package com.vainolo.phd.opmeta.gef.editor.command;

import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;

public class OPModelLinkCreateCommand extends Command {

	private NodeInstance source;
	private NodeInstance target;
	private LinkInstance link;
	private ContainerInstance container;
	
	/**
	   * The command can be executed when all parameters have been set.
	   */
	  @Override
	  public boolean canExecute() {
	    return source != null && target != null && link != null && container!=null;
	  }

	  /**
	   * Connect the {@link OpmodelLinkInstance} to the given source and target {@link OpmodelNodeInstance} instances 
	   */
	  @Override
	  public void execute() {
	    link.setSource(source);
	    link.setTarget(target);
	    container.getLinks().add(link);
	  }

	  /**
	   * Detach the {@link OPMLink} from the source and target {@link OPMNode} instances and from the containing
	   * {@link OPMObjectProcessDiagram}.
	   */
	  @Override
	  public void undo() {
	    link.setSource(null);
	    link.setTarget(null);
	    container.getLinks().remove(link);
	  }

	
	public NodeInstance getSource() {
		return source;
	}
	public void setSource(NodeInstance source) {
		this.source = source;
	}
	public NodeInstance getTarget() {
		return target;
	}
	public void setTarget(NodeInstance target) {
		this.target = target;
	}
	public LinkInstance getLink() {
		return link;
	}
	public void setLink(LinkInstance link) {
		this.link = link;
	}

	public ContainerInstance getContainer() {
		return container;
	}

	public void setContainer(ContainerInstance container) {
		this.container = container;
	}
}
