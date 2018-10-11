package ca.jahed.papyrusrt.persistence;

import java.io.IOException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeManager;
import org.eclipse.papyrus.infra.services.controlmode.ControlModeRequest;
import org.eclipse.papyrus.infra.services.controlmode.IControlModeManager;
import org.eclipse.papyrus.uml.tools.model.ExtendedUmlModel;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

public class PapyrusModel extends ExtendedUmlModel {
	
	@Override
	public void loadModel(URI arg0) {
		super.loadModel(arg0);
	}

	
	@Override
	public void saveModel() throws IOException {
		Resource mainResource = getResource();
		Model model = (Model) EcoreUtil.getObjectByType(mainResource.getContents(), UMLPackage.Literals.MODEL);
		splitPackage(model, mainResource.getURI().trimSegments(1));
		super.saveModel();
	}
	
	public void splitPackage(Package pkg, URI location) {
		IControlModeManager cmm = ControlModeManager.getInstance();
		
		for(EObject eObj : pkg.eContents()) {
			if(eObj instanceof Class) {
				URI uri = location.appendSegment("Capsule_"+((NamedElement) eObj).getName()+".uml");
				System.out.println("Creating: "+uri.toString());
				
				ControlModeRequest cmr = new ControlModeRequest(getModelManager().getTransactionalEditingDomain(), eObj, uri);
				ICommand cmd = cmm.getControlCommand(cmr);
				
				try {
					cmd.execute(null, null);
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(eObj instanceof Package) {
				URI uri = location.appendSegment("Package_"+((NamedElement) eObj).getName()+".uml");
				System.out.println("Creating: "+uri.toString());
				
				ControlModeRequest cmr = new ControlModeRequest(getModelManager().getTransactionalEditingDomain(), eObj, uri);
				ICommand cmd = cmm.getControlCommand(cmr);
				
				try {
					cmd.execute(null, null);
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				splitPackage((Package) eObj, uri.trimFragment());
			}
		}
	}
	
	
}
