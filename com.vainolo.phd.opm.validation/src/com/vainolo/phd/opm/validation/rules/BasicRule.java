package com.vainolo.phd.opm.validation.rules;

import java.util.ArrayList;

public abstract class BasicRule {
	protected int PositiveParentsCount;
	protected int NegativeParentsCount;
	protected boolean isSpecified;
	protected boolean value;
	protected ArrayList<BasicRule> derivedRules;
	
	public int getPositiveParentsCount() {
		return PositiveParentsCount;
	}
	
	public boolean getValue() {
		return value;
	}
	
	public boolean setValue(boolean newValue) {
		this.value = newValue;
		return true;
	}
	
	public boolean decrementPositiveParents() {
		if (PositiveParentsCount > 0 ) {
			PositiveParentsCount--;
		}
		return true;
	}
	
	public boolean incrementPositiveParents() {
		PositiveParentsCount++;
		return true;
	}
	
	public int getNegativeParentsCount() {
		return NegativeParentsCount;
	}
	
	public boolean decrementNegativeParents() {
		if (NegativeParentsCount > 0 ) {
			NegativeParentsCount--;
		}
		return true;
	}
	
	public boolean incrementNegativeParents() {
		NegativeParentsCount++;
		return true;
	}
	
	public boolean getIsSpecified(){
		return this.isSpecified;
	}
	
	public abstract boolean equals(BasicRule Rule);
		
	public abstract ArrayList<BasicRule> getAllSons();
}
