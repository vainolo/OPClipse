package com.vainolo.phd.opmeta.gef.editor.policy;

import org.eclipse.core.runtime.Assert;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;

public class OPContainerXYLayoutEditPolicy extends XYLayoutEditPolicy {

	private static final Dimension DEFAULT_NODE_DIMENSION = new Dimension(50, 50);
	
	/**
	 * Command created to add new nodes to a container.
	 */
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		// This policy is only installed in OPMContainer instances.
		Assert.isLegal(getHost().getModel() instanceof OpmodelContainerInstance, this.getClass().toString()
						+ " was installed in an edit part that is not a container.");

		OpmodelContainerInstance model = (OpmodelContainerInstance) getHost().getModel();

		return null;
		
	}

}
