/**
 * generated by Xtext 2.14.0
 */
package ca.jahed.papyrusrt.persistence.dsl.persist.util;

import ca.jahed.papyrusrt.persistence.dsl.persist.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage
 * @generated
 */
public class PersistAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PersistPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersistAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PersistPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersistSwitch<Adapter> modelSwitch =
    new PersistSwitch<Adapter>()
    {
      @Override
      public Adapter casePersist(Persist object)
      {
        return createPersistAdapter();
      }
      @Override
      public Adapter caseRuleStatement(RuleStatement object)
      {
        return createRuleStatementAdapter();
      }
      @Override
      public Adapter caseForEachStatement(ForEachStatement object)
      {
        return createForEachStatementAdapter();
      }
      @Override
      public Adapter caseCreateStatement(CreateStatement object)
      {
        return createCreateStatementAdapter();
      }
      @Override
      public Adapter caseCreateFolderStatement(CreateFolderStatement object)
      {
        return createCreateFolderStatementAdapter();
      }
      @Override
      public Adapter caseCreateFileStatement(CreateFileStatement object)
      {
        return createCreateFileStatementAdapter();
      }
      @Override
      public Adapter caseFileName(FileName object)
      {
        return createFileNameAdapter();
      }
      @Override
      public Adapter caseIncludeStatement(IncludeStatement object)
      {
        return createIncludeStatementAdapter();
      }
      @Override
      public Adapter caseWithStatement(WithStatement object)
      {
        return createWithStatementAdapter();
      }
      @Override
      public Adapter caseCallStatement(CallStatement object)
      {
        return createCallStatementAdapter();
      }
      @Override
      public Adapter caseEClassName(EClassName object)
      {
        return createEClassNameAdapter();
      }
      @Override
      public Adapter caseEAttributeName(EAttributeName object)
      {
        return createEAttributeNameAdapter();
      }
      @Override
      public Adapter caseEReferenceName(EReferenceName object)
      {
        return createEReferenceNameAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ca.jahed.papyrusrt.persistence.dsl.persist.Persist <em>Persist</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.Persist
   * @generated
   */
  public Adapter createPersistAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.jahed.papyrusrt.persistence.dsl.persist.RuleStatement <em>Rule Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.RuleStatement
   * @generated
   */
  public Adapter createRuleStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.jahed.papyrusrt.persistence.dsl.persist.ForEachStatement <em>For Each Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.ForEachStatement
   * @generated
   */
  public Adapter createForEachStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.jahed.papyrusrt.persistence.dsl.persist.CreateStatement <em>Create Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.CreateStatement
   * @generated
   */
  public Adapter createCreateStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.jahed.papyrusrt.persistence.dsl.persist.CreateFolderStatement <em>Create Folder Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.CreateFolderStatement
   * @generated
   */
  public Adapter createCreateFolderStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.jahed.papyrusrt.persistence.dsl.persist.CreateFileStatement <em>Create File Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.CreateFileStatement
   * @generated
   */
  public Adapter createCreateFileStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.jahed.papyrusrt.persistence.dsl.persist.FileName <em>File Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.FileName
   * @generated
   */
  public Adapter createFileNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.jahed.papyrusrt.persistence.dsl.persist.IncludeStatement <em>Include Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.IncludeStatement
   * @generated
   */
  public Adapter createIncludeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.jahed.papyrusrt.persistence.dsl.persist.WithStatement <em>With Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.WithStatement
   * @generated
   */
  public Adapter createWithStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.jahed.papyrusrt.persistence.dsl.persist.CallStatement <em>Call Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.CallStatement
   * @generated
   */
  public Adapter createCallStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.jahed.papyrusrt.persistence.dsl.persist.EClassName <em>EClass Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.EClassName
   * @generated
   */
  public Adapter createEClassNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.jahed.papyrusrt.persistence.dsl.persist.EAttributeName <em>EAttribute Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.EAttributeName
   * @generated
   */
  public Adapter createEAttributeNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ca.jahed.papyrusrt.persistence.dsl.persist.EReferenceName <em>EReference Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ca.jahed.papyrusrt.persistence.dsl.persist.EReferenceName
   * @generated
   */
  public Adapter createEReferenceNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PersistAdapterFactory
