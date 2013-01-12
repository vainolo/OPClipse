package com.vainolo.phd.opmeta.gef.editor.policy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import com.vainolo.phd.opmeta.gef.editor.command.OPModelLinkDeleteCommand;
import com.vainolo.phd.opmodel.model.LinkInstance;

public class OPModelLinkConnectionEditPolicy extends ConnectionEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		LinkInstance link = (LinkInstance)getHost().getModel();
		OPModelLinkDeleteCommand command = new OPModelLinkDeleteCommand();
		command.setLink(link);
		return command;
	}

}
