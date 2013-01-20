package com.vainolo.phd.opmeta.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import com.vainolo.phd.opmeta.gef.editor.command.OPModelLinkCreateCommand;
import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;

public class OpNodeEditPolicy extends GraphicalNodeEditPolicy {

	@Override protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		OPModelLinkCreateCommand result = new OPModelLinkCreateCommand();
		NodeInstance source = (NodeInstance) getHost().getModel();
	    result.setSource(source);
	    result.setContainer((ContainerInstance)getHost().getParent().getModel());
	    result.setLink((LinkInstance) request.getNewObject());
	    request.setStartCommand(result);
	    return result;
	}
	
	@Override protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		OPModelLinkCreateCommand linkCreateCommand = (OPModelLinkCreateCommand) request.getStartCommand();
		NodeInstance target = (NodeInstance) getHost().getModel();
		if (target == linkCreateCommand.getSource()) return null;
	    linkCreateCommand.setTarget(target);
	    return linkCreateCommand;
	}

	@Override protected Command getReconnectTargetCommand(ReconnectRequest request) {
		return null;
	}

	@Override protected Command getReconnectSourceCommand(ReconnectRequest request) {
		return null;
	}

}
