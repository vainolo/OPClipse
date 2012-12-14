package com.vainolo.phd.opmeta.gef.editor.input;

import java.util.List;

import com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule;

public class ContaimentValidationListEditorInput extends ListEditorInput<OPMetaModelContaimentValidationRule> {

	public ContaimentValidationListEditorInput(
			List<OPMetaModelContaimentValidationRule> list) {
		super(list);
	}
	
	public List<OPMetaModelContaimentValidationRule> getList(){
		return getData();
	}

}
