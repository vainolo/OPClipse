package com.vainolo.phd.opmeta.gef.editor.command;

import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;

public class OPModelLinkDeleteCommand extends Command {
	private NodeInstance source;
	private NodeInstance target;
	private LinkInstance link;
	private ContainerInstance container;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean canExecute() {
		return link != null;
	}

	/**
	 * Disconnect link from source and target things and remove from owner OPD.
	 */
	@Override
	public void execute() {
		container = link.getContainer();
		source = link.getSource();
		target = link.getTarget();

		link.setSource(null);
		link.setTarget(null);
		container.getLinks().remove(link);
	}

	/**
	 * Reconnect the link to the source and target and add it to the owner OPD.
	 */
	@Override
	public void undo() {
		link.setSource(source);
	    link.setTarget(target);
	    container.getLinks().add(link);
	}
	
	
	public LinkInstance getLink() {
		return link;
	}
	public void setLink(LinkInstance link) {
		this.link = link;
	}
	
	
}
