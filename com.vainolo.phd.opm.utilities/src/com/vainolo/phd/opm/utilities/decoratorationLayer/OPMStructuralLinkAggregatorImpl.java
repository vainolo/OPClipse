package com.vainolo.phd.opm.utilities.decoratorationLayer;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import com.vainolo.phd.opm.model.OPMContainer;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.VerticalAlignment;

public class OPMStructuralLinkAggregatorImpl implements OPMStructuralLinkAggregator{

	protected static final OPMStructuralLinkKind KIND_EDEFAULT = OPMStructuralLinkKind.AGGREGATION;

	protected OPMStructuralLinkKind kind = KIND_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	OPMStructuralLinkAggregatorImpl() {

  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public OPMStructuralLinkKind getKind() {
    return kind;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setKind(OPMStructuralLinkKind newKind) {
		OPMStructuralLinkKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    //if (eNotificationRequired())
      //eNotify(new ENotificationImpl(this, Notification.SET, OPMPackage.OPM_STRUCTURAL_LINK_AGGREGATOR__KIND, oldKind, kind));
  }

	@Override
	public EList<OPMLink> getIncomingLinks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<OPMLink> getOutgoingLinks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OPMContainer getContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setContainer(OPMContainer value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rectangle getConstraints() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConstraints(Rectangle value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setId(long value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EClass eClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource eResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EObject eContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EStructuralFeature eContainingFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EReference eContainmentFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<EObject> eContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeIterator<EObject> eAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eIsProxy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<EObject> eCrossReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eGet(EStructuralFeature feature, boolean resolve) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eSet(EStructuralFeature feature, Object newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean eIsSet(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eUnset(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object eInvoke(EOperation operation, EList<?> arguments)
			throws InvocationTargetException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eNotify(Notification notification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public VerticalAlignment getAlignment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAlignment(VerticalAlignment value) {
		// TODO Auto-generated method stub
		
	}

}
