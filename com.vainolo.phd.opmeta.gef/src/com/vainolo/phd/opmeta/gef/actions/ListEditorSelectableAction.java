package com.vainolo.phd.opmeta.gef.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;

import com.vainolo.phd.opmeta.gef.editor.IListEditor;

public class ListEditorSelectableAction extends Action {

	protected IListEditor activeListEditor = null;
	private ListEditorDeleteActionSelectionChangedListener selectionListener= new ListEditorDeleteActionSelectionChangedListener();
	
	public ListEditorSelectableAction(){
		super();
		setEnabled(false);
	}
	
	public void setEditor(IListEditor listEditor){
		if (activeListEditor != null){
			activeListEditor.removeSelectionChangedListener(selectionListener);
		}
		activeListEditor = listEditor;
		setEnabled(false);
		if (activeListEditor !=null){
			activeListEditor.addSelectionChangedListener(selectionListener);
		}
	}
	
	private void onSelectionChanged(SelectionChangedEvent event){
		if (activeListEditor == null){
			setEnabled(false);
			return;
		}
		ISelection selection = event.getSelection();
		if (selection != null){
			if (selection instanceof IStructuredSelection){
				setEnabled(!((IStructuredSelection)selection).isEmpty());
			} else {
				setEnabled(true);
			}
		} else setEnabled(false);
	}
	
	private class ListEditorDeleteActionSelectionChangedListener implements ISelectionChangedListener{
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			onSelectionChanged(event);
		}
	}
}
