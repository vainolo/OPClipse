// http://martinfowler.com/apsupp/spec.pdf

package com.vainolo.phd.opm.validation.Specification;

public interface ISpecification<T> {
	 boolean IsSatisfiedBy(T candidate);
     ISpecification<T> And(ISpecification<T> other);
     ISpecification<T> Or(ISpecification<T> other);
     ISpecification<T> Not();
}
