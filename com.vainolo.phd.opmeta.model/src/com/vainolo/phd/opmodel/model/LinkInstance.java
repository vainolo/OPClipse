/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model;

import java.util.List;

import org.eclipse.draw2d.geometry.Point;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.LinkInstance#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.LinkInstance#getTarget <em>Target</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.LinkInstance#getSource <em>Source</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.LinkInstance#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getLinkInstance()
 * @model
 * @generated
 */
public interface LinkInstance extends InstanceBase {
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
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getLinkInstance_Bendpoints()
	 * @model dataType="com.vainolo.phd.opmodel.model.Point"
	 * @generated
	 */
	List<Point> getBendpoints();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vainolo.phd.opmodel.model.NodeInstance#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NodeInstance)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getLinkInstance_Target()
	 * @see com.vainolo.phd.opmodel.model.NodeInstance#getIncomingLinks
	 * @model opposite="incomingLinks" keys="id" required="true"
	 * @generated
	 */
	NodeInstance getTarget();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.LinkInstance#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NodeInstance value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.vainolo.phd.opmodel.model.NodeInstance#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NodeInstance)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getLinkInstance_Source()
	 * @see com.vainolo.phd.opmodel.model.NodeInstance#getOutgoingLinks
	 * @model opposite="outgoingLinks" keys="id" required="true"
	 * @generated
	 */
	NodeInstance getSource();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.LinkInstance#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NodeInstance value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.vainolo.phd.opmodel.model.ContainerInstance#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(ContainerInstance)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getLinkInstance_Container()
	 * @see com.vainolo.phd.opmodel.model.ContainerInstance#getLinks
	 * @model opposite="links" keys="id" required="true" transient="false"
	 * @generated
	 */
	ContainerInstance getContainer();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.LinkInstance#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ContainerInstance value);

} // LinkInstance
