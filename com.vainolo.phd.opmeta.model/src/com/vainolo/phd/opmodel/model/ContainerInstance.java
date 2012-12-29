/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.ContainerInstance#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.ContainerInstance#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getContainerInstance()
 * @model
 * @generated
 */
public interface ContainerInstance extends InstanceBase {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.NodeInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getContainerInstance_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	List<NodeInstance> getNodes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.LinkInstance}.
	 * It is bidirectional and its opposite is '{@link com.vainolo.phd.opmodel.model.LinkInstance#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getContainerInstance_Links()
	 * @see com.vainolo.phd.opmodel.model.LinkInstance#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	List<LinkInstance> getLinks();

} // ContainerInstance
