/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.impl;

import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;

import com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;
import com.vainolo.phd.opmeta.model.opmetaFactory;
import com.vainolo.phd.opmeta.model.opmetaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType opmObjectProcessDiagramEDataType = null;

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

		// Create package meta-data objects
		theopmetaPackage.createPackageContents();

		// Initialize created meta-data
		theopmetaPackage.initializePackageContents();

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
	public EAttribute getOPMetaModelDiagram_ElementsDiagram() {
		return (EAttribute)opMetaModelDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPMetaModelDiagram_LinksDiagram() {
		return (EAttribute)opMetaModelDiagramEClass.getEStructuralFeatures().get(1);
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
	public EClass getOPMetaModelLinkValidationRule() {
		return opMetaModelLinkValidationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOPMObjectProcessDiagram() {
		return opmObjectProcessDiagramEDataType;
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
		createEAttribute(opMetaModelDiagramEClass, OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM);
		createEAttribute(opMetaModelDiagramEClass, OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM);

		opMetaModelContaimentValidationRuleEClass = createEClass(OP_META_MODEL_CONTAIMENT_VALIDATION_RULE);

		opMetaModelLinkValidationRuleEClass = createEClass(OP_META_MODEL_LINK_VALIDATION_RULE);

		// Create data types
		opmObjectProcessDiagramEDataType = createEDataType(OPM_OBJECT_PROCESS_DIAGRAM);
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

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(opMetaModelDiagramEClass, OPMetaModelDiagram.class, "OPMetaModelDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPMetaModelDiagram_ElementsDiagram(), this.getOPMObjectProcessDiagram(), "ElementsDiagram", null, 1, 1, OPMetaModelDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPMetaModelDiagram_LinksDiagram(), this.getOPMObjectProcessDiagram(), "LinksDiagram", null, 1, 1, OPMetaModelDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opMetaModelContaimentValidationRuleEClass, OPMetaModelContaimentValidationRule.class, "OPMetaModelContaimentValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opMetaModelLinkValidationRuleEClass, OPMetaModelLinkValidationRule.class, "OPMetaModelLinkValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(opmObjectProcessDiagramEDataType, OPMObjectProcessDiagram.class, "OPMObjectProcessDiagram", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //opmetaPackageImpl
