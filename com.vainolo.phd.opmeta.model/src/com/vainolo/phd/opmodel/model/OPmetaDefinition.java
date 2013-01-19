/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OPmeta Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmetaDefinition#getTypes <em>Types</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmetaDefinition#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmetaDefinition#getContainers <em>Containers</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmetaDefinition#getLinks <em>Links</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmetaDefinition#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmetaDefinition#getLinkValidationRules <em>Link Validation Rules</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmetaDefinition#getContaimentValidationRules <em>Contaiment Validation Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmetaDefinition()
 * @model
 * @generated
 */
public interface OPmetaDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.TypeDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmetaDefinition_Types()
	 * @model containment="true" lower="3"
	 * @generated
	 */
	List<TypeDescriptor> getTypes();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.TypeDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmetaDefinition_Nodes()
	 * @model keys="id" required="true"
	 * @generated
	 */
	List<TypeDescriptor> getNodes();

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.TypeDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmetaDefinition_Containers()
	 * @model keys="id" required="true"
	 * @generated
	 */
	List<TypeDescriptor> getContainers();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.TypeDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmetaDefinition_Links()
	 * @model keys="id" required="true"
	 * @generated
	 */
	List<TypeDescriptor> getLinks();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.PropertyDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmetaDefinition_Properties()
	 * @model containment="true"
	 * @generated
	 */
	List<PropertyDescriptor> getProperties();

	/**
	 * Returns the value of the '<em><b>Link Validation Rules</b></em>' containment reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Validation Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Validation Rules</em>' containment reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmetaDefinition_LinkValidationRules()
	 * @model containment="true"
	 * @generated
	 */
	List<OPmodelLinkValidationRule> getLinkValidationRules();

	/**
	 * Returns the value of the '<em><b>Contaiment Validation Rules</b></em>' reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contaiment Validation Rules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contaiment Validation Rules</em>' reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmetaDefinition_ContaimentValidationRules()
	 * @model
	 * @generated
	 */
	List<OPmodelContaimentValidationRule> getContaimentValidationRules();

} // OPmetaDefinition
