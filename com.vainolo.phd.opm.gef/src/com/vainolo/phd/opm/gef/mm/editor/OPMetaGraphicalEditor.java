package com.vainolo.phd.opm.gef.mm.editor;

import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.ui.IEditorInput;

import com.vainolo.phd.opm.gef.editor.OPMGraphicalEditor;
import com.vainolo.phd.opm.gef.utils.OPMDiagramEditorInput;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;

public class OPMetaGraphicalEditor extends OPMGraphicalEditor {
	
	@Override
	protected OPMObjectProcessDiagram getDiagramFromInput(IEditorInput input){
		OPMObjectProcessDiagram opmd=null;
		if (input instanceof OPMDiagramEditorInput){
	    	opmd = ((OPMDiagramEditorInput) input).getOPD();
	    }
		return opmd;
	}
	
	@Override
	  protected PaletteRoot getPaletteRoot() {
	    return new OPMetaGraphicalEditorPalette();
	  }
	
	void markSaveLocation(){
		getCommandStack().markSaveLocation();
	}
}
