/**
 * generated by Xtext 2.14.0
 */
package ca.jahed.papyrusrt.persistence.dsl.persist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>With Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.papyrusrt.persistence.dsl.persist.WithStatement#getIncluded <em>Included</em>}</li>
 * </ul>
 *
 * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage#getWithStatement()
 * @model
 * @generated
 */
public interface WithStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Included</b></em>' containment reference list.
   * The list contents are of type {@link ca.jahed.papyrusrt.persistence.dsl.persist.EClassName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Included</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Included</em>' containment reference list.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage#getWithStatement_Included()
   * @model containment="true"
   * @generated
   */
  EList<EClassName> getIncluded();

} // WithStatement