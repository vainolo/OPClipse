package com.vainolo.phd.opm.validation.impl;

import org.eclipse.emf.ecore.EClass;

import com.vainolo.phd.opm.model.*;
import com.vainolo.phd.opm.validation.ContainmentValidator;
import com.vainolo.phd.opm.validation.LinkValidator;
import com.vainolo.phd.opm.validation.OpmValidator;

public class OpmValidatorImpl implements OpmValidator {

	private LinkValidator linkValidator ; 
	private ContainmentValidator containmentValidator; 
	private static OpmValidatorImpl instance;
	
	
	private OpmValidatorImpl(){
		linkValidator = new LinkValidator();
		containmentValidator = new ContainmentValidator();
	}
	
	public static OpmValidatorImpl init(){
		if (instance == null){
			OpmValidatorImpl validator = new OpmValidatorImpl();
			validator.initContainmentRules();
			validator.initLinkRules();
			instance = validator;
		}
		return instance;
	}
	
	private void initContainmentRules(){
		ElementTypeEClassImpl opmDiagram = new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMObjectProcessDiagram());
		ElementTypeEClassImpl opmObject = new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMObject());
		ElementTypeEClassImpl opmProcess = new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMProcess());
		ElementTypeEClassImpl opmState = new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMState());
		ElementTypeEClassImpl opmLabel = new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getLabel());
		
		// Diagram containment: any node
		containmentValidator.addRule(opmDiagram, opmObject, true);
		containmentValidator.addRule(opmDiagram, opmProcess, true);
		containmentValidator.addRule(opmDiagram, opmLabel, true);
		
		// Object containment: object, state, process 
		containmentValidator.addRule(opmObject, opmObject, true);
		containmentValidator.addRule(opmObject, opmState, true);
		containmentValidator.addRule(opmObject, opmProcess, true);
		
		// opmProcess containment:
		containmentValidator.addRule(opmProcess, opmProcess, true);
		containmentValidator.addRule(opmProcess, opmObject, true);
		
		try{
			containmentValidator.finalizeInit();
		}catch (Exception ex){
			throw new RuntimeException("failed to init opm containment rules",ex);
		}
		
	}
	
	private void initLinkRules(){
		ElementTypeEClassImpl opmObject = new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMObject());
		ElementTypeEClassImpl opmProcess = new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMProcess());
		ElementTypeEClassImpl opmState = new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMState());
		ElementTypeEClassImpl temp;
		
		//Structural link -Aggregation: Object->Object
		linkValidator.addRule(opmObject, new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMAggregationLink()), opmObject, true);
		linkValidator.addRule(opmProcess, new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMAggregationLink()), opmProcess, true);
		
		//Structural link -Exhibition: Thing->Thing, All Options
		temp = new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMExhibitionLink());
		linkValidator.addRule(opmObject,temp , opmObject, true);
		linkValidator.addRule(opmObject, temp, opmProcess, true);
		linkValidator.addRule(opmProcess, temp, opmObject, true);
		linkValidator.addRule(opmProcess, temp, opmProcess, true);

		//Structural link -Generalisation: Object->Object
		temp = new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMGeneralizationLink());
		linkValidator.addRule(opmObject,temp , opmObject, true);
		//Structural link -Generalisation: Process -> Process
		linkValidator.addRule(opmProcess, temp, opmProcess, true);
		
		//Proc Link -  Agent, Instrument, Consumption, Effect: Object->Process
		linkValidator.addRule(opmObject, new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMAgentLink()), opmProcess, true);
		linkValidator.addRule(opmObject, new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMInstrumentLink()), opmProcess, true);
		linkValidator.addRule(opmObject, new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMConsumptionLink()), opmProcess, true);
		linkValidator.addRule(opmObject, new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMEffectLink()), opmProcess, true);
		//Proc Link -  Agent, Instrument, Consumption, Effect: State->Process
		linkValidator.addRule(opmState, new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMAgentLink()), opmProcess, true);
		linkValidator.addRule(opmState, new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMInstrumentLink()), opmProcess, true);
		linkValidator.addRule(opmState, new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMConsumptionLink()), opmProcess, true);
		linkValidator.addRule(opmState, new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMEffectLink()), opmProcess, true);
		
		//Proc Link -  Result:Process->Object, Process->State
		temp = new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMResultLink());
		linkValidator.addRule(opmProcess, temp,opmState , true);
		linkValidator.addRule(opmProcess, temp,opmObject , true);
		
		//Proc Link - Invocation: Process->Process
		linkValidator.addRule(opmProcess, new ElementTypeEClassImpl(OPMPackage.eINSTANCE.getOPMInvocationLink()),opmProcess , true);
		
		try{
			linkValidator.finalizeInit();
		}catch (Exception ex){
			throw new RuntimeException("failed to init opm link rules",ex);
		}
	}

	@Override
	public boolean validateLink(EClass fromType, EClass linkType) {
		return linkValidator.valdidate(new ElementTypeEClassImpl(fromType), new ElementTypeEClassImpl(linkType));
	}

	@Override
	public boolean validateLink(OPMNode fromType, EClass linkType) {
		return linkValidator.valdidate(new ElementTypeEClassImpl(fromType.eClass()), new ElementTypeEClassImpl(linkType));
	}
	
	@Override
	public boolean validateLink(EClass fromType, EClass linkType, EClass toType) {
		return linkValidator.valdidate(new ElementTypeEClassImpl(fromType), new ElementTypeEClassImpl(linkType), 
				new ElementTypeEClassImpl(toType));
	}
	
	@Override
	public boolean validateLink(OPMNode from, EClass linkType, OPMNode to) {
		return linkValidator.valdidate(new ElementTypeEClassImpl(from.eClass()), new ElementTypeEClassImpl(linkType), 
				new ElementTypeEClassImpl(to.eClass()));
	}

	@Override
	public boolean validateContainment(EClass container, EClass node) {
		if (!OPMPackage.eINSTANCE.getOPMContainer().isSuperTypeOf(container) || 
				!OPMPackage.eINSTANCE.getOPMNode().isSuperTypeOf(node)) return false;
		
		return containmentValidator.valdidate(new ElementTypeEClassImpl(container), new ElementTypeEClassImpl(node));
	}

	@Override
	public boolean validateContainment(OPMContainer container, EClass node) {
		if (!OPMPackage.eINSTANCE.getOPMNode().isSuperTypeOf(node)) return false;
		
		return containmentValidator.valdidate(new ElementTypeEClassImpl(container.eClass()), new ElementTypeEClassImpl(node));
	}
}
