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
 * A representation of the model object '<em><b>OPmodel Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmodelHolder#getContainer <em>Container</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmodelHolder#getMetaDefinition <em>Meta Definition</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.OPmodelHolder#getNextId <em>Next Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelHolder()
 * @model
 * @generated
 */
public interface OPmodelHolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(ContainerInstance)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelHolder_Container()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContainerInstance getContainer();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.OPmodelHolder#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ContainerInstance value);

	/**
	 * Returns the value of the '<em><b>Meta Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Definition</em>' containment reference.
	 * @see #setMetaDefinition(OPmetaDefinition)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelHolder_MetaDefinition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OPmetaDefinition getMetaDefinition();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.OPmodelHolder#getMetaDefinition <em>Meta Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Definition</em>' containment reference.
	 * @see #getMetaDefinition()
	 * @generated
	 */
	void setMetaDefinition(OPmetaDefinition value);

	/**
	 * Returns the value of the '<em><b>Next Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Id</em>' attribute.
	 * @see #setNextId(long)
	 * @see com.vainolo.phd.opmodel.model.opmodelPackage#getOPmodelHolder_NextId()
	 * @model required="true"
	 * @generated
	 */
	long getNextId();

	/**
	 * Sets the value of the '{@link com.vainolo.phd.opmodel.model.OPmodelHolder#getNextId <em>Next Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Id</em>' attribute.
	 * @see #getNextId()
	 * @generated
	 */
	void setNextId(long value);

} // OPmodelHolder
