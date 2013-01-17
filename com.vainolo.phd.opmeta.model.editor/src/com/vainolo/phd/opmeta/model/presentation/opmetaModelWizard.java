/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.vainolo.phd.opmeta.model.presentation;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

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

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

//import com.vainolo.phd.opm.model.OPMAggregationLink;
import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMGeneralizationLink;
import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
//import com.vainolo.phd.opm.model.OPMState;
//import com.vainolo.phd.opm.model.VerticalAlignment;
import com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule;
import com.vainolo.phd.opmeta.model.OPMetaModelDiagram;
import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;
import com.vainolo.phd.opmeta.model.opmetaFactory;
import com.vainolo.phd.opmeta.model.opmetaPackage;


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
 * @generated NOT
 */
public class opmetaModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(opmetaEditorPlugin.INSTANCE.getString("_UI_opmetaEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS =
		opmetaEditorPlugin.INSTANCE.getString("_UI_opmetaEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected opmetaPackage _opmetaPackage = opmetaPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected opmetaFactory _opmetaFactory = _opmetaPackage.getopmetaFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected opmetaModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */


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
		setWindowTitle(opmetaEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(opmetaEditorPlugin.INSTANCE.getImage("full/wizban/Newopmeta")));
	}

	/**
	 * Create a new model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EObject createInitialModel() {
		OPMetaModelDiagram rootObject = _opmetaFactory.createOPMetaModelDiagram();
		rootObject.setElementsDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		rootObject.setLinksDiagram(OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
		if (newFileCreationPage.getUsePredefinedMetaModel())
			fillOpm(rootObject);	
		else
			fillBasic(rootObject);	
		return rootObject;
	}

	private void fillBasic(OPMetaModelDiagram rootObject){
		OPMObjectProcessDiagram elementsDiagram = rootObject.getElementsDiagram();
		long id = 0;
		OPMObject nodeObj = OPMFactory.eINSTANCE.createOPMObject();
		nodeObj.setName("Node");
		nodeObj.setId(++id);
		nodeObj.setConstraints(new Rectangle(561,37,123,49));
		elementsDiagram.getNodes().add(nodeObj);
		OPMObject containerObj = OPMFactory.eINSTANCE.createOPMObject();
		containerObj.setName("Container");
		containerObj.setId(++id);
		containerObj.setConstraints(new Rectangle(302,37,123,49));
		elementsDiagram.getNodes().add(containerObj);
		
		OPMObject linkObj = OPMFactory.eINSTANCE.createOPMObject();
		linkObj.setName("Link");
		linkObj.setId(++id);
		linkObj.setConstraints(new Rectangle(368,38,159,57));
		rootObject.getLinksDiagram().getNodes().add(linkObj);
		
		OPMetaModelContaimentValidationRule rule = opmetaFactory.eINSTANCE.createOPMetaModelContaimentValidationRule();
		rule.setContainerTypeName("Container");
		rule.setNodeTypeName("Node");
		rule.setValid(true);
		rootObject.getContaimentValidations().add(rule);
		
		OPMetaModelLinkValidationRule ruleLink = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		ruleLink.setLinkTypeName("Link");
		ruleLink.setSourceTypeName("Node");
		ruleLink.setTargetTypeName("Node");
		ruleLink.setValid(true);
		rootObject.getLinkValidations().add(ruleLink);
		
		rootObject.getElementsDiagram().setNextId(++id);
		rootObject.getLinksDiagram().setNextId(id);
	}
	
	private void fillOpm(OPMetaModelDiagram rootObject){
		long lastId = fillOpmElements(rootObject.getElementsDiagram());
		lastId = fillOpmLinks(rootObject.getLinksDiagram(),lastId);
		fillOpmContaimentRules(rootObject.getContaimentValidations());
		fillOpmLinkRules(rootObject.getLinkValidations());
		rootObject.getElementsDiagram().setNextId(++lastId);
		rootObject.getLinksDiagram().setNextId(lastId);
	}
	
	private long fillOpmLinks(OPMObjectProcessDiagram linksDiagram, long startId) {
		long id = startId;
		// main links
		OPMObject linkObj = OPMFactory.eINSTANCE.createOPMObject();
		linkObj.setName("Link");
		linkObj.setId(++id);
		linkObj.setConstraints(new Rectangle(368,38,159,57));
		linksDiagram.getNodes().add(linkObj);
		OPMObject procObj = OPMFactory.eINSTANCE.createOPMObject();
		procObj.setName("Procedural Link");
		procObj.setId(++id);
		procObj.setConstraints(new Rectangle(279,128,122,49));
		linksDiagram.getNodes().add(procObj);
		OPMObject structuralObj = OPMFactory.eINSTANCE.createOPMObject();
		structuralObj.setName("Structural Link");
		structuralObj.setId(++id);
		structuralObj.setConstraints(new Rectangle(541,129,129,46));
		linksDiagram.getNodes().add(structuralObj);
		OPMGeneralizationLink generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(linkObj);
		generalizationLink.setTarget(procObj);
		generalizationLink.setAggregatorPosition(new Point(438,106));
		linksDiagram.getLinks().add(generalizationLink);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(linkObj);
		generalizationLink.setTarget(structuralObj);
		generalizationLink.setAggregatorPosition(new Point(438,106));
		linksDiagram.getLinks().add(generalizationLink);
		
		// Structural links
		OPMObject generalizeObj = OPMFactory.eINSTANCE.createOPMObject();
		generalizeObj.setName("Generalize Link");
		generalizeObj.setId(++id);
		generalizeObj.setConstraints(new Rectangle(709,194,120,50));
		linksDiagram.getNodes().add(generalizeObj);
		OPMObject exhibitionObj = OPMFactory.eINSTANCE.createOPMObject();
		exhibitionObj.setName("Exhibition Link");
		exhibitionObj.setId(++id);
		exhibitionObj.setConstraints(new Rectangle(709,267,120,50));
		linksDiagram.getNodes().add(exhibitionObj);
		OPMObject aggregationObj = OPMFactory.eINSTANCE.createOPMObject();
		aggregationObj.setName("Aggregation Link");
		aggregationObj.setId(++id);
		aggregationObj.setConstraints(new Rectangle(709,339,120,50));
		linksDiagram.getNodes().add(aggregationObj);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(structuralObj);
		generalizationLink.setTarget(generalizeObj);
		generalizationLink.setAggregatorPosition(new Point(678,178));
		linksDiagram.getLinks().add(generalizationLink);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(structuralObj);
		generalizationLink.setTarget(exhibitionObj);
		generalizationLink.getBendpoints().add(new Point(684,292));
		generalizationLink.setAggregatorPosition(new Point(678,178));
		linksDiagram.getLinks().add(generalizationLink);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(structuralObj);
		generalizationLink.setTarget(aggregationObj);
		generalizationLink.getBendpoints().add(new Point(684,367));
		generalizationLink.setAggregatorPosition(new Point(678,178));
		linksDiagram.getLinks().add(generalizationLink);
		
		// Procedural links
		OPMObject proceduralObj = OPMFactory.eINSTANCE.createOPMObject();
		proceduralObj.setName("Result Link");
		proceduralObj.setId(++id);
		proceduralObj.setConstraints(new Rectangle(190,203,116,40));
		linksDiagram.getNodes().add(proceduralObj);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(procObj);
		generalizationLink.setTarget(proceduralObj);
		generalizationLink.setAggregatorPosition(new Point(326,180));
		linksDiagram.getLinks().add(generalizationLink);
		proceduralObj = OPMFactory.eINSTANCE.createOPMObject();
		proceduralObj.setName("Invocation Link");
		proceduralObj.setId(++id);
		proceduralObj.setConstraints(new Rectangle(190,251,116,40));
		linksDiagram.getNodes().add(proceduralObj);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(procObj);
		generalizationLink.setTarget(proceduralObj);
		generalizationLink.getBendpoints().add(new Point(332,284));
		generalizationLink.setAggregatorPosition(new Point(326,180));
		linksDiagram.getLinks().add(generalizationLink);
		proceduralObj = OPMFactory.eINSTANCE.createOPMObject();
		proceduralObj.setName("Effect Link");
		proceduralObj.setId(++id);
		proceduralObj.setConstraints(new Rectangle(190,303,116,40));
		linksDiagram.getNodes().add(proceduralObj);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(procObj);
		generalizationLink.setTarget(proceduralObj);
		generalizationLink.getBendpoints().add(new Point(332,329));
		generalizationLink.setAggregatorPosition(new Point(326,180));
		linksDiagram.getLinks().add(generalizationLink);
		proceduralObj = OPMFactory.eINSTANCE.createOPMObject();
		proceduralObj.setName("Agent Link");
		proceduralObj.setId(++id);
		proceduralObj.setConstraints(new Rectangle(190,354,116,40));
		linksDiagram.getNodes().add(proceduralObj);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(procObj);
		generalizationLink.setTarget(proceduralObj);
		generalizationLink.getBendpoints().add(new Point(332,379));
		generalizationLink.setAggregatorPosition(new Point(326,180));
		linksDiagram.getLinks().add(generalizationLink);
		proceduralObj = OPMFactory.eINSTANCE.createOPMObject();
		proceduralObj.setName("Consumption Link");
		proceduralObj.setId(++id);
		proceduralObj.setConstraints(new Rectangle(385,210,116,40));
		linksDiagram.getNodes().add(proceduralObj);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(procObj);
		generalizationLink.setTarget(proceduralObj);
		generalizationLink.setAggregatorPosition(new Point(326,180));
		linksDiagram.getLinks().add(generalizationLink);
		proceduralObj = OPMFactory.eINSTANCE.createOPMObject();
		proceduralObj.setName("Instrument Link");
		proceduralObj.setId(++id);
		proceduralObj.setConstraints(new Rectangle(385,270,116,40));
		linksDiagram.getNodes().add(proceduralObj);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(procObj);
		generalizationLink.setTarget(proceduralObj);
		generalizationLink.getBendpoints().add(new Point(332,295));
		generalizationLink.setAggregatorPosition(new Point(326,180));
		linksDiagram.getLinks().add(generalizationLink);
		
		//Activation Kind
		/* TODO : return this when ENUM is property is implemented
		OPMObject activationKind = OPMFactory.eINSTANCE.createOPMObject();
		activationKind.setName("Activation Kind");
		activationKind.setAlignment(VerticalAlignment.TOP);
		activationKind.setId(++id);
		activationKind.setConstraints(new Rectangle(23,181,113,148));
		linksDiagram.getNodes().add(activationKind);
		OPMState state = OPMFactory.eINSTANCE.createOPMState();
		state.setName("Normal");
		state.setId(++id);
		state.setConstraints(new Rectangle(14,20,80,34));
		activationKind.getNodes().add(state);
		state = OPMFactory.eINSTANCE.createOPMState();
		state.setName("Event");
		state.setId(++id);
		state.setConstraints(new Rectangle(14,66,80,34));
		activationKind.getNodes().add(state);
		state = OPMFactory.eINSTANCE.createOPMState();
		state.setName("Condition");
		state.setId(++id);
		state.setConstraints(new Rectangle(14,107,80,34));
		activationKind.getNodes().add(state);
		OPMAggregationLink aggLink = OPMFactory.eINSTANCE.createOPMAggregationLink(); 
		aggLink.setId(++id);
		aggLink.setSource(procObj);
		aggLink.setTarget(activationKind);
		aggLink.setAggregatorPosition(new Point(168,168));
		linksDiagram.getLinks().add(aggLink); */
		return id;
	}

	private long fillOpmElements(OPMObjectProcessDiagram elementsDiagram) {
		long id = 0;
		OPMObject nodeObj = OPMFactory.eINSTANCE.createOPMObject();
		nodeObj.setName("Node");
		nodeObj.setId(++id);
		nodeObj.setConstraints(new Rectangle(561,40,111,52));
		elementsDiagram.getNodes().add(nodeObj);
		OPMObject containerObj = OPMFactory.eINSTANCE.createOPMObject();
		containerObj.setName("Container");
		containerObj.setId(++id);
		containerObj.setConstraints(new Rectangle(302,37,123,49));
		elementsDiagram.getNodes().add(containerObj);
		OPMObject thingObj = OPMFactory.eINSTANCE.createOPMObject();
		thingObj.setName("Thing");
		thingObj.setId(++id);
		thingObj.setConstraints(new Rectangle(434,137,118,52));
		elementsDiagram.getNodes().add(thingObj);
		OPMObject stateObj = OPMFactory.eINSTANCE.createOPMObject();
		stateObj.setName("State");
		stateObj.setId(++id);
		stateObj.setConstraints(new Rectangle(663,137,104,50));
		elementsDiagram.getNodes().add(stateObj);
		OPMObject diagObj = OPMFactory.eINSTANCE.createOPMObject();
		diagObj.setName("Diagram");
		diagObj.setId(++id);
		diagObj.setConstraints(new Rectangle(231,138,114,56));
		elementsDiagram.getNodes().add(diagObj);
		OPMObject objectObj = OPMFactory.eINSTANCE.createOPMObject();
		objectObj.setName("Object");
		objectObj.setId(++id);
		objectObj.setConstraints(new Rectangle(613,290,137,45));
		elementsDiagram.getNodes().add(objectObj);
		OPMObject processObj = OPMFactory.eINSTANCE.createOPMObject();
		processObj.setName("Process");
		processObj.setId(++id);
		processObj.setConstraints(new Rectangle(288,283,119,49));
		elementsDiagram.getNodes().add(processObj);
		OPMGeneralizationLink generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(nodeObj);
		generalizationLink.setTarget(thingObj);
		generalizationLink.setAggregatorPosition(new Point(608,105));
		elementsDiagram.getLinks().add(generalizationLink);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(nodeObj);
		generalizationLink.setTarget(stateObj);
		generalizationLink.setAggregatorPosition(new Point(608,105));
		elementsDiagram.getLinks().add(generalizationLink);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(containerObj);
		generalizationLink.setTarget(thingObj);
		generalizationLink.setAggregatorPosition(new Point(363,99));
		elementsDiagram.getLinks().add(generalizationLink);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(containerObj);
		generalizationLink.setTarget(diagObj);
		generalizationLink.setAggregatorPosition(new Point(363,99));
		elementsDiagram.getLinks().add(generalizationLink);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(thingObj);
		generalizationLink.setTarget(objectObj);
		generalizationLink.setAggregatorPosition(new Point(491,220));
		elementsDiagram.getLinks().add(generalizationLink);
		generalizationLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		generalizationLink.setId(++id);
		generalizationLink.setSource(thingObj);
		generalizationLink.setTarget(processObj);
		generalizationLink.setAggregatorPosition(new Point(491,220));
		elementsDiagram.getLinks().add(generalizationLink);
		return id;
		
	}

	private void fillOpmContaimentRules(List<OPMetaModelContaimentValidationRule> contaimentRules){
		OPMetaModelContaimentValidationRule rule = opmetaFactory.eINSTANCE.createOPMetaModelContaimentValidationRule();
		rule.setContainerTypeName("Diagram");
		rule.setNodeTypeName("Node");
		rule.setValid(true);
		contaimentRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelContaimentValidationRule();
		rule.setContainerTypeName("Diagram");
		rule.setNodeTypeName("State");
		rule.setValid(false);
		contaimentRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelContaimentValidationRule();
		rule.setContainerTypeName("Thing");
		rule.setNodeTypeName("Thing");
		rule.setValid(true);
		contaimentRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelContaimentValidationRule();
		rule.setContainerTypeName("Object");
		rule.setNodeTypeName("State");
		rule.setValid(true);
		contaimentRules.add(rule);
	}
	
	private void fillOpmLinkRules(List<OPMetaModelLinkValidationRule> linkRules){
		// Structural link rules
		OPMetaModelLinkValidationRule rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Aggregation");
		rule.setSourceTypeName("Object");
		rule.setTargetTypeName("Object");
		rule.setValid(true);
		linkRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Aggregation");
		rule.setSourceTypeName("Process");
		rule.setTargetTypeName("Process");
		rule.setValid(true);
		linkRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Generalization");
		rule.setSourceTypeName("Object");
		rule.setTargetTypeName("Object");
		rule.setValid(true);
		linkRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Generalization");
		rule.setSourceTypeName("Process");
		rule.setTargetTypeName("Process");
		rule.setValid(true);
		linkRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Exhibition");
		rule.setSourceTypeName("Thing");
		rule.setTargetTypeName("Thing");
		rule.setValid(true);
		linkRules.add(rule);
		
		// Procedural link rules
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Agent");
		rule.setSourceTypeName("Object");
		rule.setTargetTypeName("Process");
		rule.setValid(true);
		linkRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Agent");
		rule.setSourceTypeName("State");
		rule.setTargetTypeName("Process");
		rule.setValid(true);
		linkRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Instrument");
		rule.setSourceTypeName("Object");
		rule.setTargetTypeName("Process");
		rule.setValid(true);
		linkRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Instrument");
		rule.setSourceTypeName("State");
		rule.setTargetTypeName("Process");
		rule.setValid(true);
		linkRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Consumption");
		rule.setSourceTypeName("Object");
		rule.setTargetTypeName("Process");
		rule.setValid(true);
		linkRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Consumption");
		rule.setSourceTypeName("State");
		rule.setTargetTypeName("Process");
		rule.setValid(true);
		linkRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Effect");
		rule.setSourceTypeName("Object");
		rule.setTargetTypeName("Process");
		rule.setValid(true);
		linkRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Effect");
		rule.setSourceTypeName("State");
		rule.setTargetTypeName("Process");
		rule.setValid(true);
		linkRules.add(rule);
		
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Result");
		rule.setSourceTypeName("Process");
		rule.setTargetTypeName("Object");
		rule.setValid(true);
		linkRules.add(rule);
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Result");
		rule.setSourceTypeName("Process");
		rule.setTargetTypeName("State");
		rule.setValid(true);
		linkRules.add(rule);
		
		rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		rule.setLinkTypeName("Invocation");
		rule.setSourceTypeName("Process");
		rule.setTargetTypeName("Process");
		rule.setValid(true);
		linkRules.add(rule);
	}
	
	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
							options.put(XMLResource.OPTION_ENCODING, opmetaEditorPlugin.INSTANCE.getString("_UI_XMLEncodingValue"));
							resource.save(options);
						}
						catch (Exception exception) {
							opmetaEditorPlugin.INSTANCE.log(exception);
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
				MessageDialog.openError(workbenchWindow.getShell(), opmetaEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}

			return true;
		}
		catch (Exception exception) {
			opmetaEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class opmetaModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		
		private Button metaModelCheckBox;
		
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public opmetaModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		protected void createAdvancedControls(Composite parent) {
			metaModelCheckBox = new Button(parent,SWT.CHECK);
			metaModelCheckBox.setText("Check to load a pre defined OPM meta model");
			metaModelCheckBox.setSelection(true);
			
			super.createAdvancedControls(parent);
		}
		
		public boolean getUsePredefinedMetaModel(){
			return metaModelCheckBox.getSelection();
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
					setErrorMessage(opmetaEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
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
	 * This is the page where the type of object to create is selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new opmetaModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(opmetaEditorPlugin.INSTANCE.getString("_UI_opmetaModelWizard_label"));
		newFileCreationPage.setDescription(opmetaEditorPlugin.INSTANCE.getString("_UI_opmetaModelWizard_description"));
		newFileCreationPage.setFileName(opmetaEditorPlugin.INSTANCE.getString("_UI_opmetaEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
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
					String defaultModelBaseFilename = opmetaEditorPlugin.INSTANCE.getString("_UI_opmetaEditorFilenameDefaultBase");
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
