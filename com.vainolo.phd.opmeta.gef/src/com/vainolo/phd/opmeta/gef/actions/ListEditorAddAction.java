package com.vainolo.phd.opmeta.gef.actions;

import org.eclipse.gef.commands.Command;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import com.vainolo.phd.opmeta.gef.editor.IListEditor;

public class ListEditorAddAction extends Action {

	public static final String ADD_ID = "LIST_ADD";
	private IListEditor activeListEditor = null;

	public ListEditorAddAction() {
		super();
		setId(ADD_ID);
		setText("add new");
		ISharedImages sharedImages = PlatformUI.getWorkbench()
				.getSharedImages();
		setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
		
		setEnabled(false);
	}
	
	public void setEditor(IListEditor listEditor){
		activeListEditor = listEditor;
		setEnabled(activeListEditor != null);
	}

	@Override public void run(){
	 	Command cmd = activeListEditor.getAddCommand();
	 	activeListEditor.getCommandStack().execute(cmd);
	 	activeListEditor.refresh();
	}
}
