package rules;

public class ValidationLinkRule extends GenericRule{
	
	private Class<?> linkType;
	private int PositiveParentsCount;
	private int NegativeParentsCount;
	private boolean isSpecified;
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
	
	public ValidationLinkRule(Class<?> link, int PositiveParentCount, int NegativeParentCount, boolean isSpecified, boolean value) {
		this.isSpecified 			= isSpecified;
		this.linkType 				= link;
		this.PositiveParentsCount 	= PositiveParentCount;
		this.NegativeParentsCount 	= NegativeParentCount;
		this.value					= value;
	}
	
	public boolean getIsSpecified(){
		return this.isSpecified;
	}
	
	public Class<?> getLinkType() {
		return this.linkType;
	}
}

