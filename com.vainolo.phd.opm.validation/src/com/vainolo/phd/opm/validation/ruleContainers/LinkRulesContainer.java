package com.vainolo.phd.opm.validation.ruleContainers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vainolo.phd.opm.validation.rules.GenericRule;
import com.vainolo.phd.opm.validation.rules.OpmGenericLinkRule;

//import rules.OpmLinkRule;


public class LinkRulesContainer extends BasicRulesContainer	 {
	
	
	private Map<Object, Map<Object, List<OpmGenericLinkRule>>> rules = 
			new  HashMap<Object, Map<Object, List<OpmGenericLinkRule>>>();
	
	public boolean insertRule(GenericRule newRule, boolean value, boolean isSpecified, 
			int PositiveParentCount, int negativeParentsCount) {
		if (!(newRule instanceof OpmGenericLinkRule)) {
			return false;
		}
		OpmGenericLinkRule newOpmRule = (OpmGenericLinkRule) newRule;
		Object from = newOpmRule.FromType();
		Object link = newOpmRule.LinkType();
		Object to	  = newOpmRule.ToType();
		// check if we have a hash entry for from
		if (! rules.containsKey(from) ) {
			HashMap<Object, List<OpmGenericLinkRule>> newHash = new HashMap<Object, List<OpmGenericLinkRule>>();
			rules.put(from, newHash);
		}
		
		// check if there is an entry for "to"
		if (! rules.get(from).containsKey(to) ) {
			OpmGenericLinkRule newLinkRule = new OpmGenericLinkRule(from,link,to, PositiveParentCount, negativeParentsCount, isSpecified, value);
			List<OpmGenericLinkRule> newList = new ArrayList<OpmGenericLinkRule>();
			newList.add(newLinkRule);
			rules.get(from).put(to, newList);
		}
		// "to" exists - add to rule set if doesn't already exists
		else {
			if (this.getSpecificRule(newOpmRule).getIsSpecified() == true) {
				return false;
			}
			OpmGenericLinkRule newLinkRule = new OpmGenericLinkRule(from,link,to,PositiveParentCount,negativeParentsCount, isSpecified,value);
			rules.get(from).get(to).add(newLinkRule);
		}
		
		return true;
	}
	
	public boolean contains(GenericRule newRule) {
		if (!(newRule instanceof OpmGenericLinkRule)) {
			return false;
		}
		OpmGenericLinkRule newOpmRule = (OpmGenericLinkRule) newRule;
		Object from = newOpmRule.FromType();
		Object link = newOpmRule.LinkType();
		Object to	  = newOpmRule.ToType();
		if (rules.containsKey(from)) {
			if (rules.get(from).containsKey(to)) {
				for (OpmGenericLinkRule rule: rules.get(from).get(to)) {
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
				OpmGenericLinkRule newLinkRule = new OpmGenericLinkRule(from,link,to);
				if (this.validate(newLinkRule)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean hide_comments() {
		return true;
	
		
	
//	public boolean validate(GenericRule newRule) {
//	if (!(newRule instanceof OpmLinkRule)) {
//		return false;
//	}
//	OpmLinkRule newOpmRule = (OpmLinkRule) newRule;
//	ValidationLinkRule rule = getSpecificRule(newOpmRule);
//	if (rule == null) {
//		return false;
//	}
//	return rule.getValue();
//}
//
//	public boolean isSpecified(GenericRule newRule) {
//		if (!(newRule instanceof OpmLinkRule)) {
//			return false;
//		}
//		OpmLinkRule newOpmRule = (OpmLinkRule) newRule;
//		ValidationLinkRule rule = getSpecificRule(newOpmRule);
//		if (rule == null ) {
//			return false;
//		}
//		return rule.getIsSpecified();
//	}
//	
//	public boolean getValue(GenericRule newRule) {
//		if (!(newRule instanceof OpmLinkRule)) {
//			return false;
//		}
//		OpmLinkRule newOpmRule = (OpmLinkRule) newRule;
//		ValidationLinkRule rule = getSpecificRule(newOpmRule);
//		if (rule == null ) {
//			return false;
//		}
//		return rule.getValue();
//	}
//	
//	public boolean setValue(GenericRule newRule, boolean value) {
//		if (!(newRule instanceof OpmLinkRule)) {
//			return false;
//		}
//		OpmLinkRule newOpmRule = (OpmLinkRule) newRule;
//		ValidationLinkRule rule = getSpecificRule(newOpmRule);
//		if (rule == null ) {
//			return false;
//		}
//		return rule.setValue(value);
//	}
//	
//	public int getPositiveParentsCount(GenericRule newRule) {
//		if (!(newRule instanceof OpmLinkRule)) {
//			return -2;
//		}
//		OpmLinkRule newOpmRule = (OpmLinkRule) newRule;
//		ValidationLinkRule rule = getSpecificRule(newOpmRule);
//		if (rule == null ) {
//			return -1;
//		}
//		return rule.getPositiveParentsCount();
//	}
//	
//	public boolean incrementPositiveParentsCount (GenericRule newRule) {
//		if (!(newRule instanceof OpmLinkRule)) {
//			return false;
//		}
//		OpmLinkRule newOpmRule = (OpmLinkRule) newRule;
//		ValidationLinkRule rule = getSpecificRule(newOpmRule);
//		if (rule == null ) {
//			return false;
//		}
//		else if (rule.getIsSpecified()){
//			return false;
//		}
//		return rule.incrementPositiveParents();	
//	}
//	
//	public boolean decrementPositiveParentsCount (GenericRule newRule) {
//		if (!(newRule instanceof OpmLinkRule)) {
//			return false;
//		}
//		OpmLinkRule newOpmRule = (OpmLinkRule) newRule;
//		ValidationLinkRule rule = getSpecificRule(newOpmRule);
//		if (rule == null ) {
//			return false;
//		}
//		else if (rule.getIsSpecified()){
//			return false;
//		}
//		return rule.decrementPositiveParents();	
//	}
//	
//	public int getNegativeParentsCount(GenericRule newRule) {
//		if (!(newRule instanceof OpmLinkRule)) {
//			return -2;
//		}
//		OpmLinkRule newOpmRule = (OpmLinkRule) newRule;
//		ValidationLinkRule rule = getSpecificRule(newOpmRule);
//		if (rule == null ) {
//			return -1;
//		}
//		return rule.getNegativeParentsCount();
//	}
//	
//	public boolean incrementNegativeParentsCount (GenericRule newRule) {
//		if (!(newRule instanceof OpmLinkRule)) {
//			return false;
//		}
//		OpmLinkRule newOpmRule = (OpmLinkRule) newRule;
//		ValidationLinkRule rule = getSpecificRule(newOpmRule);
//		if (rule == null ) {
//			return false;
//		}
//		else if (rule.getIsSpecified()){
//			return false;
//		}
//		return rule.incrementNegativeParents();	
//	}
//	
//	public boolean decrementNegativeParentsCount (GenericRule newRule) {
//		if (!(newRule instanceof OpmLinkRule)) {
//			return false;
//		}
//		OpmLinkRule newOpmRule = (OpmLinkRule) newRule;
//		ValidationLinkRule rule = getSpecificRule(newOpmRule);
//		if (rule == null ) {
//			return false;
//		}
//		else if (rule.getIsSpecified()){
//			return false;
//		}
//		return rule.decrementNegativeParents();	
//	}

	}
	
	protected OpmGenericLinkRule getSpecificRule(GenericRule newOpmRule) {
		if (!(newOpmRule instanceof OpmGenericLinkRule)) {
			return null;
		}
		OpmGenericLinkRule newLinkRule = (OpmGenericLinkRule) newOpmRule;
		Object from = newLinkRule.FromType();
		Object link = newLinkRule.LinkType();
		Object to	  = newLinkRule.ToType();
		if (this.contains(newLinkRule)) {
			for (OpmGenericLinkRule rule : this.rules.get(from).get(to)) {
				if (rule.Link() == link) {
					return rule;
				}
			}
		}
		return null;
	}

}
