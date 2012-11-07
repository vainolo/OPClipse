package com.vainolo.phd.opm.gef.decorationLayer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagramKind;
import com.vainolo.phd.opm.model.OPMStructuralLink;
import com.vainolo.phd.opm.model.OPMThing;
import com.vainolo.phd.opm.model.VerticalAlignment;

public class OPMObjectProcessDiagramDecorator extends EObjectDecorator<OPMObjectProcessDiagram> implements OPMObjectProcessDiagram 
	{
	private boolean recreateNeeded = true;
	
	public OPMObjectProcessDiagramDecorator(OPMObjectProcessDiagram original){
		this(original,new DecorationsBank());
	}
	
	public OPMObjectProcessDiagramDecorator(OPMObjectProcessDiagram original, DecorationsBank decorationsBank){
		super(original,decorationsBank);
		decorationsBank.putDecorator(original, this);
	}
	@Override
	protected void notifingChange(Notification notification){
		recreateNeeded = true;
		super.notifingChange(notification);
	}
	
	private void recreateNodesAndLinks(){
		if (!recreateNeeded) return;
		List<OPMNode> origNodes =  decorated.getNodes();
		nodes = new HashSet<>();
		for (OPMNode orig:origNodes){
			OPMNode nodeDecorator = (OPMNode)decorationsBank.getOrCreateDecorator(orig);
			if (nodes.add(nodeDecorator))
			{
				if (orig instanceof OPMThing) ((OPMThing)nodeDecorator).getNodes();
			}
		}
		List<OPMLink> origLinks =  decorated.getLinks();
		links = new HashSet<OPMLink>();
		HashSet<OPMStructuralLinkAggregator> aggregators = new HashSet<>();
		for (OPMLink link:origLinks){
			if (link instanceof OPMStructuralLink){
				OPMStructuralLinkAggregator aggregator = decorationsBank.getOrCreateAggregator((OPMStructuralLink)link,this);
				nodes.add(aggregator);
				aggregators.add(aggregator);
			}else{
				links.add((OPMLink)decorationsBank.getOrCreateDecorator(link));
			}
		}
		for (OPMStructuralLinkAggregator aggregator:aggregators){
			links.addAll(aggregator.getIncomingLinks());
			links.addAll(aggregator.getOutgoingLinks());
		}
		for (OPMNode node:nodes){
			if (node instanceof OPMNodeDecorator<?>) ((OPMNodeDecorator<?>)node).notifingChange(new NotificationImpl(NotificationImpl.NO_INDEX,null,null));
		}
		recreateNeeded = false;
	}
	
	HashSet<OPMNode> nodes;
	
	@Override
	public List<OPMNode> getNodes() {
		recreateNodesAndLinks();
		return new ArrayList<>(nodes);
	}
	
	HashSet<OPMLink> links;
	
	@Override
	public List<OPMLink> getLinks() {
		recreateNodesAndLinks();
		return new ArrayList(links);
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

	@Override
	public long getNextId() {
		return decorated.getNextId();
	}

	@Override
	public void setNextId(long value) {
		decorated.setNextId(value);
	}

	@Override
	public OPMObjectProcessDiagramKind getKind() {
		return decorated.getKind();
	}

	@Override
	public void setKind(OPMObjectProcessDiagramKind value) {
		decorated.setKind(value);
	}	
}
