package com.vainolo.phd.opm.validation.ruleContainers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vainolo.phd.opm.validation.ElementType;
import com.vainolo.phd.opm.validation.rules.ContainmentRule;
import com.vainolo.phd.opm.validation.rules.BasicRule;

public class ContainmentRulesContainer extends BasicRulesContainer {
	
	private Map<Object, List<ContainmentRule>> rules = 
			new  HashMap<Object, List<ContainmentRule>>();
	
	@Override
	public boolean insertRule(BasicRule newRule, boolean value, boolean isSpecified, 
			int PositiveParentCount, int negativeParentsCount) {
		if (!(newRule instanceof ContainmentRule)) {
			return false;
		}
		ContainmentRule newOpmRule = (ContainmentRule) newRule;
		ElementType container = newOpmRule.container();
		ElementType containedItem = newOpmRule.containedItem();
		// check if we have a hash entry for from
		if (! rules.containsKey(container) ) {
			//  add rule set if doesn't already exists
			List<ContainmentRule> newList = new ArrayList<ContainmentRule>();
			rules.put(container, newList);
		} else {
			if ((getSpecificRule(newOpmRule)!=null) && (getSpecificRule(newOpmRule).getIsSpecified() == true)) {
				return false;
			}
			ContainmentRule newContainmentRule = new ContainmentRule(container,containedItem,PositiveParentCount,negativeParentsCount, isSpecified,value);
			rules.get(container).add(newContainmentRule);
		}
		
		return true;
	}
	@Override
	public boolean contains(BasicRule newRule) {
		if (!(newRule instanceof ContainmentRule)) {
			return false;
		}
		ContainmentRule newOpmRule = (ContainmentRule) newRule;
		ElementType container 		= newOpmRule.container();
		ElementType containedItem	= newOpmRule.containedItem();
		if (rules.containsKey(container)) {
			if (rules.get(container).contains(containedItem)){
					return true;
			}
		}
		return false;
	}
		
	@Override
	protected ContainmentRule getSpecificRule(BasicRule newOpmRule) {
		if (!(newOpmRule instanceof ContainmentRule)) {
			return null;
		}
		ContainmentRule newContainerRule = (ContainmentRule) newOpmRule;
		ElementType container 		= newContainerRule.container();
		ElementType containedItem	= newContainerRule.containedItem();
		if (this.contains(newContainerRule)) {
			for (ContainmentRule rule : this.rules.get(container)) {
				if (rule.containedItem().equals(containedItem)) {
					return rule;
				}
			}
		}
		return null;
	}
}
