package com.vainolo.phd.opmeta.gef.editor;

import java.util.List;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;

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

	@Override
	protected void addNewLineRequest(){
		// TODO Auto-generated method stub
	}

	@Override
	protected void deleteLineRequest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void editLineRequest() {
		// TODO Auto-generated method stub
		
	}

}
