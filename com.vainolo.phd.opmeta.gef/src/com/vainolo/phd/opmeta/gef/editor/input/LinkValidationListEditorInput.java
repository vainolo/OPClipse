package com.vainolo.phd.opmeta.gef.editor.input;

import java.util.List;

import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;

public class LinkValidationListEditorInput extends ListEditorInput<OPMetaModelLinkValidationRule> {

	public LinkValidationListEditorInput(
			List<OPMetaModelLinkValidationRule> list) {
		super(list);
	}
	
	public List<OPMetaModelLinkValidationRule> getList(){
		return getData();
	}

}
