/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OP Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.OPModel#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.OPModel#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPModel()
 * @model
 * @generated
 */
public interface OPModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model</em>' reference.
	 * @see #setMetaModel(OPMetaModelDiagram)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPModel_MetaModel()
	 * @model
	 * @generated
	 */
	OPMetaModelDiagram getMetaModel();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPModel#getMetaModel <em>Meta Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model</em>' reference.
	 * @see #getMetaModel()
	 * @generated
	 */
	void setMetaModel(OPMetaModelDiagram value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(ContainerInstanceBase)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPModel_Container()
	 * @model required="true"
	 * @generated
	 */
	ContainerInstanceBase getContainer();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPModel#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ContainerInstanceBase value);

} // OPModel
