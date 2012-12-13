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
 * A representation of the model object '<em><b>OP Meta Model Link Validation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#isIsValid <em>Is Valid</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#getSourceTypeName <em>Source Type Name</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#getTargetTypeName <em>Target Type Name</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#getLinkTypeName <em>Link Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelLinkValidationRule()
 * @model
 * @generated
 */
public interface OPMetaModelLinkValidationRule extends EObject {

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
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelLinkValidationRule_IsValid()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsValid();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#isIsValid <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Valid</em>' attribute.
	 * @see #isIsValid()
	 * @generated
	 */
	void setIsValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type Name</em>' attribute.
	 * @see #setSourceTypeName(String)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelLinkValidationRule_SourceTypeName()
	 * @model required="true"
	 * @generated
	 */
	String getSourceTypeName();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#getSourceTypeName <em>Source Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type Name</em>' attribute.
	 * @see #getSourceTypeName()
	 * @generated
	 */
	void setSourceTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Target Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type Name</em>' attribute.
	 * @see #setTargetTypeName(String)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelLinkValidationRule_TargetTypeName()
	 * @model required="true"
	 * @generated
	 */
	String getTargetTypeName();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#getTargetTypeName <em>Target Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type Name</em>' attribute.
	 * @see #getTargetTypeName()
	 * @generated
	 */
	void setTargetTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Link Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Type Name</em>' attribute.
	 * @see #setLinkTypeName(String)
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#getOPMetaModelLinkValidationRule_LinkTypeName()
	 * @model required="true"
	 * @generated
	 */
	String getLinkTypeName();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#getLinkTypeName <em>Link Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type Name</em>' attribute.
	 * @see #getLinkTypeName()
	 * @generated
	 */
	void setLinkTypeName(String value);
} // OPMetaModelLinkValidationRule
