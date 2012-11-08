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
	String eNS_URI = "http://opmeta/1.0";

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
	 * The feature id for the '<em><b>Elements Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Links Diagram</b></em>' attribute.
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
	 * The meta object id for the '<em>OPM Object Process Diagram</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.vainolo.phd.opm.model.OPMObjectProcessDiagram
	 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getOPMObjectProcessDiagram()
	 * @generated
	 */
	int OPM_OBJECT_PROCESS_DIAGRAM = 3;


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
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getElementsDiagram <em>Elements Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elements Diagram</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getElementsDiagram()
	 * @see #getOPMetaModelDiagram()
	 * @generated
	 */
	EAttribute getOPMetaModelDiagram_ElementsDiagram();

	/**
	 * Returns the meta object for the attribute '{@link com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getLinksDiagram <em>Links Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Links Diagram</em>'.
	 * @see com.vainolo.phd.opmeta.model.OPMetaModelDiagram#getLinksDiagram()
	 * @see #getOPMetaModelDiagram()
	 * @generated
	 */
	EAttribute getOPMetaModelDiagram_LinksDiagram();

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
	 * Returns the meta object for data type '{@link com.vainolo.phd.opm.model.OPMObjectProcessDiagram <em>OPM Object Process Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OPM Object Process Diagram</em>'.
	 * @see com.vainolo.phd.opm.model.OPMObjectProcessDiagram
	 * @model instanceClass="com.vainolo.phd.opm.model.OPMObjectProcessDiagram"
	 * @generated
	 */
	EDataType getOPMObjectProcessDiagram();

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
		 * The meta object literal for the '<em><b>Elements Diagram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM = eINSTANCE.getOPMetaModelDiagram_ElementsDiagram();

		/**
		 * The meta object literal for the '<em><b>Links Diagram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM = eINSTANCE.getOPMetaModelDiagram_LinksDiagram();

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
		 * The meta object literal for the '<em>OPM Object Process Diagram</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.vainolo.phd.opm.model.OPMObjectProcessDiagram
		 * @see com.vainolo.phd.opmeta.model.impl.opmetaPackageImpl#getOPMObjectProcessDiagram()
		 * @generated
		 */
		EDataType OPM_OBJECT_PROCESS_DIAGRAM = eINSTANCE.getOPMObjectProcessDiagram();

	}

} //opmetaPackage
