/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.vainolo.phd.opmodel.model.opmodelFactory
 * @model kind="package"
 * @generated
 */
public interface opmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "opmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.vainolo.com/phd/opmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "opmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	opmodelPackage eINSTANCE = com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.keyValuePairImpl <em>key Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.keyValuePairImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getkeyValuePair()
	 * @generated
	 */
	int KEY_VALUE_PAIR = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.InstanceBaseImpl <em>Instance Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.InstanceBaseImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getInstanceBase()
	 * @generated
	 */
	int INSTANCE_BASE = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BASE__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BASE__ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BASE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Instance Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BASE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.NodeInstanceImpl <em>Node Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.NodeInstanceImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getNodeInstance()
	 * @generated
	 */
	int NODE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__PROPERTIES = INSTANCE_BASE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__ID = INSTANCE_BASE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__TYPE = INSTANCE_BASE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__NAME = INSTANCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__ALIGNMENT = INSTANCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__CONSTRAINTS = INSTANCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__INCOMING_LINKS = INSTANCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE__OUTGOING_LINKS = INSTANCE_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Node Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE_FEATURE_COUNT = INSTANCE_BASE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.LinkInstanceImpl <em>Link Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.LinkInstanceImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getLinkInstance()
	 * @generated
	 */
	int LINK_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__PROPERTIES = INSTANCE_BASE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__ID = INSTANCE_BASE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__TYPE = INSTANCE_BASE__TYPE;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__BENDPOINTS = INSTANCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__TARGET = INSTANCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__SOURCE = INSTANCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE__CONTAINER = INSTANCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE_FEATURE_COUNT = INSTANCE_BASE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.ContainerInstanceImpl <em>Container Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.ContainerInstanceImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getContainerInstance()
	 * @generated
	 */
	int CONTAINER_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__PROPERTIES = INSTANCE_BASE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__ID = INSTANCE_BASE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__TYPE = INSTANCE_BASE__TYPE;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__NODES = INSTANCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__LINKS = INSTANCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_FEATURE_COUNT = INSTANCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.ThingInstanceImpl <em>Thing Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.ThingInstanceImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getThingInstance()
	 * @generated
	 */
	int THING_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE__PROPERTIES = NODE_INSTANCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE__ID = NODE_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE__TYPE = NODE_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE__NAME = NODE_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE__ALIGNMENT = NODE_INSTANCE__ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE__CONSTRAINTS = NODE_INSTANCE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE__INCOMING_LINKS = NODE_INSTANCE__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE__OUTGOING_LINKS = NODE_INSTANCE__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE__NODES = NODE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE__LINKS = NODE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Thing Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE_FEATURE_COUNT = NODE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.TypeDescriptorImpl <em>Type Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.TypeDescriptorImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getTypeDescriptor()
	 * @generated
	 */
	int TYPE_DESCRIPTOR = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DESCRIPTOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DESCRIPTOR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DESCRIPTOR__PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DESCRIPTOR__PARENTS = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DESCRIPTOR__CHILDREN = 4;

	/**
	 * The number of structural features of the '<em>Type Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DESCRIPTOR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.PropertyDescriptorImpl <em>Property Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.PropertyDescriptorImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getPropertyDescriptor()
	 * @generated
	 */
	int PROPERTY_DESCRIPTOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR__ID = 2;

	/**
	 * The number of structural features of the '<em>Property Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_DESCRIPTOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.OPmodelHolderImpl <em>OPmodel Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.OPmodelHolderImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getOPmodelHolder()
	 * @generated
	 */
	int OPMODEL_HOLDER = 8;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMODEL_HOLDER__CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Meta Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMODEL_HOLDER__META_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Next Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMODEL_HOLDER__NEXT_ID = 2;

	/**
	 * The number of structural features of the '<em>OPmodel Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMODEL_HOLDER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.OPmetaDefinitionImpl <em>OPmeta Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.OPmetaDefinitionImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getOPmetaDefinition()
	 * @generated
	 */
	int OPMETA_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMETA_DEFINITION__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMETA_DEFINITION__NODES = 1;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMETA_DEFINITION__CONTAINERS = 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMETA_DEFINITION__LINKS = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMETA_DEFINITION__PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>OPmeta Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMETA_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.PropertyInstanceImpl <em>Property Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.PropertyInstanceImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getPropertyInstance()
	 * @generated
	 */
	int PROPERTY_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE__DESCRIPTOR = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.PropertyIntInstanceImpl <em>Property Int Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.PropertyIntInstanceImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getPropertyIntInstance()
	 * @generated
	 */
	int PROPERTY_INT_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INT_INSTANCE__DESCRIPTOR = PROPERTY_INSTANCE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INT_INSTANCE__VALUE = PROPERTY_INSTANCE__VALUE;

	/**
	 * The number of structural features of the '<em>Property Int Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_INT_INSTANCE_FEATURE_COUNT = PROPERTY_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.PropertyFloatInstanceImpl <em>Property Float Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.PropertyFloatInstanceImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getPropertyFloatInstance()
	 * @generated
	 */
	int PROPERTY_FLOAT_INSTANCE = 12;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FLOAT_INSTANCE__DESCRIPTOR = PROPERTY_INSTANCE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FLOAT_INSTANCE__VALUE = PROPERTY_INSTANCE__VALUE;

	/**
	 * The number of structural features of the '<em>Property Float Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FLOAT_INSTANCE_FEATURE_COUNT = PROPERTY_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.PropertyBooleanInstanceImpl <em>Property Boolean Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.PropertyBooleanInstanceImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getPropertyBooleanInstance()
	 * @generated
	 */
	int PROPERTY_BOOLEAN_INSTANCE = 13;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BOOLEAN_INSTANCE__DESCRIPTOR = PROPERTY_INSTANCE__DESCRIPTOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BOOLEAN_INSTANCE__VALUE = PROPERTY_INSTANCE__VALUE;

	/**
	 * The number of structural features of the '<em>Property Boolean Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_BOOLEAN_INSTANCE_FEATURE_COUNT = PROPERTY_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.OPmodelLinkValidationRuleImpl <em>OPmodel Link Validation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.OPmodelLinkValidationRuleImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getOPmodelLinkValidationRule()
	 * @generated
	 */
	int OPMODEL_LINK_VALIDATION_RULE = 14;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMODEL_LINK_VALIDATION_RULE__IS_VALID = 0;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMODEL_LINK_VALIDATION_RULE__SOURCE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMODEL_LINK_VALIDATION_RULE__TARGET_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Link Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMODEL_LINK_VALIDATION_RULE__LINK_TYPE = 3;

	/**
	 * The number of structural features of the '<em>OPmodel Link Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMODEL_LINK_VALIDATION_RULE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.impl.OPmodelContaimentValidationRuleImpl <em>OPmodel Contaiment Validation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.impl.OPmodelContaimentValidationRuleImpl
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getOPmodelContaimentValidationRule()
	 * @generated
	 */
	int OPMODEL_CONTAIMENT_VALIDATION_RULE = 15;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMODEL_CONTAIMENT_VALIDATION_RULE__IS_VALID = 0;

	/**
	 * The feature id for the '<em><b>Container Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>OPmodel Contaiment Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPMODEL_CONTAIMENT_VALIDATION_RULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmodel.model.propertyType <em>property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmodel.model.propertyType
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getpropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 16;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 17;

	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 18;


	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.keyValuePair <em>key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>key Value Pair</em>'.
	 * @see com.vainolo.phd.opmodel.model.keyValuePair
	 * @generated
	 */
	EClass getkeyValuePair();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmodel.model.keyValuePair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.vainolo.phd.opmodel.model.keyValuePair#getKey()
	 * @see #getkeyValuePair()
	 * @generated
	 */
	EAttribute getkeyValuePair_Key();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmodel.model.keyValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.vainolo.phd.opmodel.model.keyValuePair#getValue()
	 * @see #getkeyValuePair()
	 * @generated
	 */
	EAttribute getkeyValuePair_Value();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.InstanceBase <em>Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Base</em>'.
	 * @see com.vainolo.phd.opmodel.model.InstanceBase
	 * @generated
	 */
	EClass getInstanceBase();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opmodel.model.InstanceBase#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.vainolo.phd.opmodel.model.InstanceBase#getProperties()
	 * @see #getInstanceBase()
	 * @generated
	 */
	EReference getInstanceBase_Properties();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmodel.model.InstanceBase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.vainolo.phd.opmodel.model.InstanceBase#getId()
	 * @see #getInstanceBase()
	 * @generated
	 */
	EAttribute getInstanceBase_Id();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opmodel.model.InstanceBase#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.vainolo.phd.opmodel.model.InstanceBase#getType()
	 * @see #getInstanceBase()
	 * @generated
	 */
	EReference getInstanceBase_Type();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.NodeInstance <em>Node Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Instance</em>'.
	 * @see com.vainolo.phd.opmodel.model.NodeInstance
	 * @generated
	 */
	EClass getNodeInstance();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmodel.model.NodeInstance#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see com.vainolo.phd.opmodel.model.NodeInstance#getConstraints()
	 * @see #getNodeInstance()
	 * @generated
	 */
	EAttribute getNodeInstance_Constraints();

	/**
	 * Returns the meta object for the reference list '{@link com.vainolo.phd.opmodel.model.NodeInstance#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see com.vainolo.phd.opmodel.model.NodeInstance#getIncomingLinks()
	 * @see #getNodeInstance()
	 * @generated
	 */
	EReference getNodeInstance_IncomingLinks();

	/**
	 * Returns the meta object for the reference list '{@link com.vainolo.phd.opmodel.model.NodeInstance#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Links</em>'.
	 * @see com.vainolo.phd.opmodel.model.NodeInstance#getOutgoingLinks()
	 * @see #getNodeInstance()
	 * @generated
	 */
	EReference getNodeInstance_OutgoingLinks();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.LinkInstance <em>Link Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Instance</em>'.
	 * @see com.vainolo.phd.opmodel.model.LinkInstance
	 * @generated
	 */
	EClass getLinkInstance();

	/**
	 * Returns the meta object for the attribute list '{@link com.vainolo.phd.opmodel.model.LinkInstance#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see com.vainolo.phd.opmodel.model.LinkInstance#getBendpoints()
	 * @see #getLinkInstance()
	 * @generated
	 */
	EAttribute getLinkInstance_Bendpoints();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opmodel.model.LinkInstance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.vainolo.phd.opmodel.model.LinkInstance#getTarget()
	 * @see #getLinkInstance()
	 * @generated
	 */
	EReference getLinkInstance_Target();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opmodel.model.LinkInstance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.vainolo.phd.opmodel.model.LinkInstance#getSource()
	 * @see #getLinkInstance()
	 * @generated
	 */
	EReference getLinkInstance_Source();

	/**
	 * Returns the meta object for the container reference '{@link com.vainolo.phd.opmodel.model.LinkInstance#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Container</em>'.
	 * @see com.vainolo.phd.opmodel.model.LinkInstance#getContainer()
	 * @see #getLinkInstance()
	 * @generated
	 */
	EReference getLinkInstance_Container();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.ContainerInstance <em>Container Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Instance</em>'.
	 * @see com.vainolo.phd.opmodel.model.ContainerInstance
	 * @generated
	 */
	EClass getContainerInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opmodel.model.ContainerInstance#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see com.vainolo.phd.opmodel.model.ContainerInstance#getNodes()
	 * @see #getContainerInstance()
	 * @generated
	 */
	EReference getContainerInstance_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opmodel.model.ContainerInstance#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see com.vainolo.phd.opmodel.model.ContainerInstance#getLinks()
	 * @see #getContainerInstance()
	 * @generated
	 */
	EReference getContainerInstance_Links();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.ThingInstance <em>Thing Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing Instance</em>'.
	 * @see com.vainolo.phd.opmodel.model.ThingInstance
	 * @generated
	 */
	EClass getThingInstance();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.TypeDescriptor <em>Type Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Descriptor</em>'.
	 * @see com.vainolo.phd.opmodel.model.TypeDescriptor
	 * @generated
	 */
	EClass getTypeDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.vainolo.phd.opmodel.model.TypeDescriptor#getId()
	 * @see #getTypeDescriptor()
	 * @generated
	 */
	EAttribute getTypeDescriptor_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vainolo.phd.opmodel.model.TypeDescriptor#getName()
	 * @see #getTypeDescriptor()
	 * @generated
	 */
	EAttribute getTypeDescriptor_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see com.vainolo.phd.opmodel.model.TypeDescriptor#getProperties()
	 * @see #getTypeDescriptor()
	 * @generated
	 */
	EReference getTypeDescriptor_Properties();

	/**
	 * Returns the meta object for the reference list '{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see com.vainolo.phd.opmodel.model.TypeDescriptor#getParents()
	 * @see #getTypeDescriptor()
	 * @generated
	 */
	EReference getTypeDescriptor_Parents();

	/**
	 * Returns the meta object for the reference list '{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see com.vainolo.phd.opmodel.model.TypeDescriptor#getChildren()
	 * @see #getTypeDescriptor()
	 * @generated
	 */
	EReference getTypeDescriptor_Children();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.PropertyDescriptor <em>Property Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Descriptor</em>'.
	 * @see com.vainolo.phd.opmodel.model.PropertyDescriptor
	 * @generated
	 */
	EClass getPropertyDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmodel.model.PropertyDescriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vainolo.phd.opmodel.model.PropertyDescriptor#getName()
	 * @see #getPropertyDescriptor()
	 * @generated
	 */
	EAttribute getPropertyDescriptor_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmodel.model.PropertyDescriptor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.vainolo.phd.opmodel.model.PropertyDescriptor#getType()
	 * @see #getPropertyDescriptor()
	 * @generated
	 */
	EAttribute getPropertyDescriptor_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmodel.model.PropertyDescriptor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.vainolo.phd.opmodel.model.PropertyDescriptor#getId()
	 * @see #getPropertyDescriptor()
	 * @generated
	 */
	EAttribute getPropertyDescriptor_Id();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.OPmodelHolder <em>OPmodel Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPmodel Holder</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmodelHolder
	 * @generated
	 */
	EClass getOPmodelHolder();

	/**
	 * Returns the meta object for the containment reference '{@link com.vainolo.phd.opmodel.model.OPmodelHolder#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmodelHolder#getContainer()
	 * @see #getOPmodelHolder()
	 * @generated
	 */
	EReference getOPmodelHolder_Container();

	/**
	 * Returns the meta object for the containment reference '{@link com.vainolo.phd.opmodel.model.OPmodelHolder#getMetaDefinition <em>Meta Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Definition</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmodelHolder#getMetaDefinition()
	 * @see #getOPmodelHolder()
	 * @generated
	 */
	EReference getOPmodelHolder_MetaDefinition();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmodel.model.OPmodelHolder#getNextId <em>Next Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Id</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmodelHolder#getNextId()
	 * @see #getOPmodelHolder()
	 * @generated
	 */
	EAttribute getOPmodelHolder_NextId();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.OPmetaDefinition <em>OPmeta Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPmeta Definition</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmetaDefinition
	 * @generated
	 */
	EClass getOPmetaDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opmodel.model.OPmetaDefinition#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmetaDefinition#getTypes()
	 * @see #getOPmetaDefinition()
	 * @generated
	 */
	EReference getOPmetaDefinition_Types();

	/**
	 * Returns the meta object for the reference list '{@link com.vainolo.phd.opmodel.model.OPmetaDefinition#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmetaDefinition#getNodes()
	 * @see #getOPmetaDefinition()
	 * @generated
	 */
	EReference getOPmetaDefinition_Nodes();

	/**
	 * Returns the meta object for the reference list '{@link com.vainolo.phd.opmodel.model.OPmetaDefinition#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Containers</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmetaDefinition#getContainers()
	 * @see #getOPmetaDefinition()
	 * @generated
	 */
	EReference getOPmetaDefinition_Containers();

	/**
	 * Returns the meta object for the reference list '{@link com.vainolo.phd.opmodel.model.OPmetaDefinition#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmetaDefinition#getLinks()
	 * @see #getOPmetaDefinition()
	 * @generated
	 */
	EReference getOPmetaDefinition_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opmodel.model.OPmetaDefinition#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmetaDefinition#getProperties()
	 * @see #getOPmetaDefinition()
	 * @generated
	 */
	EReference getOPmetaDefinition_Properties();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.PropertyInstance <em>Property Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Instance</em>'.
	 * @see com.vainolo.phd.opmodel.model.PropertyInstance
	 * @generated
	 */
	EClass getPropertyInstance();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opmodel.model.PropertyInstance#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptor</em>'.
	 * @see com.vainolo.phd.opmodel.model.PropertyInstance#getDescriptor()
	 * @see #getPropertyInstance()
	 * @generated
	 */
	EReference getPropertyInstance_Descriptor();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmodel.model.PropertyInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.vainolo.phd.opmodel.model.PropertyInstance#getValue()
	 * @see #getPropertyInstance()
	 * @generated
	 */
	EAttribute getPropertyInstance_Value();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.PropertyIntInstance <em>Property Int Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Int Instance</em>'.
	 * @see com.vainolo.phd.opmodel.model.PropertyIntInstance
	 * @generated
	 */
	EClass getPropertyIntInstance();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.PropertyFloatInstance <em>Property Float Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Float Instance</em>'.
	 * @see com.vainolo.phd.opmodel.model.PropertyFloatInstance
	 * @generated
	 */
	EClass getPropertyFloatInstance();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.PropertyBooleanInstance <em>Property Boolean Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Boolean Instance</em>'.
	 * @see com.vainolo.phd.opmodel.model.PropertyBooleanInstance
	 * @generated
	 */
	EClass getPropertyBooleanInstance();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule <em>OPmodel Link Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPmodel Link Validation Rule</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule
	 * @generated
	 */
	EClass getOPmodelLinkValidationRule();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#isIsValid <em>Is Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Valid</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#isIsValid()
	 * @see #getOPmodelLinkValidationRule()
	 * @generated
	 */
	EAttribute getOPmodelLinkValidationRule_IsValid();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Type</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#getSourceType()
	 * @see #getOPmodelLinkValidationRule()
	 * @generated
	 */
	EReference getOPmodelLinkValidationRule_SourceType();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#getTargetType()
	 * @see #getOPmodelLinkValidationRule()
	 * @generated
	 */
	EReference getOPmodelLinkValidationRule_TargetType();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#getLinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Type</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule#getLinkType()
	 * @see #getOPmodelLinkValidationRule()
	 * @generated
	 */
	EReference getOPmodelLinkValidationRule_LinkType();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule <em>OPmodel Contaiment Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPmodel Contaiment Validation Rule</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule
	 * @generated
	 */
	EClass getOPmodelContaimentValidationRule();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule#isIsValid <em>Is Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Valid</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule#isIsValid()
	 * @see #getOPmodelContaimentValidationRule()
	 * @generated
	 */
	EAttribute getOPmodelContaimentValidationRule_IsValid();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule#getContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Type</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule#getContainerType()
	 * @see #getOPmodelContaimentValidationRule()
	 * @generated
	 */
	EReference getOPmodelContaimentValidationRule_ContainerType();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Type</em>'.
	 * @see com.vainolo.phd.opmodel.model.OPmodelContaimentValidationRule#getNodeType()
	 * @see #getOPmodelContaimentValidationRule()
	 * @generated
	 */
	EReference getOPmodelContaimentValidationRule_NodeType();

	/**
	 * Returns the meta object for enum '{@link com.vainolo.phd.opmodel.model.propertyType <em>property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>property Type</em>'.
	 * @see com.vainolo.phd.opmodel.model.propertyType
	 * @generated
	 */
	EEnum getpropertyType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.draw2d.geometry.Point
	 * @model instanceClass="org.eclipse.draw2d.geometry.Point"
	 * @generated
	 */
	EDataType getPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	opmodelFactory getopmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.keyValuePairImpl <em>key Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.keyValuePairImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getkeyValuePair()
		 * @generated
		 */
		EClass KEY_VALUE_PAIR = eINSTANCE.getkeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__KEY = eINSTANCE.getkeyValuePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__VALUE = eINSTANCE.getkeyValuePair_Value();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.InstanceBaseImpl <em>Instance Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.InstanceBaseImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getInstanceBase()
		 * @generated
		 */
		EClass INSTANCE_BASE = eINSTANCE.getInstanceBase();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_BASE__PROPERTIES = eINSTANCE.getInstanceBase_Properties();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BASE__ID = eINSTANCE.getInstanceBase_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_BASE__TYPE = eINSTANCE.getInstanceBase_Type();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.NodeInstanceImpl <em>Node Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.NodeInstanceImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getNodeInstance()
		 * @generated
		 */
		EClass NODE_INSTANCE = eINSTANCE.getNodeInstance();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_INSTANCE__CONSTRAINTS = eINSTANCE.getNodeInstance_Constraints();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_INSTANCE__INCOMING_LINKS = eINSTANCE.getNodeInstance_IncomingLinks();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_INSTANCE__OUTGOING_LINKS = eINSTANCE.getNodeInstance_OutgoingLinks();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.LinkInstanceImpl <em>Link Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.LinkInstanceImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getLinkInstance()
		 * @generated
		 */
		EClass LINK_INSTANCE = eINSTANCE.getLinkInstance();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_INSTANCE__BENDPOINTS = eINSTANCE.getLinkInstance_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_INSTANCE__TARGET = eINSTANCE.getLinkInstance_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_INSTANCE__SOURCE = eINSTANCE.getLinkInstance_Source();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_INSTANCE__CONTAINER = eINSTANCE.getLinkInstance_Container();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.ContainerInstanceImpl <em>Container Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.ContainerInstanceImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getContainerInstance()
		 * @generated
		 */
		EClass CONTAINER_INSTANCE = eINSTANCE.getContainerInstance();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_INSTANCE__NODES = eINSTANCE.getContainerInstance_Nodes();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_INSTANCE__LINKS = eINSTANCE.getContainerInstance_Links();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.ThingInstanceImpl <em>Thing Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.ThingInstanceImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getThingInstance()
		 * @generated
		 */
		EClass THING_INSTANCE = eINSTANCE.getThingInstance();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.TypeDescriptorImpl <em>Type Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.TypeDescriptorImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getTypeDescriptor()
		 * @generated
		 */
		EClass TYPE_DESCRIPTOR = eINSTANCE.getTypeDescriptor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DESCRIPTOR__ID = eINSTANCE.getTypeDescriptor_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DESCRIPTOR__NAME = eINSTANCE.getTypeDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DESCRIPTOR__PROPERTIES = eINSTANCE.getTypeDescriptor_Properties();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DESCRIPTOR__PARENTS = eINSTANCE.getTypeDescriptor_Parents();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DESCRIPTOR__CHILDREN = eINSTANCE.getTypeDescriptor_Children();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.PropertyDescriptorImpl <em>Property Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.PropertyDescriptorImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getPropertyDescriptor()
		 * @generated
		 */
		EClass PROPERTY_DESCRIPTOR = eINSTANCE.getPropertyDescriptor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DESCRIPTOR__NAME = eINSTANCE.getPropertyDescriptor_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DESCRIPTOR__TYPE = eINSTANCE.getPropertyDescriptor_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_DESCRIPTOR__ID = eINSTANCE.getPropertyDescriptor_Id();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.OPmodelHolderImpl <em>OPmodel Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.OPmodelHolderImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getOPmodelHolder()
		 * @generated
		 */
		EClass OPMODEL_HOLDER = eINSTANCE.getOPmodelHolder();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPMODEL_HOLDER__CONTAINER = eINSTANCE.getOPmodelHolder_Container();

		/**
		 * The meta object literal for the '<em><b>Meta Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPMODEL_HOLDER__META_DEFINITION = eINSTANCE.getOPmodelHolder_MetaDefinition();

		/**
		 * The meta object literal for the '<em><b>Next Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPMODEL_HOLDER__NEXT_ID = eINSTANCE.getOPmodelHolder_NextId();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.OPmetaDefinitionImpl <em>OPmeta Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.OPmetaDefinitionImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getOPmetaDefinition()
		 * @generated
		 */
		EClass OPMETA_DEFINITION = eINSTANCE.getOPmetaDefinition();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPMETA_DEFINITION__TYPES = eINSTANCE.getOPmetaDefinition_Types();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPMETA_DEFINITION__NODES = eINSTANCE.getOPmetaDefinition_Nodes();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPMETA_DEFINITION__CONTAINERS = eINSTANCE.getOPmetaDefinition_Containers();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPMETA_DEFINITION__LINKS = eINSTANCE.getOPmetaDefinition_Links();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPMETA_DEFINITION__PROPERTIES = eINSTANCE.getOPmetaDefinition_Properties();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.PropertyInstanceImpl <em>Property Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.PropertyInstanceImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getPropertyInstance()
		 * @generated
		 */
		EClass PROPERTY_INSTANCE = eINSTANCE.getPropertyInstance();

		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_INSTANCE__DESCRIPTOR = eINSTANCE.getPropertyInstance_Descriptor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_INSTANCE__VALUE = eINSTANCE.getPropertyInstance_Value();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.PropertyIntInstanceImpl <em>Property Int Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.PropertyIntInstanceImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getPropertyIntInstance()
		 * @generated
		 */
		EClass PROPERTY_INT_INSTANCE = eINSTANCE.getPropertyIntInstance();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.PropertyFloatInstanceImpl <em>Property Float Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.PropertyFloatInstanceImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getPropertyFloatInstance()
		 * @generated
		 */
		EClass PROPERTY_FLOAT_INSTANCE = eINSTANCE.getPropertyFloatInstance();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.PropertyBooleanInstanceImpl <em>Property Boolean Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.PropertyBooleanInstanceImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getPropertyBooleanInstance()
		 * @generated
		 */
		EClass PROPERTY_BOOLEAN_INSTANCE = eINSTANCE.getPropertyBooleanInstance();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.OPmodelLinkValidationRuleImpl <em>OPmodel Link Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.OPmodelLinkValidationRuleImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getOPmodelLinkValidationRule()
		 * @generated
		 */
		EClass OPMODEL_LINK_VALIDATION_RULE = eINSTANCE.getOPmodelLinkValidationRule();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPMODEL_LINK_VALIDATION_RULE__IS_VALID = eINSTANCE.getOPmodelLinkValidationRule_IsValid();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPMODEL_LINK_VALIDATION_RULE__SOURCE_TYPE = eINSTANCE.getOPmodelLinkValidationRule_SourceType();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPMODEL_LINK_VALIDATION_RULE__TARGET_TYPE = eINSTANCE.getOPmodelLinkValidationRule_TargetType();

		/**
		 * The meta object literal for the '<em><b>Link Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPMODEL_LINK_VALIDATION_RULE__LINK_TYPE = eINSTANCE.getOPmodelLinkValidationRule_LinkType();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.impl.OPmodelContaimentValidationRuleImpl <em>OPmodel Contaiment Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.impl.OPmodelContaimentValidationRuleImpl
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getOPmodelContaimentValidationRule()
		 * @generated
		 */
		EClass OPMODEL_CONTAIMENT_VALIDATION_RULE = eINSTANCE.getOPmodelContaimentValidationRule();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPMODEL_CONTAIMENT_VALIDATION_RULE__IS_VALID = eINSTANCE.getOPmodelContaimentValidationRule_IsValid();

		/**
		 * The meta object literal for the '<em><b>Container Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPMODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE = eINSTANCE.getOPmodelContaimentValidationRule_ContainerType();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPMODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE = eINSTANCE.getOPmodelContaimentValidationRule_NodeType();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmodel.model.propertyType <em>property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmodel.model.propertyType
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getpropertyType()
		 * @generated
		 */
		EEnum PROPERTY_TYPE = eINSTANCE.getpropertyType();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see com.vainolo.phd.opmodel.model.impl.opmodelPackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

	}

} //opmodelPackage
