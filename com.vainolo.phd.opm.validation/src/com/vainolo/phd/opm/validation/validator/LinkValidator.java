package com.vainolo.phd.opm.validation.validator;


import com.vainolo.phd.opm.validation.GenericItems.GenericThing;
import com.vainolo.phd.opm.validation.ruleContainers.LinkRulesContainer;
import com.vainolo.phd.opm.validation.rules.GenericLinkRule;




public class LinkValidator extends BaseValidator{
	
	
	public LinkValidator(){
		super();
		LinkRulesContainer container = new LinkRulesContainer();
		this.rulesMat = container;
	}
	
	// validate different signatures
	public boolean validate (Object from, Object link) {
		if (! initDone) {
			return false;
		}
		
		return ((LinkRulesContainer)rulesMat).validate(from, link);
	}
	
	public boolean validate (Object from, Object link, Object to) {
		if (! initDone) {
			return false;
		}
		GenericLinkRule newRule = new GenericLinkRule(from,link,to);
		return rulesMat.validate(newRule);
	}
	
	public boolean valdidate (GenericThing from, GenericThing link) {
		if (! initDone) {
			return false;
		}
		return validate(from.GetType(), link.GetType());
	}
	
	public boolean valdidate (GenericThing from, GenericThing link, GenericThing to) {
		if (! initDone) {
			return false;
		}		
		return validate(from.GetType(),link.GetType(),to.GetType());
	}	
	public boolean addRule(GenericThing from, GenericThing link, GenericThing to, boolean value) {
		GenericLinkRule newRule = new GenericLinkRule(from, link, to);
		return rulesMat.addRule(newRule, value);
	}
}
