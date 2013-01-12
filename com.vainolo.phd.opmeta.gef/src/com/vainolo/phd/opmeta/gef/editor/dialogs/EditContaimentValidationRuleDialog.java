package com.vainolo.phd.opmeta.gef.editor.dialogs;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule;

public class EditContaimentValidationRuleDialog extends
		AddContaimentValidationRuleDialog {

	private final OPMetaModelContaimentValidationRule editedRule;
	
	public EditContaimentValidationRuleDialog(Shell parentShell, final OPMetaModelContaimentValidationRule editedRule) {
		super(parentShell);
		this.editedRule = editedRule;
	}

	@Override
	  protected Control createContents(Composite parent) {
	    Control contents = super.createContents(parent);
	    setTitle("Edit a Contaiment Validation Rule");
	    setMessage("Please change the data of the Contaiment Validation Rule",
	        IMessageProvider.INFORMATION);
	    return contents;
	  }
	
	@Override
	  protected Control createDialogArea(Composite parent) {
		super.createDialogArea(parent);
	    containerTypeNameTxt.setText(editedRule.getContainerTypeName());
	    nodeTypeNameTxt.setText(editedRule.getNodeTypeName());
	    if (editedRule.isValid())
	    	cmbIsValid.select(0);
	    else
	    	cmbIsValid.select(1);
	    return parent;
	}
}
