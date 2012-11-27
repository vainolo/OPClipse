/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.tests;

import com.vainolo.phd.opmeta.model.LinkInstanceBase;
import com.vainolo.phd.opmeta.model.opmetaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link Instance Base</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkInstanceBaseTest extends InstanceBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkInstanceBaseTest.class);
	}

	/**
	 * Constructs a new Link Instance Base test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkInstanceBaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link Instance Base test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinkInstanceBase getFixture() {
		return (LinkInstanceBase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(opmetaFactory.eINSTANCE.createLinkInstanceBase());
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

} //LinkInstanceBaseTest
