package com.vainolo.phd.opm.validation;

import com.vainolo.phd.opm.validation.ruleContainers.ContainmentRulesContainer;
import com.vainolo.phd.opm.validation.rules.ContainmentRule;

public class ContainmentValidator extends BaseValidator<ContainmentRulesContainer> {
	
	public ContainmentValidator(){
		super(new ContainmentRulesContainer());
	}
	
	// validate different signatures
	public boolean valdidate (ElementType container, ElementType containedItem) {
		if (! initDone) {
			return false;
		}		
		return rulesMat.validate(new ContainmentRule(container,containedItem));
		
	}	
	
	public boolean addRule(ElementType container, ElementType containedItem, boolean value) {
		ContainmentRule newRule = new ContainmentRule(container, containedItem);
		return rulesMat.addRule(newRule, value);
	}
	
}
