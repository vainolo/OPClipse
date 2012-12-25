package com.vainolo.phd.opmeta.gef.editor;

import java.util.EventObject;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackEvent;
import org.eclipse.gef.commands.CommandStackEventListener;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.EditorPart;

public abstract class TableEditorPart extends EditorPart implements IListEditor,CommandStackListener,CommandStackEventListener, IOuterSavable {

	private TableViewer viewer;
	private CommandStack commandStack;
	
	public TableEditorPart(){
		super();
		commandStack = new CommandStack();
		commandStack.addCommandStackListener(this);
		commandStack.addCommandStackEventListener(this);
		commandStack.setUndoLimit(100);
	}
	
	@Override public void doSave(IProgressMonitor monitor) {}

	@Override public void doSaveAs() {}
	
	@Override
	public boolean isDirty() {
		return commandStack.isDirty();
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
	    
	    // create table
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
	        getSite().setSelectionProvider(viewer);
	     
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
	
	//Used to update the viewer from outsite
	public void refresh() {
	  viewer.refresh();
	} 
	
	/**
	* Fire a {@link IEditorPart#PROP_DIRTY} property change and call super implementation.
	*/
	@Override
	public void commandStackChanged(EventObject event) {
		firePropertyChange(PROP_DIRTY);
	}
	
	@Override
	public void stackChanged(CommandStackEvent event){
		if (event.isPostChangeEvent()) refresh();
	}
	
	@Override public void beforeSave() {}

	@Override public void afterSave() {
		commandStack.markSaveLocation();
	}
	
	public CommandStack getCommandStack(){
		return commandStack;
	}
	
    public void addSelectionChangedListener(ISelectionChangedListener listener){
    	viewer.addSelectionChangedListener(listener);
    }

    public ISelection getSelection(){
    	return viewer.getSelection();
    }

    public void removeSelectionChangedListener(ISelectionChangedListener listener){
    	viewer.removeSelectionChangedListener(listener);
    }

    public void setSelection(ISelection selection){
    	viewer.setSelection(selection);
    }
}
