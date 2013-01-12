package com.vainolo.phd.opm.validation.rules;

import java.util.ArrayList;

import com.vainolo.phd.opm.validation.GenericItems.GenericThing;



public class GenericLinkRule extends GenericElementRule {
	
	private GenericThing link;
	private GenericThing from;
	private GenericThing to;
	private Object linkType;
	private Object fromType;
	private Object toType;
//	private OpmLinkRule  opmLinkRule;
	
	private GenericLinkRule (GenericThing from, GenericThing link, GenericThing to) {
		this.from	 	= from;
		this.link		= link;
		this.to			= to;
		this.fromType 	= from.GetType();
		this.toType 	= to.GetType();
		this.linkType 	= link.GetType();
	}
	
	public GenericLinkRule (Object from, Object link, Object to) {
		this.fromType 	= from;
		this.linkType 	= link;
		this.toType 	= to;
	}
	
	public GenericLinkRule (Object from, Object link, Object to,  
			int PositiveParentCount, int NegativeParentCount, boolean isSpecified, boolean value) {
		this.fromType 					= from;
		this.linkType 					= link;
		this.toType 					= to;
		this.NegativeParentsCount 		= NegativeParentCount;
		this.PositiveParentsCount		= PositiveParentCount;
		this.isSpecified				= isSpecified;
		this.value						= value;
	}
	
	public GenericThing From() {
		return this.from;
	}
	public GenericThing To() {
		return this.to;
	}
	public GenericThing Link() {
		return this.link;
	}
	public Object FromType() {
		return this.fromType;
	}
	public Object ToType() {
		return this.toType;
	}
	public Object LinkType() {
		return this.linkType;
	}

	
	public ArrayList<GenericElementRule> getAllSons() {
		if (this.derivedRules == null) {
			ArrayList<GenericElementRule> returnarray = new ArrayList<GenericElementRule>();
			for (GenericThing fromSon: from.GetSonsOfType()) {
				GenericLinkRule derivedRule = new GenericLinkRule(fromSon,link,to); 
				returnarray.add(derivedRule);
			}
			for (GenericThing linkSon: link.GetSonsOfType()) {
				GenericLinkRule derivedRule = new GenericLinkRule(from,linkSon,to); 
				returnarray.add(derivedRule);
			}
			for (GenericThing toSon: to.GetSonsOfType()) {
				GenericLinkRule derivedRule = new GenericLinkRule(from,link,toSon); 
				returnarray.add(derivedRule);
			}
			this.derivedRules = returnarray;
		}
		return this.derivedRules;
	}
	@Override
	public boolean equals(GenericRule rule) {
		if (!(rule instanceof GenericLinkRule)) {
			return false;
		}
		GenericLinkRule linkRule = (GenericLinkRule) rule;
		if (linkRule.FromType() != this.fromType) {
			return false;
		}
		if (linkRule.ToType() != this.toType) {
			return false;
		}
		if (linkRule.LinkType() != this.linkType) {
			return false;
		}
		return true;
	}
	public int hashCode() {
		int ret = 0;
		ret += (3* fromType.hashCode() 	) 	;
		ret += (5* toType.hashCode() 	)	;
		ret += (7* linkType.hashCode() 	) 	;
		return ret;
	}
}

