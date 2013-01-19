package com.vainolo.phd.opm.validation;

public interface IContainmentRule {
	boolean getValue();
	ElementType container();
	ElementType containedItem();
}
