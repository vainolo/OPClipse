/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model.impl;

import com.vainolo.phd.opm.model.OPMNamedElement;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.VerticalAlignment;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;
import com.vainolo.phd.opmodel.model.opmodelFactory;
import com.vainolo.phd.opmodel.model.opmodelPackage;

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
 * An implementation of the model object '<em><b>Node Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.NodeInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.NodeInstanceImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.NodeInstanceImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.NodeInstanceImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link com.vainolo.phd.opmodel.model.impl.NodeInstanceImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeInstanceImpl extends InstanceBaseImpl implements NodeInstance {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "<<name>>";

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
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final VerticalAlignment ALIGNMENT_EDEFAULT = VerticalAlignment.CENTER;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected VerticalAlignment alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle CONSTRAINTS_EDEFAULT = (Rectangle)opmodelFactory.eINSTANCE.createFromString(opmodelPackage.eINSTANCE.getRectangle(), "0,0,50,50");

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
	 * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkInstance> incomingLinks;

	/**
	 * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkInstance> outgoingLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmodelPackage.Literals.NODE_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.NODE_INSTANCE__CONSTRAINTS, oldConstraints, constraints));
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
			eNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.NODE_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalAlignment getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(VerticalAlignment newAlignment) {
		VerticalAlignment oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmodelPackage.NODE_INSTANCE__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkInstance> getIncomingLinks() {
		if (incomingLinks == null) {
			incomingLinks = new EObjectWithInverseResolvingEList<LinkInstance>(LinkInstance.class, this, opmodelPackage.NODE_INSTANCE__INCOMING_LINKS, opmodelPackage.LINK_INSTANCE__TARGET);
		}
		return incomingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<LinkInstance> getOutgoingLinks() {
		if (outgoingLinks == null) {
			outgoingLinks = new EObjectWithInverseResolvingEList<LinkInstance>(LinkInstance.class, this, opmodelPackage.NODE_INSTANCE__OUTGOING_LINKS, opmodelPackage.LINK_INSTANCE__SOURCE);
		}
		return outgoingLinks;
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
			case opmodelPackage.NODE_INSTANCE__INCOMING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
			case opmodelPackage.NODE_INSTANCE__OUTGOING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLinks()).basicAdd(otherEnd, msgs);
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
			case opmodelPackage.NODE_INSTANCE__INCOMING_LINKS:
				return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
			case opmodelPackage.NODE_INSTANCE__OUTGOING_LINKS:
				return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
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
			case opmodelPackage.NODE_INSTANCE__NAME:
				return getName();
			case opmodelPackage.NODE_INSTANCE__ALIGNMENT:
				return getAlignment();
			case opmodelPackage.NODE_INSTANCE__CONSTRAINTS:
				return getConstraints();
			case opmodelPackage.NODE_INSTANCE__INCOMING_LINKS:
				return getIncomingLinks();
			case opmodelPackage.NODE_INSTANCE__OUTGOING_LINKS:
				return getOutgoingLinks();
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
			case opmodelPackage.NODE_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case opmodelPackage.NODE_INSTANCE__ALIGNMENT:
				setAlignment((VerticalAlignment)newValue);
				return;
			case opmodelPackage.NODE_INSTANCE__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
				return;
			case opmodelPackage.NODE_INSTANCE__INCOMING_LINKS:
				getIncomingLinks().clear();
				getIncomingLinks().addAll((Collection<? extends LinkInstance>)newValue);
				return;
			case opmodelPackage.NODE_INSTANCE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				getOutgoingLinks().addAll((Collection<? extends LinkInstance>)newValue);
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
			case opmodelPackage.NODE_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case opmodelPackage.NODE_INSTANCE__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case opmodelPackage.NODE_INSTANCE__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
				return;
			case opmodelPackage.NODE_INSTANCE__INCOMING_LINKS:
				getIncomingLinks().clear();
				return;
			case opmodelPackage.NODE_INSTANCE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
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
			case opmodelPackage.NODE_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case opmodelPackage.NODE_INSTANCE__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case opmodelPackage.NODE_INSTANCE__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
			case opmodelPackage.NODE_INSTANCE__INCOMING_LINKS:
				return incomingLinks != null && !incomingLinks.isEmpty();
			case opmodelPackage.NODE_INSTANCE__OUTGOING_LINKS:
				return outgoingLinks != null && !outgoingLinks.isEmpty();
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
		if (baseClass == OPMNamedElement.class) {
			switch (derivedFeatureID) {
				case opmodelPackage.NODE_INSTANCE__NAME: return OPMPackage.OPM_NAMED_ELEMENT__NAME;
				case opmodelPackage.NODE_INSTANCE__ALIGNMENT: return OPMPackage.OPM_NAMED_ELEMENT__ALIGNMENT;
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
		if (baseClass == OPMNamedElement.class) {
			switch (baseFeatureID) {
				case OPMPackage.OPM_NAMED_ELEMENT__NAME: return opmodelPackage.NODE_INSTANCE__NAME;
				case OPMPackage.OPM_NAMED_ELEMENT__ALIGNMENT: return opmodelPackage.NODE_INSTANCE__ALIGNMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", alignment: ");
		result.append(alignment);
		result.append(", constraints: ");
		result.append(constraints);
		result.append(')');
		return result.toString();
	}

} //NodeInstanceImpl
