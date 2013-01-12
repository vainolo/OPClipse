/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model.impl;

import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;
import com.vainolo.phd.opmodel.model.ThingInstance;
import com.vainolo.phd.opmodel.model.opmodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.ThingInstanceImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.ThingInstanceImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThingInstanceImpl extends NodeInstanceImpl implements ThingInstance {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeInstance> nodes;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkInstance> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmodelPackage.Literals.THING_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<NodeInstance> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<NodeInstance>(NodeInstance.class, this, opmodelPackage.THING_INSTANCE__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkInstance> getLinks() {
		if (links == null) {
			links = new EObjectContainmentWithInverseEList<LinkInstance>(LinkInstance.class, this, opmodelPackage.THING_INSTANCE__LINKS, opmodelPackage.LINK_INSTANCE__CONTAINER);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case opmodelPackage.THING_INSTANCE__LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case opmodelPackage.THING_INSTANCE__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case opmodelPackage.THING_INSTANCE__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case opmodelPackage.THING_INSTANCE__NODES:
				return getNodes();
			case opmodelPackage.THING_INSTANCE__LINKS:
				return getLinks();
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
			case opmodelPackage.THING_INSTANCE__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends NodeInstance>)newValue);
				return;
			case opmodelPackage.THING_INSTANCE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends LinkInstance>)newValue);
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
			case opmodelPackage.THING_INSTANCE__NODES:
				getNodes().clear();
				return;
			case opmodelPackage.THING_INSTANCE__LINKS:
				getLinks().clear();
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
			case opmodelPackage.THING_INSTANCE__NODES:
				return nodes != null && !nodes.isEmpty();
			case opmodelPackage.THING_INSTANCE__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ContainerInstance.class) {
			switch (derivedFeatureID) {
				case opmodelPackage.THING_INSTANCE__NODES: return opmodelPackage.CONTAINER_INSTANCE__NODES;
				case opmodelPackage.THING_INSTANCE__LINKS: return opmodelPackage.CONTAINER_INSTANCE__LINKS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ContainerInstance.class) {
			switch (baseFeatureID) {
				case opmodelPackage.CONTAINER_INSTANCE__NODES: return opmodelPackage.THING_INSTANCE__NODES;
				case opmodelPackage.CONTAINER_INSTANCE__LINKS: return opmodelPackage.THING_INSTANCE__LINKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ThingInstanceImpl
