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
	 * The number of structural features of the '<em>OP Meta Model Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_DIAGRAM_FEATURE_COUNT = 2;

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
	 * The number of structural features of the '<em>OP Meta Model Contaiment Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_CONTAIMENT_VALIDATION_RULE_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>OP Meta Model Link Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_LINK_VALIDATION_RULE_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Instance Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_BASE_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_BASE__NODES = INSTANCE_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
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
	 * The number of structural features of the '<em>Link Instance Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_INSTANCE_BASE_FEATURE_COUNT = INSTANCE_BASE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Links</b></em>' reference list.
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
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 9;

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
	 * Returns the meta object for class '{@link com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule <em>OP Meta Model Contaiment Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OP Meta Model Contaiment Validation Rule</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule
	 * @generated
	 */
	EClass getOPMetaModelContaimentValidationRule();

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
	 * Returns the meta object for the reference list '{@link com.vainolo.phd.opmeta.model.ContainerInstanceBase#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
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
	 * Returns the meta object for class '{@link com.vainolo.phd.opmeta.model.ThingInstanceBase <em>Thing Instance Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing Instance Base</em>'.
	 * @see com.vainolo.phd.opmeta.model.ThingInstanceBase
	 * @generated
	 */
	EClass getThingInstanceBase();

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
		 * The meta object literal for the '{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelContaimentValidationRuleImpl <em>OP Meta Model Contaiment Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmeta.model.impl.OPMetaModelContaimentValidationRuleImpl
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getOPMetaModelContaimentValidationRule()
		 * @generated
		 */
		EClass OP_META_MODEL_CONTAIMENT_VALIDATION_RULE = eINSTANCE.getOPMetaModelContaimentValidationRule();

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
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link com.vainolo.phd.opmeta.model.impl.ThingInstanceBaseImpl <em>Thing Instance Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmeta.model.impl.ThingInstanceBaseImpl
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getThingInstanceBase()
		 * @generated
		 */
		EClass THING_INSTANCE_BASE = eINSTANCE.getThingInstanceBase();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

	}

} //opmetaPackage
