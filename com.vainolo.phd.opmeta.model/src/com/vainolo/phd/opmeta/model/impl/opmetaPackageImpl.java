/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.impl;

import com.vainolo.phd.opm.model.OPMPackage;

import com.vainolo.phd.opm.model.impl.OPMPackageImpl;

import com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;
import com.vainolo.phd.opmeta.model.opmetaFactory;
import com.vainolo.phd.opmeta.model.opmetaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class opmetaPackageImpl extends EPackageImpl implements opmetaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opMetaModelDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opMetaModelContaimentValidationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opMetaModelLinkValidationRuleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.vainolo.phd.opmeta.model.opmetaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private opmetaPackageImpl() {
		super(eNS_URI, opmetaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link opmetaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static opmetaPackage init() {
		if (isInited) return (opmetaPackage)EPackage.Registry.INSTANCE.getEPackage(opmetaPackage.eNS_URI);

		// Obtain or create and register package
		opmetaPackageImpl theopmetaPackage = (opmetaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof opmetaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new opmetaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OPMPackageImpl theOPMPackage = (OPMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OPMPackage.eNS_URI) instanceof OPMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OPMPackage.eNS_URI) : OPMPackage.eINSTANCE);

		// Create package meta-data objects
		theopmetaPackage.createPackageContents();
		theOPMPackage.createPackageContents();

		// Initialize created meta-data
		theopmetaPackage.initializePackageContents();
		theOPMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theopmetaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(opmetaPackage.eNS_URI, theopmetaPackage);
		return theopmetaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMetaModelDiagram() {
		return opMetaModelDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMetaModelDiagram_ElementsDiagram() {
		return (EReference)opMetaModelDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMetaModelDiagram_LinksDiagram() {
		return (EReference)opMetaModelDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMetaModelDiagram_LinkValidations() {
		return (EReference)opMetaModelDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPMetaModelDiagram_ContaimentValidations() {
		return (EReference)opMetaModelDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMetaModelContaimentValidationRule() {
		return opMetaModelContaimentValidationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMetaModelContaimentValidationRule_Valid() {
		return (EAttribute)opMetaModelContaimentValidationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMetaModelContaimentValidationRule_ContainerTypeName() {
		return (EAttribute)opMetaModelContaimentValidationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMetaModelContaimentValidationRule_NodeTypeName() {
		return (EAttribute)opMetaModelContaimentValidationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPMetaModelLinkValidationRule() {
		return opMetaModelLinkValidationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMetaModelLinkValidationRule_Valid() {
		return (EAttribute)opMetaModelLinkValidationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMetaModelLinkValidationRule_SourceTypeName() {
		return (EAttribute)opMetaModelLinkValidationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMetaModelLinkValidationRule_TargetTypeName() {
		return (EAttribute)opMetaModelLinkValidationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMetaModelLinkValidationRule_LinkTypeName() {
		return (EAttribute)opMetaModelLinkValidationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public opmetaFactory getopmetaFactory() {
		return (opmetaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		opMetaModelDiagramEClass = createEClass(OP_META_MODEL_DIAGRAM);
		createEReference(opMetaModelDiagramEClass, OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM);
		createEReference(opMetaModelDiagramEClass, OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM);
		createEReference(opMetaModelDiagramEClass, OP_META_MODEL_DIAGRAM__LINK_VALIDATIONS);
		createEReference(opMetaModelDiagramEClass, OP_META_MODEL_DIAGRAM__CONTAIMENT_VALIDATIONS);

		opMetaModelContaimentValidationRuleEClass = createEClass(OP_META_MODEL_CONTAIMENT_VALIDATION_RULE);
		createEAttribute(opMetaModelContaimentValidationRuleEClass, OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__VALID);
		createEAttribute(opMetaModelContaimentValidationRuleEClass, OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE_NAME);
		createEAttribute(opMetaModelContaimentValidationRuleEClass, OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE_NAME);

		opMetaModelLinkValidationRuleEClass = createEClass(OP_META_MODEL_LINK_VALIDATION_RULE);
		createEAttribute(opMetaModelLinkValidationRuleEClass, OP_META_MODEL_LINK_VALIDATION_RULE__VALID);
		createEAttribute(opMetaModelLinkValidationRuleEClass, OP_META_MODEL_LINK_VALIDATION_RULE__SOURCE_TYPE_NAME);
		createEAttribute(opMetaModelLinkValidationRuleEClass, OP_META_MODEL_LINK_VALIDATION_RULE__TARGET_TYPE_NAME);
		createEAttribute(opMetaModelLinkValidationRuleEClass, OP_META_MODEL_LINK_VALIDATION_RULE__LINK_TYPE_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OPMPackage theOPMPackage = (OPMPackage)EPackage.Registry.INSTANCE.getEPackage(OPMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(opMetaModelDiagramEClass, OPMetaModelDiagram.class, "OPMetaModelDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOPMetaModelDiagram_ElementsDiagram(), theOPMPackage.getOPMObjectProcessDiagram(), null, "ElementsDiagram", null, 1, 1, OPMetaModelDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPMetaModelDiagram_LinksDiagram(), theOPMPackage.getOPMObjectProcessDiagram(), null, "LinksDiagram", null, 1, 1, OPMetaModelDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPMetaModelDiagram_LinkValidations(), this.getOPMetaModelLinkValidationRule(), null, "LinkValidations", null, 0, -1, OPMetaModelDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPMetaModelDiagram_ContaimentValidations(), this.getOPMetaModelContaimentValidationRule(), null, "ContaimentValidations", null, 0, -1, OPMetaModelDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opMetaModelContaimentValidationRuleEClass, OPMetaModelContaimentValidationRule.class, "OPMetaModelContaimentValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPMetaModelContaimentValidationRule_Valid(), ecorePackage.getEBoolean(), "Valid", null, 1, 1, OPMetaModelContaimentValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMetaModelContaimentValidationRule_ContainerTypeName(), ecorePackage.getEString(), "ContainerTypeName", null, 1, 1, OPMetaModelContaimentValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMetaModelContaimentValidationRule_NodeTypeName(), ecorePackage.getEString(), "NodeTypeName", null, 1, 1, OPMetaModelContaimentValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opMetaModelLinkValidationRuleEClass, OPMetaModelLinkValidationRule.class, "OPMetaModelLinkValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPMetaModelLinkValidationRule_Valid(), ecorePackage.getEBoolean(), "Valid", null, 1, 1, OPMetaModelLinkValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMetaModelLinkValidationRule_SourceTypeName(), ecorePackage.getEString(), "SourceTypeName", null, 1, 1, OPMetaModelLinkValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMetaModelLinkValidationRule_TargetTypeName(), ecorePackage.getEString(), "TargetTypeName", null, 1, 1, OPMetaModelLinkValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMetaModelLinkValidationRule_LinkTypeName(), ecorePackage.getEString(), "LinkTypeName", null, 1, 1, OPMetaModelLinkValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //opmetaPackageImpl
