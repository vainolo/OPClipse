package com.vainolo.phd.opm.validation.Specification;

public final class AndSpecification<T> extends CompositeSpecification<T> {

	private ISpecification<T> left,right;
	
	public AndSpecification(ISpecification<T> left, ISpecification<T> right){
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean IsSatisfiedBy(T candidate) {
		return (left.IsSatisfiedBy(candidate) && right.IsSatisfiedBy(candidate));
	}

}
