/**
 * generated by Xtext 2.14.0
 */
package ca.jahed.papyrusrt.persistence.dsl.persist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.papyrusrt.persistence.dsl.persist.IncludeStatement#getIncluded <em>Included</em>}</li>
 * </ul>
 *
 * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage#getIncludeStatement()
 * @model
 * @generated
 */
public interface IncludeStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Included</b></em>' containment reference list.
   * The list contents are of type {@link ca.jahed.papyrusrt.persistence.dsl.persist.EReferenceName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Included</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Included</em>' containment reference list.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage#getIncludeStatement_Included()
   * @model containment="true"
   * @generated
   */
  EList<EReferenceName> getIncluded();

} // IncludeStatement