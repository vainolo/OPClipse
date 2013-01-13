package com.vainolo.phd.opm.validation;

import org.eclipse.emf.ecore.EClass;

public interface OpmValidator {

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpmValidator eINSTANCE = com.vainolo.phd.opm.validation.impl.OpmValidatorImpl.init();
	
	boolean validateLink(EClass fromType, EClass linkType);
	
	boolean validateLink(EClass fromType, EClass toType, EClass linkType);
	
	boolean validateContaiment(EClass container, EClass node);
	
}
