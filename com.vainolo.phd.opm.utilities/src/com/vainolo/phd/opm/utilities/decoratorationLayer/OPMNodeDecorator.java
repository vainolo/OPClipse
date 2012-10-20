package com.vainolo.phd.opm.utilities.decoratorationLayer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.draw2d.geometry.Rectangle;

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

	ArrayList<OPMLink> incomingLinks;
	
	@Override
	public List<OPMLink> getIncomingLinks() {
		if (incomingLinks == null){
			incomingLinks = new ArrayList<>();
			List<OPMLink> origs = decorated.getIncomingLinks();
			for (OPMLink orig:origs){
				if (orig instanceof OPMStructuralLink){
					//TODO what to do here
				}else
					incomingLinks.add((OPMLink)DecorationsBank.INSTANCE.GetOrCreateDecorator(orig));
				
			}
		}
		return incomingLinks;
	}

	ArrayList<OPMLink> outgoingLinks;
	
	@Override
	public List<OPMLink> getOutgoingLinks() {
		if (outgoingLinks == null){
			outgoingLinks = new ArrayList<>();
			List<OPMLink> origs = decorated.getOutgoingLinks();
			for (OPMLink orig:origs){
				if (orig instanceof OPMStructuralLink){
					//TODO what to do here
				}else
					outgoingLinks.add((OPMLink)DecorationsBank.INSTANCE.GetOrCreateDecorator(orig));
				
			}
		}
		return outgoingLinks;
	}

	@Override
	public OPMContainer getContainer() {
		OPMContainer orig = decorated.getContainer(); 
		return (OPMContainer) DecorationsBank.INSTANCE.GetOrCreateDecorator(orig);
	}

	@Override
	public void setContainer(OPMContainer value) {
		OPMContainer container = value;
		if (value instanceof OPMDecorated<?>) container = (OPMContainer)((OPMDecorated<?>)value).getDecorated();
		
		// notify previous container
		OPMContainer current = getContainer();
		if (current instanceof OPMObjectProcessDiagramDecorator) ((OPMObjectProcessDiagramDecorator)current).SetNeedRecreateNodesAndLinks();
		// notify next container - need to this before to handle events fired from within
		OPMObjectProcessDiagramDecorator decorator = (OPMObjectProcessDiagramDecorator)DecorationsBank.INSTANCE.GetOrCreateDecorator(container);
		decorator.SetNeedRecreateNodesAndLinks(); 
		//TODO same for OPMThingDecorator
		
		decorated.setContainer(container);
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
