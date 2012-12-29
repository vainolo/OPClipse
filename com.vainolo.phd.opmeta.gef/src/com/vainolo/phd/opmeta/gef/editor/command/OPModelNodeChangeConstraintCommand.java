package com.vainolo.phd.opmeta.gef.editor.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opmodel.model.NodeInstance;

public class OPModelNodeChangeConstraintCommand extends Command {

	private NodeInstance node;
	public NodeInstance getNode() {
		return node;
	}
	public void setNode(NodeInstance node) {
		this.node = node;
	}
	public Rectangle getConstraint() {
		return newConstraint;
	}
	public void setConstraint(final Rectangle newConstraint) {
		this.newConstraint = newConstraint;
	}
	private Rectangle newConstraint;
	private Rectangle oldConstraint;
	
	/**
	   * The command can be executed when all parameters have been set.
	   */
	  @Override
	  public boolean canExecute() {
	    return node != null && newConstraint != null;
	  }

	  /**
	   * Ther command can be undone if the node and old constraints are set.
	   */
	  @Override
	  public boolean canUndo() {
	    return node != null && oldConstraint != null;
	  }

	  /**
	   * Save the old constraints and set new new constraints for the {@link OPMNode}.
	   */
	  @Override
	  public void execute() {
	    oldConstraint = node.getConstraints();
	    node.setConstraints(newConstraint);
	  }

	  /**
	   * Restore the saved constraints to the {@link OPMNode}.
	   */
	  @Override
	  public void undo() {
	    node.setConstraints(oldConstraint);
	  }

}
