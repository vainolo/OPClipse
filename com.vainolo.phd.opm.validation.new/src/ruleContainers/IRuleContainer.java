package ruleContainers;

import rules.GenericRule;

public interface IRuleContainer {
	
	public boolean insertRule(GenericRule rule,boolean value, boolean isSpecified, 
			int PositiveParentCount, int negativeParentsCount);
	
	public boolean contains(GenericRule newRule);
	
	public boolean validate(GenericRule newRule);
	
	public boolean isSpecified(GenericRule newRule);
	
	public boolean getValue(GenericRule newRule);
	
	public boolean setValue(GenericRule newRule, boolean value);
	
	public int getPositiveParentsCount(GenericRule newRule);
	
	public boolean incrementPositiveParentsCount (GenericRule newRule);
	
	public boolean decrementPositiveParentsCount (GenericRule newRule);
	
	public int getNegativeParentsCount(GenericRule newRule) ;
	
	public boolean incrementNegativeParentsCount (GenericRule newRule);
	
	public boolean decrementNegativeParentsCount (GenericRule newRule);
	
}
