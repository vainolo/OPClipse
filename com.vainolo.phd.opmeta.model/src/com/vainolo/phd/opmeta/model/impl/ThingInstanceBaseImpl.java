/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.impl;

import com.vainolo.phd.opmeta.model.ContainerInstanceBase;
import com.vainolo.phd.opmeta.model.LinkInstanceBase;
import com.vainolo.phd.opmeta.model.NodeInstanceBase;
import com.vainolo.phd.opmeta.model.ThingInstanceBase;
import com.vainolo.phd.opmeta.model.opmetaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing Instance Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.ThingInstanceBaseImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.ThingInstanceBaseImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThingInstanceBaseImpl extends NodeInstanceBaseImpl implements ThingInstanceBase {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeInstanceBase> nodes;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkInstanceBase> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingInstanceBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmetaPackage.Literals.THING_INSTANCE_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<NodeInstanceBase> getNodes() {
		if (nodes == null) {
			nodes = new EObjectResolvingEList<NodeInstanceBase>(NodeInstanceBase.class, this, opmetaPackage.THING_INSTANCE_BASE__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkInstanceBase> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<LinkInstanceBase>(LinkInstanceBase.class, this, opmetaPackage.THING_INSTANCE_BASE__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case opmetaPackage.THING_INSTANCE_BASE__NODES:
				return getNodes();
			case opmetaPackage.THING_INSTANCE_BASE__LINKS:
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
			case opmetaPackage.THING_INSTANCE_BASE__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends NodeInstanceBase>)newValue);
				return;
			case opmetaPackage.THING_INSTANCE_BASE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends LinkInstanceBase>)newValue);
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
			case opmetaPackage.THING_INSTANCE_BASE__NODES:
				getNodes().clear();
				return;
			case opmetaPackage.THING_INSTANCE_BASE__LINKS:
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
			case opmetaPackage.THING_INSTANCE_BASE__NODES:
				return nodes != null && !nodes.isEmpty();
			case opmetaPackage.THING_INSTANCE_BASE__LINKS:
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
		if (baseClass == ContainerInstanceBase.class) {
			switch (derivedFeatureID) {
				case opmetaPackage.THING_INSTANCE_BASE__NODES: return opmetaPackage.CONTAINER_INSTANCE_BASE__NODES;
				case opmetaPackage.THING_INSTANCE_BASE__LINKS: return opmetaPackage.CONTAINER_INSTANCE_BASE__LINKS;
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
		if (baseClass == ContainerInstanceBase.class) {
			switch (baseFeatureID) {
				case opmetaPackage.CONTAINER_INSTANCE_BASE__NODES: return opmetaPackage.THING_INSTANCE_BASE__NODES;
				case opmetaPackage.CONTAINER_INSTANCE_BASE__LINKS: return opmetaPackage.THING_INSTANCE_BASE__LINKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ThingInstanceBaseImpl
