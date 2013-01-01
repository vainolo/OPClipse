/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model.impl;

import com.vainolo.phd.opmodel.model.PropertyFloatInstance;
import com.vainolo.phd.opmodel.model.opmodelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Float Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PropertyFloatInstanceImpl extends PropertyInstanceImpl implements PropertyFloatInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyFloatInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmodelPackage.Literals.PROPERTY_FLOAT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean setValue(String val) {
		try {
			Float.parseFloat(val);
		} catch (NumberFormatException e) {
			return false;
		}
		super.setValue(val);
		return true;
		
	}

} //PropertyFloatInstanceImpl
