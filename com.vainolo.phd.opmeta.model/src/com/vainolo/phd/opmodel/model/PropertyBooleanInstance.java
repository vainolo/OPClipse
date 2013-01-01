/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Boolean Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getPropertyBooleanInstance()
 * @model
 * @generated
 */
public interface PropertyBooleanInstance extends PropertyInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (val.equals(\"true\") || val.equals(\"false\")) {\r\n\tsuper.setValue(val);\r\n\treturn true;\r\n}\r\nreturn false;\r\n'"
	 * @generated
	 */
	boolean setValue(String val);

} // PropertyBooleanInstance
