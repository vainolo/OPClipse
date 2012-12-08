/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Instance Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.ContainerInstanceBase#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.ContainerInstanceBase#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getContainerInstanceBase()
 * @model
 * @generated
 */
public interface ContainerInstanceBase extends InstanceBase {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmeta.model.NodeInstanceBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getContainerInstanceBase_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	List<NodeInstanceBase> getNodes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmeta.model.LinkInstanceBase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getContainerInstanceBase_Links()
	 * @model
	 * @generated
	 */
	List<LinkInstanceBase> getLinks();

} // ContainerInstanceBase
