package com.vainolo.phd.opmeta.gef.editor;

import java.util.List;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;

import com.vainolo.phd.opmeta.gef.editor.input.LinkValidationListEditorInput;
import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;

public class LinkValidationTableEditorPart extends TableEditorPart {
	
	
	private List<OPMetaModelLinkValidationRule> list;
	
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		if (!(input instanceof LinkValidationListEditorInput)) 
			throw new PartInitException("Unknown input type");
		setSite(site);
	    setInput(input);
	}
	
	@Override
	protected void setInput(IEditorInput input){
		super.setInput(input);
		list = ((LinkValidationListEditorInput)input).getList();
	}
	
	// This will create the columns for the table
	@Override protected void createColumns(final Composite parent, final TableViewer viewer) {
	    String[] titles = { "Source Type", "Target Type", "Link Type", "Is Valid" };
	    int[] bounds = { 100, 100, 100, 100 };

	    // First column is for the source type name
	    TableViewerColumn col = createTableViewerColumn(titles[0], bounds[0], 0);
	    col.setLabelProvider(new ColumnLabelProvider() {
	      @Override
	      public String getText(Object element) {
	    	  OPMetaModelLinkValidationRule p = (OPMetaModelLinkValidationRule) element;
	        return p.getSourceTypeName();
	      }
	    });

	    // Second column is for the target type name
	    col = createTableViewerColumn(titles[1], bounds[1], 1);
	    col.setLabelProvider(new ColumnLabelProvider() {
	      @Override
	      public String getText(Object element) {
	    	  OPMetaModelLinkValidationRule p = (OPMetaModelLinkValidationRule) element;
		        return p.getTargetTypeName();
	      }
	    });

	    // Third column is for the link type name
	    col = createTableViewerColumn(titles[2], bounds[2], 2);
	    col.setLabelProvider(new ColumnLabelProvider() {
	      @Override
	      public String getText(Object element) {
	    	  OPMetaModelLinkValidationRule p = (OPMetaModelLinkValidationRule) element;
		        return p.getLinkTypeName();
	      }
	    });

	    // Forth column is for Is Valid
	    col = createTableViewerColumn(titles[3], bounds[3], 3);
	    col.setLabelProvider(new ColumnLabelProvider() {
	      @Override
	      public String getText(Object element) {
	    	  OPMetaModelLinkValidationRule p = (OPMetaModelLinkValidationRule) element;
	    	  if (p.isIsValid()) return "True";
	    	  return "False";
	      }
	    });
	  }
	
	 @Override protected List<OPMetaModelLinkValidationRule> getData() {return list;} 
}
