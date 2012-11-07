package com.vainolo.phd.opm.gef.decorationLayer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;

import com.vainolo.phd.opm.model.OPMContainer;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMStructuralLink;
import com.vainolo.phd.opm.model.VerticalAlignment;
import com.vainolo.phd.opm.utilities.analysis.OPMDecorated;

public class OPMNodeDecorator<T extends OPMNode> extends EObjectDecorator<T> implements OPMNode{
	
	protected OPMNodeDecorator(T decorated, DecorationsBank decorationsBank){
		super(decorated,decorationsBank);
	}

	@Override
	protected void notifingChange(Notification notification){
		incomingLinks = null;
		outgoingLinks = null;
		super.notifingChange(notification);
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

	Set<OPMLink> incomingLinks;
	
	@Override
	public List<OPMLink> getIncomingLinks() {
		if (incomingLinks == null){
			incomingLinks = new HashSet<>();
			List<OPMLink> origs = decorated.getIncomingLinks();
			for (OPMLink orig:origs){
				if (orig instanceof OPMStructuralLink){
					OPMStructuralLinkAggregator aggregator = decorationsBank.getAggregator((OPMStructuralLink)orig);
					if (aggregator == null) continue;
					OPMSimpleLink link = decorationsBank.getSimpleLink(aggregator, this);
					if (link!=null) incomingLinks.add(link);
				}else
					incomingLinks.add((OPMLink)decorationsBank.getOrCreateDecorator(orig));
				
			}
		}
		return new ArrayList<OPMLink>(incomingLinks);
	}

	Set<OPMLink> outgoingLinks;
	
	@Override
	public List<OPMLink> getOutgoingLinks() {
		if (outgoingLinks == null){
			outgoingLinks = new HashSet<OPMLink>();
			List<OPMLink> origs = decorated.getOutgoingLinks();
			for (OPMLink orig:origs){
				if (orig instanceof OPMStructuralLink){
					OPMStructuralLinkAggregator aggregator = decorationsBank.getAggregator((OPMStructuralLink)orig);
					if (aggregator == null) continue;
					OPMSimpleLink link = decorationsBank.getSimpleLink(this,aggregator);
					if (link!=null) outgoingLinks.add(link);
				}else
					outgoingLinks.add((OPMLink)decorationsBank.getOrCreateDecorator(orig));
				
			}
		}
		return new ArrayList<OPMLink>(outgoingLinks);
	}

	@Override
	public OPMContainer getContainer() {
		OPMContainer orig = decorated.getContainer(); 
		return (OPMContainer) decorationsBank.getOrCreateDecorator(orig);
	}

	@Override
	public void setContainer(OPMContainer value) {
		OPMContainer container = value;
		if (value instanceof OPMDecorated<?>) container = (OPMContainer)((OPMDecorated<?>)value).getDecorated();
		
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
	
}
