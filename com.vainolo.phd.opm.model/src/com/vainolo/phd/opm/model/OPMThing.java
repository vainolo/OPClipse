/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opm.model.OPMThing#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.OPMThing#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opm.model.OPMPackage#getOPMThing()
 * @model
 * @generated
 */
public interface OPMThing extends OPMNode {
	/**
     * Returns the value of the '<em><b>Constraints</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Constraints</em>' attribute.
     * @see #setConstraints(Rectangle)
     * @see com.vainolo.phd.opm.model.OPMPackage#getOPMThing_Constraints()
     * @model default="" dataType="com.vainolo.phd.opm.model.Rectangle"
     * @generated
     */
	Rectangle getConstraints();

	/**
     * Sets the value of the '{@link com.vainolo.phd.opm.model.OPMThing#getConstraints <em>Constraints</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constraints</em>' attribute.
     * @see #getConstraints()
     * @generated
     */
	void setConstraints(Rectangle value);

	/**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see com.vainolo.phd.opm.model.OPMPackage#getOPMThing_Name()
     * @model
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link com.vainolo.phd.opm.model.OPMThing#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

} // OPMThing
