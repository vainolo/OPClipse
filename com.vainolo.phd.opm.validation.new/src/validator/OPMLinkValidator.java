package validator;


import ruleContainers.LinkRulesContainer;
import rules.OpmGenericLinkRule;
//import rules.OpmLinkRule;


import GenericItems.GenericThing;

public class OPMLinkValidator extends OpmBaseValidator{
	
//	private OPMLinkValidator instance;
//	private LinkRulesContainer rulesMat;
//	private List<OpmLinkRule> conflictedRules;
//	private boolean initDone;
//	
//	public OPMLinkValidator getInstance() {
//		if (instance == null) {
//			LinkRulesContainer container = new LinkRulesContainer();
//			instance = new OPMLinkValidator(container);
//		}
//		return instance;
//	}
	
	public OPMLinkValidator(){
		super();
		LinkRulesContainer container = new LinkRulesContainer();
		this.rulesMat = container;
//		this.rulesMat 			= new LinkRulesContainer();
//		this.conflictedRules 	= new ArrayList<OpmLinkRule>();
//		this.initDone 			= false;
	}
		
	
//	public boolean addRule (OpmGenericLinkRule newGenericRule, boolean value) {
//		if (initDone) {
//			return false;
//		}
//		OpmLinkRule newRule = newGenericRule.getOpmLinkRule();
//		// if this rule already exists as a "specified" rule - do nothing
//		if (rulesMat.isSpecified(newRule)) {
//			return false;
//		}
//		
//		// if this rule exists as non specified
//		if (rulesMat.contains(newRule)) {
//			// if it has the same value - set to specified, remove from conflicted rules if needed and do nothing further
//			if (rulesMat.validate(newRule) == value) {
//				rulesMat.insertRule(newRule, value, true, 0, 0);
//				if (conflictedRules.contains(newRule)) {
//					conflictedRules.remove(newRule);
//				}
//				return true;
//			}
//		}
//		return this.addRule(newGenericRule, value, true, 0, 0);
//	}
//	
//	private boolean addRule(OpmGenericLinkRule newGenericRule, boolean value, boolean isSpecified, 
//			int PositiveParentCount, int negativeParentsCount){   //Return 0 if done, 1 otherwise
//		OpmLinkRule newRule = newGenericRule.getOpmLinkRule();
//		// if this rule already exists as a "specified" rule - do nothing
//		if (rulesMat.isSpecified(newRule)) {
//			return false;
//		}
//		
//		// if this rule exists - assumption : if it exists, then all derived rules also exist
//		if (rulesMat.contains(newRule)) {
//			// if it has the same value - do nothing ( the public addrule handles the case where this rule now becomes specified
//			if (rulesMat.validate(newRule) == value) {
//				return true;
//			}
//			// else - set it as requested, change all the counts in the sons, and deduce new rules if needed
//			else {
//				rulesMat.setValue(newRule, value);
//				for (OpmGenericLinkRule derivedRule: newGenericRule.getAllSons()) {
//					handleRuleChange(derivedRule, value);
//				}
//			}
//		}
//		// this rule does not exist - set it with the appropriate parameters and set all sons
//		else {
//			rulesMat.insertRule(newRule, value, isSpecified, PositiveParentCount, negativeParentsCount);
//			for (OpmGenericLinkRule derivedRule: newGenericRule.getAllSons()) {
//				handleRuleAdd(derivedRule, value);
//			}
//		}
//		return true;
//	};
//	
//	private boolean handleRuleChange (OpmGenericLinkRule newGenericRule, boolean newValueOfParent) {
//		OpmLinkRule newRule = newGenericRule.getOpmLinkRule();
//		if (newValueOfParent == true) {
//			rulesMat.incrementPositiveParentsCount(newRule);
//			rulesMat.decrementNegativeParentsCount(newRule);
//			// if the rule is now conflicted - add it to the conflicted rules list if it isn't already there
//			if (rulesMat.getNegativeParentsCount(newRule) > 0 ) {
//				if (! conflictedRules.contains(newRule)) {
//					conflictedRules.add(newRule);
//				}
//			}
//			// rule is not conflicted -> remove from conf. rules if needed, and deduce new rules 
//			else {
//				if (conflictedRules.contains(newRule)) {
//					conflictedRules.remove(newRule);
//				}
//				int posParentCount = rulesMat.getPositiveParentsCount(newRule);
//				// TODO - think abobut it
//				this.addRule(newGenericRule, newValueOfParent, false, posParentCount, 0);
//			}
//		}
//		else {
//			rulesMat.decrementPositiveParentsCount(newRule);
//			rulesMat.incrementNegativeParentsCount(newRule);
//			// if the rule is now conflicted - add it to the conflicted rules list if it isn't already there
//			if (rulesMat.getPositiveParentsCount(newRule) > 0 ) {
//				if (! conflictedRules.contains(newRule)) {
//					conflictedRules.add(newRule);
//				}
//			}
//			// rule is not conflicted -> remove from conf. rules if needed, and deduce new rules 
//			else {
//				if (conflictedRules.contains(newRule)) {
//					conflictedRules.remove(newRule);
//				}
//				int negParentCount = rulesMat.getNegativeParentsCount(newRule);
//				this.addRule(newGenericRule, newValueOfParent, false, 0, negParentCount);
//			}
//		}
//		return true;
//	}
//	
//	private boolean handleRuleAdd (OpmGenericLinkRule newGenericRule, boolean valueOfParent) {
//		OpmLinkRule newRule = newGenericRule.getOpmLinkRule();
//		// if this rule already exist - handle parent count and deduce rules/add to conflicts
//		if (rulesMat.contains(newRule)) {
//			if (valueOfParent == true) {
//				rulesMat.incrementPositiveParentsCount(newRule);
//				// if we have negative parents - add to conflicts
//				if (rulesMat.getNegativeParentsCount(newRule) > 0 ) {
//					if (! conflictedRules.contains(newRule)) {
//						conflictedRules.add(newRule);
//					}
//					return true;
//				}
//				// no negative parents, since rule already exists - no need to do anything else
//			}
//			// value of parent == false 
//			else {
//				rulesMat.incrementNegativeParentsCount(newRule);
//				// if we have Positive parents - add to conflicts
//				if (rulesMat.getPositiveParentsCount(newRule) > 0 ) {
//					if (! conflictedRules.contains(newRule)) {
//						conflictedRules.add(newRule);
//					}
//					return true;
//				}
//				// no Positive parents, since rule already exists - no need to do anything else
//			}
//		}
//		// rules does not exist - add it
//		else if (valueOfParent == true) {
//			rulesMat.insertRule(newRule, valueOfParent, false, 1, 0);
//		}
//		else {
//			rulesMat.insertRule(newRule, valueOfParent, false, 0, 1);
//		}
//		return true;
//	}
//	
//	public List<GenericThing> getSonsRecursive(GenericThing link) {
//		// TODO - add a validation that this is indeed a link?
//		List<GenericThing> returnList = new ArrayList<GenericThing>();
//		List<GenericThing> sons = link.GetSonsOfType();
//		for (GenericThing son : sons) {
//			if (! returnList.contains(son)) {
//				returnList.addAll(getSonsRecursive(son));
//			}
//		}		
//		return returnList;
//	}
	
	// validate different signatures
	public boolean validate (Object from, Object link) {
		if (! initDone) {
			return false;
		}
		
		return ((LinkRulesContainer)rulesMat).validate(from, link);
	}
	
	public boolean validate (Object from, Object link, Object to) {
		if (! initDone) {
			return false;
		}
		OpmGenericLinkRule newRule = new OpmGenericLinkRule(from,link,to);
		return rulesMat.validate(newRule);
	}
	
	public boolean valdidate (GenericThing from, GenericThing link) {
		if (! initDone) {
			return false;
		}
		return validate(from.GetType(), link.GetType());
	}
	
	public boolean valdidate (GenericThing from, GenericThing link, GenericThing to) {
		if (! initDone) {
			return false;
		}		
		return validate(from.GetType(),link.GetType(),to.GetType());
	}
	
//	public boolean finalizeInit () throws Exception{
//		if (this.initDone) {
//			return false;
//		}
//		if (! conflictedRules.isEmpty() ) {
//			Exception ex = new Exception("unhandled conflict rule"); //TODO - add tostring sub in LinkRule for a better msg
//			throw(ex);
//		}
//		this.initDone = true;
//		return true;
//	}
	
}
