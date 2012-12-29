/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Float Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getPropertyFloatInstance()
 * @model
 * @generated
 */
public interface PropertyFloatInstance extends PropertyInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='try {\r\n\tFloat.parseFloat(val);\r\n} catch (NumberFormatException e) {\r\n\treturn false;\r\n}\r\nthis.value=val;\r\nreturn true;\r\n'"
	 * @generated
	 */
	boolean setValue(String val);

} // PropertyFloatInstance
