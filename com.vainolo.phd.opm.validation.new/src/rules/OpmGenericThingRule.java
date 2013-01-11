package rules;

import java.util.ArrayList;

public abstract class OpmGenericThingRule extends GenericRule {
	protected ArrayList<OpmGenericThingRule> derivedRules;
	public abstract ArrayList<OpmGenericThingRule> getAllSons();
	
}
