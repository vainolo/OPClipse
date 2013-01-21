/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Containment Validations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_DIAGRAM__CONTAINMENT_VALIDATIONS = 3;

	/**
	 * The number of structural features of the '<em>OP Meta Model Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelContainmentValidationRuleImpl <em>OP Meta Model Containment Validation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opmeta.model.impl.OPMetaModelContainmentValidationRuleImpl
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getOPMetaModelContainmentValidationRule()
	 * @generated
	 */
	int OP_META_MODEL_CONTAINMENT_VALIDATION_RULE = 1;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_CONTAINMENT_VALIDATION_RULE__VALID = 0;

	/**
	 * The feature id for the '<em><b>Container Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_CONTAINMENT_VALIDATION_RULE__CONTAINER_TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Node Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_CONTAINMENT_VALIDATION_RULE__NODE_TYPE_NAME = 2;

	/**
	 * The number of structural features of the '<em>OP Meta Model Containment Validation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_CONTAINMENT_VALIDATION_RULE_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_LINK_VALIDATION_RULE__VALID = 0;

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
	 * Returns the meta object for the containment reference list '{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getContainmentValidations <em>Containment Validations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containment Validations</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getContainmentValidations()
	 * @see #getOPMetaModelDiagram()
	 * @generated
	 */
	EReference getOPMetaModelDiagram_ContainmentValidations();

	/**
	 * Returns the meta object for class '{@link com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule <em>OP Meta Model Containment Validation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OP Meta Model Containment Validation Rule</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule
	 * @generated
	 */
	EClass getOPMetaModelContainmentValidationRule();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule#isValid()
	 * @see #getOPMetaModelContainmentValidationRule()
	 * @generated
	 */
	EAttribute getOPMetaModelContainmentValidationRule_Valid();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule#getContainerTypeName <em>Container Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Type Name</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule#getContainerTypeName()
	 * @see #getOPMetaModelContainmentValidationRule()
	 * @generated
	 */
	EAttribute getOPMetaModelContainmentValidationRule_ContainerTypeName();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule#getNodeTypeName <em>Node Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type Name</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule#getNodeTypeName()
	 * @see #getOPMetaModelContainmentValidationRule()
	 * @generated
	 */
	EAttribute getOPMetaModelContainmentValidationRule_NodeTypeName();

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
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule#isValid()
	 * @see #getOPMetaModelLinkValidationRule()
	 * @generated
	 */
	EAttribute getOPMetaModelLinkValidationRule_Valid();

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
		 * The meta object literal for the '<em><b>Containment Validations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_META_MODEL_DIAGRAM__CONTAINMENT_VALIDATIONS = eINSTANCE.getOPMetaModelDiagram_ContainmentValidations();

		/**
		 * The meta object literal for the '{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelContainmentValidationRuleImpl <em>OP Meta Model Containment Validation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opmeta.model.impl.OPMetaModelContainmentValidationRuleImpl
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getOPMetaModelContainmentValidationRule()
		 * @generated
		 */
		EClass OP_META_MODEL_CONTAINMENT_VALIDATION_RULE = eINSTANCE.getOPMetaModelContainmentValidationRule();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_META_MODEL_CONTAINMENT_VALIDATION_RULE__VALID = eINSTANCE.getOPMetaModelContainmentValidationRule_Valid();

		/**
		 * The meta object literal for the '<em><b>Container Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_META_MODEL_CONTAINMENT_VALIDATION_RULE__CONTAINER_TYPE_NAME = eINSTANCE.getOPMetaModelContainmentValidationRule_ContainerTypeName();

		/**
		 * The meta object literal for the '<em><b>Node Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_META_MODEL_CONTAINMENT_VALIDATION_RULE__NODE_TYPE_NAME = eINSTANCE.getOPMetaModelContainmentValidationRule_NodeTypeName();

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
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_META_MODEL_LINK_VALIDATION_RULE__VALID = eINSTANCE.getOPMetaModelLinkValidationRule_Valid();

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

	}

} //opmetaPackage
