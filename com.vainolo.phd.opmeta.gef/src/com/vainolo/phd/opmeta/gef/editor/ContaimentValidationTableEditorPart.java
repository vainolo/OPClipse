package com.vainolo.phd.opmeta.gef.editor;

import java.util.Iterator;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;

import com.vainolo.phd.opmeta.gef.editor.command.OPMetaModelContaimentValidationRuleAddCommand;
import com.vainolo.phd.opmeta.gef.editor.command.OPMetaModelContaimentValidationRuleEditCommand;
import com.vainolo.phd.opmeta.gef.editor.command.OPMetaModelContaimentValidationRuleRemoveCommand;
import com.vainolo.phd.opmeta.gef.editor.dialogs.AddContaimentValidationRuleDialog;
import com.vainolo.phd.opmeta.gef.editor.dialogs.EditContaimentValidationRuleDialog;
import com.vainolo.phd.opmeta.gef.editor.input.ContaimentValidationListEditorInput;
import com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule;

public class ContaimentValidationTableEditorPart extends TableEditorPart {

	private List<OPMetaModelContaimentValidationRule> list;
	
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		if (!(input instanceof ContaimentValidationListEditorInput)) 
			throw new PartInitException("Unknown input type");
		setSite(site);
	    setInput(input);
	}
	
	@Override
	protected void setInput(IEditorInput input){
		super.setInput(input);
		list = ((ContaimentValidationListEditorInput)input).getList();
	}
	
	// This will create the columns for the table
	@Override protected void createColumns(final Composite parent, final TableViewer viewer) {
	    String[] titles = { "Container Type", "Node Type", "Is Valid" };
	    int[] bounds = { 100, 100, 100};

	    // First column is for the source type name
	    TableViewerColumn col = createTableViewerColumn(titles[0], bounds[0], 0);
	    col.setLabelProvider(new ColumnLabelProvider() {
	      @Override
	      public String getText(Object element) {
	    	  OPMetaModelContaimentValidationRule p = (OPMetaModelContaimentValidationRule) element;
	        return p.getContainerTypeName();
	      }
	    });

	    // Second column is for the target type name
	    col = createTableViewerColumn(titles[1], bounds[1], 1);
	    col.setLabelProvider(new ColumnLabelProvider() {
	      @Override
	      public String getText(Object element) {
	    	  OPMetaModelContaimentValidationRule p = (OPMetaModelContaimentValidationRule) element;
		        return p.getNodeTypeName();
	      }
	    });

	    // Third column is for Is Valid
	    col = createTableViewerColumn(titles[2], bounds[2], 2);
	    col.setLabelProvider(new ColumnLabelProvider() {
	      @Override
	      public String getText(Object element) {
	    	  OPMetaModelContaimentValidationRule p = (OPMetaModelContaimentValidationRule) element;
	    	  if (p.isValid()) return "True";
	    	  return "False";
	      }
	    });
	  }
	
	 @Override protected List<OPMetaModelContaimentValidationRule> getData() {return list;}
	
	@SuppressWarnings("unchecked")
	public Command getEditCommand(){
		CompoundCommand ccmd = new CompoundCommand();
		ISelection selection = getSite().getSelectionProvider()
		        .getSelection();
		if ((selection != null) && (selection instanceof IStructuredSelection)) {
			IStructuredSelection sel = (IStructuredSelection)selection;
			for (Iterator<OPMetaModelContaimentValidationRule> iterator = sel.iterator(); iterator.hasNext();) {
				OPMetaModelContaimentValidationRule orig = iterator.next(); 
				EditContaimentValidationRuleDialog dialog = new EditContaimentValidationRuleDialog(getSite().getShell(),orig);
				dialog.open();
				OPMetaModelContaimentValidationRule rule = dialog.getRule();
				ccmd.add(new OPMetaModelContaimentValidationRuleEditCommand(orig,rule));
			}
		}
		return ccmd;
	}

	public Command getAddCommand(){
		AddContaimentValidationRuleDialog dialog = new AddContaimentValidationRuleDialog(getSite().getShell());
		dialog.open();
		OPMetaModelContaimentValidationRule rule = dialog.getRule();
		return new OPMetaModelContaimentValidationRuleAddCommand(list,rule);
	}
	
	@SuppressWarnings("unchecked")
	public Command getDeleteCommand(){
		ISelection selection = getSite().getSelectionProvider().getSelection();
		CompoundCommand ccmd = new CompoundCommand();
		if ((selection == null) || !(selection instanceof IStructuredSelection)){ 
			IStructuredSelection sel = (IStructuredSelection)selection;
			for (Iterator<OPMetaModelContaimentValidationRule> iterator = sel.iterator(); iterator.hasNext();) {
				OPMetaModelContaimentValidationRule rule = iterator.next();
				ccmd.add(new OPMetaModelContaimentValidationRuleRemoveCommand(list,rule));
		    }
		}
		return ccmd;
	}
}
