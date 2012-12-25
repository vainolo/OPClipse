package com.vainolo.phd.opmeta.gef.actions;

import java.util.EventObject;

import org.eclipse.gef.commands.CommandStackEvent;
import org.eclipse.gef.commands.CommandStackEventListener;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;

import com.vainolo.phd.opmeta.gef.editor.IListEditor;

public class ListEditorRedo extends Action implements CommandStackListener,CommandStackEventListener{
	
	public static final String REDO_ID = ActionFactory.REDO.getId();
	private IListEditor activeListEditor = null;

	public ListEditorRedo() {
		super();
		setId(REDO_ID);
		setText("redo");
		ISharedImages sharedImages = PlatformUI.getWorkbench()
				.getSharedImages();
		setImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));
		setDisabledImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_REDO_DISABLED));
		
		setEnabled(false);
	}
	
	public void setEditor(IListEditor listEditor){
		if (activeListEditor!= null){
			activeListEditor.getCommandStack().removeCommandStackEventListener(this);
			activeListEditor.getCommandStack().removeCommandStackListener(this);
		}
		activeListEditor = listEditor;
		if (activeListEditor == null){
			setEnabled(false);
		}else {
			activeListEditor.getCommandStack().addCommandStackEventListener(this);
			activeListEditor.getCommandStack().addCommandStackListener(this);
			updateEnabled();
		}
	}

	@Override public void run(){
		activeListEditor.getCommandStack().redo();
	}

	private void updateEnabled(){
		if (activeListEditor==null) setEnabled(false);
		else setEnabled(activeListEditor.getCommandStack().canRedo());
	}
	
	@Override
	public void stackChanged(CommandStackEvent event) {
		updateEnabled();
	}

	@Override
	public void commandStackChanged(EventObject event) {
		updateEnabled();
	}


}
