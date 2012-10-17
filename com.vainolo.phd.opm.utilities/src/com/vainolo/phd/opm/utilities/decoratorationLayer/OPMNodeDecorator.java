package com.vainolo.phd.opm.utilities.decoratorationLayer;

import org.eclipse.core.runtime.Assert;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import com.vainolo.phd.opm.model.OPMContainer;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.VerticalAlignment;

public class OPMNodeDecorator extends EObjectDecorator implements OPMNode{
	
	public OPMNodeDecorator(OPMNode decorated){
		super(decorated);
		Assert.isNotNull(decorated);
		this.decorated = decorated;
	}
	
	OPMNode decorated;
	
	@Override
	public long getId() {
		return decorated.getId();
	}

	@Override
	public void setId(long value) {
		decorated.setId(value);
	}

	@Override
	public String getName() {
		return decorated.getName();
	}

	@Override
	public void setName(String value) {
		decorated.setName(value);
	}

	@Override
	public VerticalAlignment getAlignment() {
		return decorated.getAlignment();
	}

	@Override
	public void setAlignment(VerticalAlignment value) {
		decorated.setAlignment(value);
		
	}

	@Override
	public EList<OPMLink> getIncomingLinks() {
		return decorated.getIncomingLinks();
	}

	@Override
	public EList<OPMLink> getOutgoingLinks() {
		return decorated.getOutgoingLinks();
	}

	@Override
	public OPMContainer getContainer() {
		return decorated.getContainer();
	}

	@Override
	public void setContainer(OPMContainer value) {
		decorated.setContainer(value);
		
	}

	@Override
	public Rectangle getConstraints() {
		return decorated.getConstraints();
	}

	@Override
	public void setConstraints(Rectangle value) {
		decorated.setConstraints(value);
		
	}

	
}
