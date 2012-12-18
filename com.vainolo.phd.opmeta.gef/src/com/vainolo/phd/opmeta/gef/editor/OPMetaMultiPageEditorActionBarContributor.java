package com.vainolo.phd.opmeta.gef.editor;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IActionBars2;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.part.EditorActionBarContributor;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;

import com.vainolo.phd.opm.gef.editor.OPMGraphicalEditorActionBarContributor;

public class OPMetaMultiPageEditorActionBarContributor extends
		MultiPageEditorActionBarContributor {

	private OPMGraphicalEditorActionBarContributor opmBarContributor = new OPMGraphicalEditorActionBarContributor(); 
	
	private EditorActionBarContributor activeBarContributor=null;
	
	protected IActionBars actionBars;
	
	@Override
	public void setActivePage(IEditorPart activeEditor) {
		activeBarContributor = null;
		if (activeEditor instanceof OPMetaGraphicalEditor)
			activeBarContributor = opmBarContributor;
		
		if (activeBarContributor != null)
			activeBarContributor.setActiveEditor(activeEditor);
		
		contributeToMenu(actionBars.getMenuManager());
        contributeToToolBar(actionBars.getToolBarManager());
        if (actionBars instanceof IActionBars2) {
            contributeToCoolBar(((IActionBars2) actionBars).getCoolBarManager());
        }
        contributeToStatusLine(actionBars.getStatusLineManager());
	}

	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.removeAll();
		super.contributeToToolBar(toolBarManager);
		if (activeBarContributor != null) 
			activeBarContributor.contributeToToolBar(toolBarManager);
		
		toolBarManager.update(true);
	}

	public void init(IActionBars bars, IWorkbenchPage page) {
		actionBars = bars;
		super.init(bars, page); 
		opmBarContributor.init(bars, getPage());
		
	}

	public void dispose(){
		super.dispose();
		opmBarContributor.dispose();
	}

}
