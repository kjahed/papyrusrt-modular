/**
 * generated by Xtext 2.14.0
 */
package ca.jahed.papyrusrt.persistence.dsl.persist.impl;

import ca.jahed.papyrusrt.persistence.dsl.persist.CallStatement;
import ca.jahed.papyrusrt.persistence.dsl.persist.CreateStatement;
import ca.jahed.papyrusrt.persistence.dsl.persist.EClassName;
import ca.jahed.papyrusrt.persistence.dsl.persist.ForEachStatement;
import ca.jahed.papyrusrt.persistence.dsl.persist.PersistPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.jahed.papyrusrt.persistence.dsl.persist.impl.ForEachStatementImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link ca.jahed.papyrusrt.persistence.dsl.persist.impl.ForEachStatementImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link ca.jahed.papyrusrt.persistence.dsl.persist.impl.ForEachStatementImpl#getCalls <em>Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForEachStatementImpl extends MinimalEObjectImpl.Container implements ForEachStatement
{
  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EClassName class_;

  /**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected EList<CreateStatement> contents;

  /**
   * The cached value of the '{@link #getCalls() <em>Calls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalls()
   * @generated
   * @ordered
   */
  protected EList<CallStatement> calls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForEachStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PersistPackage.Literals.FOR_EACH_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassName getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClass(EClassName newClass, NotificationChain msgs)
  {
    EClassName oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PersistPackage.FOR_EACH_STATEMENT__CLASS, oldClass, newClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(EClassName newClass)
  {
    if (newClass != class_)
    {
      NotificationChain msgs = null;
      if (class_ != null)
        msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PersistPackage.FOR_EACH_STATEMENT__CLASS, null, msgs);
      if (newClass != null)
        msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PersistPackage.FOR_EACH_STATEMENT__CLASS, null, msgs);
      msgs = basicSetClass(newClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PersistPackage.FOR_EACH_STATEMENT__CLASS, newClass, newClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CreateStatement> getContents()
  {
    if (contents == null)
    {
      contents = new EObjectContainmentEList<CreateStatement>(CreateStatement.class, this, PersistPackage.FOR_EACH_STATEMENT__CONTENTS);
    }
    return contents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CallStatement> getCalls()
  {
    if (calls == null)
    {
      calls = new EObjectContainmentEList<CallStatement>(CallStatement.class, this, PersistPackage.FOR_EACH_STATEMENT__CALLS);
    }
    return calls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PersistPackage.FOR_EACH_STATEMENT__CLASS:
        return basicSetClass(null, msgs);
      case PersistPackage.FOR_EACH_STATEMENT__CONTENTS:
        return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
      case PersistPackage.FOR_EACH_STATEMENT__CALLS:
        return ((InternalEList<?>)getCalls()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PersistPackage.FOR_EACH_STATEMENT__CLASS:
        return getClass_();
      case PersistPackage.FOR_EACH_STATEMENT__CONTENTS:
        return getContents();
      case PersistPackage.FOR_EACH_STATEMENT__CALLS:
        return getCalls();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PersistPackage.FOR_EACH_STATEMENT__CLASS:
        setClass((EClassName)newValue);
        return;
      case PersistPackage.FOR_EACH_STATEMENT__CONTENTS:
        getContents().clear();
        getContents().addAll((Collection<? extends CreateStatement>)newValue);
        return;
      case PersistPackage.FOR_EACH_STATEMENT__CALLS:
        getCalls().clear();
        getCalls().addAll((Collection<? extends CallStatement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PersistPackage.FOR_EACH_STATEMENT__CLASS:
        setClass((EClassName)null);
        return;
      case PersistPackage.FOR_EACH_STATEMENT__CONTENTS:
        getContents().clear();
        return;
      case PersistPackage.FOR_EACH_STATEMENT__CALLS:
        getCalls().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PersistPackage.FOR_EACH_STATEMENT__CLASS:
        return class_ != null;
      case PersistPackage.FOR_EACH_STATEMENT__CONTENTS:
        return contents != null && !contents.isEmpty();
      case PersistPackage.FOR_EACH_STATEMENT__CALLS:
        return calls != null && !calls.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ForEachStatementImpl
