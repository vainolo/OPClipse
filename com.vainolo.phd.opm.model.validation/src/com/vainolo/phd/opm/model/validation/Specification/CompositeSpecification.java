package com.vainolo.phd.opm.model.validation.Specification;

public abstract class CompositeSpecification<T> implements ISpecification<T> {

	@Override
	public abstract boolean IsSatisfiedBy(T candidate);

	@Override
	public ISpecification<T> And(ISpecification<T> other) {
		return new AndSpecification<T>(this, other);
	}

	@Override
	public ISpecification<T> Or(ISpecification<T> other) {
		return new OrSpecification<>(this, other);
	}

	@Override
	public ISpecification<T> Not() {
		return new NotSpecification<>(this);
	}
	
}
