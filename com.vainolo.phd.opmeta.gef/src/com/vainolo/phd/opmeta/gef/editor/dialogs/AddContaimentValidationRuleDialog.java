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

import com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule;
import com.vainolo.phd.opmeta.model.opmetaFactory;

public class AddContaimentValidationRuleDialog extends TitleAreaDialog {

	protected Text containerTypeNameTxt;
	protected Text nodeTypeNameTxt;
	protected Combo cmbIsValid;
	private OPMetaModelContaimentValidationRule rule;
	
	public AddContaimentValidationRuleDialog(Shell parentShell) {
		super(parentShell);
	}
	
	@Override
	  protected Control createContents(Composite parent) {
	    Control contents = super.createContents(parent);
	    setTitle("Add a new Contaiment Validation Rule");
	    setMessage("Please enter the data of the new Contaiment Validation Rule",
	        IMessageProvider.INFORMATION);
	    return contents;
	  }
	
	@Override
	  protected Control createDialogArea(Composite parent) {
	    GridLayout layout = new GridLayout();
	    layout.numColumns = 2;
	    parent.setLayout(layout);
	    Label label1 = new Label(parent, SWT.NONE);
	    label1.setText("Container Type Name");
	    containerTypeNameTxt = new Text(parent, SWT.BORDER);
	    Label label2 = new Label(parent, SWT.NONE);
	    label2.setText("Node Type Name");
	    nodeTypeNameTxt = new Text(parent, SWT.BORDER);
	    
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
	        if (containerTypeNameTxt.getText().length() != 0
	            && nodeTypeNameTxt.getText().length() != 0) {
	        	rule = opmetaFactory.eINSTANCE.createOPMetaModelContaimentValidationRule();
	        	rule.setContainerTypeName(containerTypeNameTxt.getText());
	        	rule.setNodeTypeName(nodeTypeNameTxt.getText());
	        	rule.setValid(cmbIsValid.getSelectionIndex()==0);
	          close();
	        } else {
	          setErrorMessage("Please enter all data");
	        }
	      }
	    });
	  }

	public OPMetaModelContaimentValidationRule getRule(){return rule;}
	
}
