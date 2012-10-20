package com.vainolo.phd.opm.utilities.decoratorationLayer;

import java.util.ArrayList;
import java.util.List;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagramKind;
import com.vainolo.phd.opm.model.OPMStructuralLink;
import com.vainolo.phd.opm.model.VerticalAlignment;

public class OPMObjectProcessDiagramDecorator extends EObjectDecorator<OPMObjectProcessDiagram> implements OPMObjectProcessDiagram 
	{
	private boolean recreateNeeded = true;
	
	public OPMObjectProcessDiagramDecorator(OPMObjectProcessDiagram original){
		super(original);
		DecorationsBank.INSTANCE.putDecorator(original, this);
	}
	@Override
	protected void NotifingChange(){
		recreateNeeded = true;
	}
	
	private void RecreateNodesAndLinks(){
		if (!recreateNeeded) return;
		List<OPMNode> origNodes =  decorated.getNodes();
		nodes = new ArrayList<OPMNode>();
		for (OPMNode orig:origNodes){
			nodes.add((OPMNode)DecorationsBank.INSTANCE.GetOrCreateDecorator(orig));
		}
		List<OPMLink> origLinks =  decorated.getLinks();
		links = new ArrayList<OPMLink>();
		for (OPMLink link:origLinks){
			if (link instanceof OPMStructuralLink){
				// TODO what goes here
//			 	OPMNodeDecorator<OPMNode> source = (OPMNodeDecorator<OPMNode>)DecorationsBank.INSTANCE.GetOrCreateDecorator(link.getSource());
//			 	findOutgoingStructuralLinks source.getOutgoingLinks()
				
			}else{
				links.add((OPMLink)DecorationsBank.INSTANCE.GetOrCreateDecorator(link));
			}
		}
		recreateNeeded = false;
	}
	
	ArrayList<OPMNode> nodes;
	
	@Override
	public List<OPMNode> getNodes() {
		RecreateNodesAndLinks();
		return nodes;
	}
	
	ArrayList<OPMLink> links;
	
	@Override
	public List<OPMLink> getLinks() {
		RecreateNodesAndLinks();
		return links;
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
