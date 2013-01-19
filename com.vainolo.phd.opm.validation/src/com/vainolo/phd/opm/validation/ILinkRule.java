package com.vainolo.phd.opm.validation;

public interface ILinkRule {
	boolean getValue();
	ElementType From();
	ElementType To();
	ElementType Link();
}
