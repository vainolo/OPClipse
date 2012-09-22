/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model.tests;

import com.vainolo.phd.opm.model.OPMEffectLink;
import com.vainolo.phd.opm.model.OPMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Effect Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OPMEffectLinkTest extends OPMProceduralLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OPMEffectLinkTest.class);
	}

	/**
	 * Constructs a new Effect Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMEffectLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Effect Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OPMEffectLink getFixture() {
		return (OPMEffectLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OPMFactory.eINSTANCE.createOPMEffectLink());
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

} //OPMEffectLinkTest
