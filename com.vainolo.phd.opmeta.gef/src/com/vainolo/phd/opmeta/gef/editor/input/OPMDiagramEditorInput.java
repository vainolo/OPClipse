package com.vainolo.phd.opmeta.gef.editor.input;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;

public class OPMDiagramEditorInput implements IEditorInput {

	private OPMObjectProcessDiagram diagram;
	
	public OPMObjectProcessDiagram getOPD(){ return diagram;}
	
	public OPMDiagramEditorInput(OPMObjectProcessDiagram diagram){
		this.diagram = diagram;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
	    return null;
	}

	@Override
	public boolean exists() {
		return (diagram!=null);
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return null;
	}

}
