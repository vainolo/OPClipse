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
	 * Returns a new object of class '<em>OP Meta Model Containment Validation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OP Meta Model Containment Validation Rule</em>'.
	 * @generated
	 */
	OPMetaModelContainmentValidationRule createOPMetaModelContainmentValidationRule();

	/**
	 * Returns a new object of class '<em>OP Meta Model Link Validation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OP Meta Model Link Validation Rule</em>'.
	 * @generated
	 */
	OPMetaModelLinkValidationRule createOPMetaModelLinkValidationRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	opmetaPackage getopmetaPackage();

} //opmetaFactory
