package com.vainolo.phd.opm.gef.decorationLayer;

import com.vainolo.phd.opm.model.Label;

public class LabelDecorator extends OPMNodeDecorator<Label> implements Label{
	LabelDecorator(Label decorated, DecorationsBank decorationsBank) {
		super(decorated, decorationsBank);
	}
}