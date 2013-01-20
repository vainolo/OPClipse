/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.vainolo.phd.opmodel.model.opmodelPackage
 * @generated
 */
public interface opmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	opmodelFactory eINSTANCE = com.vainolo.phd.opmodel.model.impl.opmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>key Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>key Value Pair</em>'.
	 * @generated
	 */
	keyValuePair createkeyValuePair();

	/**
	 * Returns a new object of class '<em>Node Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Instance</em>'.
	 * @generated
	 */
	NodeInstance createNodeInstance();

	/**
	 * Returns a new object of class '<em>Link Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Instance</em>'.
	 * @generated
	 */
	LinkInstance createLinkInstance();

	/**
	 * Returns a new object of class '<em>Container Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Instance</em>'.
	 * @generated
	 */
	ContainerInstance createContainerInstance();

	/**
	 * Returns a new object of class '<em>Thing Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thing Instance</em>'.
	 * @generated
	 */
	ThingInstance createThingInstance();

	/**
	 * Returns a new object of class '<em>Type Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Descriptor</em>'.
	 * @generated
	 */
	TypeDescriptor createTypeDescriptor();

	/**
	 * Returns a new object of class '<em>Property Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Descriptor</em>'.
	 * @generated
	 */
	PropertyDescriptor createPropertyDescriptor();

	/**
	 * Returns a new object of class '<em>OPmodel Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OPmodel Holder</em>'.
	 * @generated
	 */
	OPmodelHolder createOPmodelHolder();

	/**
	 * Returns a new object of class '<em>OPmeta Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OPmeta Definition</em>'.
	 * @generated
	 */
	OPmetaDefinition createOPmetaDefinition();

	/**
	 * Returns a new object of class '<em>Property Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Instance</em>'.
	 * @generated
	 */
	PropertyInstance createPropertyInstance();

	/**
	 * Returns a new object of class '<em>Property Int Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Int Instance</em>'.
	 * @generated
	 */
	PropertyIntInstance createPropertyIntInstance();

	/**
	 * Returns a new object of class '<em>Property Float Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Float Instance</em>'.
	 * @generated
	 */
	PropertyFloatInstance createPropertyFloatInstance();

	/**
	 * Returns a new object of class '<em>Property Boolean Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Boolean Instance</em>'.
	 * @generated
	 */
	PropertyBooleanInstance createPropertyBooleanInstance();

	/**
	 * Returns a new object of class '<em>OPmodel Link Validation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OPmodel Link Validation Rule</em>'.
	 * @generated
	 */
	OPmodelLinkValidationRule createOPmodelLinkValidationRule();

	/**
	 * Returns a new object of class '<em>OPmodel Containment Validation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OPmodel Containment Validation Rule</em>'.
	 * @generated
	 */
	OPmodelContainmentValidationRule createOPmodelContainmentValidationRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	opmodelPackage getopmodelPackage();

} //opmodelFactory
