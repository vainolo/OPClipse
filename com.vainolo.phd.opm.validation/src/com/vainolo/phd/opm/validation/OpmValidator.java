package com.vainolo.phd.opm.validation;

public interface OpmValidator {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpmValidator eINSTANCE = null;// TODO : this needs init!!!
	
	boolean validateLink(Class<?> fromType, Class<?> linkType);
	
	boolean validateLink(Class<?> fromType, Class<?> toType, Class<?> linkType);
	
	boolean validateContaiment(Class<?> container, Class<?> node);
	
}
