/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model.impl;

import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.impl.OPMPackageImpl;
import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.InstanceBase;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;
import com.vainolo.phd.opmodel.model.OPmetaDefinition;
import com.vainolo.phd.opmodel.model.OPmodelContainmentValidationRule;
import com.vainolo.phd.opmodel.model.OPmodelHolder;
import com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule;
import com.vainolo.phd.opmodel.model.PropertyBooleanInstance;
import com.vainolo.phd.opmodel.model.PropertyDescriptor;
import com.vainolo.phd.opmodel.model.PropertyFloatInstance;
import com.vainolo.phd.opmodel.model.PropertyInstance;
import com.vainolo.phd.opmodel.model.PropertyIntInstance;
import com.vainolo.phd.opmodel.model.ThingInstance;
import com.vainolo.phd.opmodel.model.TypeDescriptor;
import com.vainolo.phd.opmodel.model.keyValuePair;
import com.vainolo.phd.opmodel.model.opmodelFactory;
import com.vainolo.phd.opmodel.model.opmodelPackage;

import com.vainolo.phd.opmodel.model.propertyType;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class opmodelPackageImpl extends EPackageImpl implements opmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValuePairEClass = null;

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
	private EClass nodeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oPmodelHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oPmetaDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyIntInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyFloatInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyBooleanInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oPmodelLinkValidationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oPmodelContainmentValidationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rectangleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointEDataType = null;

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
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private opmodelPackageImpl() {
		super(eNS_URI, opmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link opmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static opmodelPackage init() {
		if (isInited) return (opmodelPackage)EPackage.Registry.INSTANCE.getEPackage(opmodelPackage.eNS_URI);

		// Obtain or create and register package
		opmodelPackageImpl theopmodelPackage = (opmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof opmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new opmodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OPMPackageImpl theOPMPackage = (OPMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OPMPackage.eNS_URI) instanceof OPMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OPMPackage.eNS_URI) : OPMPackage.eINSTANCE);

		// Create package meta-data objects
		theopmodelPackage.createPackageContents();
		theOPMPackage.createPackageContents();

		// Initialize created meta-data
		theopmodelPackage.initializePackageContents();
		theOPMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theopmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(opmodelPackage.eNS_URI, theopmodelPackage);
		return theopmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getkeyValuePair() {
		return keyValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getkeyValuePair_Key() {
		return (EAttribute)keyValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getkeyValuePair_Value() {
		return (EAttribute)keyValuePairEClass.getEStructuralFeatures().get(1);
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
	public EReference getInstanceBase_Properties() {
		return (EReference)instanceBaseEClass.getEStructuralFeatures().get(0);
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
	public EReference getInstanceBase_Type() {
		return (EReference)instanceBaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeInstance() {
		return nodeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeInstance_Constraints() {
		return (EAttribute)nodeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeInstance_IncomingLinks() {
		return (EReference)nodeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeInstance_OutgoingLinks() {
		return (EReference)nodeInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkInstance() {
		return linkInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkInstance_Bendpoints() {
		return (EAttribute)linkInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkInstance_Target() {
		return (EReference)linkInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkInstance_Source() {
		return (EReference)linkInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkInstance_Container() {
		return (EReference)linkInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerInstance() {
		return containerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerInstance_Nodes() {
		return (EReference)containerInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerInstance_Links() {
		return (EReference)containerInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThingInstance() {
		return thingInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDescriptor() {
		return typeDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDescriptor_Id() {
		return (EAttribute)typeDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDescriptor_Name() {
		return (EAttribute)typeDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDescriptor_Properties() {
		return (EReference)typeDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDescriptor_Parents() {
		return (EReference)typeDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDescriptor_Children() {
		return (EReference)typeDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyDescriptor() {
		return propertyDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyDescriptor_Name() {
		return (EAttribute)propertyDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyDescriptor_Type() {
		return (EAttribute)propertyDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyDescriptor_Id() {
		return (EAttribute)propertyDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPmodelHolder() {
		return oPmodelHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmodelHolder_Container() {
		return (EReference)oPmodelHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmodelHolder_MetaDefinition() {
		return (EReference)oPmodelHolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPmodelHolder_NextId() {
		return (EAttribute)oPmodelHolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPmetaDefinition() {
		return oPmetaDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmetaDefinition_Types() {
		return (EReference)oPmetaDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmetaDefinition_Nodes() {
		return (EReference)oPmetaDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmetaDefinition_Containers() {
		return (EReference)oPmetaDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmetaDefinition_Links() {
		return (EReference)oPmetaDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmetaDefinition_Properties() {
		return (EReference)oPmetaDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmetaDefinition_LinkValidationRules() {
		return (EReference)oPmetaDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmetaDefinition_ContainmentValidationRules() {
		return (EReference)oPmetaDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyInstance() {
		return propertyInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyInstance_Descriptor() {
		return (EReference)propertyInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyInstance_Value() {
		return (EAttribute)propertyInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyIntInstance() {
		return propertyIntInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyFloatInstance() {
		return propertyFloatInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyBooleanInstance() {
		return propertyBooleanInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPmodelLinkValidationRule() {
		return oPmodelLinkValidationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPmodelLinkValidationRule_Valid() {
		return (EAttribute)oPmodelLinkValidationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmodelLinkValidationRule_SourceType() {
		return (EReference)oPmodelLinkValidationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmodelLinkValidationRule_TargetType() {
		return (EReference)oPmodelLinkValidationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmodelLinkValidationRule_LinkType() {
		return (EReference)oPmodelLinkValidationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPmodelContainmentValidationRule() {
		return oPmodelContainmentValidationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOPmodelContainmentValidationRule_Valid() {
		return (EAttribute)oPmodelContainmentValidationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmodelContainmentValidationRule_ContainerType() {
		return (EReference)oPmodelContainmentValidationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOPmodelContainmentValidationRule_NodeType() {
		return (EReference)oPmodelContainmentValidationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getpropertyType() {
		return propertyTypeEEnum;
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
	public EDataType getPoint() {
		return pointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public opmodelFactory getopmodelFactory() {
		return (opmodelFactory)getEFactoryInstance();
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
		keyValuePairEClass = createEClass(KEY_VALUE_PAIR);
		createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__KEY);
		createEAttribute(keyValuePairEClass, KEY_VALUE_PAIR__VALUE);

		instanceBaseEClass = createEClass(INSTANCE_BASE);
		createEReference(instanceBaseEClass, INSTANCE_BASE__PROPERTIES);
		createEAttribute(instanceBaseEClass, INSTANCE_BASE__ID);
		createEReference(instanceBaseEClass, INSTANCE_BASE__TYPE);

		nodeInstanceEClass = createEClass(NODE_INSTANCE);
		createEAttribute(nodeInstanceEClass, NODE_INSTANCE__CONSTRAINTS);
		createEReference(nodeInstanceEClass, NODE_INSTANCE__INCOMING_LINKS);
		createEReference(nodeInstanceEClass, NODE_INSTANCE__OUTGOING_LINKS);

		linkInstanceEClass = createEClass(LINK_INSTANCE);
		createEAttribute(linkInstanceEClass, LINK_INSTANCE__BENDPOINTS);
		createEReference(linkInstanceEClass, LINK_INSTANCE__TARGET);
		createEReference(linkInstanceEClass, LINK_INSTANCE__SOURCE);
		createEReference(linkInstanceEClass, LINK_INSTANCE__CONTAINER);

		containerInstanceEClass = createEClass(CONTAINER_INSTANCE);
		createEReference(containerInstanceEClass, CONTAINER_INSTANCE__NODES);
		createEReference(containerInstanceEClass, CONTAINER_INSTANCE__LINKS);

		thingInstanceEClass = createEClass(THING_INSTANCE);

		typeDescriptorEClass = createEClass(TYPE_DESCRIPTOR);
		createEAttribute(typeDescriptorEClass, TYPE_DESCRIPTOR__ID);
		createEAttribute(typeDescriptorEClass, TYPE_DESCRIPTOR__NAME);
		createEReference(typeDescriptorEClass, TYPE_DESCRIPTOR__PROPERTIES);
		createEReference(typeDescriptorEClass, TYPE_DESCRIPTOR__PARENTS);
		createEReference(typeDescriptorEClass, TYPE_DESCRIPTOR__CHILDREN);

		propertyDescriptorEClass = createEClass(PROPERTY_DESCRIPTOR);
		createEAttribute(propertyDescriptorEClass, PROPERTY_DESCRIPTOR__NAME);
		createEAttribute(propertyDescriptorEClass, PROPERTY_DESCRIPTOR__TYPE);
		createEAttribute(propertyDescriptorEClass, PROPERTY_DESCRIPTOR__ID);

		oPmodelHolderEClass = createEClass(OPMODEL_HOLDER);
		createEReference(oPmodelHolderEClass, OPMODEL_HOLDER__CONTAINER);
		createEReference(oPmodelHolderEClass, OPMODEL_HOLDER__META_DEFINITION);
		createEAttribute(oPmodelHolderEClass, OPMODEL_HOLDER__NEXT_ID);

		oPmetaDefinitionEClass = createEClass(OPMETA_DEFINITION);
		createEReference(oPmetaDefinitionEClass, OPMETA_DEFINITION__TYPES);
		createEReference(oPmetaDefinitionEClass, OPMETA_DEFINITION__NODES);
		createEReference(oPmetaDefinitionEClass, OPMETA_DEFINITION__CONTAINERS);
		createEReference(oPmetaDefinitionEClass, OPMETA_DEFINITION__LINKS);
		createEReference(oPmetaDefinitionEClass, OPMETA_DEFINITION__PROPERTIES);
		createEReference(oPmetaDefinitionEClass, OPMETA_DEFINITION__LINK_VALIDATION_RULES);
		createEReference(oPmetaDefinitionEClass, OPMETA_DEFINITION__CONTAINMENT_VALIDATION_RULES);

		propertyInstanceEClass = createEClass(PROPERTY_INSTANCE);
		createEReference(propertyInstanceEClass, PROPERTY_INSTANCE__DESCRIPTOR);
		createEAttribute(propertyInstanceEClass, PROPERTY_INSTANCE__VALUE);

		propertyIntInstanceEClass = createEClass(PROPERTY_INT_INSTANCE);

		propertyFloatInstanceEClass = createEClass(PROPERTY_FLOAT_INSTANCE);

		propertyBooleanInstanceEClass = createEClass(PROPERTY_BOOLEAN_INSTANCE);

		oPmodelLinkValidationRuleEClass = createEClass(OPMODEL_LINK_VALIDATION_RULE);
		createEAttribute(oPmodelLinkValidationRuleEClass, OPMODEL_LINK_VALIDATION_RULE__VALID);
		createEReference(oPmodelLinkValidationRuleEClass, OPMODEL_LINK_VALIDATION_RULE__SOURCE_TYPE);
		createEReference(oPmodelLinkValidationRuleEClass, OPMODEL_LINK_VALIDATION_RULE__TARGET_TYPE);
		createEReference(oPmodelLinkValidationRuleEClass, OPMODEL_LINK_VALIDATION_RULE__LINK_TYPE);

		oPmodelContainmentValidationRuleEClass = createEClass(OPMODEL_CONTAINMENT_VALIDATION_RULE);
		createEAttribute(oPmodelContainmentValidationRuleEClass, OPMODEL_CONTAINMENT_VALIDATION_RULE__VALID);
		createEReference(oPmodelContainmentValidationRuleEClass, OPMODEL_CONTAINMENT_VALIDATION_RULE__CONTAINER_TYPE);
		createEReference(oPmodelContainmentValidationRuleEClass, OPMODEL_CONTAINMENT_VALIDATION_RULE__NODE_TYPE);

		// Create enums
		propertyTypeEEnum = createEEnum(PROPERTY_TYPE);

		// Create data types
		rectangleEDataType = createEDataType(RECTANGLE);
		pointEDataType = createEDataType(POINT);
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
		nodeInstanceEClass.getESuperTypes().add(this.getInstanceBase());
		nodeInstanceEClass.getESuperTypes().add(theOPMPackage.getOPMNamedElement());
		linkInstanceEClass.getESuperTypes().add(this.getInstanceBase());
		containerInstanceEClass.getESuperTypes().add(this.getInstanceBase());
		thingInstanceEClass.getESuperTypes().add(this.getNodeInstance());
		thingInstanceEClass.getESuperTypes().add(this.getContainerInstance());
		propertyIntInstanceEClass.getESuperTypes().add(this.getPropertyInstance());
		propertyFloatInstanceEClass.getESuperTypes().add(this.getPropertyInstance());
		propertyBooleanInstanceEClass.getESuperTypes().add(this.getPropertyInstance());

		// Initialize classes and features; add operations and parameters
		initEClass(keyValuePairEClass, keyValuePair.class, "keyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getkeyValuePair_Key(), ecorePackage.getEString(), "key", null, 1, 1, keyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getkeyValuePair_Value(), ecorePackage.getEString(), "value", null, 1, 1, keyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceBaseEClass, InstanceBase.class, "InstanceBase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceBase_Properties(), this.getPropertyInstance(), null, "properties", null, 0, -1, InstanceBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstanceBase_Id(), ecorePackage.getELong(), "id", null, 0, 1, InstanceBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceBase_Type(), this.getTypeDescriptor(), null, "Type", null, 1, 1, InstanceBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getInstanceBase_Type().getEKeys().add(this.getTypeDescriptor_Id());

		EOperation op = addEOperation(instanceBaseEClass, this.getPropertyInstance(), "getProperty", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nodeInstanceEClass, NodeInstance.class, "NodeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeInstance_Constraints(), this.getRectangle(), "constraints", "0,0,50,50", 1, 1, NodeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeInstance_IncomingLinks(), this.getLinkInstance(), this.getLinkInstance_Target(), "incomingLinks", null, 0, -1, NodeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNodeInstance_IncomingLinks().getEKeys().add(this.getInstanceBase_Id());
		initEReference(getNodeInstance_OutgoingLinks(), this.getLinkInstance(), this.getLinkInstance_Source(), "outgoingLinks", null, 0, -1, NodeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNodeInstance_OutgoingLinks().getEKeys().add(this.getInstanceBase_Id());

		initEClass(linkInstanceEClass, LinkInstance.class, "LinkInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkInstance_Bendpoints(), this.getPoint(), "bendpoints", null, 0, -1, LinkInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkInstance_Target(), this.getNodeInstance(), this.getNodeInstance_IncomingLinks(), "target", null, 1, 1, LinkInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getLinkInstance_Target().getEKeys().add(this.getInstanceBase_Id());
		initEReference(getLinkInstance_Source(), this.getNodeInstance(), this.getNodeInstance_OutgoingLinks(), "source", null, 1, 1, LinkInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getLinkInstance_Source().getEKeys().add(this.getInstanceBase_Id());
		initEReference(getLinkInstance_Container(), this.getContainerInstance(), this.getContainerInstance_Links(), "container", null, 1, 1, LinkInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getLinkInstance_Container().getEKeys().add(this.getInstanceBase_Id());

		initEClass(containerInstanceEClass, ContainerInstance.class, "ContainerInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerInstance_Nodes(), this.getNodeInstance(), null, "nodes", null, 0, -1, ContainerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerInstance_Links(), this.getLinkInstance(), this.getLinkInstance_Container(), "links", null, 0, -1, ContainerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thingInstanceEClass, ThingInstance.class, "ThingInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeDescriptorEClass, TypeDescriptor.class, "TypeDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDescriptor_Id(), ecorePackage.getELong(), "id", null, 1, 1, TypeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDescriptor_Name(), ecorePackage.getEString(), "Name", null, 1, 1, TypeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDescriptor_Properties(), this.getPropertyDescriptor(), null, "properties", null, 0, -1, TypeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDescriptor_Parents(), this.getTypeDescriptor(), this.getTypeDescriptor_Children(), "parents", null, 0, -1, TypeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTypeDescriptor_Parents().getEKeys().add(this.getTypeDescriptor_Id());
		initEReference(getTypeDescriptor_Children(), this.getTypeDescriptor(), this.getTypeDescriptor_Parents(), "children", null, 0, -1, TypeDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTypeDescriptor_Children().getEKeys().add(this.getTypeDescriptor_Id());

		addEOperation(typeDescriptorEClass, ecorePackage.getEBoolean(), "isAbstract", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyDescriptorEClass, PropertyDescriptor.class, "PropertyDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyDescriptor_Name(), ecorePackage.getEString(), "name", null, 1, 1, PropertyDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyDescriptor_Type(), this.getpropertyType(), "type", "", 1, 1, PropertyDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyDescriptor_Id(), ecorePackage.getELong(), "id", null, 1, 1, PropertyDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oPmodelHolderEClass, OPmodelHolder.class, "OPmodelHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOPmodelHolder_Container(), this.getContainerInstance(), null, "container", null, 1, 1, OPmodelHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPmodelHolder_MetaDefinition(), this.getOPmetaDefinition(), null, "metaDefinition", null, 1, 1, OPmodelHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOPmodelHolder_NextId(), ecorePackage.getELong(), "NextId", null, 1, 1, OPmodelHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oPmetaDefinitionEClass, OPmetaDefinition.class, "OPmetaDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOPmetaDefinition_Types(), this.getTypeDescriptor(), null, "types", null, 3, -1, OPmetaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPmetaDefinition_Nodes(), this.getTypeDescriptor(), null, "nodes", null, 1, -1, OPmetaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOPmetaDefinition_Nodes().getEKeys().add(this.getTypeDescriptor_Id());
		initEReference(getOPmetaDefinition_Containers(), this.getTypeDescriptor(), null, "containers", null, 1, -1, OPmetaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOPmetaDefinition_Containers().getEKeys().add(this.getTypeDescriptor_Id());
		initEReference(getOPmetaDefinition_Links(), this.getTypeDescriptor(), null, "links", null, 1, -1, OPmetaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOPmetaDefinition_Links().getEKeys().add(this.getTypeDescriptor_Id());
		initEReference(getOPmetaDefinition_Properties(), this.getPropertyDescriptor(), null, "properties", null, 0, -1, OPmetaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPmetaDefinition_LinkValidationRules(), this.getOPmodelLinkValidationRule(), null, "linkValidationRules", null, 0, -1, OPmetaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPmetaDefinition_ContainmentValidationRules(), this.getOPmodelContainmentValidationRule(), null, "containmentValidationRules", null, 0, -1, OPmetaDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyInstanceEClass, PropertyInstance.class, "PropertyInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyInstance_Descriptor(), this.getPropertyDescriptor(), null, "descriptor", null, 0, 1, PropertyInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPropertyInstance_Descriptor().getEKeys().add(this.getPropertyDescriptor_Id());
		initEAttribute(getPropertyInstance_Value(), ecorePackage.getEString(), "value", "", 1, 1, PropertyInstance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(propertyInstanceEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyInstanceEClass, this.getpropertyType(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyInstanceEClass, ecorePackage.getEBoolean(), "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "val", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyInstanceEClass, null, "unsetValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyIntInstanceEClass, PropertyIntInstance.class, "PropertyIntInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(propertyIntInstanceEClass, ecorePackage.getEBoolean(), "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "val", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyFloatInstanceEClass, PropertyFloatInstance.class, "PropertyFloatInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(propertyFloatInstanceEClass, ecorePackage.getEBoolean(), "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "val", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyBooleanInstanceEClass, PropertyBooleanInstance.class, "PropertyBooleanInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(propertyBooleanInstanceEClass, ecorePackage.getEBoolean(), "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "val", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(oPmodelLinkValidationRuleEClass, OPmodelLinkValidationRule.class, "OPmodelLinkValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPmodelLinkValidationRule_Valid(), ecorePackage.getEBoolean(), "valid", null, 0, 1, OPmodelLinkValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPmodelLinkValidationRule_SourceType(), this.getTypeDescriptor(), null, "sourceType", null, 1, 1, OPmodelLinkValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOPmodelLinkValidationRule_SourceType().getEKeys().add(this.getTypeDescriptor_Id());
		initEReference(getOPmodelLinkValidationRule_TargetType(), this.getTypeDescriptor(), null, "targetType", null, 1, 1, OPmodelLinkValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOPmodelLinkValidationRule_TargetType().getEKeys().add(this.getTypeDescriptor_Id());
		initEReference(getOPmodelLinkValidationRule_LinkType(), this.getTypeDescriptor(), null, "linkType", null, 1, 1, OPmodelLinkValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOPmodelLinkValidationRule_LinkType().getEKeys().add(this.getTypeDescriptor_Id());

		initEClass(oPmodelContainmentValidationRuleEClass, OPmodelContainmentValidationRule.class, "OPmodelContainmentValidationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOPmodelContainmentValidationRule_Valid(), ecorePackage.getEBoolean(), "valid", null, 0, 1, OPmodelContainmentValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOPmodelContainmentValidationRule_ContainerType(), this.getTypeDescriptor(), null, "containerType", null, 1, 1, OPmodelContainmentValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOPmodelContainmentValidationRule_ContainerType().getEKeys().add(this.getTypeDescriptor_Id());
		initEReference(getOPmodelContainmentValidationRule_NodeType(), this.getTypeDescriptor(), null, "nodeType", null, 1, 1, OPmodelContainmentValidationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getOPmodelContainmentValidationRule_NodeType().getEKeys().add(this.getTypeDescriptor_Id());

		// Initialize enums and add enum literals
		initEEnum(propertyTypeEEnum, propertyType.class, "propertyType");
		addEEnumLiteral(propertyTypeEEnum, propertyType.STRING);
		addEEnumLiteral(propertyTypeEEnum, propertyType.INT);
		addEEnumLiteral(propertyTypeEEnum, propertyType.BOOLEAN);
		addEEnumLiteral(propertyTypeEEnum, propertyType.FLOAT);

		// Initialize data types
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //opmodelPackageImpl
