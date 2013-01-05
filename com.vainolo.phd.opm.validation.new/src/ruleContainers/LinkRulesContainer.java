package ruleContainers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rules.GenericRule;
import rules.OpmLinkRule;
import rules.ValidationLinkRule;


public class LinkRulesContainer extends BasicRulesContainer implements IRuleContainer {
	
	
	private Map<Class<?>, Map<Class<?>, List<ValidationLinkRule>>> rules = 
			new  HashMap<Class<?>, Map<Class<?>, List<ValidationLinkRule>>>();
	
	public boolean insertRule(GenericRule newRule, boolean value, boolean isSpecified, 
			int PositiveParentCount, int negativeParentsCount) {
		if (!(newRule instanceof OpmLinkRule)) {
			return false;
		}
		OpmLinkRule newOpmRule = (OpmLinkRule) newRule;
		Class<?> from = newOpmRule.From();
		Class<?> link = newOpmRule.Link();
		Class<?> to	  = newOpmRule.To();
		// check if we have a hash entry for from
		if (! rules.containsKey(from) ) {
			HashMap<Class<?>, List<ValidationLinkRule>> newHash = new HashMap<Class<?>, List<ValidationLinkRule>>();
			rules.put(from, newHash);
		}
		
		// check if there is an entry for "to"
		if (! rules.get(from).containsKey(to) ) {
			ValidationLinkRule newLinkRule = new ValidationLinkRule(link, PositiveParentCount, negativeParentsCount, isSpecified, value);
			List<ValidationLinkRule> newList = new ArrayList<ValidationLinkRule>();
			newList.add(newLinkRule);
			rules.get(from).put(to, newList);
		}
		// "to" exists - add to rule set if doesn't already exists
		else {
			if (this.getSpecificRule(newOpmRule).getIsSpecified() == true) {
				return false;
			}
			ValidationLinkRule newLinkRule = new ValidationLinkRule(link,PositiveParentCount,negativeParentsCount, isSpecified,value);
			rules.get(from).get(to).add(newLinkRule);
		}
		
		return true;
	}
	
	public boolean contains(GenericRule newRule) {
		if (!(newRule instanceof OpmLinkRule)) {
			return false;
		}
		OpmLinkRule newOpmRule = (OpmLinkRule) newRule;
		Class<?> from = newOpmRule.From();
		Class<?> link = newOpmRule.Link();
		Class<?> to	  = newOpmRule.To();
		if (rules.containsKey(from)) {
			if (rules.get(from).containsKey(to)) {
				for (ValidationLinkRule rule: rules.get(from).get(to)) {
					if (rule.getLinkType() == link ) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean validate (Class<?> from, Class<?> link) {
		if (this.rules.containsKey(from)) {
			for (Class<?> to : rules.get(from).keySet()) {
				OpmLinkRule newLinkRule = new OpmLinkRule(from,link,to);
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
	
	protected ValidationLinkRule getSpecificRule(GenericRule newLinkRule) {
		if (!(newLinkRule instanceof OpmLinkRule)) {
			return null;
		}
		OpmLinkRule newOpmRule = (OpmLinkRule) newLinkRule;
		Class<?> from = newOpmRule.From();
		Class<?> link = newOpmRule.Link();
		Class<?> to	  = newOpmRule.To();
		if (this.contains(newOpmRule)) {
			for (ValidationLinkRule rule : this.rules.get(from).get(to)) {
				if (rule.getLinkType() == link) {
					return rule;
				}
			}
		}
		return null;
	}

}
