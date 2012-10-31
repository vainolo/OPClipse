package com.vainolo.phd.opm.utilities.decoratorationLayer;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
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
	protected void NotifingChange(Notification notification){
		incomingLinks = null;
		outgoingLinks = null;
		super.NotifingChange(notification);
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

	ArrayList<OPMLink> incomingLinks;
	
	@Override
	public List<OPMLink> getIncomingLinks() {
		if (incomingLinks == null){
			incomingLinks = new ArrayList<>();
			List<OPMLink> origs = decorated.getIncomingLinks();
			for (OPMLink orig:origs){
				if (orig instanceof OPMStructuralLink){
					OPMStructuralLinkAggregator aggregator = decorationsBank.getAggregator((OPMStructuralLink)orig);
					if (aggregator == null) continue;
					OPMSimpleLink link = decorationsBank.getSimpleLink(aggregator, this);
					if (link!=null) incomingLinks.add(link);
				}else
					incomingLinks.add((OPMLink)decorationsBank.GetOrCreateDecorator(orig));
				
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
					OPMStructuralLinkAggregator aggregator = decorationsBank.getAggregator((OPMStructuralLink)orig);
					if (aggregator == null) continue;
					OPMSimpleLink link = decorationsBank.getSimpleLink(this,aggregator);
					if (link!=null) outgoingLinks.add(link);
				}else
					outgoingLinks.add((OPMLink)decorationsBank.GetOrCreateDecorator(orig));
				
			}
		}
		return outgoingLinks;
	}

	@Override
	public OPMContainer getContainer() {
		OPMContainer orig = decorated.getContainer(); 
		return (OPMContainer) decorationsBank.GetOrCreateDecorator(orig);
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
