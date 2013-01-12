package com.vainolo.phd.opmeta.gef.editor;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;

import com.vainolo.phd.opm.gef.editor.factory.OPMIdManager;
import com.vainolo.phd.opm.gef.editor.tool.CreationAndDirectEditTool;
import com.vainolo.phd.opmeta.gef.editor.factory.OpmodelCreationFactory;
import com.vainolo.phd.opmeta.interpreter.OpmodelFactory;
import com.vainolo.phd.opmodel.model.TypeDescriptor;
import com.vainolo.phd.opmodel.model.OPmetaDefinition;

public class OPModelGraphicalEditorPlatte extends PaletteRoot {

	private PaletteGroup group;
	private OPMIdManager opmIdManager;
	private OPmetaDefinition interpretation;
	private OpmodelFactory factory;

	public OPModelGraphicalEditorPlatte(OPmetaDefinition interpretation,OPMIdManager opmIdManager){
		this.opmIdManager = opmIdManager;
		this.interpretation = interpretation;
		factory = new OpmodelFactory(interpretation);
		addGroup();
		addSelectionTool();
		addNodeTools();
		addLinkTools();
	}
	
	private void addGroup() {
		group = new PaletteGroup("Controls");
		add(group);
	}
	
	private void addSelectionTool() {
		SelectionToolEntry entry = new SelectionToolEntry();
		group.add(entry);
		setDefaultEntry(entry);
	}
	
	private void addNodeTools(){
		CreationToolEntry entry;
		for (TypeDescriptor descriptor:interpretation.getNodes()){
			if (descriptor.isAbstract()) continue;
			entry = new CreationToolEntry(descriptor.getName(), "Create a new " + descriptor.getName(), 
					new OpmodelCreationFactory(factory,descriptor,opmIdManager),
					null, null); // TODO : get images?
			entry.setToolClass(CreationAndDirectEditTool.class);
			group.add(entry);
		}
	}
	
	private void addLinkTools(){
		CreationToolEntry entry;
		for (TypeDescriptor descriptor:interpretation.getLinks()){
			if (descriptor.isAbstract()) continue;
			entry = new ConnectionCreationToolEntry(descriptor.getName(), "Create a new " + descriptor.getName(), 
					new OpmodelCreationFactory(factory,descriptor,opmIdManager),
					null, null); // TODO : get images?
			group.add(entry);
		}
		addDescritonTools(interpretation.getLinks());
	}

	private void addDescritonTools(Iterable<TypeDescriptor> descriptions) {
		
	}
}
