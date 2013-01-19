package com.vainolo.phd.opm.validation;

import com.vainolo.phd.opm.validation.ruleContainers.BasicRulesContainer;
import com.vainolo.phd.opm.validation.rules.BasicRule;


public abstract class BaseValidator<T extends BasicRulesContainer<TRule>, TRule extends BasicRule> {
	protected final T rulesMat;

	protected boolean initDone;
	
	protected BaseValidator(T rulesMat){
		this.rulesMat = rulesMat;
		this.initDone = false;
	}
	
	public boolean finalizeInit () throws Exception{
		if (this.initDone) {
			return false;
		}
		rulesMat.testForConflictedRules();
		this.initDone = true;
		return true;
	}
	
}
