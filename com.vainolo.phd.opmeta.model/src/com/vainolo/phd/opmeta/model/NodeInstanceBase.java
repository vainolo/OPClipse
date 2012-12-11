/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model;

import org.eclipse.draw2d.geometry.Rectangle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Instance Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.NodeInstanceBase#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.NodeInstanceBase#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getNodeInstanceBase()
 * @model
 * @generated
 */
public interface NodeInstanceBase extends InstanceBase {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * The default value is <code>"0,0,50,50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Rectangle)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getNodeInstanceBase_Constraints()
	 * @model default="0,0,50,50" dataType="com.vainolo.phd.opm.model.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.NodeInstanceBase#getConstraints <em>Constraints</em>}' attribute.
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
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getNodeInstanceBase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.NodeInstanceBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NodeInstanceBase
