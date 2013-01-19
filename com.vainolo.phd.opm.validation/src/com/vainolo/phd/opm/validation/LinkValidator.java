package com.vainolo.phd.opm.validation;

import java.util.ArrayList;
import java.util.Collections;

import com.vainolo.phd.opm.validation.ruleContainers.LinkRulesContainer;
import com.vainolo.phd.opm.validation.rules.LinkRule;

public class LinkValidator extends BaseValidator<LinkRulesContainer, LinkRule>{
	
	public LinkValidator(){
		super(new LinkRulesContainer());
	}
	
	// validate different signatures
	public boolean valdidate (ElementType from, ElementType link) {
		if (! initDone) {
			return false;
		}
		return rulesMat.validate(from, link);
	}
	
	public boolean valdidate (ElementType from, ElementType link, ElementType to) {
		if (! initDone) {
			return false;
		}		
		return rulesMat.validate(new LinkRule(from,link,to));
	}	
	
	public boolean addRule(ElementType from, ElementType link, ElementType to, boolean value) {
		LinkRule newRule = new LinkRule(from, link, to);
		return rulesMat.addRule(newRule, value);
	}
	
	// TODO : find better name
	public Iterable<ILinkRule> getLeafRules(){
		if (!this.initDone) return Collections.emptyList();
		
		return new ArrayList<ILinkRule>(rulesMat.getLeafRules());
	}
}
