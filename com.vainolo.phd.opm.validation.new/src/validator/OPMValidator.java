package validator;

import java.util.ArrayList;
import java.util.List;

import GenericItems.GenericThing;

public class OPMValidator {
	
	private OPMValidator instance;
	private RulesContainer rulesMat;
	private List<basicRule> conflictedRules;
	
	public OPMValidator getInstance() {
		if (instance == null) {
			instance = new OPMValidator();
		}
		return instance;
	}
	private OPMValidator(){
		this.rulesMat = new RulesContainer();
		this.conflictedRules = new ArrayList<basicRule>();
	}
		
	
	public boolean addRule (GenericThing from, GenericThing link, GenericThing to, boolean value) {
		// if this rule already exists as a "specified" rule - do nothing
		if (rulesMat.isSpecified(from.GetType(), link.GetType(), to.GetType())) {
			return false;
		}
		
		// if this rule exists as non specified
		if (rulesMat.contains(from.GetType(), link.GetType(), to.GetType())) {
			// if it has the same value - set to specified, remove from conflicted rules if needed and do nothing further
			if (rulesMat.getValue(from.GetType(), link.GetType(), to.GetType()) == value) {
				rulesMat.insertRule(from.GetType(), link.GetType(), to.GetType(), value, true, 0, 0);
				basicRule conflictedRule = new basicRule(from,link,to);
				if (conflictedRules.contains(conflictedRule)) {
					conflictedRules.remove(conflictedRule);
				}
				return true;
			}
		}
		return this.addRule(from, link, to, value, true, 0, 0);
	}
	
	private boolean addRule(GenericThing from, GenericThing link, GenericThing to, boolean value, boolean isSpecified, 
			int PositiveParentCount, int negativeParentsCount){   //Return 0 if done, 1 otherwise
		// if this rule already exists as a "specified" rule - do nothing
		if (rulesMat.isSpecified(from.GetType(), link.GetType(), to.GetType())) {
			return false;
		}
		
		// if this rule exists - assumption : if it exists, then all derived rules also exist
		if (rulesMat.contains(from.GetType(), link.GetType(), to.GetType())) {
			// if it has the same value - do nothing ( the public addrule handles the case where this rule now becomes specified
			if (rulesMat.getValue(from.GetType(), link.GetType(), to.GetType()) == value) {
				return true;
			}
			// else - set it as requested, change all the counts in the sons, and deduce new rules if needed
			else {
				rulesMat.setValue(from.GetType(), link.GetType(), to.GetType(), value);
				for (GenericThing fromSon: from.GetSonsOfType()) {
					handleRuleChange(fromSon, link, to, value);
				}
				for (GenericThing linkSon: link.GetSonsOfType()) {
					handleRuleChange(from, linkSon, to, value);
				}
				for (GenericThing toSon: to.GetSonsOfType()) {
					handleRuleChange(from, link, toSon, value);
				}
			}
		}
		// this rule does not exist - set it with the appropriate parameters and set all sons
		else {
			rulesMat.insertRule(from.GetType(), link.GetType(), to.GetType(), value, isSpecified, PositiveParentCount, negativeParentsCount);
			for (GenericThing fromSon: from.GetSonsOfType()) {
				handleRuleAdd(fromSon, link, to, value);
			}
			for (GenericThing linkSon: link.GetSonsOfType()) {
				handleRuleAdd(from, linkSon, to, value);
			}
			for (GenericThing toSon: to.GetSonsOfType()) {
				handleRuleAdd(from, link, toSon, value);
			}
		}
		return true;
	};
	
	private boolean handleRuleChange (GenericThing from, GenericThing link, GenericThing to, boolean newValueOfParent) {
		basicRule conflictedRule = new basicRule(from,link,to);
		if (newValueOfParent == true) {
			rulesMat.incrementPositiveParentsCount(from.GetType(), link.GetType(), to.GetType());
			rulesMat.decrementNegativeParentsCount(from.GetType(), link.GetType(), to.GetType());
			// if the rule is now conflicted - add it to the conflicted rules list if it isn't already there
			if (rulesMat.getNegativeParentsCount(from.getClass(), link.getClass(), to.getClass()) > 0 ) {
				if (! conflictedRules.contains(conflictedRule)) {
					conflictedRules.add(conflictedRule);
				}
			}
			// rule is not conflicted -> remove from conf. rules if needed, and deduce new rules 
			else {
				if (conflictedRules.contains(conflictedRule)) {
					conflictedRules.add(conflictedRule);
				}
				int posParentCount = rulesMat.getPositiveParentsCount(from.GetType(), link.GetType(), to.GetType());
				this.addRule(from, link, to, newValueOfParent, false, posParentCount, 0);
			}
		}
		else {
			rulesMat.decrementPositiveParentsCount(from.GetType(), link.GetType(), to.GetType());
			rulesMat.incrementNegativeParentsCount(from.GetType(), link.GetType(), to.GetType());
			// if the rule is now conflicted - add it to the conflicted rules list if it isn't already there
			if (rulesMat.getPositiveParentsCount(from.getClass(), link.getClass(), to.getClass()) > 0 ) {
				if (! conflictedRules.contains(conflictedRule)) {
					conflictedRules.add(conflictedRule);
				}
			}
			// rule is not conflicted -> remove from conf. rules if needed, and deduce new rules 
			else {
				if (conflictedRules.contains(conflictedRule)) {
					conflictedRules.add(conflictedRule);
				}
				int negParentCount = rulesMat.getNegativeParentsCount(from.GetType(), link.GetType(), to.GetType());
				this.addRule(from, link, to, newValueOfParent, false, 0, negParentCount);
			}
		}
		return true;
	}
	
	private boolean handleRuleAdd (GenericThing from, GenericThing link, GenericThing to, boolean valueOfParent) {
		basicRule conflictedRule = new basicRule(from,link,to);
		// if this rule already exist - handle parent count and deduce rules/add to conflicts
		if (rulesMat.contains(from.GetType(), link.GetType(), to.GetType())) {
			if (valueOfParent == true) {
				rulesMat.incrementPositiveParentsCount(from.GetType(), link.GetType(), to.GetType());
				// if we have negative parents - add to conflicts
				if (rulesMat.getNegativeParentsCount(from.GetType(), link.GetType(), to.GetType()) > 0 ) {
					if (! conflictedRules.contains(conflictedRule)) {
						conflictedRules.add(conflictedRule);
					}
					return true;
				}
				// no negative parents, since rule already exists - no need to do anything else
			}
			// value of parent == false 
			else {
				rulesMat.incrementNegativeParentsCount(from.GetType(), link.GetType(), to.GetType());
				// if we have Positive parents - add to conflicts
				if (rulesMat.getPositiveParentsCount(from.GetType(), link.GetType(), to.GetType()) > 0 ) {
					if (! conflictedRules.contains(conflictedRule)) {
						conflictedRules.add(conflictedRule);
					}
					return true;
				}
				// no Positive parents, since rule already exists - no need to do anything else
			}
		}
		// rules does not exist - add it
		if (valueOfParent == true) {
			rulesMat.insertRule(from.GetType(), link.GetType(), to.GetType(), valueOfParent, false, 1, 0);
		}
		else {
			rulesMat.insertRule(from.GetType(), link.GetType(), to.GetType(), valueOfParent, false, 0, 1);
		}
		return true;
	}
	
	public List<GenericThing> getSonsRecursive(GenericThing link) {
		// TODO - add a validation that this is indeed a link?
		List<GenericThing> returnList = new ArrayList<GenericThing>();
		List<GenericThing> sons = link.GetSonsOfType();
		for (GenericThing son : sons) {
			if (! returnList.contains(son)) {
				returnList.addAll(getSonsRecursive(son));
			}
		}		
		return returnList;
	}
	
	// validate different signatures
	public boolean validate (Class<?> from, Class<?> link) {
		return rulesMat.validate(from, link);
	}
	
	public boolean validate (Class<?> from, Class<?> link, Class<?> to) {
		return rulesMat.validate(from, link, to);
	}
	
	public boolean valdidate (GenericThing from, GenericThing link) {
		return validate(from.GetType(), link.GetType());
	}
	
	public boolean valdidate (GenericThing from, GenericThing link, GenericThing to) {
		return validate(from.GetType(),link.GetType(),to.GetType());
	}
	
	private class basicRule {
		
		GenericThing from;
		GenericThing link;
		GenericThing to;
		basicRule (GenericThing from, GenericThing link, GenericThing to) {
			this.from = from;
			this.link = link;
			this.to = to;
		}
	}

}



/* TODO  
 * define types: 	source/dest (both of type node)
 * 					link
 * 
 * define a data structure to hold the rules - DONE
 * in generic thing - Eyal suggested using <T> - why? - DONE
 * Ask Arieh for Arranged Information about OPM Rules (REAL)
 * OPM Rules - Data Structures
 *   */
 