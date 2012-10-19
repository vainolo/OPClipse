package com.vainolo.phd.opm.utilities.decoratorationLayer;

import org.eclipse.core.runtime.Assert;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;

import com.vainolo.phd.opm.model.OPMContainer;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMStructuralLink;
import com.vainolo.phd.opm.model.VerticalAlignment;

public class OPMNodeDecorator<T extends OPMNode> extends EObjectDecorator implements OPMNode,OPMDecorated<T>{
	
	protected OPMNodeDecorator(T decorated){
		super(decorated);
		Assert.isNotNull(decorated);
		this.decorated = decorated;
	}
	
	protected T decorated;
	
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

	MyEList<OPMLink> incomingLinks;
	
	@Override
	public EList<OPMLink> getIncomingLinks() {
		if (incomingLinks == null){
			incomingLinks = new MyEList<>();
			EList<OPMLink> origs = decorated.getIncomingLinks();
			for (OPMLink orig:origs){
				if (orig instanceof OPMStructuralLink){
					// what to do here
				}else
					incomingLinks.add((OPMLink)DecorationsBank.INSTANCE.GetOrCreateDecorator(orig));
				
			}
		}
		return incomingLinks;
	}

	MyEList<OPMLink> outgoingLinks;
	
	@Override
	public EList<OPMLink> getOutgoingLinks() {
		if (outgoingLinks == null){
			outgoingLinks = new MyEList<>();
			EList<OPMLink> origs = decorated.getIncomingLinks();
			for (OPMLink orig:origs){
				if (orig instanceof OPMStructuralLink){
					// what to do here
				}else
					outgoingLinks.add((OPMLink)DecorationsBank.INSTANCE.GetOrCreateDecorator(orig));
				
			}
		}
		return outgoingLinks;
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

	@Override
	public T getDecorated() {
		return decorated;
	}

	
}
