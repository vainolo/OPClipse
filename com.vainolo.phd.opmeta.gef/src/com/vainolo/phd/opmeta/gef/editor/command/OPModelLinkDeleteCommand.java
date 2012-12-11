package com.vainolo.phd.opmeta.gef.editor.command;

import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;

public class OPModelLinkDeleteCommand extends Command {
	private OpmodelNodeInstance source;
	private OpmodelNodeInstance target;
	private OpmodelLinkInstance link;
	private OpmodelContainerInstance container;
	
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
		container.removeLink(link);
	}

	/**
	 * Reconnect the link to the source and target and add it to the owner OPD.
	 */
	@Override
	public void undo() {
		link.setSource(source);
	    link.setTarget(target);
	    container.addLink(link);
	}
	
	
	public OpmodelLinkInstance getLink() {
		return link;
	}
	public void setLink(OpmodelLinkInstance link) {
		this.link = link;
	}
	
	
}
