/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.tests;

import com.vainolo.phd.opmeta.model.NodeInstanceBase;
import com.vainolo.phd.opmeta.model.opmetaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node Instance Base</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeInstanceBaseTest extends InstanceBaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeInstanceBaseTest.class);
	}

	/**
	 * Constructs a new Node Instance Base test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeInstanceBaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node Instance Base test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NodeInstanceBase getFixture() {
		return (NodeInstanceBase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(opmetaFactory.eINSTANCE.createNodeInstanceBase());
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

} //NodeInstanceBaseTest
