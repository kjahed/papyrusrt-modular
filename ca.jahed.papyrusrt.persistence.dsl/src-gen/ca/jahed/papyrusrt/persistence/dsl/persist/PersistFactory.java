/**
 * generated by Xtext 2.14.0
 */
package ca.jahed.papyrusrt.persistence.dsl.persist;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage
 * @generated
 */
public interface PersistFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PersistFactory eINSTANCE = ca.jahed.papyrusrt.persistence.dsl.persist.impl.PersistFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Persist</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Persist</em>'.
   * @generated
   */
  Persist createPersist();

  /**
   * Returns a new object of class '<em>Rule Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Statement</em>'.
   * @generated
   */
  RuleStatement createRuleStatement();

  /**
   * Returns a new object of class '<em>For Each Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Each Statement</em>'.
   * @generated
   */
  ForEachStatement createForEachStatement();

  /**
   * Returns a new object of class '<em>Create Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Statement</em>'.
   * @generated
   */
  CreateStatement createCreateStatement();

  /**
   * Returns a new object of class '<em>Create Folder Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Folder Statement</em>'.
   * @generated
   */
  CreateFolderStatement createCreateFolderStatement();

  /**
   * Returns a new object of class '<em>Create File Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create File Statement</em>'.
   * @generated
   */
  CreateFileStatement createCreateFileStatement();

  /**
   * Returns a new object of class '<em>File Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Name</em>'.
   * @generated
   */
  FileName createFileName();

  /**
   * Returns a new object of class '<em>Include Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include Statement</em>'.
   * @generated
   */
  IncludeStatement createIncludeStatement();

  /**
   * Returns a new object of class '<em>With Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With Statement</em>'.
   * @generated
   */
  WithStatement createWithStatement();

  /**
   * Returns a new object of class '<em>Call Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Statement</em>'.
   * @generated
   */
  CallStatement createCallStatement();

  /**
   * Returns a new object of class '<em>EClass Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EClass Name</em>'.
   * @generated
   */
  EClassName createEClassName();

  /**
   * Returns a new object of class '<em>EAttribute Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EAttribute Name</em>'.
   * @generated
   */
  EAttributeName createEAttributeName();

  /**
   * Returns a new object of class '<em>EReference Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EReference Name</em>'.
   * @generated
   */
  EReferenceName createEReferenceName();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PersistPackage getPersistPackage();

} //PersistFactory