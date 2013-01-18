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
 * A representation of the model object '<em><b>OPmodel Contaiment Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule#getNodeType <em>Node Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelContaimentValidationRule()
 * @model
 * @generated
 */
public interface OPmodelContaimentValidationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Valid</em>' attribute.
	 * @see #setIsValid(boolean)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelContaimentValidationRule_IsValid()
	 * @model
	 * @generated
	 */
	boolean isIsValid();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule#isIsValid <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Valid</em>' attribute.
	 * @see #isIsValid()
	 * @generated
	 */
	void setIsValid(boolean value);

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
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelContaimentValidationRule_ContainerType()
	 * @model keys="id" required="true"
	 * @generated
	 */
	TypeDescriptor getContainerType();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule#getContainerType <em>Container Type</em>}' reference.
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
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelContaimentValidationRule_NodeType()
	 * @model keys="id" required="true"
	 * @generated
	 */
	TypeDescriptor getNodeType();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule#getNodeType <em>Node Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' reference.
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(TypeDescriptor value);

} // OPmodelContaimentValidationRule
