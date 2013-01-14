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
public abstract class BasicRulesContainer {
	private ArrayList<BasicRule> conflictedRules 	= new ArrayList<BasicRule>();
	private ArrayList<BasicRule> leafRules 		= new ArrayList<BasicRule>();

	protected abstract boolean insertRule(BasicRule rule, boolean value, boolean isSpecified, 
			int PositiveParentCount, int negativeParentsCount);

	protected abstract BasicRule getSpecificRule(BasicRule newRule);
	
	public abstract boolean contains(BasicRule newRule);

	public boolean validate(BasicRule newRule) {
		BasicRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		return existingRule.getValue();	
	}

	protected boolean isSpecified(BasicRule newRule) {
		BasicRule existingRule = getSpecificRule(newRule);
		if (existingRule == null) {
			return false;
		}
		return existingRule.getIsSpecified();	
	}

	protected boolean setValue(BasicRule newRule, boolean value) {
		BasicRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.setValue(value);	
	}

	protected boolean incrementPositiveParentsCount(BasicRule newRule) {
		BasicRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.incrementPositiveParents();	
	}

	protected boolean decrementPositiveParentsCount(BasicRule newRule) {
		BasicRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.decrementPositiveParents();	
	}
	
	protected int getPositiveParentsCount(BasicRule newRule) {
		BasicRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return -1;
		}

		return existingRule.getPositiveParentsCount();	
	}
	
	protected int getNegativeParentsCount(BasicRule newRule) {
		BasicRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return -1;
		}

		return existingRule.getNegativeParentsCount();	
	}

	protected boolean incrementNegativeParentsCount(BasicRule newRule) {
		BasicRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.incrementNegativeParents();	
	}

	protected boolean decrementNegativeParentsCount(BasicRule newRule) {
		BasicRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.decrementNegativeParents();	
	}
	
	public boolean addRule (BasicRule newRule, boolean value) {
		// if this rule already exists as a "specified" rule - do nothing
		if (this.isSpecified(newRule)) {
			return false;
		}
		
		// if this rule exists as non specified
		if (this.contains(newRule)) {
			// if it has the same value - set to specified, remove from conflicted rules if needed and do nothing further
			if (this.validate(newRule) == value) {
				this.insertRule(newRule, value, true, 0, 0);
				if (conflictedRules.contains(newRule)) {
					conflictedRules.remove(newRule);
				}
				return true;
			}
		}
		return this.addRule(newRule, value, true, 0, 0);
	}
	
	private boolean addRule(BasicRule newRule, boolean value, boolean isSpecified, 
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
					handleRuleChange(derivedRule, value);
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
					handleRuleAdd(derivedRule, value);
				}
			}
		}
		return true;
	};
	
	private boolean handleRuleChange (BasicRule newRule, boolean newValueOfParent) {
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
	
	private boolean handleRuleAdd (BasicRule newRule, boolean valueOfParent) {
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
			this.insertRule(newRule, valueOfParent, false, 1, 0);
		}
		else {
			this.insertRule(newRule, valueOfParent, false, 0, 1);
		}
		return true;
	}
	
	public boolean areThereConflictedRules(){
		return (! this.conflictedRules.isEmpty() );
	}
	
	public ArrayList<BasicRule> getLeafRules() {
		return this.leafRules;
	}
}
