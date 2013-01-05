package rules;

public class ValidationLinkRule extends GenericRule{
	
	private Class<?> linkType;

	public ValidationLinkRule(Class<?> link, int PositiveParentCount, int NegativeParentCount, boolean isSpecified, boolean value) {
		this.isSpecified 			= isSpecified;
		this.linkType 				= link;
		this.PositiveParentsCount 	= PositiveParentCount;
		this.NegativeParentsCount 	= NegativeParentCount;
		this.value					= value;
	}
	
	public Class<?> getLinkType() {
		return this.linkType;
	}
}

