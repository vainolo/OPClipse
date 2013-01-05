/**
 * 
 */
package ruleContainers;

import rules.GenericRule;


/**
 * @author itcherno
 *
 */
public abstract class BasicRulesContainer implements IRuleContainer {


	public abstract boolean insertRule(GenericRule rule, boolean value, boolean isSpecified, 
			int PositiveParentCount, int negativeParentsCount);

	protected abstract GenericRule getSpecificRule(GenericRule newLinkRule);
	
	public abstract boolean contains(GenericRule newRule);

	public boolean validate(GenericRule newRule) {
		GenericRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		return existingRule.getValue();	
	}

	public boolean isSpecified(GenericRule newRule) {
		GenericRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		return existingRule.getIsSpecified();	
	}

	public boolean setValue(GenericRule newRule, boolean value) {
		GenericRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.setValue(value);	
	}

	public boolean incrementPositiveParentsCount(GenericRule newRule) {
		GenericRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.incrementPositiveParents();	
	}

	public boolean decrementPositiveParentsCount(GenericRule newRule) {
		GenericRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.decrementPositiveParents();	
	}
	
	public int getPositiveParentsCount(GenericRule newRule) {
		GenericRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return -1;
		}

		return existingRule.getPositiveParentsCount();	
	}
	
	public int getNegativeParentsCount(GenericRule newRule) {
		GenericRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return -1;
		}

		return existingRule.getNegativeParentsCount();	
	}

	public boolean incrementNegativeParentsCount(GenericRule newRule) {
		GenericRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.incrementNegativeParents();	
	}

	public boolean decrementNegativeParentsCount(GenericRule newRule) {
		GenericRule existingRule = getSpecificRule(newRule);
		if (existingRule == null ) {
			return false;
		}
		else if (existingRule.getIsSpecified()){
			return false;
		}
		return existingRule.decrementNegativeParents();	
	}
	
}
