/**
 * generated by Xtext 2.14.0
 */
package ca.jahed.papyrusrt.persistence.dsl.persist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.papyrusrt.persistence.dsl.persist.CreateStatement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage#getCreateStatement()
 * @model
 * @generated
 */
public interface CreateStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(FileName)
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage#getCreateStatement_Name()
   * @model containment="true"
   * @generated
   */
  FileName getName();

  /**
   * Sets the value of the '{@link ca.jahed.papyrusrt.persistence.dsl.persist.CreateStatement#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(FileName value);

} // CreateStatement