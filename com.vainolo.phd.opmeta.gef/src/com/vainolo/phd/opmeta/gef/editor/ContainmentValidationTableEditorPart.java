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

import com.vainolo.phd.opmeta.gef.editor.command.OPMetaModelContainmentValidationRuleAddCommand;
import com.vainolo.phd.opmeta.gef.editor.command.OPMetaModelContainmentValidationRuleEditCommand;
import com.vainolo.phd.opmeta.gef.editor.command.OPMetaModelContainmentValidationRuleRemoveCommand;
import com.vainolo.phd.opmeta.gef.editor.dialogs.AddContainmentValidationRuleDialog;
import com.vainolo.phd.opmeta.gef.editor.dialogs.EditContainmentValidationRuleDialog;
import com.vainolo.phd.opmeta.gef.editor.input.ContainmentValidationListEditorInput;
import com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule;

public class ContainmentValidationTableEditorPart extends TableEditorPart {

	private List<OPMetaModelContainmentValidationRule> list;
	
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		if (!(input instanceof ContainmentValidationListEditorInput)) 
			throw new PartInitException("Unknown input type");
		setSite(site);
	    setInput(input);
	}
	
	@Override
	protected void setInput(IEditorInput input){
		super.setInput(input);
		list = ((ContainmentValidationListEditorInput)input).getList();
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
	    	  OPMetaModelContainmentValidationRule p = (OPMetaModelContainmentValidationRule) element;
	        return p.getContainerTypeName();
	      }
	    });

	    // Second column is for the target type name
	    col = createTableViewerColumn(titles[1], bounds[1], 1);
	    col.setLabelProvider(new ColumnLabelProvider() {
	      @Override
	      public String getText(Object element) {
	    	  OPMetaModelContainmentValidationRule p = (OPMetaModelContainmentValidationRule) element;
		        return p.getNodeTypeName();
	      }
	    });

	    // Third column is for Is Valid
	    col = createTableViewerColumn(titles[2], bounds[2], 2);
	    col.setLabelProvider(new ColumnLabelProvider() {
	      @Override
	      public String getText(Object element) {
	    	  OPMetaModelContainmentValidationRule p = (OPMetaModelContainmentValidationRule) element;
	    	  if (p.isValid()) return "True";
	    	  return "False";
	      }
	    });
	  }
	
	 @Override protected List<OPMetaModelContainmentValidationRule> getData() {return list;}
	
	@SuppressWarnings("unchecked")
	public Command getEditCommand(){
		CompoundCommand ccmd = new CompoundCommand();
		ISelection selection = getSite().getSelectionProvider()
		        .getSelection();
		if ((selection != null) && (selection instanceof IStructuredSelection)) {
			IStructuredSelection sel = (IStructuredSelection)selection;
			for (Iterator<OPMetaModelContainmentValidationRule> iterator = sel.iterator(); iterator.hasNext();) {
				OPMetaModelContainmentValidationRule orig = iterator.next(); 
				EditContainmentValidationRuleDialog dialog = new EditContainmentValidationRuleDialog(getSite().getShell(),orig);
				dialog.open();
				OPMetaModelContainmentValidationRule rule = dialog.getRule();
				ccmd.add(new OPMetaModelContainmentValidationRuleEditCommand(orig,rule));
			}
		}
		return ccmd;
	}

	public Command getAddCommand(){
		AddContainmentValidationRuleDialog dialog = new AddContainmentValidationRuleDialog(getSite().getShell());
		dialog.open();
		OPMetaModelContainmentValidationRule rule = dialog.getRule();
		return new OPMetaModelContainmentValidationRuleAddCommand(list,rule);
	}
	
	@SuppressWarnings("unchecked")
	public Command getDeleteCommand(){
		ISelection selection = getSite().getSelectionProvider().getSelection();
		CompoundCommand ccmd = new CompoundCommand();
		if ((selection != null) && (selection instanceof IStructuredSelection)){ 
			IStructuredSelection sel = (IStructuredSelection)selection;
			for (Iterator<OPMetaModelContainmentValidationRule> iterator = sel.iterator(); iterator.hasNext();) {
				OPMetaModelContainmentValidationRule rule = iterator.next();
				ccmd.add(new OPMetaModelContainmentValidationRuleRemoveCommand(list,rule));
		    }
		}
		return ccmd;
	}
}
