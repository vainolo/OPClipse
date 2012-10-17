package com.vainolo.phd.opm.utilities.decoratorationLayer;

import org.eclipse.emf.common.util.EList;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagramKind;
import com.vainolo.phd.opm.model.VerticalAlignment;

public class OPMObjectProcessDiagramDecorator extends EObjectDecorator implements OPMObjectProcessDiagram{

	private OPMObjectProcessDiagram original;
	
	public OPMObjectProcessDiagramDecorator(OPMObjectProcessDiagram original){
		super(original);
		this.original =original; 
	}
	
	@Override
	public EList<OPMNode> getNodes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public EList<OPMLink> getLinks() {
		// TODO Auto-generated method stub
		return null;
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

}
