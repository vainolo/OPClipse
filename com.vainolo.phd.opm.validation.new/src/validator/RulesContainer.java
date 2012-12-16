package validator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RulesContainer {
	
	
	private Map<Class<?>, Map<Class<?>, List<Rule>>> rules = 
			new  HashMap<Class<?>, Map<Class<?>, List<Rule>>>();
	

	public boolean insertRule(Class<?> from, Class<?> link, Class<?> to, 
			boolean value, boolean isSpecified, int PositiveParentCount, int negativeParentsCount) {
		// check if we have a hash entry for from
		if (! rules.containsKey(from) ) {
			HashMap<Class<?>, List<Rule>> newHash = new HashMap<Class<?>, List<Rule>>();
			rules.put(from, newHash);
		}
		
		// check if there is an entry for "to"
		if (! rules.get(from).containsKey(to) ) {
			Rule newRule = new Rule(link, PositiveParentCount, negativeParentsCount, isSpecified, value);
			List<Rule> newList = new ArrayList<Rule>();
			newList.add(newRule);
			rules.get(from).put(to, newList);
		}
		// "to" exists - add to rule set if doesn't already exists
		else {
			if (this.getSpecificRule(from, link, to).getrIsSpecified() == true) {
				return false;
			}
			Rule newRule = new Rule(link,PositiveParentCount,negativeParentsCount, isSpecified,value);
			rules.get(from).get(to).add(newRule);
		}
		
		return true;
	}
	
	public boolean contains(Class<?> from, Class<?> link, Class<?> to) {
		if (rules.containsKey(from)) {
			if (rules.get(from).containsKey(to)) {
				for (Rule rule: rules.get(from).get(to)) {
					if (rule.getLinkType() == link ) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean validate(Class<?> from, Class<?> link, Class<?> to) {
		Rule rule = getSpecificRule(from, link, to);
		if (rule == null) {
			return false;
		}
		return rule.getValue();
	}
	
	public boolean validate (Class<?> from, Class<?> link) {
		if (this.rules.containsKey(from)) {
			for (Class<?> to : rules.get(from).keySet()) {
				if (this.validate(from,link,to)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isSpecified(Class<?> from, Class<?> link, Class<?> to) {
		Rule rule = getSpecificRule(from, link, to);
		if (rule == null ) {
			return false;
		}
		return rule.getrIsSpecified();
	}
	
	public boolean getValue(Class<?> from, Class<?> link, Class<?> to) {
		Rule rule = getSpecificRule(from, link, to);
		if (rule == null ) {
			return false;
		}
		return rule.getValue();
	}
	
	public boolean setValue(Class<?> from, Class<?> link, Class<?> to, boolean value) {
		Rule rule = getSpecificRule(from, link, to);
		if (rule == null ) {
			return false;
		}
		return rule.setValue(value);
	}
	
	public int getPositiveParentsCount(Class<?> from, Class<?> link, Class<?> to) {
		Rule rule = getSpecificRule(from, link, to);
		if (rule == null ) {
			return -1;
		}
		return rule.getPositiveParentsCount();
	}
	
	public boolean incrementPositiveParentsCount (Class<?> from, Class<?> link, Class<?> to) {
		Rule rule = getSpecificRule(from, link, to);
		if (rule == null ) {
			return false;
		}
		else if (rule.getrIsSpecified()){
			return false;
		}
		return rule.incrementPositiveParents();	
	}
	
	public boolean decrementPositiveParentsCount (Class<?> from, Class<?> link, Class<?> to) {
		Rule rule = getSpecificRule(from, link, to);
		if (rule == null ) {
			return false;
		}
		else if (rule.getrIsSpecified()){
			return false;
		}
		return rule.decrementPositiveParents();	
	}
	
	public int getNegativeParentsCount(Class<?> from, Class<?> link, Class<?> to) {
		Rule rule = getSpecificRule(from, link, to);
		if (rule == null ) {
			return -1;
		}
		return rule.getNegativeParentsCount();
	}
	
	public boolean incrementNegativeParentsCount (Class<?> from, Class<?> link, Class<?> to) {
		Rule rule = getSpecificRule(from, link, to);
		if (rule == null ) {
			return false;
		}
		else if (rule.getrIsSpecified()){
			return false;
		}
		return rule.incrementNegativeParents();	
	}
	
	public boolean decrementNegativeParentsCount (Class<?> from, Class<?> link, Class<?> to) {
		Rule rule = getSpecificRule(from, link, to);
		if (rule == null ) {
			return false;
		}
		else if (rule.getrIsSpecified()){
			return false;
		}
		return rule.decrementNegativeParents();	
	}
		
	private Rule getSpecificRule(Class<?> from, Class<?> link, Class<?> to) {
		if (this.contains(from, link, to)) {
			for (Rule rule : this.rules.get(from).get(to)) {
				if (rule.getLinkType() == link) {
					return rule;
				}
			}
		}
		return null;
	}
}
