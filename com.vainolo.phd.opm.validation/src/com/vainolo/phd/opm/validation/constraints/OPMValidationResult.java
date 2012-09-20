package com.vainolo.phd.opm.validation.constraints;

enum OPMValidationResult{
	/**
	 * When the constraint cannot validate the Expression
	 */
	NoResult,
	
	/**
	 * The Given expression is valid according to the constraint
	 */
	Valid,
	
	/**
	 * The given expression is not valid according to the constraint
	 */
	InValid
	
	
}
