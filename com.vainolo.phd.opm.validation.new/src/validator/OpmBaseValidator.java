package validator;

import java.util.ArrayList;
import java.util.List;

import ruleContainers.BasicRulesContainer;
import rules.GenericRule;
import rules.OpmGenericLinkRule;
import rules.OpmGenericThingRule;

public class OpmBaseValidator {
//	private OpmBaseValidator instance;
	protected BasicRulesContainer rulesMat;
	private List<GenericRule> conflictedRules;
	protected boolean initDone;
	
//	public OpmBaseValidator getInstance(BasicRulesContainer container) {
//		if (instance == null) {
//			instance = new OpmBaseValidator(container);
//		}
//		return instance;
//	}
//	
//	public OpmBaseValidator getInstance() {
//		if (instance == null) {
//			return null;
//		}
//		return instance;
//	}
//	
	protected OpmBaseValidator(){
//		this.rulesMat 			= container;
		this.conflictedRules 	= new ArrayList<GenericRule>();
		this.initDone 			= false;
	}
		
	
	public boolean addRule (OpmGenericLinkRule newRule, boolean value) throws Exception {
		if (initDone) {
			return false;
		}
		// if this rule already exists as a "specified" rule - do nothing
		if (rulesMat.isSpecified(newRule)) {
			return false;
		}
		
		// if this rule exists as non specified
		if (rulesMat.contains(newRule)) {
			// if it has the same value - set to specified, remove from conflicted rules if needed and do nothing further
			if (rulesMat.validate(newRule) == value) {
				rulesMat.insertRule(newRule, value, true, 0, 0);
				if (conflictedRules.contains(newRule)) {
					conflictedRules.remove(newRule);
				}
				return true;
			}
		}
		return this.addRule(newRule, value, true, 0, 0);
	}
	
	private boolean addRule(OpmGenericThingRule newRule, boolean value, boolean isSpecified, 
			int PositiveParentCount, int negativeParentsCount) throws Exception{   //Return 0 if done, 1 otherwise
		// if this rule already exists as a "specified" rule - do nothing
		if (rulesMat.isSpecified(newRule)) {
			return false;
		}
		
		// if this rule exists - assumption : if it exists, then all derived rules also exist
		if (rulesMat.contains(newRule)) {
			// if it has the same value - do nothing ( the public addrule handles the case where this rule now becomes specified
			if (rulesMat.validate(newRule) == value) {
				return true;
			}
			// else - set it as requested, change all the counts in the sons, and deduce new rules if needed
			else {
				rulesMat.setValue(newRule, value);
				for (OpmGenericThingRule derivedRule: newRule.getAllSons()) {
					handleRuleChange(derivedRule, value);
				}
			}
		}
		// this rule does not exist - set it with the appropriate parameters and set all sons
		else {
			rulesMat.insertRule(newRule, value, isSpecified, PositiveParentCount, negativeParentsCount);
			for (OpmGenericThingRule derivedRule: newRule.getAllSons()) {
				handleRuleAdd(derivedRule, value);
			}
		}
		return true;
	};
	
	private boolean handleRuleChange (OpmGenericThingRule newRule, boolean newValueOfParent) throws Exception {
		if (newValueOfParent == true) {
			rulesMat.incrementPositiveParentsCount(newRule);
			rulesMat.decrementNegativeParentsCount(newRule);
			// if the rule is now conflicted - add it to the conflicted rules list if it isn't already there
			if (rulesMat.getNegativeParentsCount(newRule) > 0 ) {
				if (! conflictedRules.contains(newRule)) {
					conflictedRules.add(newRule);
				}
			}
			// rule is not conflicted -> remove from conf. rules if needed, and deduce new rules 
			else {
				if (conflictedRules.contains(newRule)) {
					conflictedRules.remove(newRule);
				}
				int posParentCount = rulesMat.getPositiveParentsCount(newRule);
				// TODO - think abobut it
				this.addRule(newRule, newValueOfParent, false, posParentCount, 0);
			}
		}
		else {
			rulesMat.decrementPositiveParentsCount(newRule);
			rulesMat.incrementNegativeParentsCount(newRule);
			// if the rule is now conflicted - add it to the conflicted rules list if it isn't already there
			if (rulesMat.getPositiveParentsCount(newRule) > 0 ) {
				if (! conflictedRules.contains(newRule)) {
					conflictedRules.add(newRule);
				}
			}
			// rule is not conflicted -> remove from conf. rules if needed, and deduce new rules 
			else {
				if (conflictedRules.contains(newRule)) {
					conflictedRules.remove(newRule);
				}
				int negParentCount = rulesMat.getNegativeParentsCount(newRule);
				this.addRule(newRule, newValueOfParent, false, 0, negParentCount);
			}
		}
		return true;
	}
	
	private boolean handleRuleAdd (OpmGenericThingRule newRule, boolean valueOfParent) throws Exception {
		// if this rule already exist - handle parent count and deduce rules/add to conflicts
		if (rulesMat.contains(newRule)) {
			if (valueOfParent == true) {
				rulesMat.incrementPositiveParentsCount(newRule);
				// if we have negative parents - add to conflicts
				if (rulesMat.getNegativeParentsCount(newRule) > 0 ) {
					if (! conflictedRules.contains(newRule)) {
						conflictedRules.add(newRule);
					}
					return true;
				}
				// no negative parents, since rule already exists - no need to do anything else
			}
			// value of parent == false 
			else {
				rulesMat.incrementNegativeParentsCount(newRule);
				// if we have Positive parents - add to conflicts
				if (rulesMat.getPositiveParentsCount(newRule) > 0 ) {
					if (! conflictedRules.contains(newRule)) {
						conflictedRules.add(newRule);
					}
					return true;
				}
				// no Positive parents, since rule already exists - no need to do anything else
			}
		}
		// rules does not exist - add it
		else if (valueOfParent == true) {
			rulesMat.insertRule(newRule, valueOfParent, false, 1, 0);
		}
		else {
			rulesMat.insertRule(newRule, valueOfParent, false, 0, 1);
		}
		return true;
	}
		
	public boolean finalizeInit () throws Exception{
		if (this.initDone) {
			return false;
		}
		if (! conflictedRules.isEmpty() ) {
			Exception ex = new Exception("unhandled conflict rule"); //TODO - add tostring sub in LinkRule for a better msg
			throw(ex);
		}
		this.initDone = true;
		return true;
	}
}
