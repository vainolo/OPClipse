package com.vainolo.phd.opm.validation.ruleContainers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vainolo.phd.opm.validation.ElementType;
import com.vainolo.phd.opm.validation.rules.BasicRule;
import com.vainolo.phd.opm.validation.rules.LinkRule;

public class LinkRulesContainer extends BasicRulesContainer	 {
	
	
	private Map<ElementType, Map<ElementType, List<LinkRule>>> rules = 
			new  HashMap<ElementType, Map<ElementType, List<LinkRule>>>();
	
	protected boolean insertRule(BasicRule newRule, boolean value, boolean isSpecified, 
			int PositiveParentCount, int negativeParentsCount) {
		if (!(newRule instanceof LinkRule)) {
			return false;
		}
		LinkRule newOpmRule = (LinkRule) newRule;
		// TODO : do we really need this?
		if ((getSpecificRule(newOpmRule)!=null) && (getSpecificRule(newOpmRule).getIsSpecified() == true)) {
			return false;
		}
		
		ElementType from = newOpmRule.From();
		ElementType link = newOpmRule.Link();
		ElementType to	  = newOpmRule.To();
		// check if we have a hash entry for from
		if (! rules.containsKey(from) ) {
			HashMap<ElementType, List<LinkRule>> newHash = new HashMap<ElementType, List<LinkRule>>();
			rules.put(from, newHash);
		}
		
		// check if there is an entry for "to"
		if (! rules.get(from).containsKey(to) ) {
			List<LinkRule> newList = new ArrayList<LinkRule>();
			rules.get(from).put(to, newList);
		}
		
		LinkRule newLinkRule = new LinkRule(from,link,to,PositiveParentCount,negativeParentsCount, isSpecified,value);
		rules.get(from).get(to).add(newLinkRule);
		
		return true;
	}
	
	public boolean contains(BasicRule rule) {
		return (getSpecificRule(rule) != null);
	}
	
	public boolean validate (ElementType from, ElementType link) {
		if (this.rules.containsKey(from)) {
			for (ElementType to : rules.get(from).keySet()) {
				LinkRule newLinkRule = new LinkRule(from,link,to);
				if (this.validate(newLinkRule)) {
					return true;
				}
			}
		}
		return false;
	}
	
	protected LinkRule getSpecificRule(BasicRule newOpmRule) {
		if (!(newOpmRule instanceof LinkRule)) {
			return null;
		}
		LinkRule newLinkRule = (LinkRule) newOpmRule;
		ElementType from = newLinkRule.From();
		ElementType link = newLinkRule.Link();
		ElementType to	  = newLinkRule.To();
		if (rules.containsKey(from)) {
			if (rules.get(from).containsKey(to)) {
				for (LinkRule rule : this.rules.get(from).get(to)) {
					if (rule.Link().equals(link)) {
						return rule;
					}
				}
			}
		}
		return null;
	}

}
