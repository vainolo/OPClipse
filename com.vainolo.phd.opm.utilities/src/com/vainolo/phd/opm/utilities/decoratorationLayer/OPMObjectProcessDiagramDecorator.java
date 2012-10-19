package com.vainolo.phd.opm.utilities.decoratorationLayer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.NotifyingInternalEListImpl;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagramKind;
import com.vainolo.phd.opm.model.OPMStructuralLink;
import com.vainolo.phd.opm.model.VerticalAlignment;

public class OPMObjectProcessDiagramDecorator extends EObjectDecorator implements OPMObjectProcessDiagram, 
	OPMDecorated<OPMObjectProcessDiagram>{

	private OPMObjectProcessDiagram original;
	
	public OPMObjectProcessDiagramDecorator(OPMObjectProcessDiagram original){
		super(original);
		this.original =original; 
		DecorationsBank.INSTANCE.putDecorator(original, this);
		
		InitializeNodesAndLinks();
	}
	
	private void InitializeNodesAndLinks(){
		EList<OPMNode> origNodes =  original.getNodes();
		nodes = new NotifyingInternalEListImpl<OPMNode>();
		for (OPMNode orig:origNodes){
			nodes.add((OPMNode)DecorationsBank.INSTANCE.GetOrCreateDecorator(orig));
		}
		EList<OPMLink> origLinks =  original.getLinks();
		links = new NotifyingInternalEListImpl<OPMLink>();
		for (OPMLink link:origLinks){
			if (link instanceof OPMStructuralLink){
//			 	OPMNodeDecorator<OPMNode> source = (OPMNodeDecorator<OPMNode>)DecorationsBank.INSTANCE.GetOrCreateDecorator(link.getSource());
//			 	findOutgoingStructuralLinks source.getOutgoingLinks()
				
			}else{
				links.add((OPMLink)DecorationsBank.INSTANCE.GetOrCreateDecorator(link));
			}
		}	
	}
	
	NotifyingInternalEListImpl<OPMNode> nodes;
	
	@Override
	public EList<OPMNode> getNodes() {
		
		return nodes;
	}
	
	NotifyingInternalEListImpl<OPMLink> links;
	
	@Override
	public EList<OPMLink> getLinks() {
		
		return links;
	}

	@Override
	public long getId() {
		return original.getId();
	}

	@Override
	public void setId(long value) {
		original.setId(value);
	}

	
	@Override
	public String getName() {
		return original.getName();
	}

	@Override
	public void setName(String value) {
		original.setName(value);
	}

	@Override
	public VerticalAlignment getAlignment() {
		return original.getAlignment();
	}

	@Override
	public void setAlignment(VerticalAlignment value) {
		original.setAlignment(value);
	}

	@Override
	public long getNextId() {
		return original.getNextId();
	}

	@Override
	public void setNextId(long value) {
		original.setNextId(value);
	}

	@Override
	public OPMObjectProcessDiagramKind getKind() {
		return original.getKind();
	}

	@Override
	public void setKind(OPMObjectProcessDiagramKind value) {
		original.setKind(value);
	}

	@Override
	public OPMObjectProcessDiagram getDecorated() {
		return original;
	}

}
