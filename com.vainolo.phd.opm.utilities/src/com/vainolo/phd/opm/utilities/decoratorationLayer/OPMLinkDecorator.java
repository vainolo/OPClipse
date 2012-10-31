package com.vainolo.phd.opm.utilities.decoratorationLayer;

import java.util.List;

import org.eclipse.draw2d.geometry.Point;

import com.vainolo.phd.opm.model.OPMContainer;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMLinkRouterKind;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;

public class OPMLinkDecorator<T extends OPMLink> extends EObjectDecorator<T> implements OPMLink{
	
	protected OPMLinkDecorator(T decorated, DecorationsBank decorationsBank) {
		super(decorated, decorationsBank);
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
		OPMObjectProcessDiagram orig = decorated.getOpd();
		if (orig==null) return null;
		OPMObjectProcessDiagram wrapper = (OPMObjectProcessDiagram)decorationsBank.GetOrCreateDecorator(orig);
		return wrapper;
	}

	@Override
	public void setOpd(OPMObjectProcessDiagram value) {
		OPMObjectProcessDiagram container = value;
		if (value instanceof OPMObjectProcessDiagramDecorator) container = ((OPMObjectProcessDiagramDecorator)value).getDecorated();
		
		decorated.setOpd(container);
	}

	@Override
	public OPMNode getSource() {
		OPMNode origSource= decorated.getSource();
		return (OPMNode)decorationsBank.GetOrCreateDecorator(origSource);
	}

	@Override
	public void setSource(OPMNode value) {
		if (value instanceof OPMNodeDecorator) {
			OPMNodeDecorator<?> decorator =(OPMNodeDecorator<?>) value;
			decorated.setSource((OPMNode)decorator.getDecorated());
		} else {
			decorated.setSource(value);
		}
		
		
	}

	@Override
	public OPMNode getTarget() {
		OPMNode origTarget= decorated.getTarget();
		return (OPMNode)decorationsBank.GetOrCreateDecorator(origTarget);
	}

	@Override
	public void setTarget(OPMNode value) {
		if (value instanceof OPMNodeDecorator) {
			OPMNodeDecorator<?> decorator =(OPMNodeDecorator<?>) value;
			decorated.setTarget((OPMNode)decorator.getDecorated());
		} else {
			decorated.setTarget(value);
		}
	}

	@Override
	public List<Point> getBendpoints() {
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
