package com.vainolo.phd.opm.validation.rules;

import java.util.ArrayList;

import com.vainolo.phd.opm.validation.ElementType;

public class LinkRule extends BasicRule {
	
	private ElementType link;
	private ElementType from;
	private ElementType to;
	
	public LinkRule (ElementType from, ElementType link, ElementType to) {
		this.from	 	= from;
		this.link		= link;
		this.to			= to;
		// TODO : all these should get some default value
		// this.NegativeParentsCount = NegativeParentCount;
		// this.PositiveParentsCount = PositiveParentCount;
		// this.isSpecified = isSpecified;
		// this.value = value;
	}
	
	public LinkRule (ElementType from, ElementType link, ElementType to,  
			int PositiveParentCount, int NegativeParentCount, boolean isSpecified, boolean value) {
		this.from = from;
		this.link= link;
		this.to = to;
		this.NegativeParentsCount = NegativeParentCount;
		this.PositiveParentsCount = PositiveParentCount;
		this.isSpecified = isSpecified;
		this.value = value;
	}
	
	public ElementType From() {
		return this.from;
	}
	public ElementType To() {
		return this.to;
	}
	public ElementType Link() {
		return this.link;
	}
	
	public ArrayList<BasicRule> getAllSons() {
		if (this.derivedRules == null) {
			ArrayList<BasicRule> returnarray = new ArrayList<BasicRule>();
			for (ElementType fromSon: from.GetSonsOfType()) {
				LinkRule derivedRule = new LinkRule(fromSon,link,to); 
				returnarray.add(derivedRule);
			}
			for (ElementType linkSon: link.GetSonsOfType()) {
				LinkRule derivedRule = new LinkRule(from,linkSon,to); 
				returnarray.add(derivedRule);
			}
			for (ElementType toSon: to.GetSonsOfType()) {
				LinkRule derivedRule = new LinkRule(from,link,toSon); 
				returnarray.add(derivedRule);
			}
			this.derivedRules = returnarray;
		}
		return this.derivedRules;
	}
	@Override
	public boolean equals(BasicRule rule) {
		if (!(rule instanceof LinkRule)) {
			return false;
		}
		LinkRule linkRule = (LinkRule) rule;
		if (!linkRule.from.equals(this.from)) return false;
		if (!linkRule.to.equals(this.to)) return false;
		if (!linkRule.link.equals(this.link)) return false;
		return true;
	}
	public int hashCode() {
		int ret = 0;
		ret += (3* from.hashCode() 	) 	;
		ret += (5* to.hashCode() 	)	;
		ret += (7* link.hashCode() 	) 	;
		return ret;
	}
}

