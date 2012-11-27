/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model;


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
	 * It is bidirectional and its opposite is '{@link com.vainolo.phd.opmeta.model.NodeInstanceBase#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NodeInstanceBase)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getLinkInstanceBase_Source()
	 * @see com.vainolo.phd.opmeta.model.NodeInstanceBase#getOutgoingLinks
	 * @model opposite="outgoingLinks"
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
	 * It is bidirectional and its opposite is '{@link com.vainolo.phd.opmeta.model.NodeInstanceBase#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NodeInstanceBase)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getLinkInstanceBase_Target()
	 * @see com.vainolo.phd.opmeta.model.NodeInstanceBase#getIncomingLinks
	 * @model opposite="incomingLinks"
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

} // LinkInstanceBase
