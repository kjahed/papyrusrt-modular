/**
 * generated by Xtext 2.14.0
 */
package ca.jahed.papyrusrt.persistence.dsl.persist;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create File Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.papyrusrt.persistence.dsl.persist.CreateFileStatement#getIncludedReferencing <em>Included Referencing</em>}</li>
 *   <li>{@link ca.jahed.papyrusrt.persistence.dsl.persist.CreateFileStatement#getIncludedAttributes <em>Included Attributes</em>}</li>
 * </ul>
 *
 * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage#getCreateFileStatement()
 * @model
 * @generated
 */
public interface CreateFileStatement extends CreateStatement
{
  /**
   * Returns the value of the '<em><b>Included Referencing</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Included Referencing</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Included Referencing</em>' containment reference.
   * @see #setIncludedReferencing(WithStatement)
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage#getCreateFileStatement_IncludedReferencing()
   * @model containment="true"
   * @generated
   */
  WithStatement getIncludedReferencing();

  /**
   * Sets the value of the '{@link ca.jahed.papyrusrt.persistence.dsl.persist.CreateFileStatement#getIncludedReferencing <em>Included Referencing</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Included Referencing</em>' containment reference.
   * @see #getIncludedReferencing()
   * @generated
   */
  void setIncludedReferencing(WithStatement value);

  /**
   * Returns the value of the '<em><b>Included Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Included Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Included Attributes</em>' containment reference.
   * @see #setIncludedAttributes(IncludeStatement)
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage#getCreateFileStatement_IncludedAttributes()
   * @model containment="true"
   * @generated
   */
  IncludeStatement getIncludedAttributes();

  /**
   * Sets the value of the '{@link ca.jahed.papyrusrt.persistence.dsl.persist.CreateFileStatement#getIncludedAttributes <em>Included Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Included Attributes</em>' containment reference.
   * @see #getIncludedAttributes()
   * @generated
   */
  void setIncludedAttributes(IncludeStatement value);

} // CreateFileStatement
