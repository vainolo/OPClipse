/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model;

import org.eclipse.draw2d.geometry.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opm.model.OPMStructuralLink#getAggregatorPosition <em>Aggregator Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opm.model.OPMPackage#getOPMStructuralLink()
 * @model abstract="true"
 * @generated
 */
public interface OPMStructuralLink extends OPMLink {
	/**
	 * Returns the value of the '<em><b>Aggregator Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregator Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregator Position</em>' attribute.
	 * @see #setAggregatorPosition(Point)
	 * @see com.vainolo.phd.opm.model.OPMPackage#getOPMStructuralLink_AggregatorPosition()
	 * @model dataType="com.vainolo.phd.opm.model.Point"
	 * @generated
	 */
	Point getAggregatorPosition();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opm.model.OPMStructuralLink#getAggregatorPosition <em>Aggregator Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregator Position</em>' attribute.
	 * @see #getAggregatorPosition()
	 * @generated
	 */
	void setAggregatorPosition(Point value);

} // OPMStructuralLink
