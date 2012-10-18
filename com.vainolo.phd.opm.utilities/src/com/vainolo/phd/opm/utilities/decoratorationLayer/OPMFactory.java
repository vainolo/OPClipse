package com.vainolo.phd.opm.utilities.decoratorationLayer;

import com.vainolo.phd.opm.model.OPMConsumptionLink;
import com.vainolo.phd.opm.model.OPMInstrumentLink;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMProceduralActivationKind;
import com.vainolo.phd.opm.model.OPMProceduralLink;
import com.vainolo.phd.opm.model.OPMProcess;
import com.vainolo.phd.opm.model.OPMState;

public class OPMFactory {
	private OPMFactory(){}
	
	private static OPMFactory instance;
	
	public static OPMFactory Instance(){
		if (instance == null) instance=new OPMFactory();
		return instance;
	}
	
	public OPMProceduralLink createOPMAgentLink(){
		OPMProceduralLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMAgentLink();
		return new OPMProceduralLinkDecorator(link);
	}
	
	public OPMProceduralLink createOPMConsumptionConditionLink(){
		OPMConsumptionLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMConsumptionLink();
		link.setActivationKind(OPMProceduralActivationKind.CONDITION);
		return new OPMProceduralLinkDecorator(link);
	}
	
	public OPMProceduralLink createOPMConsumptionEventLink(){
		OPMConsumptionLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMConsumptionLink();
		link.setActivationKind(OPMProceduralActivationKind.EVENT);
		return new OPMProceduralLinkDecorator(link);
	}
	public OPMProceduralLink createOPMConsumptionLink(){
		OPMConsumptionLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMConsumptionLink();
		return new OPMProceduralLinkDecorator(link);
	}
	
	public OPMProceduralLink createOPMEffectLink(){
		OPMProceduralLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMEffectLink();
		return new OPMProceduralLinkDecorator(link);
	}
	public OPMProceduralLink createOPMInstrumentLink(){
		OPMInstrumentLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMInstrumentLink();
		return new OPMProceduralLinkDecorator(link);
	}
	
	public OPMProceduralLink createOPMInstrumentConditionLink(){
		OPMInstrumentLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMInstrumentLink();
		link.setActivationKind(OPMProceduralActivationKind.CONDITION);
		return new OPMProceduralLinkDecorator(link);
	}
	public OPMProceduralLink createOPMInstrumentEventLink(){
		OPMInstrumentLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMInstrumentLink();
		link.setActivationKind(OPMProceduralActivationKind.EVENT);
		return new OPMProceduralLinkDecorator(link);
	}
	
	public OPMProceduralLink createOPMInvocationLink(){
		OPMProceduralLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMInvocationLink();
		return new OPMProceduralLinkDecorator(link);
	}
	
	public OPMLink createOPMSimpleLink(){
		return new OPMSimpleLink();
	}
	public OPMProceduralLink createOPMResultLink(){
		OPMProceduralLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMResultLink();
		return new OPMProceduralLinkDecorator(link);
	}
	
	public OPMObject createOPMObject() {
		return new OPMObjectDecorator(com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMObject());
	}
	
	public OPMProcess createOPMProcess() {
		return new OPMProcessDecorator(com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMProcess());
	}
	
	public OPMObjectProcessDiagram createOPMObjectProcessDiagram() {
		return new OPMObjectProcessDiagramDecorator(com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMObjectProcessDiagram());
	}
	
	public OPMState createOPMState() {
		return new OPMStateDecorator(com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMState());
	}
	
	public OPMStructuralLinkAggregator createOPMStructuralLinkAggregator() {
		return new OPMStructuralLinkAggregatorImpl();
	}
	
//	public OPMProceduralLink createOPMAgentLink(){
//		OPMProceduralLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMAgentLink();
//		return new OPMProceduralLinkDecorator(link);
//	}
//	public OPMProceduralLink createOPMAgentLink(){
//		OPMProceduralLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMAgentLink();
//		return new OPMProceduralLinkDecorator(link);
//	}
//	
//	public OPMProceduralLink createOPMAgentLink(){
//		OPMProceduralLink link = com.vainolo.phd.opm.model.OPMFactory.eINSTANCE.createOPMAgentLink();
//		return new OPMProceduralLinkDecorator(link);
//	}
}
