package com.vainolo.phd.opm.model.validation.Specification;

public final class OrSpecification<T> extends CompositeSpecification<T> {

private ISpecification<T> left,right;
	
	public OrSpecification(ISpecification<T> left, ISpecification<T> right){
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean IsSatisfiedBy(T candidate) {
		return (left.IsSatisfiedBy(candidate) || right.IsSatisfiedBy(candidate));
	}
}
