package com.vainolo.phd.opm.validation.rules;

import java.util.ArrayList;

public abstract class GenericElementRule extends GenericRule {
	protected ArrayList<GenericElementRule> derivedRules;
	public abstract ArrayList<GenericElementRule> getAllSons();
	
}
