/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see com.vainolo.phd.opmeta.model.opmetaFactory
 * @model kind="package"
 * @generated
 */
public interface opmetaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "opmeta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.vainolo.com/phd/opmeta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "opmeta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	opmetaPackage eINSTANCE = com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelDiagramImpl <em>OP Meta Model Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmeta.model.impl.OPMetaModelDiagramImpl
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getOPMetaModelDiagram()
	 * @generated
	 */
	int OP_META_MODEL_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Elements Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Links Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Link Validations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_DIAGRAM__LINK_VALIDATIONS = 2;

	/**
	 * The feature id for the '<em><b>Contaiment Validations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_DIAGRAM__CONTAIMENT_VALIDATIONS = 3;

	/**
	 * The number of structural features of the '<em>OP Meta Model Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelContaimentValidationRuleImpl <em>OP Meta Model Contaiment Validation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmeta.model.impl.OPMetaModelContaimentValidationRuleImpl
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getOPMetaModelContaimentValidationRule()
	 * @generated
	 */
	int OP_META_MODEL_CONTAIMENT_VALIDATION_RULE = 1;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__IS_VALID = 0;

	/**
	 * The feature id for the '<em><b>Container Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Node Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE_NAME = 2;

	/**
	 * The number of structural features of the '<em>OP Meta Model Contaiment Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_CONTAIMENT_VALIDATION_RULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelLinkValidationRuleImpl <em>OP Meta Model Link Validation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmeta.model.impl.OPMetaModelLinkValidationRuleImpl
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getOPMetaModelLinkValidationRule()
	 * @generated
	 */
	int OP_META_MODEL_LINK_VALIDATION_RULE = 2;

	/**
	 * The feature id for the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_LINK_VALIDATION_RULE__IS_VALID = 0;

	/**
	 * The feature id for the '<em><b>Source Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_LINK_VALIDATION_RULE__SOURCE_TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Target Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_LINK_VALIDATION_RULE__TARGET_TYPE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Link Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_LINK_VALIDATION_RULE__LINK_TYPE_NAME = 3;

	/**
	 * The number of structural features of the '<em>OP Meta Model Link Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_LINK_VALIDATION_RULE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmeta.model.impl.OPModelImpl <em>OP Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmeta.model.impl.OPModelImpl
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getOPModel()
	 * @generated
	 */
	int OP_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Meta Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_MODEL__META_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_MODEL__CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Next Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_MODEL__NEXT_ID = 2;

	/**
	 * The number of structural features of the '<em>OP Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmeta.model.impl.InstanceBaseImpl <em>Instance Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmeta.model.impl.InstanceBaseImpl
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getInstanceBase()
	 * @generated
	 */
	int INSTANCE_BASE = 4;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BASE__TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BASE__ID = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BASE__PROPERTIES = 2;

	/**
	 * The number of structural features of the '<em>Instance Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BASE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmeta.model.impl.NodeInstanceBaseImpl <em>Node Instance Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmeta.model.impl.NodeInstanceBaseImpl
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getNodeInstanceBase()
	 * @generated
	 */
	int NODE_INSTANCE_BASE = 5;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE_BASE__TYPE_NAME = INSTANCE_BASE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE_BASE__ID = INSTANCE_BASE__ID;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE_BASE__PROPERTIES = INSTANCE_BASE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE_BASE__CONSTRAINTS = INSTANCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE_BASE__NAME = INSTANCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node Instance Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INSTANCE_BASE_FEATURE_COUNT = INSTANCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmeta.model.impl.ContainerInstanceBaseImpl <em>Container Instance Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmeta.model.impl.ContainerInstanceBaseImpl
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getContainerInstanceBase()
	 * @generated
	 */
	int CONTAINER_INSTANCE_BASE = 6;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_BASE__TYPE_NAME = INSTANCE_BASE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_BASE__ID = INSTANCE_BASE__ID;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_BASE__PROPERTIES = INSTANCE_BASE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_BASE__NODES = INSTANCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_BASE__LINKS = INSTANCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container Instance Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_BASE_FEATURE_COUNT = INSTANCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmeta.model.impl.LinkInstanceBaseImpl <em>Link Instance Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmeta.model.impl.LinkInstanceBaseImpl
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getLinkInstanceBase()
	 * @generated
	 */
	int LINK_INSTANCE_BASE = 7;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE_BASE__TYPE_NAME = INSTANCE_BASE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE_BASE__ID = INSTANCE_BASE__ID;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE_BASE__PROPERTIES = INSTANCE_BASE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE_BASE__SOURCE = INSTANCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE_BASE__TARGET = INSTANCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE_BASE__BENDPOINTS = INSTANCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link Instance Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE_BASE_FEATURE_COUNT = INSTANCE_BASE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmeta.model.impl.ThingInstanceBaseImpl <em>Thing Instance Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmeta.model.impl.ThingInstanceBaseImpl
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getThingInstanceBase()
	 * @generated
	 */
	int THING_INSTANCE_BASE = 8;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE_BASE__TYPE_NAME = NODE_INSTANCE_BASE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE_BASE__ID = NODE_INSTANCE_BASE__ID;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE_BASE__PROPERTIES = NODE_INSTANCE_BASE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE_BASE__CONSTRAINTS = NODE_INSTANCE_BASE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE_BASE__NAME = NODE_INSTANCE_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE_BASE__NODES = NODE_INSTANCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE_BASE__LINKS = NODE_INSTANCE_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Thing Instance Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_INSTANCE_BASE_FEATURE_COUNT = NODE_INSTANCE_BASE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmeta.model.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmeta.model.impl.KeyValuePairImpl
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getKeyValuePair()
	 * @generated
	 */
	int KEY_VALUE_PAIR = 9;

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
	 * The number of structural features of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 10;

	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 11;

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram <em>OP Meta Model Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OP Meta Model Diagram</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelDiagram
	 * @generated
	 */
	EClass getOPMetaModelDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getElementsDiagram <em>Elements Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elements Diagram</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getElementsDiagram()
	 * @see #getOPMetaModelDiagram()
	 * @generated
	 */
	EReference getOPMetaModelDiagram_ElementsDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getLinksDiagram <em>Links Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Links Diagram</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getLinksDiagram()
	 * @see #getOPMetaModelDiagram()
	 * @generated
	 */
	EReference getOPMetaModelDiagram_LinksDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getLinkValidations <em>Link Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Validations</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getLinkValidations()
	 * @see #getOPMetaModelDiagram()
	 * @generated
	 */
	EReference getOPMetaModelDiagram_LinkValidations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getContaimentValidations <em>Contaiment Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contaiment Validations</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getContaimentValidations()
	 * @see #getOPMetaModelDiagram()
	 * @generated
	 */
	EReference getOPMetaModelDiagram_ContaimentValidations();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule <em>OP Meta Model Contaiment Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OP Meta Model Contaiment Validation Rule</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule
	 * @generated
	 */
	EClass getOPMetaModelContaimentValidationRule();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule#isIsValid <em>Is Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Valid</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule#isIsValid()
	 * @see #getOPMetaModelContaimentValidationRule()
	 * @generated
	 */
	EAttribute getOPMetaModelContaimentValidationRule_IsValid();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule#getContainerTypeName <em>Container Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Type Name</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule#getContainerTypeName()
	 * @see #getOPMetaModelContaimentValidationRule()
	 * @generated
	 */
	EAttribute getOPMetaModelContaimentValidationRule_ContainerTypeName();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule#getNodeTypeName <em>Node Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type Name</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule#getNodeTypeName()
	 * @see #getOPMetaModelContaimentValidationRule()
	 * @generated
	 */
	EAttribute getOPMetaModelContaimentValidationRule_NodeTypeName();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule <em>OP Meta Model Link Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OP Meta Model Link Validation Rule</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule
	 * @generated
	 */
	EClass getOPMetaModelLinkValidationRule();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#isIsValid <em>Is Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Valid</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#isIsValid()
	 * @see #getOPMetaModelLinkValidationRule()
	 * @generated
	 */
	EAttribute getOPMetaModelLinkValidationRule_IsValid();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#getSourceTypeName <em>Source Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type Name</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#getSourceTypeName()
	 * @see #getOPMetaModelLinkValidationRule()
	 * @generated
	 */
	EAttribute getOPMetaModelLinkValidationRule_SourceTypeName();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#getTargetTypeName <em>Target Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Type Name</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#getTargetTypeName()
	 * @see #getOPMetaModelLinkValidationRule()
	 * @generated
	 */
	EAttribute getOPMetaModelLinkValidationRule_TargetTypeName();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#getLinkTypeName <em>Link Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Type Name</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#getLinkTypeName()
	 * @see #getOPMetaModelLinkValidationRule()
	 * @generated
	 */
	EAttribute getOPMetaModelLinkValidationRule_LinkTypeName();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmeta.model.OPModel <em>OP Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OP Model</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPModel
	 * @generated
	 */
	EClass getOPModel();

	/**
	 * Returns the meta object for the containment reference '{@link com.vainolo.phd.opmeta.model.OPModel#getMetaModel <em>Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Model</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPModel#getMetaModel()
	 * @see #getOPModel()
	 * @generated
	 */
	EReference getOPModel_MetaModel();

	/**
	 * Returns the meta object for the containment reference '{@link com.vainolo.phd.opmeta.model.OPModel#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPModel#getContainer()
	 * @see #getOPModel()
	 * @generated
	 */
	EReference getOPModel_Container();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPModel#getNextId <em>Next Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Id</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPModel#getNextId()
	 * @see #getOPModel()
	 * @generated
	 */
	EAttribute getOPModel_NextId();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmeta.model.InstanceBase <em>Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Base</em>'.
	 * @see com.vainolo.phd.opmeta.model.InstanceBase
	 * @generated
	 */
	EClass getInstanceBase();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.InstanceBase#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see com.vainolo.phd.opmeta.model.InstanceBase#getTypeName()
	 * @see #getInstanceBase()
	 * @generated
	 */
	EAttribute getInstanceBase_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.InstanceBase#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.vainolo.phd.opmeta.model.InstanceBase#getId()
	 * @see #getInstanceBase()
	 * @generated
	 */
	EAttribute getInstanceBase_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opmeta.model.InstanceBase#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.vainolo.phd.opmeta.model.InstanceBase#getProperties()
	 * @see #getInstanceBase()
	 * @generated
	 */
	EReference getInstanceBase_Properties();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmeta.model.NodeInstanceBase <em>Node Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Instance Base</em>'.
	 * @see com.vainolo.phd.opmeta.model.NodeInstanceBase
	 * @generated
	 */
	EClass getNodeInstanceBase();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.NodeInstanceBase#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see com.vainolo.phd.opmeta.model.NodeInstanceBase#getConstraints()
	 * @see #getNodeInstanceBase()
	 * @generated
	 */
	EAttribute getNodeInstanceBase_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.NodeInstanceBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.vainolo.phd.opmeta.model.NodeInstanceBase#getName()
	 * @see #getNodeInstanceBase()
	 * @generated
	 */
	EAttribute getNodeInstanceBase_Name();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmeta.model.ContainerInstanceBase <em>Container Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Instance Base</em>'.
	 * @see com.vainolo.phd.opmeta.model.ContainerInstanceBase
	 * @generated
	 */
	EClass getContainerInstanceBase();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opmeta.model.ContainerInstanceBase#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see com.vainolo.phd.opmeta.model.ContainerInstanceBase#getNodes()
	 * @see #getContainerInstanceBase()
	 * @generated
	 */
	EReference getContainerInstanceBase_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opmeta.model.ContainerInstanceBase#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see com.vainolo.phd.opmeta.model.ContainerInstanceBase#getLinks()
	 * @see #getContainerInstanceBase()
	 * @generated
	 */
	EReference getContainerInstanceBase_Links();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmeta.model.LinkInstanceBase <em>Link Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Instance Base</em>'.
	 * @see com.vainolo.phd.opmeta.model.LinkInstanceBase
	 * @generated
	 */
	EClass getLinkInstanceBase();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opmeta.model.LinkInstanceBase#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.vainolo.phd.opmeta.model.LinkInstanceBase#getSource()
	 * @see #getLinkInstanceBase()
	 * @generated
	 */
	EReference getLinkInstanceBase_Source();

	/**
	 * Returns the meta object for the reference '{@link com.vainolo.phd.opmeta.model.LinkInstanceBase#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.vainolo.phd.opmeta.model.LinkInstanceBase#getTarget()
	 * @see #getLinkInstanceBase()
	 * @generated
	 */
	EReference getLinkInstanceBase_Target();

	/**
	 * Returns the meta object for the attribute list '{@link com.vainolo.phd.opmeta.model.LinkInstanceBase#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see com.vainolo.phd.opmeta.model.LinkInstanceBase#getBendpoints()
	 * @see #getLinkInstanceBase()
	 * @generated
	 */
	EAttribute getLinkInstanceBase_Bendpoints();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmeta.model.ThingInstanceBase <em>Thing Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing Instance Base</em>'.
	 * @see com.vainolo.phd.opmeta.model.ThingInstanceBase
	 * @generated
	 */
	EClass getThingInstanceBase();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmeta.model.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Pair</em>'.
	 * @see com.vainolo.phd.opmeta.model.KeyValuePair
	 * @generated
	 */
	EClass getKeyValuePair();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.KeyValuePair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.vainolo.phd.opmeta.model.KeyValuePair#getKey()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Key();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.KeyValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.vainolo.phd.opmeta.model.KeyValuePair#getValue()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Value();

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
	opmetaFactory getopmetaFactory();

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
		 * The meta object literal for the '{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelDiagramImpl <em>OP Meta Model Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmeta.model.impl.OPMetaModelDiagramImpl
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getOPMetaModelDiagram()
		 * @generated
		 */
		EClass OP_META_MODEL_DIAGRAM = eINSTANCE.getOPMetaModelDiagram();

		/**
		 * The meta object literal for the '<em><b>Elements Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM = eINSTANCE.getOPMetaModelDiagram_ElementsDiagram();

		/**
		 * The meta object literal for the '<em><b>Links Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM = eINSTANCE.getOPMetaModelDiagram_LinksDiagram();

		/**
		 * The meta object literal for the '<em><b>Link Validations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_META_MODEL_DIAGRAM__LINK_VALIDATIONS = eINSTANCE.getOPMetaModelDiagram_LinkValidations();

		/**
		 * The meta object literal for the '<em><b>Contaiment Validations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_META_MODEL_DIAGRAM__CONTAIMENT_VALIDATIONS = eINSTANCE.getOPMetaModelDiagram_ContaimentValidations();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelContaimentValidationRuleImpl <em>OP Meta Model Contaiment Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmeta.model.impl.OPMetaModelContaimentValidationRuleImpl
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getOPMetaModelContaimentValidationRule()
		 * @generated
		 */
		EClass OP_META_MODEL_CONTAIMENT_VALIDATION_RULE = eINSTANCE.getOPMetaModelContaimentValidationRule();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__IS_VALID = eINSTANCE.getOPMetaModelContaimentValidationRule_IsValid();

		/**
		 * The meta object literal for the '<em><b>Container Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__CONTAINER_TYPE_NAME = eINSTANCE.getOPMetaModelContaimentValidationRule_ContainerTypeName();

		/**
		 * The meta object literal for the '<em><b>Node Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_META_MODEL_CONTAIMENT_VALIDATION_RULE__NODE_TYPE_NAME = eINSTANCE.getOPMetaModelContaimentValidationRule_NodeTypeName();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelLinkValidationRuleImpl <em>OP Meta Model Link Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmeta.model.impl.OPMetaModelLinkValidationRuleImpl
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getOPMetaModelLinkValidationRule()
		 * @generated
		 */
		EClass OP_META_MODEL_LINK_VALIDATION_RULE = eINSTANCE.getOPMetaModelLinkValidationRule();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_META_MODEL_LINK_VALIDATION_RULE__IS_VALID = eINSTANCE.getOPMetaModelLinkValidationRule_IsValid();

		/**
		 * The meta object literal for the '<em><b>Source Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_META_MODEL_LINK_VALIDATION_RULE__SOURCE_TYPE_NAME = eINSTANCE.getOPMetaModelLinkValidationRule_SourceTypeName();

		/**
		 * The meta object literal for the '<em><b>Target Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_META_MODEL_LINK_VALIDATION_RULE__TARGET_TYPE_NAME = eINSTANCE.getOPMetaModelLinkValidationRule_TargetTypeName();

		/**
		 * The meta object literal for the '<em><b>Link Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_META_MODEL_LINK_VALIDATION_RULE__LINK_TYPE_NAME = eINSTANCE.getOPMetaModelLinkValidationRule_LinkTypeName();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmeta.model.impl.OPModelImpl <em>OP Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmeta.model.impl.OPModelImpl
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getOPModel()
		 * @generated
		 */
		EClass OP_MODEL = eINSTANCE.getOPModel();

		/**
		 * The meta object literal for the '<em><b>Meta Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_MODEL__META_MODEL = eINSTANCE.getOPModel_MetaModel();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_MODEL__CONTAINER = eINSTANCE.getOPModel_Container();

		/**
		 * The meta object literal for the '<em><b>Next Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_MODEL__NEXT_ID = eINSTANCE.getOPModel_NextId();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmeta.model.impl.InstanceBaseImpl <em>Instance Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmeta.model.impl.InstanceBaseImpl
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getInstanceBase()
		 * @generated
		 */
		EClass INSTANCE_BASE = eINSTANCE.getInstanceBase();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BASE__TYPE_NAME = eINSTANCE.getInstanceBase_TypeName();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_BASE__ID = eINSTANCE.getInstanceBase_Id();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_BASE__PROPERTIES = eINSTANCE.getInstanceBase_Properties();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmeta.model.impl.NodeInstanceBaseImpl <em>Node Instance Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmeta.model.impl.NodeInstanceBaseImpl
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getNodeInstanceBase()
		 * @generated
		 */
		EClass NODE_INSTANCE_BASE = eINSTANCE.getNodeInstanceBase();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_INSTANCE_BASE__CONSTRAINTS = eINSTANCE.getNodeInstanceBase_Constraints();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_INSTANCE_BASE__NAME = eINSTANCE.getNodeInstanceBase_Name();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmeta.model.impl.ContainerInstanceBaseImpl <em>Container Instance Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmeta.model.impl.ContainerInstanceBaseImpl
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getContainerInstanceBase()
		 * @generated
		 */
		EClass CONTAINER_INSTANCE_BASE = eINSTANCE.getContainerInstanceBase();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_INSTANCE_BASE__NODES = eINSTANCE.getContainerInstanceBase_Nodes();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_INSTANCE_BASE__LINKS = eINSTANCE.getContainerInstanceBase_Links();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmeta.model.impl.LinkInstanceBaseImpl <em>Link Instance Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmeta.model.impl.LinkInstanceBaseImpl
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getLinkInstanceBase()
		 * @generated
		 */
		EClass LINK_INSTANCE_BASE = eINSTANCE.getLinkInstanceBase();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_INSTANCE_BASE__SOURCE = eINSTANCE.getLinkInstanceBase_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_INSTANCE_BASE__TARGET = eINSTANCE.getLinkInstanceBase_Target();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_INSTANCE_BASE__BENDPOINTS = eINSTANCE.getLinkInstanceBase_Bendpoints();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmeta.model.impl.ThingInstanceBaseImpl <em>Thing Instance Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmeta.model.impl.ThingInstanceBaseImpl
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getThingInstanceBase()
		 * @generated
		 */
		EClass THING_INSTANCE_BASE = eINSTANCE.getThingInstanceBase();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmeta.model.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmeta.model.impl.KeyValuePairImpl
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getKeyValuePair()
		 * @generated
		 */
		EClass KEY_VALUE_PAIR = eINSTANCE.getKeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__KEY = eINSTANCE.getKeyValuePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__VALUE = eINSTANCE.getKeyValuePair_Value();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

	}

} //opmetaPackage
