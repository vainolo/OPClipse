package com.vainolo.phd.opmeta.gef.editor.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;

public class OPModelNodeCreateCommand extends Command {

	private OpmodelContainerInstance container;
	private Rectangle constraints;
	private OpmodelNodeInstance node;
	
	public Rectangle getConstraints() {
		return constraints;
	}

	public void setConstraints(Rectangle constraints) {
		this.constraints = constraints;
	}
	
	public OpmodelContainerInstance getContainer() {
		return container;
	}

	public void setContainer(OpmodelContainerInstance container) {
		this.container = container;
	}

	public OpmodelNodeInstance getNode() {
		return node;
	}

	public void setNode(OpmodelNodeInstance node) {
		this.node = node;
	}
	
	/**
	 * The command can be executed if all parameters have been set.
	 */
	@Override
	public boolean canExecute() {
		return node != null && constraints != null && container != null;
	}

	/**
	 * Set the constraints for the {@link OPMNode} and add it to the container {@link OPMObjectProcessDiagram}.
	 */
	@Override
	public void execute() {
		node.setConstraints(constraints);
		container.getNodes().add(node);
	}
	
	/**
	 * Remove the {@link OPMNode} from the container {@link OPMObjectProcessDiagram}.
	 */
	@Override
	public void undo() {
		container.getNodes().remove(node);
	}
}
