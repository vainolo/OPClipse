/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Int Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getPropertyIntInstance()
 * @model
 * @generated
 */
public interface PropertyIntInstance extends PropertyInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='try {\r\n\tInteger.parseInt(val);\r\n} catch (NumberFormatException e) {\r\n\treturn false;\r\n}\r\nsuper.setValue(val);\r\nreturn true;\r\n'"
	 * @generated
	 */
	boolean setValue(String val);

} // PropertyIntInstance
