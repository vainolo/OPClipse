package com.vainolo.phd.opmeta.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;
import com.vainolo.phd.opmeta.gef.editor.command.OPModelNodeDeleteCommand;

public class OPModelNodeComponentEditPolicy extends ComponentEditPolicy {

	/**
	   * Create a command to delete a node. When a node is deleted all incoming and outgoing links are also deleted
	   * (functionality provided by the command). When a {@link OPMThing} node is deleted, there is special treatment for
	   * structural links that start and end at this node. If this node is source for a structural link, the
	   * {@link OPMStructuralLinkAggregator} of this link must be deleted. Also if this node is the target of the only
	   * outgoing link of a {@link OPMStructuralLinkAggregator}, the aggregator must be deleted.
	   * 
	   * @return a command that deletes a node and all other required diagram entities.
	   */
	  @Override
	  protected Command createDeleteCommand(GroupRequest deleteRequest) {
	    OpmodelNodeInstance nodeToDelete = (OpmodelNodeInstance) getHost().getModel();
	    return createRecursiveDeleteNodeCommand(nodeToDelete,(OpmodelContainerInstance)getHost().getParent().getModel());
	  }

	private Command createRecursiveDeleteNodeCommand(OpmodelNodeInstance nodeToDelete, OpmodelContainerInstance nodeContainer) {
		CompoundCommand compoundCommand = new CompoundCommand();

	    if(nodeToDelete instanceof OpmodelContainerInstance) {
	    	OpmodelContainerInstance container = (OpmodelContainerInstance) nodeToDelete;
	      for(OpmodelNodeInstance node : container.getNodes()) {
	        Command containedNodeDelete = createRecursiveDeleteNodeCommand(node,container);
	        compoundCommand.add(containedNodeDelete);
	      }
	    }
	    	
		OPModelNodeDeleteCommand deleteCommand = new OPModelNodeDeleteCommand();
		deleteCommand.setNode(nodeToDelete);
		deleteCommand.setContainer(nodeContainer);
		compoundCommand.add(deleteCommand);
		
		return compoundCommand;
	}
}
