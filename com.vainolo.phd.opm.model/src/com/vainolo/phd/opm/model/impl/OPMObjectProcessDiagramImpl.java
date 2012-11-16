/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */
package com.vainolo.phd.opm.model.impl;

import java.util.Collection;

import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNamedElement;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagramKind;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.VerticalAlignment;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Object Process Diagram</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.vainolo.phd.opm.model.impl.OPMObjectProcessDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.impl.OPMObjectProcessDiagramImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.impl.OPMObjectProcessDiagramImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.impl.OPMObjectProcessDiagramImpl#getNextId <em>Next Id</em>}</li>
 *   <li>{@link com.vainolo.phd.opm.model.impl.OPMObjectProcessDiagramImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OPMObjectProcessDiagramImpl extends OPMContainerImpl implements OPMObjectProcessDiagram {
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
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
  protected EList<OPMLink> links;

  /**
	 * The default value of the '{@link #getNextId() <em>Next Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNextId()
	 * @generated
	 * @ordered
	 */
  protected static final long NEXT_ID_EDEFAULT = 0L;
  /**
	 * The cached value of the '{@link #getNextId() <em>Next Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getNextId()
	 * @generated
	 * @ordered
	 */
  protected long nextId = NEXT_ID_EDEFAULT;

  /**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
  protected static final OPMObjectProcessDiagramKind KIND_EDEFAULT = OPMObjectProcessDiagramKind.COMPOUND;
  /**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
  protected OPMObjectProcessDiagramKind kind = KIND_EDEFAULT;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected OPMObjectProcessDiagramImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return OPMPackage.Literals.OPM_OBJECT_PROCESS_DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__ALIGNMENT, oldAlignment, alignment));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<OPMLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentWithInverseEList<OPMLink>(OPMLink.class, this, OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS, OPMPackage.OPM_LINK__OPD);
		}
		return links;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public long getNextId() {
		return nextId;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNextId(long newNextId) {
		long oldNextId = nextId;
		nextId = newNextId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NEXT_ID, oldNextId, nextId));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OPMObjectProcessDiagramKind getKind() {
		return kind;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setKind(OPMObjectProcessDiagramKind newKind) {
		OPMObjectProcessDiagramKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__KIND, oldKind, kind));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NAME:
				return getName();
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__ALIGNMENT:
				return getAlignment();
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS:
				return getLinks();
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NEXT_ID:
				return getNextId();
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__KIND:
				return getKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__ALIGNMENT:
				setAlignment((VerticalAlignment)newValue);
				return;
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends OPMLink>)newValue);
				return;
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NEXT_ID:
				setNextId((Long)newValue);
				return;
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__KIND:
				setKind((OPMObjectProcessDiagramKind)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID) {
		switch (featureID) {
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS:
				getLinks().clear();
				return;
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NEXT_ID:
				setNextId(NEXT_ID_EDEFAULT);
				return;
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__KIND:
				setKind(KIND_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__ALIGNMENT:
				return alignment != ALIGNMENT_EDEFAULT;
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__LINKS:
				return links != null && !links.isEmpty();
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NEXT_ID:
				return nextId != NEXT_ID_EDEFAULT;
			case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__KIND:
				return kind != KIND_EDEFAULT;
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
				case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NAME: return OPMPackage.OPM_NAMED_ELEMENT__NAME;
				case OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__ALIGNMENT: return OPMPackage.OPM_NAMED_ELEMENT__ALIGNMENT;
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
				case OPMPackage.OPM_NAMED_ELEMENT__NAME: return OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__NAME;
				case OPMPackage.OPM_NAMED_ELEMENT__ALIGNMENT: return OPMPackage.OPM_OBJECT_PROCESS_DIAGRAM__ALIGNMENT;
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
		result.append(", nextId: ");
		result.append(nextId);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} // OPMObjectProcessDiagramImpl
