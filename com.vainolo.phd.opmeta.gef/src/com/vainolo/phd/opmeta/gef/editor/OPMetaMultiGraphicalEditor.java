package com.vainolo.phd.opmeta.gef.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.MultiPageEditorPart;

import com.vainolo.phd.opm.gef.editor.OPMGraphicalEditor;
import com.vainolo.phd.opm.gef.editor.factory.OPMIdManager;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opmeta.gef.editor.input.ContainmentValidationListEditorInput;
import com.vainolo.phd.opmeta.gef.editor.input.LinkValidationListEditorInput;
import com.vainolo.phd.opmeta.gef.editor.input.OPMDiagramEditorInput;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.util.OPMMLoader;

public class OPMetaMultiGraphicalEditor extends MultiPageEditorPart implements ISelectionListener {

	private IFile opmmFile;
	private OPMetaModelDiagram opmeta;
	private OPMIdManager idManager; 
	
	public OPMetaMultiGraphicalEditor() {
		super();
		idManager = new OPMIdManager();
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException{
		if(!(input instanceof IFileEditorInput)) {
	    	throw new PartInitException("Invalid Input: Must be IFileEditorInput");
	    }
		super.init(site, input);
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
		
	}
	
	@Override
	public void dispose(){
		getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(this);
		super.dispose();
		
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
	    opmeta = OPMMLoader.loadOPMetaFile(opmmFile.getLocationURI().toString());
	      if(opmeta == null) {
	        throw new RuntimeException("Could not load OPMeta file " + opmmFile.getLocationURI().toString());
	      }
	      
	      if (opmeta.getElementsDiagram().getId() == 0){
	    	  opmeta.getElementsDiagram().setId(1);
	    	  opmeta.getLinksDiagram().setId(2);
	    	  opmeta.getElementsDiagram().setNextId(3);
	    	  opmeta.getLinksDiagram().setNextId(3);
	      }
	      
	    idManager.setId(opmeta.getElementsDiagram().getNextId());
	  }
	
	@Override
	protected void createPages() {
		int index;
		try {
			index = addPage(new OPMetaGraphicalEditor(idManager), new OPMDiagramEditorInput(opmeta.getElementsDiagram()));
			setPageText(index, "Elements");
		} catch (PartInitException e) {
			 ErrorDialog.openError(getSite().getShell(),
                     "Error creating Elements GEF editor",
                     null, e.getStatus());
			e.printStackTrace();
		}
		try {
			index = addPage(new OPMetaGraphicalEditor(idManager), new OPMDiagramEditorInput(opmeta.getLinksDiagram()));
			setPageText(index, "Links");
		} catch (PartInitException e) {
			 ErrorDialog.openError(getSite().getShell(),
                     "Error creating Links GEF editor",
                     null, e.getStatus());
			e.printStackTrace();
		}
		try {
			index = addPage(new LinkValidationTableEditorPart(), new LinkValidationListEditorInput(opmeta.getLinkValidations()));
			setPageText(index, "Link Validation Rules");
		} catch (PartInitException e) {
			 ErrorDialog.openError(getSite().getShell(),
                     "Error creating Link Validation Rules editor",
                     null, e.getStatus());
			e.printStackTrace();
		}
		try {
			index = addPage(new ContainmentValidationTableEditorPart(), new ContainmentValidationListEditorInput(opmeta.getContainmentValidations()));
			setPageText(index, "Contaiment Validation Rules");
		} catch (PartInitException e) {
			 ErrorDialog.openError(getSite().getShell(),
                     "Error creating Contaiment Validation Rules editor",
                     null, e.getStatus());
			e.printStackTrace();
		}
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		try {
			preSave();
			  opmeta.eResource().getResourceSet().getPackageRegistry().put(OPMPackage.eNS_URI,OPMPackage.eINSTANCE);
		      opmeta.eResource().save(null);
		      opmmFile.touch(null);
		      afterSave();
		    } catch(Exception e) {
		      throw new RuntimeException(e);
		    }
		
	}
	
	protected void preSave(){
		int count = getPageCount();
		for (int i=0;i<count;i++){
	    	  IEditorPart part = getEditor(i);
	    	  if (part instanceof IOuterSavable){
	    		  ((IOuterSavable) part).beforeSave();
	    	  }
	      }
	}

	protected void afterSave(){
		int count = getPageCount();
	      for (int i=0;i<count;i++){
	    	  IEditorPart part = getEditor(i);
	    	  if (part instanceof IOuterSavable){
	    		  ((IOuterSavable) part).afterSave();
	    	  }
	      }
	}
	
	@Override
	public void doSaveAs() {
		throw new RuntimeException("doSaveAs must be overridden"); //$NON-NLS-1$
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (this.equals(getSite().getPage().getActiveEditor())) {
		    if (getActiveEditor() instanceof OPMGraphicalEditor)
		    	((OPMGraphicalEditor)getActiveEditor()).selectionChanged(getActiveEditor(), selection);
		   }
	}
	
	 
}
