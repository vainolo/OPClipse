package validator;

import java.util.*; 

import GenericItems.GenericThing;

public class RulesContainer {
	
	private Map<GenericThing, Map<GenericThing, List<Rule>>> rules = 
			new  HashMap<GenericThing, Map<GenericThing, List<Rule>>>();
	

	public boolean addRule(GenericThing itemA, GenericThing link, GenericThing itemB, 
			boolean value, boolean isSpecified, int PositiveParentCount) {
		// check if we have a hash entry for itemA
		if (! rules.containsKey(itemA) ) {
			HashMap<GenericThing, List<Rule>> newHash = new HashMap<GenericThing, List<Rule>>();
			rules.put(itemA, newHash);
		}
		
		// check if there is an entry for item b
		if (! rules.get(itemA).containsKey(itemB) ) {
			Rule newRule = new Rule(link, PositiveParentCount, isSpecified, value);
			List<Rule> newList = new ArrayList<Rule>();
			newList.add(newRule);
			rules.get(itemA).put(itemB, newList);
		}
		// b exists - add to rule set if doesn't already exists
		else {
			if (this.contains(itemA,link,itemB)) {
				return false;
			}
			Rule newRule = new Rule(link,PositiveParentCount,isSpecified,value);
			rules.get(itemA).get(itemB).add(newRule);
		}
		
		return true;
	}
	
	public boolean contains(GenericThing from, GenericThing link, GenericThing to) {
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
