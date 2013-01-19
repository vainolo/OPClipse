/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model.impl;

import com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule;
import com.vainolo.phd.opmodel.model.TypeDescriptor;
import com.vainolo.phd.opmodel.model.opmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OPmodel Link Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmodelLinkValidationRuleImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmodelLinkValidationRuleImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmodelLinkValidationRuleImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmodelLinkValidationRuleImpl#getLinkType <em>Link Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPmodelLinkValidationRuleImpl extends EObjectImpl implements OPmodelLinkValidationRule {
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
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected TypeDescriptor sourceType;

	/**
	 * The cached value of the '{@link #getTargetType() <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected TypeDescriptor targetType;

	/**
	 * The cached value of the '{@link #getLinkType() <em>Link Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected TypeDescriptor linkType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPmodelLinkValidationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmodelPackage.Literals.OPMODEL_LINK_VALIDATION_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDescriptor getSourceType() {
		if (sourceType != null && sourceType.eIsProxy()) {
			InternalEObject oldSourceType = (InternalEObject)sourceType;
			sourceType = (TypeDescriptor)eResolveProxy(oldSourceType);
			if (sourceType != oldSourceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__SOURCE_TYPE, oldSourceType, sourceType));
			}
		}
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDescriptor basicGetSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(TypeDescriptor newSourceType) {
		TypeDescriptor oldSourceType = sourceType;
		sourceType = newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__SOURCE_TYPE, oldSourceType, sourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDescriptor getTargetType() {
		if (targetType != null && targetType.eIsProxy()) {
			InternalEObject oldTargetType = (InternalEObject)targetType;
			targetType = (TypeDescriptor)eResolveProxy(oldTargetType);
			if (targetType != oldTargetType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__TARGET_TYPE, oldTargetType, targetType));
			}
		}
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDescriptor basicGetTargetType() {
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetType(TypeDescriptor newTargetType) {
		TypeDescriptor oldTargetType = targetType;
		targetType = newTargetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__TARGET_TYPE, oldTargetType, targetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDescriptor getLinkType() {
		if (linkType != null && linkType.eIsProxy()) {
			InternalEObject oldLinkType = (InternalEObject)linkType;
			linkType = (TypeDescriptor)eResolveProxy(oldLinkType);
			if (linkType != oldLinkType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__LINK_TYPE, oldLinkType, linkType));
			}
		}
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDescriptor basicGetLinkType() {
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkType(TypeDescriptor newLinkType) {
		TypeDescriptor oldLinkType = linkType;
		linkType = newLinkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__LINK_TYPE, oldLinkType, linkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__VALID:
				return isValid();
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__SOURCE_TYPE:
				if (resolve) return getSourceType();
				return basicGetSourceType();
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__TARGET_TYPE:
				if (resolve) return getTargetType();
				return basicGetTargetType();
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__LINK_TYPE:
				if (resolve) return getLinkType();
				return basicGetLinkType();
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
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__VALID:
				setValid((Boolean)newValue);
				return;
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__SOURCE_TYPE:
				setSourceType((TypeDescriptor)newValue);
				return;
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__TARGET_TYPE:
				setTargetType((TypeDescriptor)newValue);
				return;
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__LINK_TYPE:
				setLinkType((TypeDescriptor)newValue);
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
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__VALID:
				setValid(VALID_EDEFAULT);
				return;
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__SOURCE_TYPE:
				setSourceType((TypeDescriptor)null);
				return;
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__TARGET_TYPE:
				setTargetType((TypeDescriptor)null);
				return;
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__LINK_TYPE:
				setLinkType((TypeDescriptor)null);
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
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__VALID:
				return valid != VALID_EDEFAULT;
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__SOURCE_TYPE:
				return sourceType != null;
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__TARGET_TYPE:
				return targetType != null;
			case opmodelPackage.OPMODEL_LINK_VALIDATION_RULE__LINK_TYPE:
				return linkType != null;
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
		result.append(" (valid: ");
		result.append(valid);
		result.append(')');
		return result.toString();
	}

} //OPmodelLinkValidationRuleImpl
