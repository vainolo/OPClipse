package com.vainolo.phd.opmeta.gef.actions;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.EditorActionBarContributor;

import com.vainolo.phd.opmeta.gef.editor.IListEditor;

public class OPTableEditorActionBarContributor extends
		EditorActionBarContributor {

	private IListEditor activeEditor = null;
	private ListEditorDeleteAction deleteAction = new ListEditorDeleteAction();
	private ListEditorAddAction addAction = new ListEditorAddAction();
	private ListEditorEditAction editAction = new ListEditorEditAction();
	private ListEditorUndo undoAction = new ListEditorUndo();
	private ListEditorRedo redoAction = new ListEditorRedo();
	
	@Override public void contributeToToolBar(IToolBarManager toolBarManager) {
		 super.contributeToToolBar(toolBarManager);
		 toolBarManager.add(undoAction);
		 toolBarManager.add(redoAction);
		 toolBarManager.add(deleteAction);
		 toolBarManager.add(addAction);
		 toolBarManager.add(editAction);
		 
    }
	
	@Override public void setActiveEditor(IEditorPart targetEditor) {
		if (!(targetEditor instanceof IListEditor)) throw new RuntimeException("Unhandled editor type");
		activeEditor = (IListEditor) targetEditor;
		deleteAction.setEditor(activeEditor);
		addAction.setEditor(activeEditor);
		editAction.setEditor(activeEditor);
		undoAction.setEditor(activeEditor);
		redoAction.setEditor(activeEditor);
    }
	
	
}
