/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model.impl;

import com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule;
import com.vainolo.phd.opmodel.model.TypeDescriptor;
import com.vainolo.phd.opmodel.model.opmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OPmodel Contaiment Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmodelContaimentValidationRuleImpl#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmodelContaimentValidationRuleImpl#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmodelContaimentValidationRuleImpl#getNodeType <em>Node Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPmodelContaimentValidationRuleImpl extends EObjectImpl implements OPmodelContaimentValidationRule {
	/**
	 * The default value of the '{@link #isIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsValid() <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsValid()
	 * @generated
	 * @ordered
	 */
	protected boolean isValid = IS_VALID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainerType() <em>Container Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerType()
	 * @generated
	 * @ordered
	 */
	protected TypeDescriptor containerType;

	/**
	 * The cached value of the '{@link #getNodeType() <em>Node Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeType()
	 * @generated
	 * @ordered
	 */
	protected TypeDescriptor nodeType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPmodelContaimentValidationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmodelPackage.Literals.OPMODEL_CONTAIMENT_VALIDATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsValid() {
		return isValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsValid(boolean newIsValid) {
		boolean oldIsValid = isValid;
		isValid = newIsValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__IS_VALID, oldIsValid, isValid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDescriptor getContainerType() {
		if (containerType != null && containerType.eIsProxy()) {
			InternalEObject oldContainerType = (InternalEObject)containerType;
			containerType = (TypeDescriptor)eResolveProxy(oldContainerType);
			if (containerType != oldContainerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE, oldContainerType, containerType));
			}
		}
		return containerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDescriptor basicGetContainerType() {
		return containerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerType(TypeDescriptor newContainerType) {
		TypeDescriptor oldContainerType = containerType;
		containerType = newContainerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE, oldContainerType, containerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDescriptor getNodeType() {
		if (nodeType != null && nodeType.eIsProxy()) {
			InternalEObject oldNodeType = (InternalEObject)nodeType;
			nodeType = (TypeDescriptor)eResolveProxy(oldNodeType);
			if (nodeType != oldNodeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE, oldNodeType, nodeType));
			}
		}
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDescriptor basicGetNodeType() {
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeType(TypeDescriptor newNodeType) {
		TypeDescriptor oldNodeType = nodeType;
		nodeType = newNodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE, oldNodeType, nodeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__IS_VALID:
				return isIsValid();
			case opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE:
				if (resolve) return getContainerType();
				return basicGetContainerType();
			case opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE:
				if (resolve) return getNodeType();
				return basicGetNodeType();
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
			case opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__IS_VALID:
				setIsValid((Boolean)newValue);
				return;
			case opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE:
				setContainerType((TypeDescriptor)newValue);
				return;
			case opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE:
				setNodeType((TypeDescriptor)newValue);
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
			case opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__IS_VALID:
				setIsValid(IS_VALID_EDEFAULT);
				return;
			case opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE:
				setContainerType((TypeDescriptor)null);
				return;
			case opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE:
				setNodeType((TypeDescriptor)null);
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
			case opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__IS_VALID:
				return isValid != IS_VALID_EDEFAULT;
			case opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE:
				return containerType != null;
			case opmodelPackage.OPMODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE:
				return nodeType != null;
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
		result.append(" (isValid: ");
		result.append(isValid);
		result.append(')');
		return result.toString();
	}

} //OPmodelContaimentValidationRuleImpl
