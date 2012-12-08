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
 *   <li>{@link com.vainolo.phd.opmeta.model.OPModel#getNextId <em>Next Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPModel()
 * @model
 * @generated
 */
public interface OPModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model</em>' containment reference.
	 * @see #setMetaModel(OPMetaModelDiagram)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPModel_MetaModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OPMetaModelDiagram getMetaModel();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPModel#getMetaModel <em>Meta Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model</em>' containment reference.
	 * @see #getMetaModel()
	 * @generated
	 */
	void setMetaModel(OPMetaModelDiagram value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(ContainerInstanceBase)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPModel_Container()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContainerInstanceBase getContainer();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPModel#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ContainerInstanceBase value);

	/**
	 * Returns the value of the '<em><b>Next Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Id</em>' attribute.
	 * @see #setNextId(long)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPModel_NextId()
	 * @model required="true"
	 * @generated
	 */
	long getNextId();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPModel#getNextId <em>Next Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Id</em>' attribute.
	 * @see #getNextId()
	 * @generated
	 */
	void setNextId(long value);

} // OPModel
