/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model.tests;

import com.vainolo.phd.opm.model.OPMConsumptionConditionLink;
import com.vainolo.phd.opm.model.OPMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Consumption Condition Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OPMConsumptionConditionLinkTest extends OPMProceduralLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OPMConsumptionConditionLinkTest.class);
	}

	/**
	 * Constructs a new Consumption Condition Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMConsumptionConditionLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Consumption Condition Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OPMConsumptionConditionLink getFixture() {
		return (OPMConsumptionConditionLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OPMFactory.eINSTANCE.createOPMConsumptionConditionLink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //OPMConsumptionConditionLinkTest
