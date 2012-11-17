package validator;

import GenericItems.GenericThing;

public class Rule {
	
	private GenericThing linkType;
	private int PositiveParentsCount;
	private boolean isSepcified;
	public boolean value;
	
	public boolean getValue() {
		return value;
	}
	
	public boolean setValue(boolean newValue) {
		this.value = newValue;
		return true;
	}
	
	public int getPositiveParentsCount() {
		return PositiveParentsCount;
	}
	
	public boolean decrementPositiveParents() {
		if (PositiveParentsCount > 0 ) {
			PositiveParentsCount++;
		}
		return true;
	}
	
	public boolean incrementPositiveParents() {
		PositiveParentsCount++;
		return true;
	}
	
	public Rule(GenericThing link, int PositiveParentCount, boolean isSpecified, boolean value) {
		this.isSepcified 			= isSpecified;
		this.linkType 				= link;
		this.PositiveParentsCount 	= PositiveParentCount;
		this.value					= value;
	}
	
	public boolean getrIsSpecified(){
		return this.isSepcified;
	}
	
	public GenericThing getLinkType() {
		return this.linkType;
	}
}

