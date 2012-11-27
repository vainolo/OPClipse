/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.tests;

import com.vainolo.phd.opmeta.model.ContainerInstanceBase;
import com.vainolo.phd.opmeta.model.opmetaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Container Instance Base</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerInstanceBaseTest extends InstanceBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContainerInstanceBaseTest.class);
	}

	/**
	 * Constructs a new Container Instance Base test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerInstanceBaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Container Instance Base test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContainerInstanceBase getFixture() {
		return (ContainerInstanceBase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(opmetaFactory.eINSTANCE.createContainerInstanceBase());
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

} //ContainerInstanceBaseTest
