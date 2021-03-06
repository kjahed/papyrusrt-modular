/**
 * generated by Xtext 2.14.0
 */
package ca.jahed.papyrusrt.persistence.dsl.persist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.papyrusrt.persistence.dsl.persist.EClassName#getBase <em>Base</em>}</li>
 *   <li>{@link ca.jahed.papyrusrt.persistence.dsl.persist.EClassName#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage#getEClassName()
 * @model
 * @generated
 */
public interface EClassName extends EObject
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' attribute.
   * @see #setBase(String)
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage#getEClassName_Base()
   * @model
   * @generated
   */
  String getBase();

  /**
   * Sets the value of the '{@link ca.jahed.papyrusrt.persistence.dsl.persist.EClassName#getBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #getBase()
   * @generated
   */
  void setBase(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' attribute list.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage#getEClassName_Fields()
   * @model unique="false"
   * @generated
   */
  EList<String> getFields();

} // EClassName
