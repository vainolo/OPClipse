package com.vainolo.phd.opmeta.gef.editor.policy;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.vainolo.phd.opmeta.gef.editor.command.OPModelNodeChangeConstraintCommand;
import com.vainolo.phd.opmeta.gef.editor.command.OPModelNodeCreateCommand;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelThingInstance;

public class OpXYLayoutEditPolicy extends XYLayoutEditPolicy {

	private static final Dimension DEFAULT_NODE_DIMENSION = new Dimension(50, 50);
	
	/**
	 * Command created to change the constraints of a {@link OpmodelNodeInstance} instance.
	 */
	@Override
	protected Command createChangeConstraintCommand(EditPart child, Object constraint) {
		if (!canGetChildCommand()) return UnexecutableCommand.INSTANCE;
		OPModelNodeChangeConstraintCommand command = new OPModelNodeChangeConstraintCommand();
		command.setNode((OpmodelNodeInstance) child.getModel());
		command.setConstraint((Rectangle) constraint);
		return command;
	}
	
	/**
	 * Command created to add new nodes to a container.
	 */
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		if (!canGetChildCommand()) return UnexecutableCommand.INSTANCE;
		
		OpmodelContainerInstance model = (OpmodelContainerInstance) getHost().getModel();
		
		Command retVal = null;

		if (request.getNewObjectType().equals(OpmodelNodeInstance.class) || request.getNewObjectType().equals(OpmodelThingInstance.class)) {
			
			// TODO : here should go some kind of validation
			OPModelNodeCreateCommand command = new OPModelNodeCreateCommand();
			Rectangle constraints = (Rectangle) getConstraintFor(request);
			if (constraints.getSize().isEmpty()) {
				constraints.setSize(DEFAULT_NODE_DIMENSION);
			}
			command.setConstraints(constraints);
			command.setContainer(model);
			command.setNode((OpmodelNodeInstance) request.getNewObject());
			retVal = command;
		}
		return retVal;		
	}

	private boolean canGetChildCommand(){
		return (getHost().getModel() instanceof OpmodelContainerInstance);
	}
}
