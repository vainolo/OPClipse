/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.vainolo.phd.opmeta.model.opmetaPackage
 * @generated
 */
public interface opmetaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	opmetaFactory eINSTANCE = com.vainolo.phd.opmeta.model.impl.opmetaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>OP Meta Model Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OP Meta Model Diagram</em>'.
	 * @generated
	 */
	OPMetaModelDiagram createOPMetaModelDiagram();

	/**
	 * Returns a new object of class '<em>OP Meta Model Contaiment Validation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OP Meta Model Contaiment Validation Rule</em>'.
	 * @generated
	 */
	OPMetaModelContaimentValidationRule createOPMetaModelContaimentValidationRule();

	/**
	 * Returns a new object of class '<em>OP Meta Model Link Validation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OP Meta Model Link Validation Rule</em>'.
	 * @generated
	 */
	OPMetaModelLinkValidationRule createOPMetaModelLinkValidationRule();

	/**
	 * Returns a new object of class '<em>OP Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OP Model</em>'.
	 * @generated
	 */
	OPModel createOPModel();

	/**
	 * Returns a new object of class '<em>Node Instance Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Instance Base</em>'.
	 * @generated
	 */
	NodeInstanceBase createNodeInstanceBase();

	/**
	 * Returns a new object of class '<em>Container Instance Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Instance Base</em>'.
	 * @generated
	 */
	ContainerInstanceBase createContainerInstanceBase();

	/**
	 * Returns a new object of class '<em>Link Instance Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Instance Base</em>'.
	 * @generated
	 */
	LinkInstanceBase createLinkInstanceBase();

	/**
	 * Returns a new object of class '<em>Thing Instance Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thing Instance Base</em>'.
	 * @generated
	 */
	ThingInstanceBase createThingInstanceBase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	opmetaPackage getopmetaPackage();

} //opmetaFactory
