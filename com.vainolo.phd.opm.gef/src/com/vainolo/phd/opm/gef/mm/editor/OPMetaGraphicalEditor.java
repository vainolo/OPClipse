package com.vainolo.phd.opm.gef.mm.editor;

import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPart;

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
	    return new OPMetaGraphicalEditorPalette(getOPMIdManager());
	  }
	
	void markSaveLocation(){
		getCommandStack().markSaveLocation();
	}
	
	/**
	 * @see org.eclipse.ui.ISelectionListener#selectionChanged(IWorkbenchPart,
	 *      ISelection)
	 */
	// this is really stupid but the implementation in the original is just bad
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// If not the active editor, ignore selection changed.
		if (this.equals(part))
			updateActions(getSelectionActions());
	}
}
