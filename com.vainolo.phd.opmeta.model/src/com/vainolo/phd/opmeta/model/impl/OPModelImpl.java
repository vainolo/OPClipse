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
	 * The cached value of the '{@link #getMetaModel() <em>Meta Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModel()
	 * @generated
	 * @ordered
	 */
	protected OPMetaModelDiagram metaModel;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
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
		if (metaModel != null && metaModel.eIsProxy()) {
			InternalEObject oldMetaModel = (InternalEObject)metaModel;
			metaModel = (OPMetaModelDiagram)eResolveProxy(oldMetaModel);
			if (metaModel != oldMetaModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, opmetaPackage.OP_MODEL__META_MODEL, oldMetaModel, metaModel));
			}
		}
		return metaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMetaModelDiagram basicGetMetaModel() {
		return metaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModel(OPMetaModelDiagram newMetaModel) {
		OPMetaModelDiagram oldMetaModel = metaModel;
		metaModel = newMetaModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_MODEL__META_MODEL, oldMetaModel, metaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerInstanceBase getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (ContainerInstanceBase)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, opmetaPackage.OP_MODEL__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerInstanceBase basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(ContainerInstanceBase newContainer) {
		ContainerInstanceBase oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_MODEL__CONTAINER, oldContainer, container));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case opmetaPackage.OP_MODEL__META_MODEL:
				if (resolve) return getMetaModel();
				return basicGetMetaModel();
			case opmetaPackage.OP_MODEL__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
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
