/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.InstanceBase#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.InstanceBase#getId <em>Id</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.InstanceBase#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getInstanceBase()
 * @model abstract="true"
 * @generated
 */
public interface InstanceBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.PropertyInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getInstanceBase_Properties()
	 * @model containment="true"
	 * @generated
	 */
	List<PropertyInstance> getProperties();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getInstanceBase_Id()
	 * @model id="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.InstanceBase#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeDescriptor)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getInstanceBase_Type()
	 * @model keys="id" required="true"
	 * @generated
	 */
	TypeDescriptor getType();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.InstanceBase#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDescriptor value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='for (PropertyInstance propertyInstance:getProperties()){\r\n\t if (propertyInstance.getName().equals(name)) return propertyInstance;\r\n}\r\nreturn null;'"
	 * @generated
	 */
	PropertyInstance getProperty(String name);

} // InstanceBase
