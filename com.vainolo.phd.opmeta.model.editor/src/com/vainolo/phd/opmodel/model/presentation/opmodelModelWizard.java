/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmodel.model.presentation;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xmi.XMLResource;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.PixelConverter;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import com.vainolo.phd.opmeta.interpreter.OpmetaInterpreter;
import com.vainolo.phd.opmeta.interpreter.OpmodelFactory;
import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.OPmodelContainmentValidationRule;
import com.vainolo.phd.opmodel.model.OPmodelHolder;
import com.vainolo.phd.opmodel.model.TypeDescriptor;
import org.eclipse.core.runtime.Path;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.presentation.opmetaEditorPlugin;
import com.vainolo.phd.opmeta.model.util.OPMMLoader;;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class opmodelModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(OPModelEditorPlugin.INSTANCE.getString("_UI_opmodelEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS =
		OPModelEditorPlugin.INSTANCE.getString("_UI_opmodelEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected opmodelModelWizardNewFileCreationPage newFileCreationPage;

	protected opmodelModelWizradOpmetaSelectionPage selectOpmetaFilePage;
	
	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	protected OPmodelHolder currHolder = null; 

	// Keep track of the directory that we browsed to last time
	// the wizard was invoked.
	private static String previouslyBrowsedDirectory = ""; //$NON-NLS-1$
	
	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(OPModelEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(OPModelEditorPlugin.INSTANCE.getImage("full/wizban/Newopmodel")));
	}

	/**
	 * Create a new model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EObject createInitialModel() {
		OPmodelHolder holder = currHolder;
		
		OpmodelFactory factory = new OpmodelFactory(holder.getMetaDefinition());
		ContainerInstance container =  (ContainerInstance)factory.createOpmodelInstance(selectOpmetaFilePage.getInitialObjectType());
		holder.setContainer(container);
		container.setId(holder.getNextId());
		holder.setNextId(holder.getNextId() +1);
		
		// do not move this before any other command because some commands might use this
		currHolder = null;
		return holder;
	}

	@Override
	public boolean canFinish() {
		if (selectOpmetaFilePage.isActivePage()) return false;
		return super.canFinish();
	}
	
	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							
							// Create a resource set
							//
							ResourceSet resourceSet = new ResourceSetImpl();

							// Get the URI of the model file.
							//
							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

							// Create a resource for this file.
							//
							Resource resource = resourceSet.createResource(fileURI);

							// Add the initial model object to the contents.
							//
							EObject rootObject = createInitialModel();
							//((OPmodelHolder)rootObject).getMetaDefinition().getContainmentValidationRules().get(0)
							//((EObjectResolvingEList<OPmodelContainmentValidationRule>)((OPmodelHolder)rootObject).getMetaDefinition().getContainmentValidationRules()).eResource()
							if (rootObject != null) {
								resource.getContents().add(rootObject);
							}
							
							// Save the contents of the resource to the file system.
							//
							Map<Object, Object> options = new HashMap<Object, Object>();
							options.put(XMLResource.OPTION_ENCODING, opmetaEditorPlugin.INSTANCE.getString("_UI_XMLEncodingValue"));
							resource.save(options);
						}
						catch (Exception exception) {
							OPModelEditorPlugin.INSTANCE.log(exception);
						}
						finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
					(new Runnable() {
						 public void run() {
							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
						 }
					 });
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor
					(new FileEditorInput(modelFile),
					 workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());					 	 
			}
			catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), OPModelEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}

			return true;
		}
		catch (Exception exception) {
			OPModelEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class opmodelModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public opmodelModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";
					setErrorMessage(OPModelEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}

	/**
	 * This is the page where the opmeta file is selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class opmodelModelWizradOpmetaSelectionPage extends WizardPage{

		private Text filePathField;
		private Button browseFilesButton;
		private Label errorLabel ;
		
		protected opmodelModelWizradOpmetaSelectionPage(String pageName, String initialBrowseDirectory) {
			super(pageName);
			this.initialBrowseDirectory = initialBrowseDirectory;
		}

		private final String initialBrowseDirectory;
		
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo initialObjectField;
		
		private void createFileSelectionPanel(Composite workArea){
			// project specification group
			Composite fileGroup = new Composite(workArea, SWT.NONE);
			GridLayout layout = new GridLayout();
			layout.numColumns = 3;
			layout.makeColumnsEqualWidth = false;
			layout.marginWidth = 0;
			fileGroup.setLayout(layout);
			fileGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING));

			// title
			Label containerLabel = new Label(fileGroup, SWT.LEFT);
			{
				containerLabel.setText(OPModelEditorPlugin.INSTANCE.getString("_UI_SelectFile"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.BEGINNING;
				containerLabel.setLayoutData(data);
			}

			// project location entry field
			this.filePathField = new Text(fileGroup, SWT.BORDER);

			GridData directoryPathData = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
			directoryPathData.widthHint = new PixelConverter(filePathField).convertWidthInCharsToPixels(25);
			filePathField.setLayoutData(directoryPathData);
			
			// browse button
			browseFilesButton = new Button(fileGroup, SWT.PUSH);
			browseFilesButton.setText(OPModelEditorPlugin.INSTANCE.getString("_UI_Browse"));
			setButtonLayoutData(browseFilesButton);

			browseFilesButton.addSelectionListener(new SelectionAdapter() {
				/*
				 * @see org.eclipse.swt.events.SelectionAdapter#widgetS
				 * elected(org.eclipse.swt.events.SelectionEvent)
				 */
				public void widgetSelected(SelectionEvent e) {
					handleFileLocationButtonPressed();
				}

			});

			filePathField.addTraverseListener(new TraverseListener() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.swt.events.TraverseListener#keyTraversed(org.eclipse
				 * .swt.events.TraverseEvent)
				 */
				public void keyTraversed(TraverseEvent e) {
					if (e.detail == SWT.TRAVERSE_RETURN) {
						e.doit = false;
						updateOPmodelHolder(filePathField.getText().trim());
					}
				}

			});

			filePathField.addFocusListener(new FocusAdapter() {

				/*
				 * (non-Javadoc)
				 * 
				 * @see
				 * org.eclipse.swt.events.FocusListener#focusLost(org.eclipse.swt
				 * .events.FocusEvent)
				 */
				public void focusLost(org.eclipse.swt.events.FocusEvent e) {
					updateOPmodelHolder(filePathField.getText().trim());
				}
			});
		}
		
		private void handleFileLocationButtonPressed(){
			 FileDialog dialog = new FileDialog(filePathField.getShell(), SWT.OPEN);
			   dialog.setFilterExtensions(new String [] {"*.opmeta"});
			   
			   // get path to start from
			   dialog.setFilterPath(System.getProperty("user.home"));
			   String dirName = filePathField.getText().trim();
				if (dirName.length() == 0) {
					dirName = previouslyBrowsedDirectory;
				}
				if (dirName.length() == 0) {
					dirName = initialBrowseDirectory;
				}
				if (dirName.length() != 0) {
					File path = new File(dirName);
					if (path.exists()) {
						dialog.setFilterPath(new Path(dirName).toOSString());
					}
				}

				String selectedFile = dialog.open();
				if (selectedFile != null) {
					File path = new File(selectedFile);
					String selectedDir = path.getParent();
					if (selectedDir != null)
						previouslyBrowsedDirectory = selectedDir;
					filePathField.setText(selectedFile);
					updateOPmodelHolder(selectedFile);
				}
		}
		
		/**
		 * Create a new OPmodelHolder.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void updateOPmodelHolder(String opmetaFilePath){
			setPageComplete(false);
			setMyErrorMessage(null);
			currHolder = null;
			initialObjectField.removeAll();
			if (opmetaFilePath.trim().length() == 0){
				return;
			}
			OPMetaModelDiagram metaModelDiag = OPMMLoader.loadOPMetaAbsoluteFile(opmetaFilePath);
			if (metaModelDiag == null){
				setMyErrorMessage(OPModelEditorPlugin.INSTANCE.getString("_UI_FileFailedToLoad",new Object [] {opmetaFilePath}));
				return;
			}
			try{
			currHolder = OpmetaInterpreter.CreateOPmodelHolder(metaModelDiag);
			}catch (RuntimeException ex) {
				setMyErrorMessage(OPModelEditorPlugin.INSTANCE.getString("_UI_FileFailedToTranslate",new Object [] {opmetaFilePath, ex.getMessage()}));
				return;
			}
			if (currHolder != null) fillInitialObjectField();
		}
		
		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE); {
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			createFileSelectionPanel(composite);
			
			Composite contianerSelectionPanel = new Composite(composite, SWT.NONE); {
				GridLayout layout = new GridLayout();
				layout.verticalSpacing = 12;
				layout.makeColumnsEqualWidth = true;
				contianerSelectionPanel.setLayout(layout);
				contianerSelectionPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING));
			}

			fillContainerSelectionPanel(contianerSelectionPanel);
			
			errorLabel= new Label(composite, SWT.BORDER);
			{
				
				errorLabel.setLayoutData(new GridData(SWT.FILL,SWT.FILL, true, true));
			}
			
			setPageComplete(false);
			setControl(composite);
		}

		public boolean isActivePage() {return isCurrentPage();}
		
		private void fillContainerSelectionPanel(Composite composite){
			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(OPModelEditorPlugin.INSTANCE.getString("_UI_ContainerObject"));
				
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.LEFT);
			{
				GridData data = new GridData(SWT.FILL,SWT.BEGINNING,true,false);
				initialObjectField.setLayoutData(data);
				initialObjectField.setEnabled(false);
			}

		}
		
		private void fillInitialObjectField(){
			List<TypeDescriptor> allContainers =  currHolder.getMetaDefinition().getContainers();
			List<TypeDescriptor> nodes =  currHolder.getMetaDefinition().getNodes();
			
			for (TypeDescriptor curr:allContainers){
				if (!curr.isAbstract() && !nodes.contains(curr))
					initialObjectField.add(curr.getName());
			}
			
			if (initialObjectField.getItemCount() ==0){
				setMyErrorMessage(OPModelEditorPlugin.INSTANCE.getString("_UI_FileHasNoContainers"));
			}
			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			initialObjectField.addModifyListener(validator);
			initialObjectField.setEnabled(true);
			setPageComplete(validatePage());
		}
		
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected ModifyListener validator =
			new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					setPageComplete(validatePage());
				}
			};
			
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		protected boolean validatePage() {
			return getInitialObjectType() != null;
		}
		
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public TypeDescriptor getInitialObjectType() {
			if (currHolder == null) return null;
			if (currHolder.getMetaDefinition() == null) return null;
			String label = initialObjectField.getText();
			List<TypeDescriptor> allContainers =  currHolder.getMetaDefinition().getContainers();
			
			for (TypeDescriptor curr:allContainers){
				if (curr.getName().equals(label))
					return curr;
			}
			
			return null;
		}
	
		private void setMyErrorMessage(String message){
			if (message == null) errorLabel.setText("");
			else errorLabel.setText(message);
		}
	}
	
	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
		@Override
	public void addPages() {
			IPath contianerDir = null;
			IPath contianerLocation = null;
			String modelFilename= "";
						
			// Try and get the resource selection to determine a current directory for the file dialog.
			//
			if (selection != null && !selection.isEmpty()) {
				// Get the resource...
				//
				Object selectedElement = selection.iterator().next();
				if (selectedElement instanceof IResource) {
					// Get the resource parent, if its a file.
					//
					IResource selectedResource = (IResource)selectedElement;
					if (selectedResource.getType() == IResource.FILE) {
						selectedResource = selectedResource.getParent();
					}

					// This gives us a directory...
					//
					if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
						// Set this for the container.
						//
						contianerDir = selectedResource.getFullPath();
						contianerLocation = selectedResource.getLocation();

						// Make up a unique new name here.
						//
						String defaultModelBaseFilename = OPModelEditorPlugin.INSTANCE.getString("_UI_opmodelEditorFilenameDefaultBase");
						String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
						modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
						for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
							modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
						}
						
						
					}
				}
			}
			
		String initialBrowseDirectory ="";
		if (contianerLocation!=null){
			File f = contianerLocation.toFile();
			if (f.isFile()) initialBrowseDirectory = f.getParentFile().getAbsolutePath();
			else initialBrowseDirectory  = f.getAbsolutePath();
		}
				
		selectOpmetaFilePage = new opmodelModelWizradOpmetaSelectionPage("selector", initialBrowseDirectory);
		selectOpmetaFilePage .setTitle(OPModelEditorPlugin.INSTANCE.getString("_UI_opmodelModelWizard_label"));
		selectOpmetaFilePage.setDescription(OPModelEditorPlugin.INSTANCE.getString("_UI_Wizard_meta_selection_description"));
		addPage(selectOpmetaFilePage);
		
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new opmodelModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(OPModelEditorPlugin.INSTANCE.getString("_UI_opmodelModelWizard_label"));
		newFileCreationPage.setDescription(OPModelEditorPlugin.INSTANCE.getString("_UI_opmodelModelWizard_description"));
		newFileCreationPage.setFileName(OPModelEditorPlugin.INSTANCE.getString("_UI_opmodelEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
		if (contianerDir != null) newFileCreationPage.setContainerFullPath(contianerDir);
		if (modelFilename.length() >0) newFileCreationPage.setFileName(modelFilename);
		addPage(newFileCreationPage);

	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}
