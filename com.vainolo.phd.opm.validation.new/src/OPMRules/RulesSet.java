package OPMRules;
import rules.OpmLinkRule;
import validator.OPMLinkValidator;
import ruleContainers.BasicRulesContainer;
import ruleContainers.IRuleContainer;
import ruleContainers.LinkRulesContainer;

import com.vainolo.phd.opm.model.OPMAgentLink;
import com.vainolo.phd.opm.model.OPMAggregationLink;
import com.vainolo.phd.opm.model.OPMConsumptionLink;
import com.vainolo.phd.opm.model.OPMEffectLink;
import com.vainolo.phd.opm.model.OPMExhibitionLink;
import com.vainolo.phd.opm.model.OPMFactory;
import com.vainolo.phd.opm.model.OPMGeneralizationLink;
import com.vainolo.phd.opm.model.OPMInstrumentLink;
import com.vainolo.phd.opm.model.OPMInvocationLink;
import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OPMProcess;
import com.vainolo.phd.opm.model.OPMResultLink;
import com.vainolo.phd.opm.model.OPMState;
//OPMLinkRule(from,link,to)
import com.vainolo.phd.opm.model.OPMThing;
public class RulesSet {

	private LinkRulesContainer rulesCont;
	public RulesSet() {
		rulesCont = new LinkRulesContainer();
		
	}
	public boolean init() {
		OPMAggregationLink RAggLink = OPMFactory.eINSTANCE.createOPMAggregationLink();
		OPMExhibitionLink RExhLink = OPMFactory.eINSTANCE.createOPMExhibitionLink();
		OPMGeneralizationLink RGenLink = OPMFactory.eINSTANCE.createOPMGeneralizationLink();
		OPMAgentLink RAgeLink = OPMFactory.eINSTANCE.createOPMAgentLink();
		OPMInstrumentLink RInsLink = OPMFactory.eINSTANCE.createOPMInstrumentLink();
		OPMConsumptionLink RConLink = OPMFactory.eINSTANCE.createOPMConsumptionLink();
		OPMEffectLink REffLink = OPMFactory.eINSTANCE.createOPMEffectLink();
		OPMResultLink RResLink = OPMFactory.eINSTANCE.createOPMResultLink();
		OPMInvocationLink RInvLInk = OPMFactory.eINSTANCE.createOPMInvocationLink();
		
		OPMObject RObject =  OPMFactory.eINSTANCE.createOPMObject();
		OPMProcess RProc = OPMFactory.eINSTANCE.createOPMProcess();
		OPMState RState = OPMFactory.eINSTANCE.createOPMState();
		
		//Structural link -Aggregation: Object->Object
		OpmLinkRule ObjAggObj_rule = new OpmLinkRule(RObject.getClass(), RAggLink.getClass(), RObject.getClass() );
		rulesCont.insertRule(ObjAggObj_rule, true, false);
		
		//Structural link -Exhibition: Thing->Thing, All Options
		OpmLinkRule ObjExhObj_rule = new OpmLinkRule(RObject.getClass(), RExhLink.getClass(), RObject.getClass() );
		OpmLinkRule ObjExhProc_rule = new OpmLinkRule(RObject.getClass(), RExhLink.getClass(), RProc.getClass() );
		OpmLinkRule ProcExhObj_rule = new OpmLinkRule(RProc.getClass(), RExhLink.getClass(),RObject.getClass()  );
		OpmLinkRule ProcExhProc_rule = new OpmLinkRule(RProc.getClass(), RExhLink.getClass(),RProc.getClass() );
		rulesCont.insertRule(ObjExhObj_rule, true, false);
		rulesCont.insertRule(ObjExhProc_rule, true, false);
		rulesCont.insertRule(ProcExhObj_rule, true, false);
		rulesCont.insertRule(ProcExhProc_rule, true, false);
		
		//Structural link -Generalization: Object->Object
		OpmLinkRule ObjGenObj_rule = new OpmLinkRule(RObject.getClass(), RGenLink.getClass(), RObject.getClass() );
		rulesCont.insertRule(ObjGenObj_rule, true, false);
		
		//Structural link -Generalization: Procces -> Procces
		OpmLinkRule ProcGenProc_rule = new OpmLinkRule(RProc.getClass(), RGenLink.getClass(), RProc.getClass() );
		rulesCont.insertRule(ProcGenProc_rule, true, false);

		//Proc Link -  Agent, Instrument, Consumption, Effect: Object->Process, State->Process
		OpmLinkRule ObjAgeProc_rule = new OpmLinkRule(RObject.getClass(),RAgeLink.getClass() ,RProc.getClass());
		OpmLinkRule StateAgeProc_rule = new OpmLinkRule(RState.getClass(),RAgeLink.getClass() ,RProc.getClass());
		rulesCont.insertRule(ObjAgeProc_rule, true, false);
		rulesCont.insertRule(StateAgeProc_rule, true, false);
		OpmLinkRule ObjInsProc_rule = new OpmLinkRule(RObject.getClass(),RInsLink.getClass() ,RProc.getClass());
		OpmLinkRule StateInsProc_rule = new OpmLinkRule(RState.getClass(),RInsLink.getClass() ,RProc.getClass());
		rulesCont.insertRule(ObjInsProc_rule, true, false);
		rulesCont.insertRule(StateInsProc_rule, true, false);
		OpmLinkRule ObjConProc_rule = new OpmLinkRule(RObject.getClass(),RConLink.getClass() ,RProc.getClass());
		OpmLinkRule StateConProc_rule = new OpmLinkRule(RState.getClass(),RConLink.getClass() ,RProc.getClass());
		rulesCont.insertRule(ObjConProc_rule, true, false);
		rulesCont.insertRule(StateConProc_rule, true, false);
		OpmLinkRule ObjEffProc_rule = new OpmLinkRule(RObject.getClass(),REffLink.getClass() ,RProc.getClass());
		OpmLinkRule StateEffProc_rule = new OpmLinkRule(RState.getClass(),REffLink.getClass() ,RProc.getClass());
		rulesCont.insertRule(ObjEffProc_rule, true, false);
		rulesCont.insertRule(StateEffProc_rule, true, false);
		
		//Result: Process->Object, Process->State
		OpmLinkRule ProcResObj_rule = new OpmLinkRule(RProc.getClass(),RResLink.getClass() ,RObject.getClass());
		OpmLinkRule ProcResState_rule = new OpmLinkRule(RProc.getClass(),RResLink.getClass() ,RState.getClass());
		rulesCont.insertRule(ProcResObj_rule, true, false);
		rulesCont.insertRule(ProcResState_rule, true, false);
		
		//Invocation: Process->Process
		OpmLinkRule ProcInvProc_rule = new OpmLinkRule(RProc.getClass(),RResLink.getClass() ,RProc.getClass());
		rulesCont.insertRule(ProcInvProc_rule, true, false);
		return true;
	}	
}

// TODO - make sure that label (Lable.java) does not connect to any other model