/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.impl;

import com.vainolo.phd.opmeta.model.LinkInstanceBase;
import com.vainolo.phd.opmeta.model.NodeInstanceBase;
import com.vainolo.phd.opmeta.model.opmetaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Instance Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.NodeInstanceBaseImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.NodeInstanceBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.NodeInstanceBaseImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.NodeInstanceBaseImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeInstanceBaseImpl extends InstanceBaseImpl implements NodeInstanceBase {
	/**
	 * The default value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle CONSTRAINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected Rectangle constraints = CONSTRAINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkInstanceBase> outgoingLinks;

	/**
	 * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkInstanceBase> incomingLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeInstanceBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmetaPackage.Literals.NODE_INSTANCE_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(Rectangle newConstraints) {
		Rectangle oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.NODE_INSTANCE_BASE__CONSTRAINTS, oldConstraints, constraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.NODE_INSTANCE_BASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkInstanceBase> getOutgoingLinks() {
		if (outgoingLinks == null) {
			outgoingLinks = new EObjectWithInverseResolvingEList<LinkInstanceBase>(LinkInstanceBase.class, this, opmetaPackage.NODE_INSTANCE_BASE__OUTGOING_LINKS, opmetaPackage.LINK_INSTANCE_BASE__SOURCE);
		}
		return outgoingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkInstanceBase> getIncomingLinks() {
		if (incomingLinks == null) {
			incomingLinks = new EObjectWithInverseResolvingEList<LinkInstanceBase>(LinkInstanceBase.class, this, opmetaPackage.NODE_INSTANCE_BASE__INCOMING_LINKS, opmetaPackage.LINK_INSTANCE_BASE__TARGET);
		}
		return incomingLinks;
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
			case opmetaPackage.NODE_INSTANCE_BASE__OUTGOING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLinks()).basicAdd(otherEnd, msgs);
			case opmetaPackage.NODE_INSTANCE_BASE__INCOMING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
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
			case opmetaPackage.NODE_INSTANCE_BASE__OUTGOING_LINKS:
				return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
			case opmetaPackage.NODE_INSTANCE_BASE__INCOMING_LINKS:
				return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
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
			case opmetaPackage.NODE_INSTANCE_BASE__CONSTRAINTS:
				return getConstraints();
			case opmetaPackage.NODE_INSTANCE_BASE__NAME:
				return getName();
			case opmetaPackage.NODE_INSTANCE_BASE__OUTGOING_LINKS:
				return getOutgoingLinks();
			case opmetaPackage.NODE_INSTANCE_BASE__INCOMING_LINKS:
				return getIncomingLinks();
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
			case opmetaPackage.NODE_INSTANCE_BASE__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
				return;
			case opmetaPackage.NODE_INSTANCE_BASE__NAME:
				setName((String)newValue);
				return;
			case opmetaPackage.NODE_INSTANCE_BASE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				getOutgoingLinks().addAll((Collection<? extends LinkInstanceBase>)newValue);
				return;
			case opmetaPackage.NODE_INSTANCE_BASE__INCOMING_LINKS:
				getIncomingLinks().clear();
				getIncomingLinks().addAll((Collection<? extends LinkInstanceBase>)newValue);
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
			case opmetaPackage.NODE_INSTANCE_BASE__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
				return;
			case opmetaPackage.NODE_INSTANCE_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case opmetaPackage.NODE_INSTANCE_BASE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				return;
			case opmetaPackage.NODE_INSTANCE_BASE__INCOMING_LINKS:
				getIncomingLinks().clear();
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
			case opmetaPackage.NODE_INSTANCE_BASE__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
			case opmetaPackage.NODE_INSTANCE_BASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case opmetaPackage.NODE_INSTANCE_BASE__OUTGOING_LINKS:
				return outgoingLinks != null && !outgoingLinks.isEmpty();
			case opmetaPackage.NODE_INSTANCE_BASE__INCOMING_LINKS:
				return incomingLinks != null && !incomingLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (constraints: ");
		result.append(constraints);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NodeInstanceBaseImpl
