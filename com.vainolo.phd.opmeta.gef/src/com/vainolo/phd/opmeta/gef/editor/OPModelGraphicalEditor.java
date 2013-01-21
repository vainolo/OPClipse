package com.vainolo.phd.opmeta.gef.editor;

import java.util.EventObject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.ToggleGridAction;
import org.eclipse.gef.ui.actions.ToggleSnapToGeometryAction;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;

//import com.vainolo.phd.opm.gef.action.ResizeToContentsAction;
import com.vainolo.phd.opm.gef.editor.OPMGraphicalEditorContextMenuProvider;
import com.vainolo.phd.opm.gef.editor.factory.OPMIdManager;
import com.vainolo.phd.opmeta.gef.editor.parts.OPModelEditPartFactory;
import com.vainolo.phd.opmeta.interpreter.validation.OpmodelValidator;
import com.vainolo.phd.opmeta.model.util.OPMMLoader;
import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.OPmetaDefinition;
import com.vainolo.phd.opmodel.model.OPmodelHolder;

public class OPModelGraphicalEditor extends GraphicalEditorWithFlyoutPalette {

	  //private Logger logger = Logger.getLogger(OPModelGraphicalEditor.class.getName());
	  private OPMIdManager opmIdManager;
	  private OPmetaDefinition interpretation;
	  private OPmodelHolder opmodel;
	  private ContainerInstance rootContainer;
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
	      
	      interpretation = opmodel.getMetaDefinition();
	      rootContainer = opmodel.getContainer();
	      setEditDomain(new DefaultEditDomain(this));
	  }
	
	@Override
	protected PaletteRoot getPaletteRoot() {
		return new OPModelGraphicalEditorPlatte(interpretation,opmIdManager);
	}

	@Override
	  protected void configureGraphicalViewer() {
	    super.configureGraphicalViewer();
	    getGraphicalViewer().setEditPartFactory(new OPModelEditPartFactory(new OpmodelValidator(interpretation)));
	    getActionRegistry().registerAction(new ToggleGridAction(getGraphicalViewer()));
	    getActionRegistry().registerAction(new ToggleSnapToGeometryAction(getGraphicalViewer()));
	    getGraphicalViewer().setContextMenu(
	        new OPMGraphicalEditorContextMenuProvider(getGraphicalViewer(), getActionRegistry()));
	    configureKeyboardShortcuts();
	  }

	private void configureKeyboardShortcuts() {
	    GraphicalViewerKeyHandler keyHandler = new GraphicalViewerKeyHandler(getGraphicalViewer());
	    keyHandler.put(KeyStroke.getPressed(SWT.F2, 0), getActionRegistry().getAction(GEFActionConstants.DIRECT_EDIT));
//	    keyHandler.put(KeyStroke.getPressed(SWT.F3, 0),
//	        getActionRegistry().getAction(ResizeToContentsAction.RESIZE_TO_CONTENTS_ID));
	    getGraphicalViewer().setKeyHandler(keyHandler);

	  }
	
	@Override
	  protected void initializeGraphicalViewer() {
	    super.initializeGraphicalViewer();
	    getGraphicalViewer().setContents(rootContainer);
	    getGraphicalControl().setFont(new Font(null, "Consolas", 10, SWT.NORMAL));
	  }
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		try {
			opmodel.setNextId(opmIdManager.getNextId());
			opmodel.eResource().save(null);
			opmmFile.touch(null);
			getCommandStack().markSaveLocation();
	    } catch(Exception e) {
	    	throw new RuntimeException(e);
	    }
	}
	
	/**
	   * Fire a {@link IEditorPart#PROP_DIRTY} property change and call super implementation.
	   */
	  @Override
	  public void commandStackChanged(EventObject event) {
	    firePropertyChange(PROP_DIRTY);
	    super.commandStackChanged(event);
	  }
}
