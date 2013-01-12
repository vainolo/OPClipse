/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.impl;

import com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule;
import com.vainolo.phd.opmeta.model.opmetaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OP Meta Model Contaiment Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelContaimentValidationRuleImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelContaimentValidationRuleImpl#getContainerTypeName <em>Container Type Name</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelContaimentValidationRuleImpl#getNodeTypeName <em>Node Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPMetaModelContaimentValidationRuleImpl extends EObjectImpl implements OPMetaModelContaimentValidationRule {
	/**
	 * The default value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALID_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected boolean valid = VALID_EDEFAULT;
	/**
	 * The default value of the '{@link #getContainerTypeName() <em>Container Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_TYPE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContainerTypeName() <em>Container Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerTypeName()
	 * @generated
	 * @ordered
	 */
	protected String containerTypeName = CONTAINER_TYPE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getNodeTypeName() <em>Node Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_TYPE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNodeTypeName() <em>Node Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTypeName()
	 * @generated
	 * @ordered
	 */
	protected String nodeTypeName = NODE_TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPMetaModelContaimentValidationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmetaPackage.Literals.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid(boolean newValid) {
		boolean oldValid = valid;
		valid = newValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainerTypeName() {
		return containerTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerTypeName(String newContainerTypeName) {
		String oldContainerTypeName = containerTypeName;
		containerTypeName = newContainerTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE_NAME, oldContainerTypeName, containerTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeTypeName() {
		return nodeTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeTypeName(String newNodeTypeName) {
		String oldNodeTypeName = nodeTypeName;
		nodeTypeName = newNodeTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE_NAME, oldNodeTypeName, nodeTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__VALID:
				return isValid();
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE_NAME:
				return getContainerTypeName();
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE_NAME:
				return getNodeTypeName();
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
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__VALID:
				setValid((Boolean)newValue);
				return;
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE_NAME:
				setContainerTypeName((String)newValue);
				return;
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE_NAME:
				setNodeTypeName((String)newValue);
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
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__VALID:
				setValid(VALID_EDEFAULT);
				return;
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE_NAME:
				setContainerTypeName(CONTAINER_TYPE_NAME_EDEFAULT);
				return;
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE_NAME:
				setNodeTypeName(NODE_TYPE_NAME_EDEFAULT);
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
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__VALID:
				return valid != VALID_EDEFAULT;
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE_NAME:
				return CONTAINER_TYPE_NAME_EDEFAULT == null ? containerTypeName != null : !CONTAINER_TYPE_NAME_EDEFAULT.equals(containerTypeName);
			case opmetaPackage.OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE_NAME:
				return NODE_TYPE_NAME_EDEFAULT == null ? nodeTypeName != null : !NODE_TYPE_NAME_EDEFAULT.equals(nodeTypeName);
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
		result.append(" (Valid: ");
		result.append(valid);
		result.append(", ContainerTypeName: ");
		result.append(containerTypeName);
		result.append(", NodeTypeName: ");
		result.append(nodeTypeName);
		result.append(')');
		return result.toString();
	}

} //OPMetaModelContaimentValidationRuleImpl
