/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.impl;

import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;

import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.opmetaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OP Meta Model Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelDiagramImpl#getElementsDiagram <em>Elements Diagram</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelDiagramImpl#getLinksDiagram <em>Links Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPMetaModelDiagramImpl extends EObjectImpl implements OPMetaModelDiagram {
	/**
	 * The default value of the '{@link #getElementsDiagram() <em>Elements Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsDiagram()
	 * @generated
	 * @ordered
	 */
	protected static final OPMObjectProcessDiagram ELEMENTS_DIAGRAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementsDiagram() <em>Elements Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsDiagram()
	 * @generated
	 * @ordered
	 */
	protected OPMObjectProcessDiagram elementsDiagram = ELEMENTS_DIAGRAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinksDiagram() <em>Links Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksDiagram()
	 * @generated
	 * @ordered
	 */
	protected static final OPMObjectProcessDiagram LINKS_DIAGRAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinksDiagram() <em>Links Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksDiagram()
	 * @generated
	 * @ordered
	 */
	protected OPMObjectProcessDiagram linksDiagram = LINKS_DIAGRAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OPMetaModelDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return opmetaPackage.Literals.OP_META_MODEL_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMObjectProcessDiagram getElementsDiagram() {
		return elementsDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementsDiagram(OPMObjectProcessDiagram newElementsDiagram) {
		OPMObjectProcessDiagram oldElementsDiagram = elementsDiagram;
		elementsDiagram = newElementsDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM, oldElementsDiagram, elementsDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPMObjectProcessDiagram getLinksDiagram() {
		return linksDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinksDiagram(OPMObjectProcessDiagram newLinksDiagram) {
		OPMObjectProcessDiagram oldLinksDiagram = linksDiagram;
		linksDiagram = newLinksDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM, oldLinksDiagram, linksDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case opmetaPackage.OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM:
				return getElementsDiagram();
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM:
				return getLinksDiagram();
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
			case opmetaPackage.OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM:
				setElementsDiagram((OPMObjectProcessDiagram)newValue);
				return;
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM:
				setLinksDiagram((OPMObjectProcessDiagram)newValue);
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
			case opmetaPackage.OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM:
				setElementsDiagram(ELEMENTS_DIAGRAM_EDEFAULT);
				return;
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM:
				setLinksDiagram(LINKS_DIAGRAM_EDEFAULT);
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
			case opmetaPackage.OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM:
				return ELEMENTS_DIAGRAM_EDEFAULT == null ? elementsDiagram != null : !ELEMENTS_DIAGRAM_EDEFAULT.equals(elementsDiagram);
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM:
				return LINKS_DIAGRAM_EDEFAULT == null ? linksDiagram != null : !LINKS_DIAGRAM_EDEFAULT.equals(linksDiagram);
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
		result.append(" (ElementsDiagram: ");
		result.append(elementsDiagram);
		result.append(", LinksDiagram: ");
		result.append(linksDiagram);
		result.append(')');
		return result.toString();
	}

} //OPMetaModelDiagramImpl
