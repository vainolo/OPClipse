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
 * A representation of the model object '<em><b>OPmodel Link Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#isValid <em>Valid</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#getLinkType <em>Link Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelLinkValidationRule()
 * @model
 * @generated
 */
public interface OPmodelLinkValidationRule extends EObject {
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
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelLinkValidationRule_Valid()
	 * @model
	 * @generated
	 */
	boolean isValid();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#isValid <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid</em>' attribute.
	 * @see #isValid()
	 * @generated
	 */
	void setValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' reference.
	 * @see #setSourceType(TypeDescriptor)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelLinkValidationRule_SourceType()
	 * @model keys="id" required="true"
	 * @generated
	 */
	TypeDescriptor getSourceType();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#getSourceType <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' reference.
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(TypeDescriptor value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' reference.
	 * @see #setTargetType(TypeDescriptor)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelLinkValidationRule_TargetType()
	 * @model keys="id" required="true"
	 * @generated
	 */
	TypeDescriptor getTargetType();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#getTargetType <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' reference.
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(TypeDescriptor value);

	/**
	 * Returns the value of the '<em><b>Link Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Type</em>' reference.
	 * @see #setLinkType(TypeDescriptor)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelLinkValidationRule_LinkType()
	 * @model keys="id" required="true"
	 * @generated
	 */
	TypeDescriptor getLinkType();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#getLinkType <em>Link Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type</em>' reference.
	 * @see #getLinkType()
	 * @generated
	 */
	void setLinkType(TypeDescriptor value);

} // OPmodelLinkValidationRule
