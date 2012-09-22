/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.vainolo.phd.opm.model.OPMPackage
 * @generated
 */
public interface OPMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OPMFactory eINSTANCE = com.vainolo.phd.opm.model.impl.OPMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Object Process Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Process Diagram</em>'.
	 * @generated
	 */
	OPMObjectProcessDiagram createOPMObjectProcessDiagram();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	OPMObject createOPMObject();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	OPMProcess createOPMProcess();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	OPMLink createOPMLink();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
    OPMState createOPMState();

    /**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Agent Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent Link</em>'.
	 * @generated
	 */
	OPMAgentLink createOPMAgentLink();

	/**
	 * Returns a new object of class '<em>Effect Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Link</em>'.
	 * @generated
	 */
	OPMEffectLink createOPMEffectLink();

	/**
	 * Returns a new object of class '<em>Effect Event Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Event Link</em>'.
	 * @generated
	 */
	OPMEffectEventLink createOPMEffectEventLink();

	/**
	 * Returns a new object of class '<em>Effect Condition Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Condition Link</em>'.
	 * @generated
	 */
	OPMEffectConditionLink createOPMEffectConditionLink();

	/**
	 * Returns a new object of class '<em>Result Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Link</em>'.
	 * @generated
	 */
	OPMResultLink createOPMResultLink();

	/**
	 * Returns a new object of class '<em>Invocation Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invocation Link</em>'.
	 * @generated
	 */
	OPMInvocationLink createOPMInvocationLink();

	/**
	 * Returns a new object of class '<em>Instrument Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instrument Link</em>'.
	 * @generated
	 */
	OPMInstrumentLink createOPMInstrumentLink();

	/**
	 * Returns a new object of class '<em>Instrument Event Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instrument Event Link</em>'.
	 * @generated
	 */
	OPMInstrumentEventLink createOPMInstrumentEventLink();

	/**
	 * Returns a new object of class '<em>Instrument Condition Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instrument Condition Link</em>'.
	 * @generated
	 */
	OPMInstrumentConditionLink createOPMInstrumentConditionLink();

	/**
	 * Returns a new object of class '<em>Consumption Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consumption Link</em>'.
	 * @generated
	 */
	OPMConsumptionLink createOPMConsumptionLink();

	/**
	 * Returns a new object of class '<em>Consumption Event Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consumption Event Link</em>'.
	 * @generated
	 */
	OPMConsumptionEventLink createOPMConsumptionEventLink();

	/**
	 * Returns a new object of class '<em>Consumption Condition Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consumption Condition Link</em>'.
	 * @generated
	 */
	OPMConsumptionConditionLink createOPMConsumptionConditionLink();

	/**
	 * Returns a new object of class '<em>Aggregation Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation Link</em>'.
	 * @generated
	 */
	OPMAggregationLink createOPMAggregationLink();

	/**
	 * Returns a new object of class '<em>Exhibition Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exhibition Link</em>'.
	 * @generated
	 */
	OPMExhibitionLink createOPMExhibitionLink();

	/**
	 * Returns a new object of class '<em>Generalization Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization Link</em>'.
	 * @generated
	 */
	OPMGeneralizationLink createOPMGeneralizationLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OPMPackage getOPMPackage();

} //OPMFactory
