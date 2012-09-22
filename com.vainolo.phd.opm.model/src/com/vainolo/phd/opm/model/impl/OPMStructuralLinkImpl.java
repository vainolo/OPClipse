/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model.impl;

import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.OPMStructuralLink;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opm.model.impl.OPMStructuralLinkImpl#getAggregatorPosition <em>Aggregator Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OPMStructuralLinkImpl extends OPMLinkImpl implements OPMStructuralLink {
	/**
	 * The default value of the '{@link #getAggregatorPosition() <em>Aggregator Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatorPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Point AGGREGATOR_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregatorPosition() <em>Aggregator Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatorPosition()
	 * @generated
	 * @ordered
	 */
	protected Point aggregatorPosition = AGGREGATOR_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPMStructuralLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OPMPackage.Literals.OPM_STRUCTURAL_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getAggregatorPosition() {
		return aggregatorPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregatorPosition(Point newAggregatorPosition) {
		Point oldAggregatorPosition = aggregatorPosition;
		aggregatorPosition = newAggregatorPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPMPackage.OPM_STRUCTURAL_LINK__AGGREGATOR_POSITION, oldAggregatorPosition, aggregatorPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OPMPackage.OPM_STRUCTURAL_LINK__AGGREGATOR_POSITION:
				return getAggregatorPosition();
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
			case OPMPackage.OPM_STRUCTURAL_LINK__AGGREGATOR_POSITION:
				setAggregatorPosition((Point)newValue);
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
			case OPMPackage.OPM_STRUCTURAL_LINK__AGGREGATOR_POSITION:
				setAggregatorPosition(AGGREGATOR_POSITION_EDEFAULT);
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
			case OPMPackage.OPM_STRUCTURAL_LINK__AGGREGATOR_POSITION:
				return AGGREGATOR_POSITION_EDEFAULT == null ? aggregatorPosition != null : !AGGREGATOR_POSITION_EDEFAULT.equals(aggregatorPosition);
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
		result.append(" (aggregatorPosition: ");
		result.append(aggregatorPosition);
		result.append(')');
		return result.toString();
	}

} //OPMStructuralLinkImpl
