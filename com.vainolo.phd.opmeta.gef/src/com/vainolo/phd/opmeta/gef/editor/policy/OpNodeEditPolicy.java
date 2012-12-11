package com.vainolo.phd.opmeta.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import com.vainolo.phd.opmeta.gef.editor.command.OPLinkCreateCommand;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;

public class OpNodeEditPolicy extends GraphicalNodeEditPolicy {

	@Override protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		OPLinkCreateCommand result = new OPLinkCreateCommand();
		OpmodelNodeInstance source = (OpmodelNodeInstance) getHost().getModel();
	    result.setSource(source);
	    result.setContainer((OpmodelContainerInstance)getHost().getParent().getModel());
	    result.setLink((OpmodelLinkInstance) request.getNewObject());
	    request.setStartCommand(result);
	    return result;
	}
	
	@Override protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		OPLinkCreateCommand linkCreateCommand = (OPLinkCreateCommand) request.getStartCommand();
		OpmodelNodeInstance target = (OpmodelNodeInstance) getHost().getModel();
		if (target == linkCreateCommand.getSource()) return UnexecutableCommand.INSTANCE;
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
