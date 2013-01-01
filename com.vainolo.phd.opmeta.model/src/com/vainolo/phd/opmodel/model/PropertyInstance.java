/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.PropertyInstance#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.PropertyInstance#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getPropertyInstance()
 * @model
 * @generated
 */
public interface PropertyInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' reference.
	 * @see #setDescriptor(PropertyDescriptor)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getPropertyInstance_Descriptor()
	 * @model keys="id"
	 * @generated
	 */
	PropertyDescriptor getDescriptor();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.PropertyInstance#getDescriptor <em>Descriptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' reference.
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(PropertyDescriptor value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getPropertyInstance_Value()
	 * @model default="" unique="false" required="true" changeable="false"
	 * @generated
	 */
	String getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String oldValue = value;\r\nvalue = val;\r\nif (eNotificationRequired())\r\n\teNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.PROPERTY_INSTANCE__VALUE, oldValue, value));\r\nreturn true;'"
	 * @generated
	 */
	boolean setValue(String val);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='value =VALUE_EDEFAULT;'"
	 * @generated
	 */
	void unsetValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getDescriptor().getName();'"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return getDescriptor().getType();'"
	 * @generated
	 */
	propertyType getType();

} // PropertyInstance
