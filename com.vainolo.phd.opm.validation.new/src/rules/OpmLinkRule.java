package rules;

public class OpmLinkRule extends GenericRule {
	Class<?> from;
	Class<?> link;
	Class<?> to;
	public OpmLinkRule (Class<?> from, Class<?> link, Class<?> to) {
		this.from = from;
		this.link = link;
		this.to = to;
	}
	public Class<?> From() {
		return this.from;
	}
	public Class<?> Link() {
		return this.link;
	}
	public Class<?> To() {
		return this.to;
	}
}
