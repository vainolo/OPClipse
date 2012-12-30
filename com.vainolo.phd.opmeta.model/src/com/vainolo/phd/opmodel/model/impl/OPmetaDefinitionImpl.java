/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model.impl;

import com.vainolo.phd.opmodel.model.OPmetaDefinition;
import com.vainolo.phd.opmodel.model.PropertyDescriptor;
import com.vainolo.phd.opmodel.model.TypeDescriptor;
import com.vainolo.phd.opmodel.model.opmodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OPmeta Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmetaDefinitionImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmetaDefinitionImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmetaDefinitionImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmetaDefinitionImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.OPmetaDefinitionImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPmetaDefinitionImpl extends EObjectImpl implements OPmetaDefinition {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDescriptor> types;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDescriptor> nodes;
	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDescriptor> containers;
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDescriptor> links;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyDescriptor> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPmetaDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmodelPackage.Literals.OPMETA_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TypeDescriptor> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<TypeDescriptor>(TypeDescriptor.class, this, opmodelPackage.OPMETA_DEFINITION__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TypeDescriptor> getNodes() {
		if (nodes == null) {
			nodes = new EObjectResolvingEList<TypeDescriptor>(TypeDescriptor.class, this, opmodelPackage.OPMETA_DEFINITION__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TypeDescriptor> getContainers() {
		if (containers == null) {
			containers = new EObjectResolvingEList<TypeDescriptor>(TypeDescriptor.class, this, opmodelPackage.OPMETA_DEFINITION__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TypeDescriptor> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<TypeDescriptor>(TypeDescriptor.class, this, opmodelPackage.OPMETA_DEFINITION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<PropertyDescriptor> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<PropertyDescriptor>(PropertyDescriptor.class, this, opmodelPackage.OPMETA_DEFINITION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case opmodelPackage.OPMETA_DEFINITION__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case opmodelPackage.OPMETA_DEFINITION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case opmodelPackage.OPMETA_DEFINITION__TYPES:
				return getTypes();
			case opmodelPackage.OPMETA_DEFINITION__NODES:
				return getNodes();
			case opmodelPackage.OPMETA_DEFINITION__CONTAINERS:
				return getContainers();
			case opmodelPackage.OPMETA_DEFINITION__LINKS:
				return getLinks();
			case opmodelPackage.OPMETA_DEFINITION__PROPERTIES:
				return getProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case opmodelPackage.OPMETA_DEFINITION__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends TypeDescriptor>)newValue);
				return;
			case opmodelPackage.OPMETA_DEFINITION__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends TypeDescriptor>)newValue);
				return;
			case opmodelPackage.OPMETA_DEFINITION__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends TypeDescriptor>)newValue);
				return;
			case opmodelPackage.OPMETA_DEFINITION__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends TypeDescriptor>)newValue);
				return;
			case opmodelPackage.OPMETA_DEFINITION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertyDescriptor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case opmodelPackage.OPMETA_DEFINITION__TYPES:
				getTypes().clear();
				return;
			case opmodelPackage.OPMETA_DEFINITION__NODES:
				getNodes().clear();
				return;
			case opmodelPackage.OPMETA_DEFINITION__CONTAINERS:
				getContainers().clear();
				return;
			case opmodelPackage.OPMETA_DEFINITION__LINKS:
				getLinks().clear();
				return;
			case opmodelPackage.OPMETA_DEFINITION__PROPERTIES:
				getProperties().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case opmodelPackage.OPMETA_DEFINITION__TYPES:
				return types != null && !types.isEmpty();
			case opmodelPackage.OPMETA_DEFINITION__NODES:
				return nodes != null && !nodes.isEmpty();
			case opmodelPackage.OPMETA_DEFINITION__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case opmodelPackage.OPMETA_DEFINITION__LINKS:
				return links != null && !links.isEmpty();
			case opmodelPackage.OPMETA_DEFINITION__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OPmetaDefinitionImpl