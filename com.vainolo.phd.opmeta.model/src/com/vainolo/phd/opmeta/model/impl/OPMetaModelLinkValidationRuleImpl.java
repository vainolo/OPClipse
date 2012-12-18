/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.impl;

import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;
import com.vainolo.phd.opmeta.model.opmetaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OP Meta Model Link Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelLinkValidationRuleImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelLinkValidationRuleImpl#getSourceTypeName <em>Source Type Name</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelLinkValidationRuleImpl#getTargetTypeName <em>Target Type Name</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelLinkValidationRuleImpl#getLinkTypeName <em>Link Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPMetaModelLinkValidationRuleImpl extends EObjectImpl implements OPMetaModelLinkValidationRule {
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
	 * The default value of the '{@link #getSourceTypeName() <em>Source Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_TYPE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSourceTypeName() <em>Source Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTypeName()
	 * @generated
	 * @ordered
	 */
	protected String sourceTypeName = SOURCE_TYPE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getTargetTypeName() <em>Target Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_TYPE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTargetTypeName() <em>Target Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTypeName()
	 * @generated
	 * @ordered
	 */
	protected String targetTypeName = TARGET_TYPE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getLinkTypeName() <em>Link Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_TYPE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLinkTypeName() <em>Link Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTypeName()
	 * @generated
	 * @ordered
	 */
	protected String linkTypeName = LINK_TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPMetaModelLinkValidationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmetaPackage.Literals.OP_META_MODEL_LINK_VALIDATION_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__VALID, oldValid, valid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceTypeName() {
		return sourceTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTypeName(String newSourceTypeName) {
		String oldSourceTypeName = sourceTypeName;
		sourceTypeName = newSourceTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__SOURCE_TYPE_NAME, oldSourceTypeName, sourceTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetTypeName() {
		return targetTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTypeName(String newTargetTypeName) {
		String oldTargetTypeName = targetTypeName;
		targetTypeName = newTargetTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__TARGET_TYPE_NAME, oldTargetTypeName, targetTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkTypeName() {
		return linkTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkTypeName(String newLinkTypeName) {
		String oldLinkTypeName = linkTypeName;
		linkTypeName = newLinkTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__LINK_TYPE_NAME, oldLinkTypeName, linkTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__VALID:
				return isValid();
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__SOURCE_TYPE_NAME:
				return getSourceTypeName();
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__TARGET_TYPE_NAME:
				return getTargetTypeName();
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__LINK_TYPE_NAME:
				return getLinkTypeName();
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
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__VALID:
				setValid((Boolean)newValue);
				return;
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__SOURCE_TYPE_NAME:
				setSourceTypeName((String)newValue);
				return;
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__TARGET_TYPE_NAME:
				setTargetTypeName((String)newValue);
				return;
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__LINK_TYPE_NAME:
				setLinkTypeName((String)newValue);
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
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__VALID:
				setValid(VALID_EDEFAULT);
				return;
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__SOURCE_TYPE_NAME:
				setSourceTypeName(SOURCE_TYPE_NAME_EDEFAULT);
				return;
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__TARGET_TYPE_NAME:
				setTargetTypeName(TARGET_TYPE_NAME_EDEFAULT);
				return;
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__LINK_TYPE_NAME:
				setLinkTypeName(LINK_TYPE_NAME_EDEFAULT);
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
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__VALID:
				return valid != VALID_EDEFAULT;
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__SOURCE_TYPE_NAME:
				return SOURCE_TYPE_NAME_EDEFAULT == null ? sourceTypeName != null : !SOURCE_TYPE_NAME_EDEFAULT.equals(sourceTypeName);
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__TARGET_TYPE_NAME:
				return TARGET_TYPE_NAME_EDEFAULT == null ? targetTypeName != null : !TARGET_TYPE_NAME_EDEFAULT.equals(targetTypeName);
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE__LINK_TYPE_NAME:
				return LINK_TYPE_NAME_EDEFAULT == null ? linkTypeName != null : !LINK_TYPE_NAME_EDEFAULT.equals(linkTypeName);
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
		result.append(", SourceTypeName: ");
		result.append(sourceTypeName);
		result.append(", TargetTypeName: ");
		result.append(targetTypeName);
		result.append(", LinkTypeName: ");
		result.append(linkTypeName);
		result.append(')');
		return result.toString();
	}

} //OPMetaModelLinkValidationRuleImpl
