/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model;

import java.util.List;
import org.eclipse.draw2d.geometry.Rectangle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.NodeInstance#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.NodeInstance#getName <em>Name</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.NodeInstance#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.NodeInstance#getOutgoingLinks <em>Outgoing Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getNodeInstance()
 * @model
 * @generated
 */
public interface NodeInstance extends InstanceBase {
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
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getNodeInstance_Constraints()
	 * @model default="0,0,50,50" dataType="com.vainolo.phd.opmodel.model.Rectangle" required="true"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.NodeInstance#getConstraints <em>Constraints</em>}' attribute.
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
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getNodeInstance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.NodeInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.LinkInstance}.
	 * It is bidirectional and its opposite is '{@link com.vainolo.phd.opmodel.model.LinkInstance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getNodeInstance_IncomingLinks()
	 * @see com.vainolo.phd.opmodel.model.LinkInstance#getTarget
	 * @model opposite="target" keys="id"
	 * @generated
	 */
	List<LinkInstance> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.LinkInstance}.
	 * It is bidirectional and its opposite is '{@link com.vainolo.phd.opmodel.model.LinkInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getNodeInstance_OutgoingLinks()
	 * @see com.vainolo.phd.opmodel.model.LinkInstance#getSource
	 * @model opposite="source" keys="id"
	 * @generated
	 */
	List<LinkInstance> getOutgoingLinks();

} // NodeInstance
