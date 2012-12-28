/**
 * 
 */
package ruleContainers;

import rules.GenericRule;


/**
 * @author itcherno
 *
 */
public abstract class BasicRulesContainer implements IRuleContainer {

	/* (non-Javadoc)
	 * @see ruleContainers.IRuleContainer#insertRule(rules.GenericRule, boolean, boolean, int, int)
	 */

	@Override
	public boolean insertRule(GenericRule rule, boolean value, boolean isSpecified, 
			int PositiveParentCount, int negativeParentsCount) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ruleContainers.IRuleContainer#contains(rules.GenericRule)
	 */
	@Override
	public boolean contains(GenericRule newRule) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ruleContainers.IRuleContainer#validate(rules.GenericRule)
	 */
	@Override
	public boolean validate(GenericRule newRule) {
		// TODO Auto-generated method stub
		return false;
	}


	/* (non-Javadoc)
	 * @see ruleContainers.IRuleContainer#isSpecified(rules.GenericRule)
	 */
	@Override
	public boolean isSpecified(GenericRule newRule) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ruleContainers.IRuleContainer#getValue(rules.GenericRule)
	 */
	@Override
	public boolean getValue(GenericRule newRule) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ruleContainers.IRuleContainer#setValue(rules.GenericRule, boolean)
	 */
	@Override
	public boolean setValue(GenericRule newRule, boolean value) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ruleContainers.IRuleContainer#getPositiveParentsCount(rules.GenericRule)
	 */
	@Override
	public int getPositiveParentsCount(GenericRule newRule) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see ruleContainers.IRuleContainer#incrementPositiveParentsCount(rules.GenericRule)
	 */
	@Override
	public boolean incrementPositiveParentsCount(GenericRule newRule) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ruleContainers.IRuleContainer#decrementPositiveParentsCount(rules.GenericRule)
	 */
	@Override
	public boolean decrementPositiveParentsCount(GenericRule newRule) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ruleContainers.IRuleContainer#getNegativeParentsCount(rules.GenericRule)
	 */
	@Override
	public int getNegativeParentsCount(GenericRule newRule) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see ruleContainers.IRuleContainer#incrementNegativeParentsCount(rules.GenericRule)
	 */
	@Override
	public boolean incrementNegativeParentsCount(GenericRule newRule) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ruleContainers.IRuleContainer#decrementNegativeParentsCount(rules.GenericRule)
	 */
	@Override
	public boolean decrementNegativeParentsCount(GenericRule newRule) {
		// TODO Auto-generated method stub
		return false;
	}
	protected abstract GenericRule getSpecificRule(GenericRule newLinkRule);
}
