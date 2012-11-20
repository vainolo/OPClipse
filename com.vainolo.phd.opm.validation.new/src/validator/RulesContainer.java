package validator;

import java.util.*; 

public class RulesContainer {
	
	private Map<Class<?>, Map<Class<?>, List<Rule>>> rules = 
			new  HashMap<Class<?>, Map<Class<?>, List<Rule>>>();
	

	public boolean insertRule(Class<?> from, Class<?> link, Class<?> to, 
			boolean value, boolean isSpecified, int PositiveParentCount) {
		// check if we have a hash entry for from
		if (! rules.containsKey(from) ) {
			HashMap<Class<?>, List<Rule>> newHash = new HashMap<Class<?>, List<Rule>>();
			rules.put(from, newHash);
		}
		
		// check if there is an entry for "to"
		if (! rules.get(from).containsKey(to) ) {
			Rule newRule = new Rule(link, PositiveParentCount, isSpecified, value);
			List<Rule> newList = new ArrayList<Rule>();
			newList.add(newRule);
			rules.get(from).put(to, newList);
		}
		// "to" exists - add to rule set if doesn't already exists
		else {
			if (this.contains(from,link,to)) {
				return false;
			}
			Rule newRule = new Rule(link,PositiveParentCount,isSpecified,value);
			rules.get(from).get(to).add(newRule);
		}
//		Class<?> c = itemA.getClass();
		
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
	
}
