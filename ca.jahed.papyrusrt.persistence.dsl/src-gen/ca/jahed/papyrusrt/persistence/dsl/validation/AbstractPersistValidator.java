/*
 * generated by Xtext 2.14.0
 */
package ca.jahed.papyrusrt.persistence.dsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractPersistValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage.eINSTANCE);
		return result;
	}
}
