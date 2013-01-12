package com.vainolo.phd.opmeta.gef.editor.dialogs;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;

public class EditLinkValidationRuleDialog extends AddLinkValidationRuleDialog {

	private OPMetaModelLinkValidationRule editedRule;
	
	public EditLinkValidationRuleDialog(Shell parentShell, OPMetaModelLinkValidationRule editedRule) {
		super(parentShell);
		this.editedRule = editedRule;
	}

	@Override
	  protected Control createContents(Composite parent) {
	    Control contents = super.createContents(parent);
	    setTitle("Edit a Link Validation Rule");
	    setMessage("Please change the data of the Link Validation Rule",
	        IMessageProvider.INFORMATION);
	    return contents;
	  }
	
	@Override
	  protected Control createDialogArea(Composite parent) {
		super.createDialogArea(parent);
	    sourceTypeNameTxt.setText(editedRule.getSourceTypeName());
	    targetTypeNameTxt.setText(editedRule.getTargetTypeName());
	    linkTypeNameTxt.setText(editedRule.getLinkTypeName());
	    if (editedRule.isValid())
	    	cmbIsValid.select(0);
	    else
	    	cmbIsValid.select(1);
	    return parent;
	}
}
