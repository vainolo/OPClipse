package com.vainolo.phd.opmeta.gef.editor.input;

import java.util.List;

import com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule;

public class ContainmentValidationListEditorInput extends ListEditorInput<OPMetaModelContainmentValidationRule> {

	public ContainmentValidationListEditorInput(
			List<OPMetaModelContainmentValidationRule> list) {
		super(list);
	}
	
	public List<OPMetaModelContainmentValidationRule> getList(){
		return getData();
	}

}
