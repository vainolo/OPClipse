/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.policy;

import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opm.gef.editor.command.OPMLinkDeleteCommand;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.utilities.decoratorationLayer.OPMSimpleLink;
import com.vainolo.phd.opm.utilities.decoratorationLayer.OPMStructuralLinkAggregator;

/**
 * Edit policy used by the OPMLink class to server delete requests.
 * 
 * @author vainolo
 * 
 */
public class OPMLinkConnectionEditPolicy extends ConnectionEditPolicy {

	/**
	 * Create a {@link OPMLinkDeleteCommand} and fill its details.
	 * 
	 * @param request
	 *            the request that requires treatment.
	 * @return a {@link OPMLinkDeleteCommand} that deletes a link from the
	 *         model.
	 */
	@Override
	protected Command getDeleteCommand(GroupRequest request) {
		OPMLink link = (OPMLink)getHost().getModel();
		// normal (short!) case
		if (!(link instanceof OPMSimpleLink)){
			OPMLinkDeleteCommand command = new OPMLinkDeleteCommand();
			command.setLink(link);
			return command;
		}
		OPMSimpleLink simpleLink = (OPMSimpleLink) link;
		OPMLink origLink = simpleLink.getUnderliningLink();
		// case source to aggregator link
		if (origLink == null){
			OPMNode node = simpleLink.getTarget();
			if (node == null || !(node instanceof OPMStructuralLinkAggregator)) return null;
			return OPMNodeComponentEditPolicy.createDeleteStructuralLinkAggregatorNodeCommand((OPMStructuralLinkAggregator)node);
		}
		OPMLinkDeleteCommand command = new OPMLinkDeleteCommand();
		command.setLink(origLink);
		return command;
	}
}
