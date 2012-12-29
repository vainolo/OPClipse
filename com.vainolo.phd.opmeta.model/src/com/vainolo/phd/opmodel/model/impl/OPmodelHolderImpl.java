/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model.impl;

import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.OPmetaDefinition;
import com.vainolo.phd.opmodel.model.OPmodelHolder;
import com.vainolo.phd.opmodel.model.opmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OPmodel Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmodelHolderImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmodelHolderImpl#getMetaDefinition <em>Meta Definition</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmodelHolderImpl#getNextId <em>Next Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPmodelHolderImpl extends EObjectImpl implements OPmodelHolder {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected ContainerInstance container;

	/**
	 * The cached value of the '{@link #getMetaDefinition() <em>Meta Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDefinition()
	 * @generated
	 * @ordered
	 */
	protected OPmetaDefinition metaDefinition;

	/**
	 * The default value of the '{@link #getNextId() <em>Next Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextId()
	 * @generated
	 * @ordered
	 */
	protected static final long NEXT_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNextId() <em>Next Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextId()
	 * @generated
	 * @ordered
	 */
	protected long nextId = NEXT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPmodelHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmodelPackage.Literals.OPMODEL_HOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerInstance getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(ContainerInstance newContainer, NotificationChain msgs) {
		ContainerInstance oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, opmodelPackage.OPMODEL_HOLDER__CONTAINER, oldContainer, newContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(ContainerInstance newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - opmodelPackage.OPMODEL_HOLDER__CONTAINER, null, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - opmodelPackage.OPMODEL_HOLDER__CONTAINER, null, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.OPMODEL_HOLDER__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPmetaDefinition getMetaDefinition() {
		return metaDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaDefinition(OPmetaDefinition newMetaDefinition, NotificationChain msgs) {
		OPmetaDefinition oldMetaDefinition = metaDefinition;
		metaDefinition = newMetaDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, opmodelPackage.OPMODEL_HOLDER__META_DEFINITION, oldMetaDefinition, newMetaDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaDefinition(OPmetaDefinition newMetaDefinition) {
		if (newMetaDefinition != metaDefinition) {
			NotificationChain msgs = null;
			if (metaDefinition != null)
				msgs = ((InternalEObject)metaDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - opmodelPackage.OPMODEL_HOLDER__META_DEFINITION, null, msgs);
			if (newMetaDefinition != null)
				msgs = ((InternalEObject)newMetaDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - opmodelPackage.OPMODEL_HOLDER__META_DEFINITION, null, msgs);
			msgs = basicSetMetaDefinition(newMetaDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.OPMODEL_HOLDER__META_DEFINITION, newMetaDefinition, newMetaDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNextId() {
		return nextId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextId(long newNextId) {
		long oldNextId = nextId;
		nextId = newNextId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.OPMODEL_HOLDER__NEXT_ID, oldNextId, nextId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case opmodelPackage.OPMODEL_HOLDER__CONTAINER:
				return basicSetContainer(null, msgs);
			case opmodelPackage.OPMODEL_HOLDER__META_DEFINITION:
				return basicSetMetaDefinition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case opmodelPackage.OPMODEL_HOLDER__CONTAINER:
				return getContainer();
			case opmodelPackage.OPMODEL_HOLDER__META_DEFINITION:
				return getMetaDefinition();
			case opmodelPackage.OPMODEL_HOLDER__NEXT_ID:
				return getNextId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case opmodelPackage.OPMODEL_HOLDER__CONTAINER:
				setContainer((ContainerInstance)newValue);
				return;
			case opmodelPackage.OPMODEL_HOLDER__META_DEFINITION:
				setMetaDefinition((OPmetaDefinition)newValue);
				return;
			case opmodelPackage.OPMODEL_HOLDER__NEXT_ID:
				setNextId((Long)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case opmodelPackage.OPMODEL_HOLDER__CONTAINER:
				setContainer((ContainerInstance)null);
				return;
			case opmodelPackage.OPMODEL_HOLDER__META_DEFINITION:
				setMetaDefinition((OPmetaDefinition)null);
				return;
			case opmodelPackage.OPMODEL_HOLDER__NEXT_ID:
				setNextId(NEXT_ID_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case opmodelPackage.OPMODEL_HOLDER__CONTAINER:
				return container != null;
			case opmodelPackage.OPMODEL_HOLDER__META_DEFINITION:
				return metaDefinition != null;
			case opmodelPackage.OPMODEL_HOLDER__NEXT_ID:
				return nextId != NEXT_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (NextId: ");
		result.append(nextId);
		result.append(')');
		return result.toString();
	}

} //OPmodelHolderImpl
