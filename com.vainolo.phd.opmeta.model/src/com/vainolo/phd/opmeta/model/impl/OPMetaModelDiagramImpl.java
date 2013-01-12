/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.impl;

import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;

import com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;
import com.vainolo.phd.opmeta.model.opmetaPackage;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OP Meta Model Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelDiagramImpl#getElementsDiagram <em>Elements Diagram</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelDiagramImpl#getLinksDiagram <em>Links Diagram</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelDiagramImpl#getLinkValidations <em>Link Validations</em>}</li>
 *   <li>{@link com.vainolo.phd.opmeta.model.impl.OPMetaModelDiagramImpl#getContaimentValidations <em>Contaiment Validations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPMetaModelDiagramImpl extends EObjectImpl implements OPMetaModelDiagram {
	/**
	 * The cached value of the '{@link #getElementsDiagram() <em>Elements Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsDiagram()
	 * @generated
	 * @ordered
	 */
	protected OPMObjectProcessDiagram elementsDiagram;

	/**
	 * The cached value of the '{@link #getLinksDiagram() <em>Links Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksDiagram()
	 * @generated
	 * @ordered
	 */
	protected OPMObjectProcessDiagram linksDiagram;

	/**
	 * The cached value of the '{@link #getLinkValidations() <em>Link Validations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkValidations()
	 * @generated
	 * @ordered
	 */
	protected EList<OPMetaModelLinkValidationRule> linkValidations;

	/**
	 * The cached value of the '{@link #getContaimentValidations() <em>Contaiment Validations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContaimentValidations()
	 * @generated
	 * @ordered
	 */
	protected EList<OPMetaModelContaimentValidationRule> contaimentValidations;

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
	public NotificationChain basicSetElementsDiagram(OPMObjectProcessDiagram newElementsDiagram, NotificationChain msgs) {
		OPMObjectProcessDiagram oldElementsDiagram = elementsDiagram;
		elementsDiagram = newElementsDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM, oldElementsDiagram, newElementsDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementsDiagram(OPMObjectProcessDiagram newElementsDiagram) {
		if (newElementsDiagram != elementsDiagram) {
			NotificationChain msgs = null;
			if (elementsDiagram != null)
				msgs = ((InternalEObject)elementsDiagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - opmetaPackage.OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM, null, msgs);
			if (newElementsDiagram != null)
				msgs = ((InternalEObject)newElementsDiagram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - opmetaPackage.OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM, null, msgs);
			msgs = basicSetElementsDiagram(newElementsDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM, newElementsDiagram, newElementsDiagram));
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
	public NotificationChain basicSetLinksDiagram(OPMObjectProcessDiagram newLinksDiagram, NotificationChain msgs) {
		OPMObjectProcessDiagram oldLinksDiagram = linksDiagram;
		linksDiagram = newLinksDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM, oldLinksDiagram, newLinksDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinksDiagram(OPMObjectProcessDiagram newLinksDiagram) {
		if (newLinksDiagram != linksDiagram) {
			NotificationChain msgs = null;
			if (linksDiagram != null)
				msgs = ((InternalEObject)linksDiagram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM, null, msgs);
			if (newLinksDiagram != null)
				msgs = ((InternalEObject)newLinksDiagram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM, null, msgs);
			msgs = basicSetLinksDiagram(newLinksDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM, newLinksDiagram, newLinksDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<OPMetaModelLinkValidationRule> getLinkValidations() {
		if (linkValidations == null) {
			linkValidations = new EObjectContainmentEList<OPMetaModelLinkValidationRule>(OPMetaModelLinkValidationRule.class, this, opmetaPackage.OP_META_MODEL_DIAGRAM__LINK_VALIDATIONS);
		}
		return linkValidations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<OPMetaModelContaimentValidationRule> getContaimentValidations() {
		if (contaimentValidations == null) {
			contaimentValidations = new EObjectContainmentEList<OPMetaModelContaimentValidationRule>(OPMetaModelContaimentValidationRule.class, this, opmetaPackage.OP_META_MODEL_DIAGRAM__CONTAIMENT_VALIDATIONS);
		}
		return contaimentValidations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case opmetaPackage.OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM:
				return basicSetElementsDiagram(null, msgs);
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM:
				return basicSetLinksDiagram(null, msgs);
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINK_VALIDATIONS:
				return ((InternalEList<?>)getLinkValidations()).basicRemove(otherEnd, msgs);
			case opmetaPackage.OP_META_MODEL_DIAGRAM__CONTAIMENT_VALIDATIONS:
				return ((InternalEList<?>)getContaimentValidations()).basicRemove(otherEnd, msgs);
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
			case opmetaPackage.OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM:
				return getElementsDiagram();
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM:
				return getLinksDiagram();
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINK_VALIDATIONS:
				return getLinkValidations();
			case opmetaPackage.OP_META_MODEL_DIAGRAM__CONTAIMENT_VALIDATIONS:
				return getContaimentValidations();
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
			case opmetaPackage.OP_META_MODEL_DIAGRAM__ELEMENTS_DIAGRAM:
				setElementsDiagram((OPMObjectProcessDiagram)newValue);
				return;
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM:
				setLinksDiagram((OPMObjectProcessDiagram)newValue);
				return;
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINK_VALIDATIONS:
				getLinkValidations().clear();
				getLinkValidations().addAll((Collection<? extends OPMetaModelLinkValidationRule>)newValue);
				return;
			case opmetaPackage.OP_META_MODEL_DIAGRAM__CONTAIMENT_VALIDATIONS:
				getContaimentValidations().clear();
				getContaimentValidations().addAll((Collection<? extends OPMetaModelContaimentValidationRule>)newValue);
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
				setElementsDiagram((OPMObjectProcessDiagram)null);
				return;
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM:
				setLinksDiagram((OPMObjectProcessDiagram)null);
				return;
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINK_VALIDATIONS:
				getLinkValidations().clear();
				return;
			case opmetaPackage.OP_META_MODEL_DIAGRAM__CONTAIMENT_VALIDATIONS:
				getContaimentValidations().clear();
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
				return elementsDiagram != null;
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINKS_DIAGRAM:
				return linksDiagram != null;
			case opmetaPackage.OP_META_MODEL_DIAGRAM__LINK_VALIDATIONS:
				return linkValidations != null && !linkValidations.isEmpty();
			case opmetaPackage.OP_META_MODEL_DIAGRAM__CONTAIMENT_VALIDATIONS:
				return contaimentValidations != null && !contaimentValidations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OPMetaModelDiagramImpl
