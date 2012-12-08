package com.vainolo.phd.opmeta.gef.editor.policy;

import org.eclipse.core.runtime.Assert;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.vainolo.phd.opmeta.gef.editor.command.OPModelNodeCreateCommand;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelThingInstance;

public class OPContainerXYLayoutEditPolicy extends XYLayoutEditPolicy {

	private static final Dimension DEFAULT_NODE_DIMENSION = new Dimension(50, 50);
	
	/**
	 * Command created to add new nodes to a container.
	 */
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		// This policy is only installed in the main OPModelContainerInstances.
		Assert.isLegal(getHost().getModel() instanceof OpmodelContainerInstance, this.getClass().toString()
						+ " was installed in an edit part that is not a container.");

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

}
