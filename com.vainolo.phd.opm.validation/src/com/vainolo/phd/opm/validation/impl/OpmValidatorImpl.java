package com.vainolo.phd.opm.validation.impl;

import org.eclipse.emf.ecore.EClass;

import com.vainolo.phd.opm.model.OPMPackage;
import com.vainolo.phd.opm.validation.OpmValidator;

public class OpmValidatorImpl implements OpmValidator {

	private OpmValidatorImpl(){
		// TODO : create inner Validators / Containers
	}
	
	public static OpmValidatorImpl init(){
		OpmValidatorImpl validator = new OpmValidatorImpl();
		initContaimentRules(validator);
		initLinkRules(validator);
		
		return validator;
	}
	
	private static void initContaimentRules(OpmValidatorImpl validator ){
		EClass opmDiagram = OPMPackage.eINSTANCE.getOPMObjectProcessDiagram();
		EClass opmObject = OPMPackage.eINSTANCE.getOPMObject();
		EClass opmProcess = OPMPackage.eINSTANCE.getOPMProcess();
		EClass opmState = OPMPackage.eINSTANCE.getOPMState();
		
		// Diagram containment: any node
		// create rule OPMPackage.eINSTANCE.getOPMObjectProcessDiagram(), OPMPackage.eINSTANCE.getOPMNode()
		
		// Object containment: object, state // TODO : check if also process
		// create rule opmObject,opmObject
		// create rule opmObject,opmState
		
		// opmProcess containment:
		// create rule opmProcess,opmObject
		// create rule opmProcess,opmProcess
		
	}
	
	private static void initLinkRules(OpmValidatorImpl validator ){
		EClass opmObject = OPMPackage.eINSTANCE.getOPMObject();
		EClass opmProcess = OPMPackage.eINSTANCE.getOPMProcess();
		EClass opmState = OPMPackage.eINSTANCE.getOPMState();
		
		// nneds an all invalid rule?
		
		//Structural link -Aggregation: Object->Object
		// create rule  opmObject, OPMPackage.eINSTANCE.getOPMAggregationLink(), opmObject
		
		//Structural link -Exhibition: Thing->Thing, All Options
		// create rule  opmObject, OPMPackage.eINSTANCE.getOPMExhibitionLink(), opmObject
		// create rule  opmObject, OPMPackage.eINSTANCE.getOPMExhibitionLink(), opmProcess
		// create rule  opmProcess, OPMPackage.eINSTANCE.getOPMExhibitionLink(), opmObject
		// create rule  opmProcess, OPMPackage.eINSTANCE.getOPMExhibitionLink(), opmProcess

		//Structural link -Generalization: Object->Object
		// create rule  opmObject, OPMPackage.eINSTANCE.getOPMGeneralizationLink(), opmObject
		//Structural link -Generalization: Procces -> Procces
		// create rule  opmProcess, OPMPackage.eINSTANCE.getOPMGeneralizationLink(), opmProcess
		
		//Proc Link -  Agent, Instrument, Consumption, Effect: Object->Process
		// create rule  opmObject, OPMPackage.eINSTANCE.getOPMAgentLink(), opmProcess
		// create rule  opmObject, OPMPackage.eINSTANCE.getOPMInstrumentLink(), opmProcess
		// create rule  opmObject, OPMPackage.eINSTANCE.getOPMConsumptionLink(), opmProcess
		// create rule  opmObject, OPMPackage.eINSTANCE.getOPMEffectLink(), opmProcess
		//Proc Link -  Agent, Instrument, Consumption, Effect: State->Process
		// create rule  opmState, OPMPackage.eINSTANCE.getOPMAgentLink(), opmProcess
		// create rule  opmState, OPMPackage.eINSTANCE.getOPMInstrumentLink(), opmProcess
		// create rule  opmState, OPMPackage.eINSTANCE.getOPMConsumptionLink(), opmProcess
		// create rule  opmState, OPMPackage.eINSTANCE.getOPMEffectLink(), opmProcess
		
		//Proc Link -  Result:Process->Object, Process->State
		// create rule  opmProcess, OPMPackage.eINSTANCE.getOPMResultLink(), opmState
		// create rule  opmProcess, OPMPackage.eINSTANCE.getOPMResultLink(), opmObject
		
		//Proc Link - Invocation: Process->Process 
		// create rule  opmProcess, OPMPackage.eINSTANCE.getOPMInvocationLink(), opmProcess
		
	}

	@Override
	public boolean validateLink(Class<?> fromType, Class<?> linkType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateLink(Class<?> fromType, Class<?> toType,
			Class<?> linkType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateContaiment(Class<?> container, Class<?> node) {
		// TODO Auto-generated method stub
		return false;
	}

}
