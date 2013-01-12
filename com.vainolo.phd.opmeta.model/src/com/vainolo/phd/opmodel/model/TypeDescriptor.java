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
 * A representation of the model object '<em><b>Type Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getId <em>Id</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getName <em>Name</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getParents <em>Parents</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getTypeDescriptor()
 * @model
 * @generated
 */
public interface TypeDescriptor extends EObject {
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
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getTypeDescriptor_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getTypeDescriptor_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.PropertyDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getTypeDescriptor_Properties()
	 * @model
	 * @generated
	 */
	List<PropertyDescriptor> getProperties();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.TypeDescriptor}.
	 * It is bidirectional and its opposite is '{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getTypeDescriptor_Parents()
	 * @see com.vainolo.phd.opmodel.model.TypeDescriptor#getChildren
	 * @model opposite="children" keys="id"
	 * @generated
	 */
	List<TypeDescriptor> getParents();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link com.vainolo.phd.opmodel.model.TypeDescriptor}.
	 * It is bidirectional and its opposite is '{@link com.vainolo.phd.opmodel.model.TypeDescriptor#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getTypeDescriptor_Children()
	 * @see com.vainolo.phd.opmodel.model.TypeDescriptor#getParents
	 * @model opposite="parents" keys="id"
	 * @generated
	 */
	List<TypeDescriptor> getChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (!getChildren().isEmpty());'"
	 * @generated
	 */
	boolean isAbstract();

} // TypeDescriptor
