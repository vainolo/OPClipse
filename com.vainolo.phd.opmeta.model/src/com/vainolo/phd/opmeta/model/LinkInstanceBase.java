/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model;

import java.util.List;
import org.eclipse.draw2d.geometry.Point;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Instance Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.LinkInstanceBase#getSource <em>Source</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.LinkInstanceBase#getTarget <em>Target</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.LinkInstanceBase#getBendpoints <em>Bendpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getLinkInstanceBase()
 * @model
 * @generated
 */
public interface LinkInstanceBase extends InstanceBase {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NodeInstanceBase)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getLinkInstanceBase_Source()
	 * @model keys="Id"
	 * @generated
	 */
	NodeInstanceBase getSource();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.LinkInstanceBase#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NodeInstanceBase value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NodeInstanceBase)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getLinkInstanceBase_Target()
	 * @model keys="Id"
	 * @generated
	 */
	NodeInstanceBase getTarget();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.LinkInstanceBase#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NodeInstanceBase value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' attribute list.
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getLinkInstanceBase_Bendpoints()
	 * @model dataType="com.vainolo.phd.opmeta.model.Point"
	 * @generated
	 */
	List<Point> getBendpoints();

} // LinkInstanceBase
