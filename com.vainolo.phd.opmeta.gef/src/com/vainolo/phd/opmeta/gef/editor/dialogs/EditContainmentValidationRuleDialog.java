package com.vainolo.phd.opmeta.gef.editor.dialogs;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule;

public class EditContainmentValidationRuleDialog extends
		AddContainmentValidationRuleDialog {

	private final OPMetaModelContainmentValidationRule editedRule;
	
	public EditContainmentValidationRuleDialog(Shell parentShell, final OPMetaModelContainmentValidationRule editedRule) {
		super(parentShell);
		this.editedRule = editedRule;
	}

	@Override
	  protected Control createContents(Composite parent) {
	    Control contents = super.createContents(parent);
	    setTitle("Edit a Containment Validation Rule");
	    setMessage("Please change the data of the Containment Validation Rule",
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
