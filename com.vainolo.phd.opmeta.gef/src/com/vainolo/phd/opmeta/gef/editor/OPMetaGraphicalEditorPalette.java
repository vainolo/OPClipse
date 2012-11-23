package com.vainolo.phd.opmeta.gef.editor;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;

import com.vainolo.phd.opm.gef.editor.factory.LabelFactory;
import com.vainolo.phd.opm.gef.editor.factory.OPMAggregationLinkFactory;
import com.vainolo.phd.opm.gef.editor.factory.OPMExhibitionLinkFactory;
import com.vainolo.phd.opm.gef.editor.factory.OPMGeneralizationLinkFactory;
import com.vainolo.phd.opm.gef.editor.factory.OPMIdManager;
import com.vainolo.phd.opm.gef.editor.factory.OPMObjectFactory;
import com.vainolo.phd.opm.gef.editor.factory.OPMStateFactory;
import com.vainolo.phd.opm.gef.editor.tool.CreationAndDirectEditTool;

public class OPMetaGraphicalEditorPalette extends PaletteRoot {
	
	String iconsPath = "../../editor/icons/";
	PaletteGroup group;
	OPMIdManager opmIdManager;

	public OPMetaGraphicalEditorPalette(OPMIdManager opmIdManager){
		this.opmIdManager = opmIdManager;
		addGroup();
		addSelectionTool();
		addNodeTools();
		addOPMStructuralLinkTools();
	}

	private void addSelectionTool() {
		SelectionToolEntry entry = new SelectionToolEntry();
		group.add(entry);
		setDefaultEntry(entry);
	}

	private void addGroup() {
		group = new PaletteGroup("OPMeta Controls");
		add(group);
	}

	private void addNodeTools() {
		CreationToolEntry entry = new CreationToolEntry("Label", "Create new Label", new LabelFactory(opmIdManager),
														ImageDescriptor.createFromFile(	this.getClass(),
																iconsPath+"label.ico"),
														ImageDescriptor.createFromFile(	this.getClass(),
																iconsPath+"label.ico"));
		group.add(entry);

		entry = new CreationToolEntry("OPMObject", "Create a new Object", new OPMObjectFactory(opmIdManager),
										ImageDescriptor.createFromFile(this.getClass(), iconsPath+"object.ico"),
										ImageDescriptor.createFromFile(this.getClass(), iconsPath+"object.ico"));
		entry.setToolClass(CreationAndDirectEditTool.class);
		group.add(entry);

		entry = new CreationToolEntry("OPMState", "Create a new State", new OPMStateFactory(opmIdManager),
										ImageDescriptor.createFromFile(this.getClass(), iconsPath+"state.ico"),
										ImageDescriptor.createFromFile(this.getClass(), iconsPath+"state.ico"));
		entry.setToolClass(CreationAndDirectEditTool.class);
		group.add(entry);

	}

	/**
	 * Add tools to create structural links in the diagram.
	 */
	private void addOPMStructuralLinkTools() {
		ConnectionCreationToolEntry entry;
		entry = new ConnectionCreationToolEntry(
												"Aggregation",
												"Create a new Aggregation link",
												new OPMAggregationLinkFactory(opmIdManager),
												ImageDescriptor.createFromFile(this.getClass(), iconsPath+"aggregation.ico"),
												ImageDescriptor.createFromFile(this.getClass(), iconsPath+"aggregation.ico"));
		group.add(entry);

		entry = new ConnectionCreationToolEntry(
												"Exhibition",
												"Create a new Exhibition link",
												new OPMExhibitionLinkFactory(opmIdManager),
												ImageDescriptor.createFromFile(this.getClass(), iconsPath+"exhibition.ico"),
												ImageDescriptor.createFromFile(this.getClass(), iconsPath+"exhibition.ico"));
		group.add(entry);

		entry = new ConnectionCreationToolEntry("Generalization", "Create a new Generalization link",
												new OPMGeneralizationLinkFactory(opmIdManager),
												ImageDescriptor.createFromFile(	this.getClass(),
														iconsPath+"generalization.ico"),
												ImageDescriptor.createFromFile(	this.getClass(),
														iconsPath+"generalization.ico"));
		group.add(entry);
	}

}
