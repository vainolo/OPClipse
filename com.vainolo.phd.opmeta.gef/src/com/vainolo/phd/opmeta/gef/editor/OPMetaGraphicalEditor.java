package com.vainolo.phd.opmeta.gef.editor;

import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPart;

import com.vainolo.phd.opm.gef.editor.OPMGraphicalEditor;
import com.vainolo.phd.opm.gef.editor.factory.OPMIdManager;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opmeta.gef.utils.OPMDiagramEditorInput;

public class OPMetaGraphicalEditor extends OPMGraphicalEditor {
	
	public OPMetaGraphicalEditor(OPMIdManager idManager){
		super(idManager);
	}
	
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
	
	@Override protected void afterLoadInput() {} // disable reset value of IdManager
	
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
