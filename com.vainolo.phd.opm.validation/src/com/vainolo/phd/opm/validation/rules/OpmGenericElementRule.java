package com.vainolo.phd.opm.validation.rules;

import java.util.ArrayList;

public abstract class OpmGenericElementRule extends GenericRule {
	protected ArrayList<OpmGenericElementRule> derivedRules;
	public abstract ArrayList<OpmGenericElementRule> getAllSons();
	
}
