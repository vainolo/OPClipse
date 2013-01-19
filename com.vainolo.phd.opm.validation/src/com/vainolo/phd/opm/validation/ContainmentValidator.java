package com.vainolo.phd.opm.validation;

import java.util.ArrayList;
import java.util.Collections;

import com.vainolo.phd.opm.validation.ruleContainers.ContainmentRulesContainer;
import com.vainolo.phd.opm.validation.rules.ContainmentRule;

public class ContainmentValidator extends BaseValidator<ContainmentRulesContainer,ContainmentRule> {
	
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

	// TODO : find better name
	public Iterable<IContainmentRule> getLeafRules(){
		if (!this.initDone) return Collections.emptyList();
		
		return new ArrayList<IContainmentRule>(rulesMat.getLeafRules());
	}
}
