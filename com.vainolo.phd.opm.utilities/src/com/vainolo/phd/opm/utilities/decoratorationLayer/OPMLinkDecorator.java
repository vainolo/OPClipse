package com.vainolo.phd.opm.utilities.decoratorationLayer;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMLinkRouterKind;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;

public class OPMLinkDecorator extends EObjectDecorator implements OPMLink{

	private OPMLink decorated;
	
	public OPMLinkDecorator(OPMLink decorated) {
		super(decorated);
		this.decorated = decorated;
	}

	@Override
	public long getId() {
		return decorated.getId();
	}

	@Override
	public void setId(long value) {
		decorated.setId(value);
	}

	@Override
	public OPMObjectProcessDiagram getOpd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOpd(OPMObjectProcessDiagram value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OPMNode getSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSource(OPMNode value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OPMNode getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTarget(OPMNode value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EList<Point> getBendpoints() {
		return decorated.getBendpoints();
	}

	@Override
	public OPMLinkRouterKind getRouterKind() {
		return decorated.getRouterKind();
	}

	@Override
	public void setRouterKind(OPMLinkRouterKind value) {
		decorated.setRouterKind(value);
		
	}

	@Override
	public String getSourceDecoration() {
		return decorated.getSourceDecoration();
	}

	@Override
	public void setSourceDecoration(String value) {
		decorated.setSourceDecoration(value);
	}

	@Override
	public String getTargetDecoration() {
		return decorated.getTargetDecoration();
	}

	@Override
	public void setTargetDecoration(String value) {
		decorated.setTargetDecoration(value);
	}

	@Override
	public String getCenterDecoration() {
		return decorated.getCenterDecoration();
	}

	@Override
	public void setCenterDecoration(String value) {
		decorated.setCenterDecoration(value);
	}

}
