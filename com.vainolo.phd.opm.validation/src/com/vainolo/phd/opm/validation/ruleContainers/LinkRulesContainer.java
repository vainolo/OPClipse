package com.vainolo.phd.opm.validation.ruleContainers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vainolo.phd.opm.validation.rules.GenericRule;
import com.vainolo.phd.opm.validation.rules.GenericLinkRule;

//import rules.OpmLinkRule;


public class LinkRulesContainer extends BasicRulesContainer	 {
	
	
	private Map<Object, Map<Object, List<GenericLinkRule>>> rules = 
			new  HashMap<Object, Map<Object, List<GenericLinkRule>>>();
	
	public boolean insertRule(GenericRule newRule, boolean value, boolean isSpecified, 
			int PositiveParentCount, int negativeParentsCount) {
		if (!(newRule instanceof GenericLinkRule)) {
			return false;
		}
		GenericLinkRule newOpmRule = (GenericLinkRule) newRule;
		Object from = newOpmRule.FromType();
		Object link = newOpmRule.LinkType();
		Object to	  = newOpmRule.ToType();
		// check if we have a hash entry for from
		if (! rules.containsKey(from) ) {
			HashMap<Object, List<GenericLinkRule>> newHash = new HashMap<Object, List<GenericLinkRule>>();
			rules.put(from, newHash);
		}
		
		// check if there is an entry for "to"
		if (! rules.get(from).containsKey(to) ) {
			GenericLinkRule newLinkRule = new GenericLinkRule(from,link,to, PositiveParentCount, negativeParentsCount, isSpecified, value);
			List<GenericLinkRule> newList = new ArrayList<GenericLinkRule>();
			newList.add(newLinkRule);
			rules.get(from).put(to, newList);
		}
		// "to" exists - add to rule set if doesn't already exists
		else {
			if (this.getSpecificRule(newOpmRule).getIsSpecified() == true) {
				return false;
			}
			GenericLinkRule newLinkRule = new GenericLinkRule(from,link,to,PositiveParentCount,negativeParentsCount, isSpecified,value);
			rules.get(from).get(to).add(newLinkRule);
		}
		
		return true;
	}
	
	public boolean contains(GenericRule newRule) {
		if (!(newRule instanceof GenericLinkRule)) {
			return false;
		}
		GenericLinkRule newOpmRule = (GenericLinkRule) newRule;
		Object from = newOpmRule.FromType();
		Object link = newOpmRule.LinkType();
		Object to	  = newOpmRule.ToType();
		if (rules.containsKey(from)) {
			if (rules.get(from).containsKey(to)) {
				for (GenericLinkRule rule: rules.get(from).get(to)) {
					if (rule.Link() == link ) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean validate (Object from, Object link) {
		if (this.rules.containsKey(from)) {
			for (Object to : rules.get(from).keySet()) {
				GenericLinkRule newLinkRule = new GenericLinkRule(from,link,to);
				if (this.validate(newLinkRule)) {
					return true;
				}
			}
		}
		return false;
	}
	
	protected GenericLinkRule getSpecificRule(GenericRule newOpmRule) {
		if (!(newOpmRule instanceof GenericLinkRule)) {
			return null;
		}
		GenericLinkRule newLinkRule = (GenericLinkRule) newOpmRule;
		Object from = newLinkRule.FromType();
		Object link = newLinkRule.LinkType();
		Object to	  = newLinkRule.ToType();
		if (this.contains(newLinkRule)) {
			for (GenericLinkRule rule : this.rules.get(from).get(to)) {
				if (rule.Link() == link) {
					return rule;
				}
			}
		}
		return null;
	}

}
