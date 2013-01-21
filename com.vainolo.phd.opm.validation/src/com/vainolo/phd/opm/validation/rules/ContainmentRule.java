package com.vainolo.phd.opm.validation.rules;

import java.util.ArrayList;

import com.vainolo.phd.opm.validation.ElementType;
import com.vainolo.phd.opm.validation.IContainmentRule;

public class ContainmentRule extends BasicRule implements IContainmentRule{

	private ElementType container;
	private ElementType containedItem;
	
	public ContainmentRule (ElementType container, ElementType containedItem) {
		this.container	 	= container;
		this.containedItem	= containedItem;
		// default value for the remaining fields - if  object is built using this constructor these fields 
		// won't be used
		 this.NegativeParentsCount 	= 0;
		 this.PositiveParentsCount 	= 0;
		 this.isSpecified 			= false;
		 this.value 				= false;
	}
	
	public ContainmentRule (ElementType container, ElementType containedItem,  
			int PositiveParentCount, int NegativeParentCount, boolean isSpecified, boolean value) {
		this.container  	= container;
		this.containedItem	= containedItem;
		this.NegativeParentsCount = NegativeParentCount;
		this.PositiveParentsCount = PositiveParentCount;
		this.isSpecified = isSpecified;
		this.value = value;
	}
	
	public ElementType container() {
		return this.container;
	}
	public ElementType containedItem() {
		return this.containedItem;
	}
	@Override
	public ArrayList<BasicRule> getAllSons() {
		if (this.derivedRules == null) {
			ArrayList<BasicRule> returnarray = new ArrayList<BasicRule>();
			for (ElementType containerSon: container.GetSonsOfType()) {
				ContainmentRule derivedRule = new ContainmentRule(containerSon,containedItem); 
				returnarray.add(derivedRule);
			}
			for (ElementType containedItemSon: containedItem.GetSonsOfType()) {
				ContainmentRule derivedRule = new ContainmentRule(container,containedItemSon); 
				returnarray.add(derivedRule);
			}
			this.derivedRules = returnarray;
		}
		return this.derivedRules;
	}
	@Override
	public boolean equals(Object rule) {
		if (!(rule instanceof ContainmentRule)) {
			return false;
		}
		ContainmentRule containmentRule = (ContainmentRule) rule;
		if (!containmentRule.container.equals(this.container)) return false;
		if (!containmentRule.containedItem.equals(this.containedItem)) return false;
		return true;
	}
	@Override
	public int hashCode() {
		int ret = 0;
		ret += (3* container.hashCode() 	) 	;
		ret += (5* containedItem.hashCode() )	;
		return ret;
	}

	@Override
	public String toString() {
		return container.getTypeName() + " contains " + containedItem.getTypeName();
	}

}
