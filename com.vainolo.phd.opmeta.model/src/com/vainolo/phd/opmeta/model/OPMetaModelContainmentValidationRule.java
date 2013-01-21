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
 * A representation of the model object '<em><b>OP Meta Model Containment Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule#isValid <em>Valid</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule#getContainerTypeName <em>Container Type Name</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule#getNodeTypeName <em>Node Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelContainmentValidationRule()
 * @model
 * @generated
 */
public interface OPMetaModelContainmentValidationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see #setValid(boolean)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelContainmentValidationRule_Valid()
	 * @model required="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Container Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Type Name</em>' attribute.
	 * @see #setContainerTypeName(String)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelContainmentValidationRule_ContainerTypeName()
	 * @model required="true"
	 * @generated
	 */
	String getContainerTypeName();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule#getContainerTypeName <em>Container Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Type Name</em>' attribute.
	 * @see #getContainerTypeName()
	 * @generated
	 */
	void setContainerTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Node Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type Name</em>' attribute.
	 * @see #setNodeTypeName(String)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelContainmentValidationRule_NodeTypeName()
	 * @model required="true"
	 * @generated
	 */
	String getNodeTypeName();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule#getNodeTypeName <em>Node Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type Name</em>' attribute.
	 * @see #getNodeTypeName()
	 * @generated
	 */
	void setNodeTypeName(String value);

} // OPMetaModelContainmentValidationRule
