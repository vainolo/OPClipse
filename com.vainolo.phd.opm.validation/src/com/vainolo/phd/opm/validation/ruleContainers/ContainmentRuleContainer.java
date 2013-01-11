package com.vainolo.phd.opm.validation.ruleContainers;

import com.vainolo.phd.opm.validation.rules.GenericRule;

public class ContainmentRuleContainer extends BasicRulesContainer {

	@Override
	protected GenericRule getSpecificRule(GenericRule newLinkRule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertRule(GenericRule rule, boolean value,
			boolean isSpecified, int PositiveParentCount,
			int negativeParentsCount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(GenericRule newRule) {
		// TODO Auto-generated method stub
		return false;
	}

}
