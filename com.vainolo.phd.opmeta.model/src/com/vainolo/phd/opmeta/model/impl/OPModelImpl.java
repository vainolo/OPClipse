/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.impl;

import com.vainolo.phd.opmeta.model.ContainerInstanceBase;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.OPModel;
import com.vainolo.phd.opmeta.model.opmetaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OP Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPModelImpl#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPModelImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPModelImpl#getNextId <em>Next Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPModelImpl extends EObjectImpl implements OPModel {
	/**
	 * The cached value of the '{@link #getMetaModel() <em>Meta Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModel()
	 * @generated
	 * @ordered
	 */
	protected OPMetaModelDiagram metaModel;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected ContainerInstanceBase container;

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
	protected OPModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmetaPackage.Literals.OP_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMetaModelDiagram getMetaModel() {
		return metaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaModel(OPMetaModelDiagram newMetaModel, NotificationChain msgs) {
		OPMetaModelDiagram oldMetaModel = metaModel;
		metaModel = newMetaModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_MODEL__META_MODEL, oldMetaModel, newMetaModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModel(OPMetaModelDiagram newMetaModel) {
		if (newMetaModel != metaModel) {
			NotificationChain msgs = null;
			if (metaModel != null)
				msgs = ((InternalEObject)metaModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - opmetaPackage.OP_MODEL__META_MODEL, null, msgs);
			if (newMetaModel != null)
				msgs = ((InternalEObject)newMetaModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - opmetaPackage.OP_MODEL__META_MODEL, null, msgs);
			msgs = basicSetMetaModel(newMetaModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_MODEL__META_MODEL, newMetaModel, newMetaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerInstanceBase getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(ContainerInstanceBase newContainer, NotificationChain msgs) {
		ContainerInstanceBase oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_MODEL__CONTAINER, oldContainer, newContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(ContainerInstanceBase newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - opmetaPackage.OP_MODEL__CONTAINER, null, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - opmetaPackage.OP_MODEL__CONTAINER, null, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_MODEL__CONTAINER, newContainer, newContainer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_MODEL__NEXT_ID, oldNextId, nextId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case opmetaPackage.OP_MODEL__META_MODEL:
				return basicSetMetaModel(null, msgs);
			case opmetaPackage.OP_MODEL__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case opmetaPackage.OP_MODEL__META_MODEL:
				return getMetaModel();
			case opmetaPackage.OP_MODEL__CONTAINER:
				return getContainer();
			case opmetaPackage.OP_MODEL__NEXT_ID:
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
			case opmetaPackage.OP_MODEL__META_MODEL:
				setMetaModel((OPMetaModelDiagram)newValue);
				return;
			case opmetaPackage.OP_MODEL__CONTAINER:
				setContainer((ContainerInstanceBase)newValue);
				return;
			case opmetaPackage.OP_MODEL__NEXT_ID:
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
			case opmetaPackage.OP_MODEL__META_MODEL:
				setMetaModel((OPMetaModelDiagram)null);
				return;
			case opmetaPackage.OP_MODEL__CONTAINER:
				setContainer((ContainerInstanceBase)null);
				return;
			case opmetaPackage.OP_MODEL__NEXT_ID:
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
			case opmetaPackage.OP_MODEL__META_MODEL:
				return metaModel != null;
			case opmetaPackage.OP_MODEL__CONTAINER:
				return container != null;
			case opmetaPackage.OP_MODEL__NEXT_ID:
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

} //OPModelImpl
