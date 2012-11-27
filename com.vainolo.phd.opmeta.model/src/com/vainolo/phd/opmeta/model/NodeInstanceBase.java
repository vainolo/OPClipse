/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model;

import java.util.List;

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
 *   <li>{@link com.vainolo.phd.opmeta.model.NodeInstanceBase#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.NodeInstanceBase#getIncomingLinks <em>Incoming Links</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Rectangle)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getNodeInstanceBase_Constraints()
	 * @model dataType="com.vainolo.phd.opm.model.Rectangle"
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

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmeta.model.LinkInstanceBase}.
	 * It is bidirectional and its opposite is '{@link com.vainolo.phd.opmeta.model.LinkInstanceBase#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getNodeInstanceBase_OutgoingLinks()
	 * @see com.vainolo.phd.opmeta.model.LinkInstanceBase#getSource
	 * @model opposite="source"
	 * @generated
	 */
	List<LinkInstanceBase> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmeta.model.LinkInstanceBase}.
	 * It is bidirectional and its opposite is '{@link com.vainolo.phd.opmeta.model.LinkInstanceBase#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getNodeInstanceBase_IncomingLinks()
	 * @see com.vainolo.phd.opmeta.model.LinkInstanceBase#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	List<LinkInstanceBase> getIncomingLinks();

} // NodeInstanceBase
