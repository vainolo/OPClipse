package com.vainolo.phd.opmeta.gef.editor.dialogs;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;
import com.vainolo.phd.opmeta.model.opmetaFactory;

public class AddLinkValidationRuleDialog extends TitleAreaDialog {

	private Text sourceTypeNameTxt;
	private Text targetTypeNameTxt;
	private Text linkTypeNameTxt;
	private Combo cmbIsValid;
	private OPMetaModelLinkValidationRule rule;
	
	public AddLinkValidationRuleDialog(Shell parentShell) {
		super(parentShell);
	}
	
	@Override
	  protected Control createContents(Composite parent) {
	    Control contents = super.createContents(parent);
	    setTitle("Add a new Link Validation Rule");
	    setMessage("Please enter the data of the new Link Validation Rule",
	        IMessageProvider.INFORMATION);
	    return contents;
	  }
	
	@Override
	  protected Control createDialogArea(Composite parent) {
	    GridLayout layout = new GridLayout();
	    layout.numColumns = 2;
	    parent.setLayout(layout);
	    Label label1 = new Label(parent, SWT.NONE);
	    label1.setText("Source Type Name");
	    sourceTypeNameTxt = new Text(parent, SWT.BORDER);
	    Label label2 = new Label(parent, SWT.NONE);
	    label2.setText("Target Type Name");
	    targetTypeNameTxt = new Text(parent, SWT.BORDER);
	    Label label3 = new Label(parent, SWT.NONE);
	    label3.setText("Link Type Name");
	    linkTypeNameTxt = new Text(parent, SWT.BORDER);
	    Label label4 = new Label(parent, SWT.NONE);
	    label4.setText("Is Valid");
	    GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_END);
	    gd.horizontalSpan = 2;
	    cmbIsValid = new Combo(parent, SWT.READ_ONLY);
	    cmbIsValid.add("True",0);
	    cmbIsValid.add("False",1);
	    return parent;
	}

	@Override
	  protected void createButtonsForButtonBar(Composite parent) {
	    ((GridLayout) parent.getLayout()).numColumns++;

	    Button button = new Button(parent, SWT.PUSH);
	    button.setText("OK");
	    button.setFont(JFaceResources.getDialogFont());
	    button.addSelectionListener(new SelectionAdapter() {
	      public void widgetSelected(SelectionEvent e) {
	        if (sourceTypeNameTxt.getText().length() != 0
	            && targetTypeNameTxt.getText().length() != 0
	            && linkTypeNameTxt.getText().length() != 0) {
	        	rule = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
	        	rule.setSourceTypeName(sourceTypeNameTxt.getText());
	        	rule.setTargetTypeName(targetTypeNameTxt.getText());
	        	rule.setLinkTypeName(linkTypeNameTxt.getText());
	        	rule.setValid(cmbIsValid.getSelectionIndex()==0);
	          close();
	        } else {
	          setErrorMessage("Please enter all data");
	        }
	      }
	    });
	  }

	public OPMetaModelLinkValidationRule getRule(){return rule;}
	
}
