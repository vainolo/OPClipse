package com.vainolo.phd.opm.validation.ruleContainers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vainolo.phd.opm.validation.rules.LinkRule;
import com.vainolo.phd.opm.validation.rules.BasicRule;

public class ContainmentRuleContainer extends BasicRulesContainer {
	
	private Map<Object, List<LinkRule>> rules = 
			new  HashMap<Object, List<LinkRule>>();
	
	@Override
	protected BasicRule getSpecificRule(BasicRule newLinkRule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertRule(BasicRule rule, boolean value,
			boolean isSpecified, int PositiveParentCount,
			int negativeParentsCount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(BasicRule newRule) {
		// TODO Auto-generated method stub
		return false;
	}

}
