package com.vainolo.phd.opmeta.gef.actions;

import org.eclipse.gef.commands.Command;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class ListEditorDeleteAction extends ListEditorSelectableAction {

	public static final String DELETE_ID = "LIST_DELETE";

	public ListEditorDeleteAction() {
		super();
		setId(DELETE_ID);
		setText("delete");
		ISharedImages sharedImages = PlatformUI.getWorkbench()
				.getSharedImages();
		setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
		setDisabledImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
		
		setEnabled(false);
	}

	@Override
	public void run() {
		if (activeListEditor != null){
			Command command =  activeListEditor.getDeleteCommand();
			activeListEditor.getCommandStack().execute(command);
			activeListEditor.refresh();
		}
	}	
}
