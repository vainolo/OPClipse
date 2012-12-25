package com.vainolo.phd.opmeta.gef.actions;

import org.eclipse.gef.commands.Command;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class ListEditorEditAction extends ListEditorSelectableAction {

	public static final String EDIT_ID = "LIST_EDIT";

	public ListEditorEditAction() {
		super();
		setId(EDIT_ID);
		setText("edit");
		ISharedImages sharedImages = PlatformUI.getWorkbench()
				.getSharedImages();
		setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_OBJ_FILE));
		
		setEnabled(false);
	}

	@Override
	public void run() {
		if (activeListEditor != null){
			Command command =  activeListEditor.getEditCommand();
			activeListEditor.getCommandStack().execute(command);
			activeListEditor.refresh();
		}
	}	

}
