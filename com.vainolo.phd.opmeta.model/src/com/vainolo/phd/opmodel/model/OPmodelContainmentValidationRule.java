/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OPmodel Containment Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmodelContainmentValidationRule#isValid <em>Valid</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmodelContainmentValidationRule#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmodelContainmentValidationRule#getNodeType <em>Node Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelContainmentValidationRule()
 * @model
 * @generated
 */
public interface OPmodelContainmentValidationRule extends EObject {
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
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelContainmentValidationRule_Valid()
	 * @model
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.OPmodelContainmentValidationRule#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Container Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Type</em>' reference.
	 * @see #setContainerType(TypeDescriptor)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelContainmentValidationRule_ContainerType()
	 * @model keys="id" required="true"
	 * @generated
	 */
	TypeDescriptor getContainerType();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.OPmodelContainmentValidationRule#getContainerType <em>Container Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Type</em>' reference.
	 * @see #getContainerType()
	 * @generated
	 */
	void setContainerType(TypeDescriptor value);

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' reference.
	 * @see #setNodeType(TypeDescriptor)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelContainmentValidationRule_NodeType()
	 * @model keys="id" required="true"
	 * @generated
	 */
	TypeDescriptor getNodeType();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.OPmodelContainmentValidationRule#getNodeType <em>Node Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' reference.
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(TypeDescriptor value);

} // OPmodelContainmentValidationRule
