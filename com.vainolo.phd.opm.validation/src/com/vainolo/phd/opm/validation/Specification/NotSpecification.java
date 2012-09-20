package com.vainolo.phd.opm.validation.Specification;

public final class NotSpecification<T> extends CompositeSpecification<T> {

	private ISpecification<T> wrapped;
	
	public NotSpecification(ISpecification<T> wrapped){
		this.wrapped = wrapped;
	}
	
	@Override public boolean IsSatisfiedBy(T candidate) { return !wrapped.IsSatisfiedBy(candidate); }
}
