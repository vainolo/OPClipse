package com.vainolo.phd.opm.utilities.decoratorationLayer;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;

import com.vainolo.phd.opm.model.OPMContainer;
import com.vainolo.phd.opm.model.OPMLink;

public class OPMStructuralLinkAggregatorImpl implements OPMStructuralLinkAggregator{

	protected static final StructuralLinkKind KIND_EDEFAULT = StructuralLinkKind.AGGREGATION;

	protected StructuralLinkKind kind = KIND_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public OPMStructuralLinkAggregatorImpl() {

  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public StructuralLinkKind getKind() {
    return kind;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setKind(StructuralLinkKind newKind) {
		StructuralLinkKind oldKind = kind;
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

}
