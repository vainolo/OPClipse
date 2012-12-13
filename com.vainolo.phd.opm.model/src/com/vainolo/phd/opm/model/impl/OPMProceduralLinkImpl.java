/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model.impl;

import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMProceduralActivationKind;
import com.vainolo.phd.opm.model.OPMProceduralLink;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedural Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opm.model.impl.OPMProceduralLinkImpl#getActivationKind <em>Activation Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OPMProceduralLinkImpl extends OPMLinkImpl implements OPMProceduralLink {
	/**
	 * The default value of the '{@link #getActivationKind() <em>Activation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationKind()
	 * @generated
	 * @ordered
	 */
	protected static final OPMProceduralActivationKind ACTIVATION_KIND_EDEFAULT = OPMProceduralActivationKind.NORMAL;
	/**
	 * The cached value of the '{@link #getActivationKind() <em>Activation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationKind()
	 * @generated
	 * @ordered
	 */
	protected OPMProceduralActivationKind activationKind = ACTIVATION_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPMProceduralLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPMPackage.Literals.OPM_PROCEDURAL_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMProceduralActivationKind getActivationKind() {
		return activationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OPMPackage.OPM_PROCEDURAL_LINK__ACTIVATION_KIND:
				return getActivationKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OPMPackage.OPM_PROCEDURAL_LINK__ACTIVATION_KIND:
				return activationKind != ACTIVATION_KIND_EDEFAULT;
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
		result.append(" (ActivationKind: ");
		result.append(activationKind);
		result.append(')');
		return result.toString();
	}

} //OPMProceduralLinkImpl
