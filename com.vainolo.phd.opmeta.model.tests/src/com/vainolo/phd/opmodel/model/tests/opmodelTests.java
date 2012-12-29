/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>opmodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class opmodelTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new opmodelTests("opmodel Tests");
		suite.addTestSuite(NodeInstanceTest.class);
		suite.addTestSuite(LinkInstanceTest.class);
		suite.addTestSuite(ContainerInstanceTest.class);
		suite.addTestSuite(ThingInstanceTest.class);
		suite.addTestSuite(TypeDescriptorTest.class);
		suite.addTestSuite(PropertyInstanceTest.class);
		suite.addTestSuite(PropertyIntInstanceTest.class);
		suite.addTestSuite(PropertyFloatInstanceTest.class);
		suite.addTestSuite(PropertyBooleanInstanceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public opmodelTests(String name) {
		super(name);
	}

} //opmodelTests
