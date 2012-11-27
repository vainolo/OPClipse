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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Instance Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.LinkInstanceBaseImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.LinkInstanceBaseImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkInstanceBaseImpl extends InstanceBaseImpl implements LinkInstanceBase {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected NodeInstanceBase source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected NodeInstanceBase target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkInstanceBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmetaPackage.Literals.LINK_INSTANCE_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeInstanceBase getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (NodeInstanceBase)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, opmetaPackage.LINK_INSTANCE_BASE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeInstanceBase basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(NodeInstanceBase newSource, NotificationChain msgs) {
		NodeInstanceBase oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, opmetaPackage.LINK_INSTANCE_BASE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(NodeInstanceBase newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, opmetaPackage.NODE_INSTANCE_BASE__OUTGOING_LINKS, NodeInstanceBase.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, opmetaPackage.NODE_INSTANCE_BASE__OUTGOING_LINKS, NodeInstanceBase.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.LINK_INSTANCE_BASE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeInstanceBase getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (NodeInstanceBase)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, opmetaPackage.LINK_INSTANCE_BASE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeInstanceBase basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(NodeInstanceBase newTarget, NotificationChain msgs) {
		NodeInstanceBase oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, opmetaPackage.LINK_INSTANCE_BASE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(NodeInstanceBase newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, opmetaPackage.NODE_INSTANCE_BASE__INCOMING_LINKS, NodeInstanceBase.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, opmetaPackage.NODE_INSTANCE_BASE__INCOMING_LINKS, NodeInstanceBase.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.LINK_INSTANCE_BASE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case opmetaPackage.LINK_INSTANCE_BASE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, opmetaPackage.NODE_INSTANCE_BASE__OUTGOING_LINKS, NodeInstanceBase.class, msgs);
				return basicSetSource((NodeInstanceBase)otherEnd, msgs);
			case opmetaPackage.LINK_INSTANCE_BASE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, opmetaPackage.NODE_INSTANCE_BASE__INCOMING_LINKS, NodeInstanceBase.class, msgs);
				return basicSetTarget((NodeInstanceBase)otherEnd, msgs);
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
			case opmetaPackage.LINK_INSTANCE_BASE__SOURCE:
				return basicSetSource(null, msgs);
			case opmetaPackage.LINK_INSTANCE_BASE__TARGET:
				return basicSetTarget(null, msgs);
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
			case opmetaPackage.LINK_INSTANCE_BASE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case opmetaPackage.LINK_INSTANCE_BASE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case opmetaPackage.LINK_INSTANCE_BASE__SOURCE:
				setSource((NodeInstanceBase)newValue);
				return;
			case opmetaPackage.LINK_INSTANCE_BASE__TARGET:
				setTarget((NodeInstanceBase)newValue);
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
			case opmetaPackage.LINK_INSTANCE_BASE__SOURCE:
				setSource((NodeInstanceBase)null);
				return;
			case opmetaPackage.LINK_INSTANCE_BASE__TARGET:
				setTarget((NodeInstanceBase)null);
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
			case opmetaPackage.LINK_INSTANCE_BASE__SOURCE:
				return source != null;
			case opmetaPackage.LINK_INSTANCE_BASE__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkInstanceBaseImpl
