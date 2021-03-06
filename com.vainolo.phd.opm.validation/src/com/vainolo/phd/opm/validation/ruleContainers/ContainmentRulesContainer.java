package com.vainolo.phd.opm.validation.ruleContainers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vainolo.phd.opm.validation.ElementType;
import com.vainolo.phd.opm.validation.rules.ContainmentRule;

public class ContainmentRulesContainer extends BasicRulesContainer<ContainmentRule> {
	
	private Map<ElementType, List<ContainmentRule>> rules = 
			new  HashMap<ElementType, List<ContainmentRule>>();
	
	@Override
	protected ContainmentRule insertRule(ContainmentRule newRule, boolean value, boolean isSpecified, 
			int positiveParentCount, int negativeParentsCount) {
		if (!(newRule instanceof ContainmentRule)) {
			return null;
		}
		ContainmentRule newOpmRule = (ContainmentRule) newRule;
		ElementType container = newOpmRule.container();
		ElementType containedItem = newOpmRule.containedItem();
		
		// check if we have a hash entry for from
		if (! rules.containsKey(container) ) {
			//  add rule set if doesn't already exists
			List<ContainmentRule> newList = new ArrayList<ContainmentRule>();
			rules.put(container, newList);
		} 
	
		ContainmentRule newContainmentRule = new ContainmentRule(container,containedItem,positiveParentCount,negativeParentsCount, isSpecified,value);
		rules.get(container).add(newContainmentRule);
		
		return newContainmentRule;
	}
	@Override
	public boolean contains(ContainmentRule rule) {
		ContainmentRule specific = getSpecificRule(rule);
		return (specific != null);
	}
		
	@Override
	protected ContainmentRule getSpecificRule(ContainmentRule newOpmRule) {
		if (!(newOpmRule instanceof ContainmentRule)) {
			return null;
		}
		ContainmentRule newContainerRule = (ContainmentRule) newOpmRule;
		ElementType container 		= newContainerRule.container();
		ElementType containedItem	= newContainerRule.containedItem();
		if (rules.containsKey(container)) {
			for (ContainmentRule rule : this.rules.get(container)) {
				if (rule.containedItem().equals(containedItem)) {
					return rule;
				}
			}
		}
		return null;
	}
}
