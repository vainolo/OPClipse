/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.impl;

import com.vainolo.phd.opmeta.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class opmetaFactoryImpl extends EFactoryImpl implements opmetaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static opmetaFactory init() {
		try {
			opmetaFactory theopmetaFactory = (opmetaFactory)EPackage.Registry.INSTANCE.getEFactory("www.vainolo.com/phd/opmeta"); 
			if (theopmetaFactory != null) {
				return theopmetaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new opmetaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public opmetaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case opmetaPackage.OP_META_MODEL_DIAGRAM: return createOPMetaModelDiagram();
			case opmetaPackage.OP_META_MODEL_CONTAINMENT_VALIDATION_RULE: return createOPMetaModelContainmentValidationRule();
			case opmetaPackage.OP_META_MODEL_LINK_VALIDATION_RULE: return createOPMetaModelLinkValidationRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMetaModelDiagram createOPMetaModelDiagram() {
		OPMetaModelDiagramImpl opMetaModelDiagram = new OPMetaModelDiagramImpl();
		return opMetaModelDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMetaModelContainmentValidationRule createOPMetaModelContainmentValidationRule() {
		OPMetaModelContainmentValidationRuleImpl opMetaModelContainmentValidationRule = new OPMetaModelContainmentValidationRuleImpl();
		return opMetaModelContainmentValidationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMetaModelLinkValidationRule createOPMetaModelLinkValidationRule() {
		OPMetaModelLinkValidationRuleImpl opMetaModelLinkValidationRule = new OPMetaModelLinkValidationRuleImpl();
		return opMetaModelLinkValidationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public opmetaPackage getopmetaPackage() {
		return (opmetaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static opmetaPackage getPackage() {
		return opmetaPackage.eINSTANCE;
	}

} //opmetaFactoryImpl
