package com.vainolo.phd.opmeta.gef.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ToggleGridAction;
import org.eclipse.gef.ui.actions.ToggleSnapToGeometryAction;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;

import com.vainolo.phd.opm.gef.editor.OPMGraphicalEditorContextMenuProvider;
import com.vainolo.phd.opm.gef.editor.factory.OPMIdManager;
import com.vainolo.phd.opmeta.gef.editor.parts.OPModelEditPartFactory;
import com.vainolo.phd.opmeta.gef.editor.policy.OPContainerXYLayoutEditPolicy;
import com.vainolo.phd.opmeta.interpreter.OpmetaInterpretation;
import com.vainolo.phd.opmeta.interpreter.OpmodelInterpretationCreator;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.model.OPModel;
import com.vainolo.phd.opmeta.model.util.OPMMLoader;

public class OPModelGraphicalEditor extends GraphicalEditorWithFlyoutPalette {

	  //private Logger logger = Logger.getLogger(OPModelGraphicalEditor.class.getName());
	  private OPMIdManager opmIdManager;
	  private OpmetaInterpretation interpretation;
	  private OPModel opmodel;
	  private OpmodelContainerInstance rootContainer;
	  private IFile opmmFile;
	  
	  public OPModelGraphicalEditor() {
		  this(new OPMIdManager());
	  }
	  
	  protected OPModelGraphicalEditor(OPMIdManager opmIdManager) {
		  super();
		  this.opmIdManager = opmIdManager;
		  
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
	    opmodel = OPMMLoader.loadOPModelFile(opmmFile.getLocationURI().toString());
	      if(opmodel == null) {
	        throw new RuntimeException("Could not load OPMeta file " + opmmFile.getLocationURI().toString());
	      }
	      if (opmodel.getNextId() == 0){
	    	  opmodel.setNextId(1);
	      }
	      opmIdManager.setId(opmodel.getNextId());
	      
	      interpretation = OpmetaInterpretation.CreateInterpretation(opmodel.getMetaModel());
	      rootContainer =  OpmodelInterpretationCreator.Create(interpretation, opmodel.getContainer());
	      setEditDomain(new DefaultEditDomain(this));
	  }
	
	@Override
	protected PaletteRoot getPaletteRoot() {
		return new OPModelGraphicalEditorPlatte(interpretation,opmIdManager);
	}

	@Override
	  protected void configureGraphicalViewer() {
	    super.configureGraphicalViewer();
	    getGraphicalViewer().setEditPartFactory(new OPModelEditPartFactory());
	    getActionRegistry().registerAction(new ToggleGridAction(getGraphicalViewer()));
	    getActionRegistry().registerAction(new ToggleSnapToGeometryAction(getGraphicalViewer()));
	    getGraphicalViewer().setContextMenu(
	        new OPMGraphicalEditorContextMenuProvider(getGraphicalViewer(), getActionRegistry()));
	    //configureKeyboardShortcuts();
	  }

	@Override
	  protected void initializeGraphicalViewer() {
	    super.initializeGraphicalViewer();
	    getGraphicalViewer().setContents(rootContainer);
	    getGraphicalViewer().getContents().installEditPolicy(EditPolicy.LAYOUT_ROLE, new OPContainerXYLayoutEditPolicy());
	    getGraphicalControl().setFont(new Font(null, "Consolas", 10, SWT.NORMAL));
	  }
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
	}
}
