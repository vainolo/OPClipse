/**
 * 
 */
package com.vainolo.phd.opm.validation.ruleContainers;

import java.util.ArrayList;

import com.vainolo.phd.opm.validation.rules.BasicRule;

/**
 * @author itcherno
 *
 */
public abstract class BasicRulesContainer<TRule extends BasicRule> {
	private ArrayList<TRule> conflictedRules 	= new ArrayList<TRule>();
	private ArrayList<TRule> leafRules 		= new ArrayList<TRule>();

	protected abstract boolean insertRule(TRule rule, boolean value, boolean isSpecified, 
			int PositiveParentCount, int negativeParentsCount);

	protected abstract TRule getSpecificRule(TRule newRule);
	
	public abstract boolean contains(TRule newRule);

	public boolean validate(TRule newRule) {
		TRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		return existingRule.getValue();	
	}

	protected boolean isSpecified(TRule newRule) {
		TRule existingRule = getSpecificRule(newRule);
		if (existingRule == null) {
			return false;
		}
		return existingRule.getIsSpecified();	
	}

	protected boolean setValue(TRule newRule, boolean value) {
		TRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.setValue(value);	
	}

	protected boolean incrementPositiveParentsCount(TRule newRule) {
		TRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.incrementPositiveParents();	
	}

	protected boolean decrementPositiveParentsCount(TRule newRule) {
		TRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.decrementPositiveParents();	
	}
	
	protected int getPositiveParentsCount(TRule newRule) {
		TRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return -1;
		}

		return existingRule.getPositiveParentsCount();	
	}
	
	protected int getNegativeParentsCount(TRule newRule) {
		TRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return -1;
		}

		return existingRule.getNegativeParentsCount();	
	}

	protected boolean incrementNegativeParentsCount(TRule newRule) {
		TRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.incrementNegativeParents();	
	}

	protected boolean decrementNegativeParentsCount(TRule newRule) {
		TRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.decrementNegativeParents();	
	}
	
	public boolean addRule (TRule newRule, boolean value) {
		// if this rule already exists as a "specified" rule - do nothing
		if (this.isSpecified(newRule)) {
			return false;
		}
		
		// if this rule exists as non specified
		if (this.contains(newRule)) {
			// if it has the same value - set to specified, remove from conflicted rules if needed and do nothing further
			if (this.validate(newRule) == value) {
				this.getSpecificRule(newRule).setIsSpecified(true);//, value, true, 0, 0);//change to GetSpecificRule(newRule).setIsSpesified(true)
				if (conflictedRules.contains(newRule)) {
					conflictedRules.remove(newRule);
				}
				return true;
			}
		}
		return this.addRule(newRule, value, true, 0, 0);
	}
	
	@SuppressWarnings("unchecked")
	private boolean addRule(TRule newRule, boolean value, boolean isSpecified, 
			int PositiveParentCount, int negativeParentsCount) {   //Return 0 if done, 1 otherwise
		// if this rule already exists as a "specified" rule - do nothing
		if (this.isSpecified(newRule)) {
			return false;
		}
		
		// if this rule exists - assumption : if it exists, then all derived rules also exist
		if (this.contains(newRule)) {
			// if it has the same value - do nothing ( the public addrule handles the case where this rule now becomes specified
			if (this.validate(newRule) == value) {
				return true;
			}
			// else - set it as requested, change all the counts in the sons, and deduce new rules if needed
			else {
				this.setValue(newRule, value);
				for (BasicRule derivedRule: newRule.getAllSons()) {
					handleRuleChange((TRule)derivedRule, value);
				}
			}
		}
		// this rule does not exist - set it with the appropriate parameters and set all sons
		else {
			this.insertRule(newRule, value, isSpecified, PositiveParentCount, negativeParentsCount);
			ArrayList<BasicRule> derivedRules = newRule.getAllSons();
			if (derivedRules.isEmpty() ) {
				leafRules.add(newRule);
			}
			else {
				for (BasicRule derivedRule: derivedRules) {
					handleRuleAdd((TRule)derivedRule, value);
				}
			}
		}
		return true;
	};
	
	private boolean handleRuleChange (TRule newRule, boolean newValueOfParent) {
		if (newValueOfParent == true) {
			this.incrementPositiveParentsCount(newRule);
			this.decrementNegativeParentsCount(newRule);
			// if the rule is now conflicted - add it to the conflicted rules list if it isn't already there
			if (this.getNegativeParentsCount(newRule) > 0 ) {
				if (! conflictedRules.contains(newRule)) {
					conflictedRules.add(newRule);
				}
			}
			// rule is not conflicted -> remove from conf. rules if needed, and deduce new rules 
			else {
				if (conflictedRules.contains(newRule)) {
					conflictedRules.remove(newRule);
				}
				int posParentCount = this.getPositiveParentsCount(newRule);
				// TODO - think about it
				this.addRule(newRule, newValueOfParent, false, posParentCount, 0);
			}
		}
		else {
			this.decrementPositiveParentsCount(newRule);
			this.incrementNegativeParentsCount(newRule);
			// if the rule is now conflicted - add it to the conflicted rules list if it isn't already there
			if (this.getPositiveParentsCount(newRule) > 0 ) {
				if (! conflictedRules.contains(newRule)) {
					conflictedRules.add(newRule);
				}
			}
			// rule is not conflicted -> remove from conf. rules if needed, and deduce new rules 
			else {
				if (conflictedRules.contains(newRule)) {
					conflictedRules.remove(newRule);
				}
				int negParentCount = this.getNegativeParentsCount(newRule);
				this.addRule(newRule, newValueOfParent, false, 0, negParentCount);
			}
		}
		return true;
	}
	
	private boolean handleRuleAdd (TRule newRule, boolean valueOfParent) {
		// if this rule already exist - handle parent count and deduce rules/add to conflicts
		if (this.contains(newRule)) {
			if (valueOfParent) {
				this.incrementPositiveParentsCount(newRule);
				// if we have negative parents - add to conflicts
				if (this.getNegativeParentsCount(newRule) > 0 ) {
					if (! conflictedRules.contains(newRule)) {
						conflictedRules.add(newRule);
					}
					return true;
				}
				// no negative parents, since rule already exists - no need to do anything else
			}
			// value of parent == false 
			else {
				this.incrementNegativeParentsCount(newRule);
				// if we have Positive parents - add to conflicts
				if (this.getPositiveParentsCount(newRule) > 0 ) {
					if (! conflictedRules.contains(newRule)) {
						conflictedRules.add(newRule);
					}
					return true;
				}
				// no Positive parents, since rule already exists - no need to do anything else
			}
		}
		// rules does not exist - add it
		else if (valueOfParent) {
			this.addRule(newRule, valueOfParent, false, 1, 0);
		}
		else {
			this.addRule(newRule, valueOfParent, false, 0, 1);
		}
		return true;
	}
	
	public boolean areThereConflictedRules(){
		return (! this.conflictedRules.isEmpty() );
	}
	
	public ArrayList<TRule> getLeafRules() {
		return this.leafRules;
	}
	
	public void testForConflictedRules() throws Exception {
		if (this.conflictedRules.isEmpty()) return;
		
		StringBuilder msg = new StringBuilder("unhandled conflicet rule: " + "'" + conflictedRules.get(0).toString() + "'");
		// TODO build an explaining message
		Exception ex = new Exception(msg.toString()); 
		throw(ex);
	}

}
