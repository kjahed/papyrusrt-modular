package ca.jahed.papyrusrt.persistence;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.papyrus.infra.core.resource.ModelSet;
import org.eclipse.papyrus.infra.core.resource.ReadOnlyAxis;
import org.eclipse.papyrus.infra.gmfdiag.css.resource.CSSNotationResource;
import org.eclipse.papyrus.uml.tools.model.ExtendedUmlModel;
import org.eclipse.papyrusrt.codegen.cpp.profile.RTCppProperties.RTCppPropertiesPackage;
import org.eclipse.papyrusrt.umlrt.profile.UMLRealTime.UMLRealTimePackage;
import org.eclipse.papyrusrt.umlrt.profile.statemachine.UMLRTStateMachines.UMLRTStateMachinesPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import ca.jahed.papyrusrt.persistence.dsl.PersistStandaloneSetup;
import ca.jahed.papyrusrt.persistence.dsl.persist.CallStatement;
import ca.jahed.papyrusrt.persistence.dsl.persist.CreateFileStatement;
import ca.jahed.papyrusrt.persistence.dsl.persist.CreateFolderStatement;
import ca.jahed.papyrusrt.persistence.dsl.persist.CreateStatement;
import ca.jahed.papyrusrt.persistence.dsl.persist.EAttributeName;
import ca.jahed.papyrusrt.persistence.dsl.persist.EClassName;
import ca.jahed.papyrusrt.persistence.dsl.persist.EReferenceName;
import ca.jahed.papyrusrt.persistence.dsl.persist.FileName;
import ca.jahed.papyrusrt.persistence.dsl.persist.ForEachStatement;
import ca.jahed.papyrusrt.persistence.dsl.persist.IncludeStatement;
import ca.jahed.papyrusrt.persistence.dsl.persist.Persist;
import ca.jahed.papyrusrt.persistence.dsl.persist.RuleStatement;
import ca.jahed.papyrusrt.persistence.dsl.persist.WithStatement;

public class PapyrusModel2 extends ExtendedUmlModel {
	
	HashMap<String, RuleInfo> ruleDB = new HashMap<>();
	HashMap<Resource, List<EObject>> plan = new HashMap<>();
	HashMap<EObject, URI> objectLocationMap = new HashMap<>();
	HashSet<URI> resourceUris = new HashSet<>();
	
	@Override
	public void loadModel(URI arg0) {
		super.loadModel(arg0);
		
		resourceURI = arg0.appendFileExtension(getModelFileExtension());
        final Map<Object, Object> options = modelSet.getLoadOptions();
        options.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
        options.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE);
        options.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap<Object, Object>());
        options.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
        options.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        
		resource = modelSet.createResource(resourceURI);
		if(resource == null) {
			System.out.println("Resource is null!");
			return;
		}
		
		((ResourceImpl)resource).setIntrinsicIDToEObjectMap(new HashMap<>());
				
		try {
			resource.load(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		configureResource(resource);
		
		IFile mainFile = (IFile) ResourcesPlugin.getWorkspace()
				.getRoot().findMember(resourceURI.toPlatformString(true));
		IContainer mainFolder = mainFile.getParent();
		
		Stack<IContainer> toScan = new Stack<IContainer>();
		toScan.add(mainFolder);
		
		while(!toScan.isEmpty()) {
			try {
				IContainer folder = toScan.pop();
				IResource[] members = folder.members();
				for (IResource member : members) {
					if(member instanceof IFolder)
						toScan.push((IContainer) member);
					else {
						String extension = member.getFullPath().getFileExtension();
						if ("uml".equalsIgnoreCase(extension)) {
							URI memberUri = URI.createPlatformResourceURI(member.getFullPath().toString(), true);
							modelSet.getResource(memberUri, false);
							resourceUris.add(resource.getURI());
							
						}
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		resource = modelSet.getResource(resourceURI, false);
		configureResource(resource);
	}

	
	@Override
	public void saveModel() throws IOException {
		super.saveModel();
		ruleDB.clear();
		plan.clear();
		
		resource = modelSet.getResource(resourceURI, true);
		
		CSSNotationResource notationResource = null;
		for (Resource resource : getModelManager().getResources()) {
			if (resource instanceof CSSNotationResource && resource.getURI().isPlatform()) {
				notationResource = (CSSNotationResource) resource;
				break;
			}
		}
		
		if(notationResource != null)
			EcoreUtil.resolveAll(notationResource);
		
		Resource mainResource = getResource();
		String modelFileName = mainResource.getURI().trimFileExtension().lastSegment().toString();
		URI persistFileURI = mainResource.getURI().trimSegments(1).appendSegment(modelFileName+".persist");
		
		try {
			parsePersistModel(persistFileURI);
			doSave();
		} catch (Exception e) { //.persist file does not exist
			e.printStackTrace();
			super.saveModel();
		}
		
		if(notationResource != null) {
			EcoreUtil.resolveAll(notationResource);
			
			try {
				notationResource.save(null);
			} catch(IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public void doSave() throws IOException {
		Resource mainResource = getResource();
		String mainResourceName = mainResource.getURI().lastSegment().substring(0, 
				mainResource.getURI().lastSegment().indexOf('.'));
		
		EList<EObject> contents = mainResource.getContents();
		for(String ruleInfo : ruleDB.keySet()) {
			for(EObject eObj : contents) {
				splitEObject(eObj, ruleDB.get(ruleInfo), 
						mainResource.getURI().trimSegments(1).appendSegment(mainResourceName+".parts"));
			}
		}
			
		System.out.println("Done planning");
		
		final HashMap<EObject, EObject> eObjContainerMap = new HashMap<>();
		
		TransactionalEditingDomain domain = getModelManager().getTransactionalEditingDomain();
	    domain.getCommandStack().execute(new RecordingCommand(domain) {
			
			@Override
			protected void doExecute() {
				for(Resource resource : plan.keySet()) {
					List<EObject> tomove = plan.get(resource);
					EObject mainEObj = tomove.get(0);
					EObject parent = mainEObj.eContainer();
					eObjContainerMap.put(mainEObj, parent);
					
					List<EObject> rtElements = getUmlrtElements((Element) mainEObj);
					
					Model model = UMLPackage.eINSTANCE.getUMLFactory().createModel();
					model.setName(((NamedElement) mainEObj).getName() + "_Model");
					model.getPackagedElements().add((PackageableElement) mainEObj);
					resource.getContents().add(model);
					resource.getContents().addAll(rtElements);
					
					for(EObject eobj : tomove) {
						resource.getContents().add(eobj);
					}
					resource.getContents().addAll(rtElements);
					
					resourceUris.add(resource.getURI());
					
					try {
						resource.save(null);
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					parent.eResource().getContents().addAll(rtElements);
				}
			}
		});
	    
	    mainResource.save(null);
				
	    domain.getCommandStack().execute(new RecordingCommand(domain) {
			
			@Override
			protected void doExecute() {
				for(EObject mainEObj : eObjContainerMap.keySet()) {
					EObject parent = eObjContainerMap.get(mainEObj);
					
					EObject proxyObj = UMLFactory.eINSTANCE.create(mainEObj.eClass());
					((Package) parent).getPackagedElements().add((PackageableElement) proxyObj);
					((InternalEObject) proxyObj).eSetProxyURI(EcoreUtil.getURI(mainEObj));
					
					try {
						parent.eResource().save(null);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
	    		
		modelSet.getReadOnlyHandler().makeWritable(
				ReadOnlyAxis.anyAxis(), resourceUris.toArray(new URI[resourceUris.size()]));
	}
	
	public static List<EObject> getUmlrtElements(Element element) {
        List<EObject> rtelements = new LinkedList<>();
        List<EObject> toRemove = new LinkedList<>();
            
		try {
            for(EObject obj : element.eResource().getContents()) {
                if(obj.eClass().getEPackage().getName().equals(UMLRealTimePackage.eNAME)
                        || obj.eClass().getEPackage().getName().equals(UMLRTStateMachinesPackage.eNAME)
                        || obj.eClass().getEPackage().getName().equals(RTCppPropertiesPackage.eNAME)) {
                    for(EReference ref : obj.eClass().getEAllReferences()) {
                        if(EcoreUtil.equals((EObject) obj.eGet(ref), element)) {
                            //rtelements.add(obj);
                            rtelements.add(EcoreUtil.copy(obj));
                            toRemove.add(obj);
                            break;
                        }
                    }
                }
            }
            
            element.eResource().getContents().removeAll(toRemove);
            
            EList<Element> subElements = element.getOwnedElements();
            for(Element sub : subElements) {
                rtelements.addAll(getUmlrtElements(sub));
            }
        } catch(Exception e) {
        }	

		return rtelements;
	}
	
	public void splitEObject(EObject eObj, RuleInfo ruleInfo, URI location) {
//		EStructuralFeature href = eObj.eClass().getEStructuralFeature("href");
//		if(eObj.eGet(href) != null)
//			return;
//		if(eObj.eResource() != getResource())
//			return;
		
		String clsName = eObj.eClass().getName();
		if(ruleInfo.hasElement(clsName)) {
			ElementInfo eInfo = ruleInfo.getElementInfo(clsName);
			createFiles(eObj, eInfo, location);
			createFolders(eObj, eInfo, location);
			
			EList<EObject> content = eObj.eContents();
			for(String includedRule : eInfo.includedRules) {
				RuleInfo incRule = ruleDB.get(includedRule);
				for(EObject child : content)
					splitEObject(child, incRule, location);
			}
		}
	}
	
	public void createFiles(EObject eObj, ElementInfo eInfo, URI location) {
		for(FileInfo fInfo : eInfo.files)
			createFile(eObj, eInfo, fInfo, location);
	}
	
	public void createFolders(EObject eObj, ElementInfo eInfo, URI location) {
		for(FolderInfo fInfo : eInfo.folders)
			createFolder(eObj, eInfo, fInfo, location);
	}
	
	public void createFile(EObject eObj, ElementInfo eInfo, FileInfo fileInfo, URI location) {
		String fileName = resolveFileName(eObj, fileInfo.name);		
		ModelSet set = getModelManager();
		
		URI fileURI = location.appendSegment(fileName);
//		if(set.getURIConverter().exists(fileURI, null))
//			return;
		
		Resource newResource = set.createResource(fileURI);
		System.out.println("Created resource: "+newResource.getURI().toString());
		
		List<EObject> tomove = new ArrayList<EObject>();
		plan.put(newResource, tomove);
		tomove.add(eObj);

		for(ReferenceInfo refInfo : fileInfo.includedReferences) {
			EObject refObject = resolveReferenceValue(eObj, refInfo);
			tomove.add(refObject);
		}
		
		if(!fileInfo.includedReferencing.isEmpty()) {
			Collection<Setting> usages = EcoreUtil.UsageCrossReferencer.find(eObj, eObj.eResource());
			for(Setting usage : usages) {
				EObject user = usage.getEObject();
				for(EClassInfo clsInfo : fileInfo.includedReferencing)
					if(clsInfo.name.equals(user.eClass().getName())) {
						tomove.add(user);
					}
			}
		}
	}
	
	public void createFolder(EObject eObj, ElementInfo eInfo, FolderInfo folderInfo, URI location) {
		String fileName = resolveFileName(eObj, folderInfo.name);		
		for(FolderInfo subFolder : folderInfo.folders)
			createFolder(eObj, eInfo, subFolder, location.appendSegment(fileName));
		
		for(FileInfo subFile : folderInfo.files)
			createFile(eObj, eInfo, subFile, location.appendSegment(fileName));
		
		EList<EObject> content = eObj.eContents();
		for(String includedRule : folderInfo.includedRules) {
			RuleInfo ruleInfo = ruleDB.get(includedRule);
			for(EObject child : content)
				splitEObject(child, ruleInfo, location.appendSegment(fileName));
		}
	}
	
	public String resolveFileName(EObject eObj, FileNameInfo nameInfo) {
		String name = "";
		
		if(nameInfo.name != null)
			name += nameInfo.name;
		else
			name += resolveAttributeValue(eObj, nameInfo.attr);
		
		if(nameInfo.next != null)
			return name + resolveFileName(eObj, nameInfo.next);
		
		return name;
	}
	
	public String resolveAttributeValue(EObject eObj, AttributeInfo attrInfo) {
		EStructuralFeature feature = eObj.eClass().getEStructuralFeature(attrInfo.name);
		if(feature == null)
			return null;
		
		if(feature instanceof EAttribute || attrInfo.next == null)
			return eObj.eGet(feature).toString();
		
		//TODO what if not EReference or EObject?
		EReference eref = (EReference) feature;	
		return resolveAttributeValue((EObject) eObj.eGet(eref), attrInfo.next);
	}
	
	public EObject resolveReferenceValue(EObject eObj, ReferenceInfo refInfo) {
		//TODO what if not EReference or EObject?
		EStructuralFeature feature = eObj.eClass().getEStructuralFeature(refInfo.name);
		if(feature == null)
			return null;
		
		if(refInfo.next == null)
			return (EObject) eObj.eGet(feature);

		return resolveReferenceValue((EObject) eObj.eGet(feature), refInfo.next);
	}
	
	public void parsePersistModel(URI persistURI) throws Exception {
		Injector injector = new PersistStandaloneSetup().createInjector();
		XtextResourceSet persistResourceSet = injector.getInstance(XtextResourceSet.class);
		persistResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		Resource persistResource = persistResourceSet.getResource(persistURI, true);
		Persist persistModel = (Persist) persistResource.getContents().get(0);
				
		for(RuleStatement stmt : persistModel.getStatements()) {
			RuleInfo ruleInfo = parsePersistModel_handleRule(stmt);
			ruleDB.put(ruleInfo.id, ruleInfo);
		}
	}
	
	public RuleInfo parsePersistModel_handleRule(RuleStatement stmt) {
		RuleInfo ruleInfo = new RuleInfo(stmt.getId());
		
		for(ForEachStatement forEach : stmt.getRules()) {
			ElementInfo elementInfo = parsePersistModel_handleForEach(forEach);
			ruleInfo.addElement(elementInfo);
		}
		
		return ruleInfo;
	}
	
	public ElementInfo parsePersistModel_handleForEach(ForEachStatement stmt) {
		String elementName = stmt.getClass_().getBase();
		
		//FIXME: should handle elements like Model.Class
//		for(String elementNameField : stmt.getClass_().getFields())
//			elementName += "." + elementNameField;
		
		ElementInfo elementInfo = new ElementInfo(elementName);
		
		for(CreateStatement createStmt : stmt.getContents()) {	
			if(createStmt instanceof CreateFileStatement) {
				elementInfo.addFile(
						parsePersistModel_handleCreateFile((CreateFileStatement) createStmt));
			}
			
			else if(createStmt instanceof CreateFolderStatement) {
				elementInfo.addFolder(
						parsePersistModel_handleCreateFolder((CreateFolderStatement) createStmt));
			}
		}
		
		for(CallStatement callStmt : stmt.getCalls()) {
			for(String calls : callStmt.getRules())
				elementInfo.addRule(calls);
		}
		
		return elementInfo;
	}
	
	public FileInfo parsePersistModel_handleCreateFile(CreateFileStatement stmt) {
		FileInfo fileInfo = new FileInfo(
				parsePersistModel_handleFileName(stmt.getName()));
		
		if(stmt.getIncludedAttributes() != null) {
			fileInfo.setIncludedReferences(parsePersistModel_handleIncludeStmt(stmt.getIncludedAttributes()));
		}
		
		if(stmt.getIncludedReferencing() != null) {
			fileInfo.setIncludedReferencing(parsePersistModel_handleWithStmt(stmt.getIncludedReferencing()));
		}
		
		return fileInfo;
	}
	
	public ArrayList<ReferenceInfo> parsePersistModel_handleIncludeStmt(IncludeStatement stmt) {
		ArrayList<ReferenceInfo> references = new ArrayList<>();
		
		for(EReferenceName refName : stmt.getIncluded()) {
			references.add(parsePersistModel_handleEReferenceName(refName));
		}
		
		return references;
	}
	
	public ArrayList<EClassInfo> parsePersistModel_handleWithStmt(WithStatement stmt) {
		ArrayList<EClassInfo> references = new ArrayList<>();
		
		for(EClassName className : stmt.getIncluded()) {
			references.add(new EClassInfo(className.getBase()));
		}
		
		return references;
	}
	
	public FileNameInfo parsePersistModel_handleFileName(FileName fileName) {
		FileNameInfo fileNameInfo = fileName.getPrefix() != null ?
				new FileNameInfo(fileName.getPrefix()) : 
				new FileNameInfo(parsePersistModel_handleEAttributeName(fileName.getAttr()));
				
		FileNameInfo current = fileNameInfo;
		if(fileName.getRight() != null)
			current.next = parsePersistModel_handleFileName(fileName.getRight());
		
		return fileNameInfo;
	}
	
	public AttributeInfo parsePersistModel_handleEAttributeName(EAttributeName attr) {
		AttributeInfo attrInfo = new AttributeInfo(attr.getBase());
		
		AttributeInfo current = attrInfo;
		for(String field : attr.getFields()) {
			current.next = new AttributeInfo(field);
			current = current.next;
		}
		
		return attrInfo;
	}
	
	public ReferenceInfo parsePersistModel_handleEReferenceName(EReferenceName ref) {
		ReferenceInfo refInfo = new ReferenceInfo(ref.getBase());

		ReferenceInfo current = refInfo;
		for(String field : ref.getFields()) {
			current.next = new ReferenceInfo(field);
			current = current.next;
		}
		
		return refInfo;
	}
	
	public FolderInfo parsePersistModel_handleCreateFolder(CreateFolderStatement stmt) {
		FolderInfo folderInfo = new FolderInfo(
				parsePersistModel_handleFileName(stmt.getName()));
		
		for(CreateStatement createStmt : stmt.getContents()) {
			if(createStmt instanceof CreateFileStatement) {
				folderInfo.addFile(
						parsePersistModel_handleCreateFile((CreateFileStatement) createStmt));
			}
			
			else if(createStmt instanceof CreateFolderStatement) {
				folderInfo.addFolder(
						parsePersistModel_handleCreateFolder((CreateFolderStatement) createStmt));
			}
		}
		
		for(CallStatement callStmt : stmt.getCalls()) {
			for(String rule : callStmt.getRules())
				folderInfo.addRule(rule);
		}
		
		return folderInfo;
	}
	
	public class RuleInfo {
		String id;
		HashMap<String, ElementInfo> elements;
		
		public RuleInfo(String id) {
			this.id = id;
			this.elements = new HashMap<>();
		}
		
		public void addElement(ElementInfo elInfo) {
			elements.put(elInfo.name, elInfo);
		}
		
		public ElementInfo getElementInfo(String elName) {
			return elements.get(elName);
		}
		
		public boolean hasElement(String elName) {
			return elements.containsKey(elName);
		}
	}
	
	public class ElementInfo {
		String name;
		ArrayList<FolderInfo> folders;
		ArrayList<FileInfo> files;
		ArrayList<String> includedRules;
		
		public ElementInfo(String name) {
			this.name = name;
			folders = new ArrayList<>();
			files = new ArrayList<>();
			includedRules = new ArrayList<>();
		}
		
		public void addFile(FileInfo file) {
			files.add(file);
		}
		
		public void addFolder(FolderInfo folder) {
			folders.add(folder);
		}
		
		public void addRule(String rule) {
			includedRules.add(rule);
		}
	}
	
	public class FileInfo {
		FileNameInfo name;
		ArrayList<ReferenceInfo> includedReferences;
		ArrayList<EClassInfo> includedReferencing;
		
		public FileInfo(FileNameInfo name) {
			this.name = name;
			this.includedReferences = new ArrayList<>();
			this.includedReferencing = new ArrayList<>();
		}
		
		public void setIncludedReferences(ArrayList<ReferenceInfo> ref) {
			includedReferences = ref;
		}
		
		public void setIncludedReferencing(ArrayList<EClassInfo> ref) {
			includedReferencing = ref;
		}
	}
	
	public class FolderInfo {
		FileNameInfo name;
		ArrayList<FileInfo> files;
		ArrayList<FolderInfo> folders;
		ArrayList<String> includedRules;
		
		public FolderInfo(FileNameInfo name) {
			this.name = name;
			this.files = new ArrayList<>();
			this.folders = new ArrayList<>();
			this.includedRules = new ArrayList<>();
		}
		
		public void addFile(FileInfo file) {
			files.add(file);
		}
		
		public void addFolder(FolderInfo folder) {
			folders.add(folder);
		}
		
		public void addRule(String rule) {
			includedRules.add(rule);
		}
	}
	
	public class EClassInfo {
		String name;
		EClassInfo next;
		
		public EClassInfo(String name) {
			this.name = name;
		}
	}
	
	public class ReferenceInfo {
		String name;
		ReferenceInfo next;
		
		public ReferenceInfo(String name) {
			this.name = name;
		}
	}
	
	public class AttributeInfo {
		String name;
		AttributeInfo next;
		
		public AttributeInfo(String name) {
			this.name = name;
		}
	}
	
	public class FileNameInfo {
		String name;
		AttributeInfo attr;
		FileNameInfo next;
		
		public FileNameInfo(String name) {
			this.name = name;
		}
		
		public FileNameInfo(AttributeInfo attr) {
			this.attr = attr;
		}
	}
}
