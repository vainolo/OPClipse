package com.vainolo.phd.opmeta.gef.editor;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.part.EditorPart;

public abstract class TableEditorPart extends EditorPart {

	private TableViewer viewer;
	
	@Override public void doSave(IProgressMonitor monitor) {}

	@Override public void doSaveAs() {}
	
	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@SuppressWarnings("rawtypes")
	protected abstract List getData();
	
	protected abstract void createColumns(final Composite parent, final TableViewer viewer);
	
	@Override
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout(1, false);
	    parent.setLayout(layout);
	    viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
	            | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
	        createColumns(parent, viewer);
	        final Table table = viewer.getTable();
	        table.setHeaderVisible(true);
	        table.setLinesVisible(true);

	        viewer.setContentProvider( ArrayContentProvider.getInstance());
	        // Get the content for the viewer, setInput will call getElements in the
	        // contentProvider
	        viewer.setInput(getData());
	        // Make the selection available to other views
	        
	     // Layout the viewer
	        GridData gridData = new GridData();
	        gridData.verticalAlignment = GridData.FILL;
	        gridData.grabExcessHorizontalSpace = true;
	        gridData.grabExcessVerticalSpace = true;
	        gridData.horizontalAlignment = GridData.FILL;
	        viewer.getControl().setLayoutData(gridData);
	}

	 protected TableViewerColumn createTableViewerColumn(String title, int bound, final int colNumber) {
		    final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
		        SWT.NONE);
		    final TableColumn column = viewerColumn.getColumn();
		    column.setText(title);
		    column.setWidth(bound);
		    column.setResizable(true);
		    column.setMoveable(true);
		    return viewerColumn;
		  }

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
		// Make the selection available to other views
	    getSite().setSelectionProvider(viewer);
	}

}
