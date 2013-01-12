package com.vainolo.phd.opmeta.gef.editor.input;

import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class ListEditorInput<T extends  Object> implements IEditorInput{

	private List<T> list;
	
	protected List<T> getData(){
		return list;
	}
	
	
	
	public ListEditorInput(List<T> list){
		this.list = list;
	}

	@Override
	public boolean exists() {
		return (list!=null);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		return null;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return null;
	}
}
