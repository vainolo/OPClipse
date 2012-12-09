/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.impl;

import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.impl.OPMPackageImpl;

import com.vainolo.phd.opmeta.model.ContainerInstanceBase;
import com.vainolo.phd.opmeta.model.InstanceBase;
import com.vainolo.phd.opmeta.model.LinkInstanceBase;
import com.vainolo.phd.opmeta.model.NodeInstanceBase;
import com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;
import com.vainolo.phd.opmeta.model.OPModel;
import com.vainolo.phd.opmeta.model.ThingInstanceBase;
import com.vainolo.phd.opmeta.model.opmetaFactory;
import com.vainolo.phd.opmeta.model.opmetaPackage;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeInstanceBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerInstanceBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkInstanceBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingInstanceBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rectangleEDataType = null;

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
	public EClass getOPModel() {
		return opModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPModel_MetaModel() {
		return (EReference)opModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPModel_Container() {
		return (EReference)opModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPModel_NextId() {
		return (EAttribute)opModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceBase() {
		return instanceBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceBase_TypeName() {
		return (EAttribute)instanceBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceBase_Id() {
		return (EAttribute)instanceBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeInstanceBase() {
		return nodeInstanceBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeInstanceBase_Constraints() {
		return (EAttribute)nodeInstanceBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeInstanceBase_Name() {
		return (EAttribute)nodeInstanceBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerInstanceBase() {
		return containerInstanceBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerInstanceBase_Nodes() {
		return (EReference)containerInstanceBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerInstanceBase_Links() {
		return (EReference)containerInstanceBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkInstanceBase() {
		return linkInstanceBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkInstanceBase_Source() {
		return (EReference)linkInstanceBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkInstanceBase_Target() {
		return (EReference)linkInstanceBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThingInstanceBase() {
		return thingInstanceBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRectangle() {
		return rectangleEDataType;
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

		opMetaModelContaimentValidationRuleEClass = createEClass(OP_META_MODEL_CONTAIMENT_VALIDATION_RULE);

		opMetaModelLinkValidationRuleEClass = createEClass(OP_META_MODEL_LINK_VALIDATION_RULE);

		opModelEClass = createEClass(OP_MODEL);
		createEReference(opModelEClass, OP_MODEL__META_MODEL);
		createEReference(opModelEClass, OP_MODEL__CONTAINER);
		createEAttribute(opModelEClass, OP_MODEL__NEXT_ID);

		instanceBaseEClass = createEClass(INSTANCE_BASE);
		createEAttribute(instanceBaseEClass, INSTANCE_BASE__TYPE_NAME);
		createEAttribute(instanceBaseEClass, INSTANCE_BASE__ID);

		nodeInstanceBaseEClass = createEClass(NODE_INSTANCE_BASE);
		createEAttribute(nodeInstanceBaseEClass, NODE_INSTANCE_BASE__CONSTRAINTS);
		createEAttribute(nodeInstanceBaseEClass, NODE_INSTANCE_BASE__NAME);

		containerInstanceBaseEClass = createEClass(CONTAINER_INSTANCE_BASE);
		createEReference(containerInstanceBaseEClass, CONTAINER_INSTANCE_BASE__NODES);
		createEReference(containerInstanceBaseEClass, CONTAINER_INSTANCE_BASE__LINKS);

		linkInstanceBaseEClass = createEClass(LINK_INSTANCE_BASE);
		createEReference(linkInstanceBaseEClass, LINK_INSTANCE_BASE__SOURCE);
		createEReference(linkInstanceBaseEClass, LINK_INSTANCE_BASE__TARGET);

		thingInstanceBaseEClass = createEClass(THING_INSTANCE_BASE);

		// Create data types
		rectangleEDataType = createEDataType(RECTANGLE);
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
		nodeInstanceBaseEClass.getESuperTypes().add(this.getInstanceBase());
		containerInstanceBaseEClass.getESuperTypes().add(this.getInstanceBase());
		linkInstanceBaseEClass.getESuperTypes().add(this.getInstanceBase());
		thingInstanceBaseEClass.getESuperTypes().add(this.getNodeInstanceBase());
		thingInstanceBaseEClass.getESuperTypes().add(this.getContainerInstanceBase());

		// Initialize classes and features; add operations and parameters
		initEClass(opMetaModelDiagramEClass, OPMetaModelDiagram.class, "OPMetaModelDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOPMetaModelDiagram_ElementsDiagram(), theOPMPackage.getOPMObjectProcessDiagram(), null, "ElementsDiagram", null, 1, 1, OPMetaModelDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPMetaModelDiagram_LinksDiagram(), theOPMPackage.getOPMObjectProcessDiagram(), null, "LinksDiagram", null, 1, 1, OPMetaModelDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opMetaModelContaimentValidationRuleEClass, OPMetaModelContaimentValidationRule.class, "OPMetaModelContaimentValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opMetaModelLinkValidationRuleEClass, OPMetaModelLinkValidationRule.class, "OPMetaModelLinkValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opModelEClass, OPModel.class, "OPModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOPModel_MetaModel(), this.getOPMetaModelDiagram(), null, "MetaModel", null, 1, 1, OPModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPModel_Container(), this.getContainerInstanceBase(), null, "Container", null, 1, 1, OPModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPModel_NextId(), ecorePackage.getELong(), "NextId", null, 1, 1, OPModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceBaseEClass, InstanceBase.class, "InstanceBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceBase_TypeName(), ecorePackage.getEString(), "TypeName", null, 0, 1, InstanceBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBase_Id(), ecorePackage.getELong(), "Id", null, 0, 1, InstanceBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeInstanceBaseEClass, NodeInstanceBase.class, "NodeInstanceBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeInstanceBase_Constraints(), theOPMPackage.getRectangle(), "constraints", "0,0,50,50", 0, 1, NodeInstanceBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeInstanceBase_Name(), ecorePackage.getEString(), "Name", null, 0, 1, NodeInstanceBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerInstanceBaseEClass, ContainerInstanceBase.class, "ContainerInstanceBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerInstanceBase_Nodes(), this.getNodeInstanceBase(), null, "nodes", null, 0, -1, ContainerInstanceBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerInstanceBase_Links(), this.getLinkInstanceBase(), null, "links", null, 0, -1, ContainerInstanceBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkInstanceBaseEClass, LinkInstanceBase.class, "LinkInstanceBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkInstanceBase_Source(), this.getNodeInstanceBase(), null, "source", null, 0, 1, LinkInstanceBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getLinkInstanceBase_Source().getEKeys().add(this.getInstanceBase_Id());
		initEReference(getLinkInstanceBase_Target(), this.getNodeInstanceBase(), null, "target", null, 0, 1, LinkInstanceBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getLinkInstanceBase_Target().getEKeys().add(this.getInstanceBase_Id());

		initEClass(thingInstanceBaseEClass, ThingInstanceBase.class, "ThingInstanceBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //opmetaPackageImpl
