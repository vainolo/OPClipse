package com.vainolo.phd.opm.gef.mm.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.MultiPageEditorPart;

import com.vainolo.phd.opm.gef.editor.OPMGraphicalEditor;
import com.vainolo.phd.opm.gef.utils.OPMDiagramEditorInput;
import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.opmetaFactory;
import com.vainolo.phd.opmeta.model.opmetaPackage;
import com.vainolo.phd.opmeta.model.util.OPMMLoader;

public class OPMetaModelGraphicalEditor extends MultiPageEditorPart{

	private IFile opmmFile;
	private OPMetaModelDiagram opmeta;
	
	public OPMetaModelGraphicalEditor() {
		super();
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException{
		if(!(input instanceof IFileEditorInput)) {
	    	throw new PartInitException("Invalid Input: Must be IFileEditorInput");
	    }
		super.init(site, input);
	}
	
	@Override
	  protected void setInput(IEditorInput input) {
	    super.setInput(input);
	    loadInput(input);
	    setPartName(input.getName());
	  }

	  private void loadInput(IEditorInput input) {
	    IFileEditorInput fileInput = (IFileEditorInput) input;
	    opmmFile = fileInput.getFile();
	    opmeta = OPMMLoader.loadOPDFile(opmmFile.getLocationURI().toString());
	      if(opmeta == null) {
	        throw new RuntimeException("Could not load OPMeta file " + opmmFile.getLocationURI().toString());
	      }
	      
	   // TODO: remove at some point:
		    if (opmeta != null && opmeta.getElementsDiagram() == null) opmeta.setElementsDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		    if (opmeta != null && opmeta.getLinksDiagram() == null) opmeta.setLinksDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
	  }
	
	@Override
	protected void createPages() {
		int index;
		try {
			index = addPage(new OPMGraphicalEditor(), new OPMDiagramEditorInput(opmeta.getElementsDiagram()));
			setPageText(index, "Elements");
		} catch (PartInitException e) {
			 ErrorDialog.openError(getSite().getShell(),
                     "Error creating Elements GEF editor",
                     null, e.getStatus());
			e.printStackTrace();
		}
		try {
			index = addPage(new OPMGraphicalEditor(), new OPMDiagramEditorInput(opmeta.getLinksDiagram()));
			setPageText(index, "Links");
		} catch (PartInitException e) {
			 ErrorDialog.openError(getSite().getShell(),
                     "Error creating Links GEF editor",
                     null, e.getStatus());
			e.printStackTrace();
		}
		// TODO continue
		
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

}
