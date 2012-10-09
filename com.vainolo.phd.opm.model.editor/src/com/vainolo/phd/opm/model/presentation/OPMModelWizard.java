/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opm.model.presentation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.CommonPlugin;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xmi.XMLResource;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.model.provider.OPMEditPlugin;


import org.eclipse.core.runtime.Path;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
 

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OPMModelWizard extends Wizard implements INewWizard {
	/**
   * The supported extensions for created files.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(OPMEditorPlugin.INSTANCE.getString("_UI_OPMEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
   * A formatted list of supported file extensions, suitable for display.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final String FORMATTED_FILE_EXTENSIONS =
		OPMEditorPlugin.INSTANCE.getString("_UI_OPMEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
   * This caches an instance of the model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected OPMPackage opmPackage = OPMPackage.eINSTANCE;

	/**
   * This caches an instance of the model factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected OPMFactory opmFactory = opmPackage.getOPMFactory();

	/**
   * This is the file creation page.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected OPMModelWizardNewFileCreationPage newFileCreationPage;

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

	/**
   * Caches the names of the types that can be created as the root object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected List<String> initialObjectNames;

	/**
   * This just records the information.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
    this.workbench = workbench;
    this.selection = selection;
    setWindowTitle(OPMEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
    setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(OPMEditorPlugin.INSTANCE.getImage("full/wizban/NewOPM")));
  }

	/**
   * Returns the names of the types that can be created as the root object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected Collection<String> getInitialObjectNames() {
    if (initialObjectNames == null) {
      initialObjectNames = new ArrayList<String>();
      for (EClassifier eClassifier : opmPackage.getEClassifiers()) {
        if (eClassifier instanceof EClass) {
          EClass eClass = (EClass)eClassifier;
          if (!eClass.isAbstract()) {
            initialObjectNames.add(eClass.getName());
          }
        }
      }
      Collections.sort(initialObjectNames, CommonPlugin.INSTANCE.getComparator());
    }
    return initialObjectNames;
  }

	/**
   * Create a new model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated NOT
   */
	protected EObject createInitialModel() {
    EClass eClass = (EClass)opmPackage.getEClassifier(OPMEditorPlugin.INSTANCE.getString("_UI_ModelEclassName"));
    EObject rootObject = opmFactory.create(eClass);
    return rootObject;
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
              if (rootObject != null) {
                resource.getContents().add(rootObject);
              }

              // Save the contents of the resource to the file system.
              //
              Map<Object, Object> options = new HashMap<Object, Object>();
              options.put(XMLResource.OPTION_ENCODING, OPMEditorPlugin.INSTANCE.getString("_UI_XMLEncodingValue"));
              resource.save(options);
            }
            catch (Exception exception) {
              OPMEditorPlugin.INSTANCE.log(exception);
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
        MessageDialog.openError(workbenchWindow.getShell(), OPMEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
        return false;
      }

      return true;
    }
    catch (Exception exception) {
      OPMEditorPlugin.INSTANCE.log(exception);
      return false;
    }
  }

	/**
   * This is the one page of the wizard.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public class OPMModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
     * Pass in the selection.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		public OPMModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
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
          setErrorMessage(OPMEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
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
   * The framework calls this to create the contents of the wizard.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
		@Override
	public void addPages() {
    // Create a page, set the title, and the initial model file name.
    //
    newFileCreationPage = new OPMModelWizardNewFileCreationPage("Whatever", selection);
    newFileCreationPage.setTitle(OPMEditorPlugin.INSTANCE.getString("_UI_OPMModelWizard_label"));
    newFileCreationPage.setDescription(OPMEditorPlugin.INSTANCE.getString("_UI_OPMModelWizard_description"));
    newFileCreationPage.setFileName(OPMEditorPlugin.INSTANCE.getString("_UI_OPMEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
    addPage(newFileCreationPage);

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
          newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

          // Make up a unique new name here.
          //
          String defaultModelBaseFilename = OPMEditorPlugin.INSTANCE.getString("_UI_OPMEditorFilenameDefaultBase");
          String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
          String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
          for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
            modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
          }
          newFileCreationPage.setFileName(modelFilename);
        }
      }
    }
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
