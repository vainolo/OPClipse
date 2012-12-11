package com.vainolo.phd.opmeta.gef.editor.command;

import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;

public class OPLinkCreateCommand extends Command {

	private OpmodelNodeInstance source;
	private OpmodelNodeInstance target;
	private OpmodelLinkInstance link;
	private OpmodelContainerInstance container;
	
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
	    container.addLink(link);
	  }

	  /**
	   * Detach the {@link OPMLink} from the source and target {@link OPMNode} instances and from the containing
	   * {@link OPMObjectProcessDiagram}.
	   */
	  @Override
	  public void undo() {
	    link.setSource(null);
	    link.setTarget(null);
	    container.removeLink(link);
	  }

	
	public OpmodelNodeInstance getSource() {
		return source;
	}
	public void setSource(OpmodelNodeInstance source) {
		this.source = source;
	}
	public OpmodelNodeInstance getTarget() {
		return target;
	}
	public void setTarget(OpmodelNodeInstance target) {
		this.target = target;
	}
	public OpmodelLinkInstance getLink() {
		return link;
	}
	public void setLink(OpmodelLinkInstance link) {
		this.link = link;
	}

	public OpmodelContainerInstance getContainer() {
		return container;
	}

	public void setContainer(OpmodelContainerInstance container) {
		this.container = container;
	}
}
