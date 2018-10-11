package ca.jahed.papyrusrt.persistence.dsl.ui;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ModelHelper {

	static ResourceSet resourceSet = new ResourceSetImpl();
	static HashMap<String, ModelInfo> models = new HashMap<>();
	
	public static void loadModel(String uri) {
		if(!models.containsKey(uri)) {
			Resource resource = resourceSet.getResource(URI.createURI(uri), true);
			models.put(uri, new ModelInfo(uri, resource));
		}
		
		ModelInfo modelInfo = models.get(uri);
		modelInfo.update();
	}
	
	public static ArrayList<String> getClasses(String uri) {
		loadModel(uri);
		ModelInfo modelInfo = models.get(uri);
		return modelInfo.getClasses();
	}
	
//	public static ArrayList<String> getContainedClasses(String uri, String className, EList<String> fields) {
//		loadModel(uri);
//		ModelInfo modelInfo = models.get(uri);
//		return modelInfo.getContainedClasses(className, fields);
//	}
	
	public static ArrayList<String> getAttributes(String uri, String className, EList<String> fields) {
		loadModel(uri);
		ModelInfo modelInfo = models.get(uri);
		return modelInfo.getAttributes(className, fields);
	}
	
	public static ArrayList<String> getAttributes(String uri, String className) {
		loadModel(uri);
		ModelInfo modelInfo = models.get(uri);
		return modelInfo.getAttributes(className);
	}
	
	public static ArrayList<String> getReferences(String uri, String className, EList<String> fields) {
		loadModel(uri);
		ModelInfo modelInfo = models.get(uri);
		return modelInfo.getReferences(className, fields);
	}
	
	public static ArrayList<String> getReferences(String uri, String className) {
		loadModel(uri);
		ModelInfo modelInfo = models.get(uri);
		return modelInfo.getReferences(className);
	}
	
	public static ArrayList<String> getFields(String uri, String className) {
		loadModel(uri);
		ModelInfo modelInfo = models.get(uri);
		return modelInfo.getFields(className);
	}
	

	private static class ModelInfo {
		String uri;
		Resource model;
		ArrayList<String> eclassNames;
		HashMap<String, EClass> eclassMap;
		HashMap<String, ArrayList<String>> eclassAttrMap;
		HashMap<String, ArrayList<String>> eclassRefMap;
		
		public ModelInfo(String uri, Resource model) {
			super();
			this.uri = uri;
			this.model = model;
			this.eclassNames = new ArrayList<>();
			this.eclassMap = new HashMap<>();
			this.eclassAttrMap = new HashMap<>();
			this.eclassRefMap = new HashMap<>();
		}

		public void update() {
			if(!model.isModified() && !eclassNames.isEmpty())
				return;
			
			eclassNames.clear();
			eclassMap.clear();
			eclassAttrMap.clear();
			eclassRefMap.clear();
			
			TreeIterator<EObject> it = model.getAllContents();
			while(it.hasNext()) {
				EObject obj = it.next();
				eclassNames.add(obj.eClass().getName());
				eclassMap.put(obj.eClass().getName(), obj.eClass());
			}
		}
		
		public ArrayList<String> getClasses() {
			return eclassNames; 
		}
		
		public ArrayList<String> getAttributes(String className, EList<String> fields) {			
			EClass currentCls = eclassMap.get(className);
			
			for(String nextClsName : fields) {
				for(EReference eref : currentCls.getEAllReferences()) {
					if(nextClsName.equals(eref.getName())) {
						currentCls = eref.getEReferenceType().eClass();
						break;
					}
				}
				
				if(currentCls == null)
					break;
			}
			
			ArrayList<String> attributes = new ArrayList<>();
			if(currentCls != null) {
				for(EAttribute eattr : currentCls.getEAllAttributes())
					attributes.add(eattr.getName());
			}
			
			return attributes;	
		}
		
		public ArrayList<String> getReferences(String className, EList<String> fields) {			
			EClass currentCls = eclassMap.get(className);
			
			for(String nextClsName : fields) {
				for(EReference eref : currentCls.getEAllReferences()) {
					if(nextClsName.equals(eref.getName())) {
						currentCls = eref.getEReferenceType().eClass();
						break;
					}
				}
				
				if(currentCls == null)
					break;
			}
			
			ArrayList<String> references = new ArrayList<>();
			if(currentCls != null) {
				for(EReference eref : currentCls.getEAllReferences())
					references.add(eref.getName());
			}
			
			return references;	
		}
		
		public ArrayList<String> getAttributes(String className) {
			if(eclassAttrMap.containsKey(className))
				return eclassAttrMap.get(className);
			
			ArrayList<String> attributes = new ArrayList<>();
			eclassAttrMap.put(className, attributes);
			
			EClass eclass = eclassMap.get(className);
			for(EAttribute eattr : eclass.getEAllAttributes())
				attributes.add(eattr.getName());
			return attributes;	
		}
		
		public ArrayList<String> getReferences(String className) {
			if(eclassRefMap.containsKey(className))
				return eclassRefMap.get(className);
			
			ArrayList<String> references = new ArrayList<>();
			eclassRefMap.put(className, references);
			
			EClass eclass = eclassMap.get(className);
			for(EReference eref : eclass.getEAllReferences())
				references.add(eref.getName());
			return references;	
		}
		
		public ArrayList<String> getFields(String className) {
			ArrayList<String> fields = new ArrayList<>();
			fields.addAll(getAttributes(className));
			fields.addAll(getReferences(className));
			return fields;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((uri == null) ? 0 : uri.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			
			ModelInfo other = (ModelInfo) obj;
			if (uri == null) {
				if (other.uri != null)
					return false;
			} else if (!uri.equals(other.uri))
				return false;
			return true;
		}
	}
}
