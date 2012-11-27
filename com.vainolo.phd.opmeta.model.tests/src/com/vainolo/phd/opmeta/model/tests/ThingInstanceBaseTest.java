/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.tests;

import com.vainolo.phd.opmeta.model.ThingInstanceBase;
import com.vainolo.phd.opmeta.model.opmetaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Thing Instance Base</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThingInstanceBaseTest extends NodeInstanceBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ThingInstanceBaseTest.class);
	}

	/**
	 * Constructs a new Thing Instance Base test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingInstanceBaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Thing Instance Base test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ThingInstanceBase getFixture() {
		return (ThingInstanceBase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(opmetaFactory.eINSTANCE.createThingInstanceBase());
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

} //ThingInstanceBaseTest
