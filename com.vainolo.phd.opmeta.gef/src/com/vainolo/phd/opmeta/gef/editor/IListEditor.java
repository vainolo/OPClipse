package com.vainolo.phd.opmeta.gef.editor;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IEditorPart;

public interface IListEditor extends ISelectionProvider, IEditorPart{

	CommandStack getCommandStack();
	
	Command getDeleteCommand();
	
	Command getAddCommand();
	
	Command getEditCommand();
	
	void refresh();
}
