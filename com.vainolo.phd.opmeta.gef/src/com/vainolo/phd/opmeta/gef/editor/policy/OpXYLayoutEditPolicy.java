package com.vainolo.phd.opmeta.gef.editor.policy;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.vainolo.phd.opmeta.gef.editor.command.OPModelNodeChangeConstraintCommand;
import com.vainolo.phd.opmeta.gef.editor.command.OPModelNodeCreateCommand;
import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;
import com.vainolo.phd.opmeta.interpreter.validation.OpmodelValidator;

public class OpXYLayoutEditPolicy extends XYLayoutEditPolicy {

	private static final Dimension DEFAULT_NODE_DIMENSION = new Dimension(50, 50);
	
	private final OpmodelValidator opmodelValidator;
	
	public OpXYLayoutEditPolicy(OpmodelValidator opmodelValidator){
		super();
		this.opmodelValidator = opmodelValidator;
	}
	
	/**
	 * Command created to change the constraints of a {@link OpmodelNodeInstance} instance.
	 */
	@Override
	protected Command createChangeConstraintCommand(EditPart child, Object constraint) {
		if (!canGetChildCommand()) return null;
		OPModelNodeChangeConstraintCommand command = new OPModelNodeChangeConstraintCommand();
		command.setNode((NodeInstance) child.getModel());
		command.setConstraint((Rectangle) constraint);
		return command;
	}
	
	/**
	 * Command created to add new nodes to a container.
	 */
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		if (!canGetChildCommand()) return null;
		
		ContainerInstance model = (ContainerInstance) getHost().getModel();
		
		Command retVal = null;

		NodeInstance newNode = (NodeInstance) request.getNewObject();
		if (opmodelValidator.validateContainment(model, newNode)){
			
			OPModelNodeCreateCommand command = new OPModelNodeCreateCommand();
			Rectangle constraints = (Rectangle) getConstraintFor(request);
			if (constraints.getSize().isEmpty()) {
				constraints.setSize(DEFAULT_NODE_DIMENSION);
			}
			command.setConstraints(constraints);
			command.setContainer(model);
			command.setNode(newNode);
			retVal = command;
		}
		return retVal;		
	}

	private boolean canGetChildCommand(){
		return (getHost().getModel() instanceof ContainerInstance);
	}
}
