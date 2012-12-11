package com.vainolo.phd.opmeta.gef.editor.command;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelContainerInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelLinkInstance;
import com.vainolo.phd.opmeta.interpreter.opmodel.OpmodelNodeInstance;

public class OPModelNodeDeleteCommand extends Command {

	 /** Node to be deleted. */
	  private OpmodelNodeInstance node;
	  /** Container of the node. */
	  private OpmodelContainerInstance container;
	  /** Incoming and outgoing links. */
	  private List<LinkDataStorage> linksDs;

	  /**
		 * The command can be executed if all parameters have been set.
		 */
		@Override
		public boolean canExecute() {
			return node != null && container != null && container.containsNode(node);
		}

	  
	  @Override
	  public void execute() {
	    detachLinks();
	    container.removeNode(node);
	  }

	  @Override
	  public void undo() {
	    reattachLinks();
	    container.addNode(node);
	  }

	  /**
	   * Detach all links from the node and from the other connecting node,
	   * storing the connection information in local data structures.
	   */
	  private void detachLinks() {
		  linksDs = new ArrayList<>();
		  ArrayList<OpmodelLinkInstance> links = new ArrayList<>();
		  links.addAll(node.getIncomingLinks());
		  links.addAll(node.getOutgoingLinks());
		  for (OpmodelLinkInstance link:links){
			  LinkDataStorage ds =new LinkDataStorage(link);
			  link.setSource(null);
			  link.setTarget(null);
			  ds.container.removeLink(link);
			  linksDs.add(ds);
		  }
	  }

	  /**
	   * Re-attach all links to their source and target node.
	   */
	  private void reattachLinks() {
	    for(LinkDataStorage linkds : linksDs) {
	    	OpmodelLinkInstance link = linkds.link;
	      link.setSource(linkds.source);
	      link.setTarget(linkds.target);
	      linkds.container.addLink(link);

	    }
	  }

	  /**
	   * Set the node to delete from the diagram.
	   * 
	   * @param node
	   *          the Node to delete from the diagram.
	   */
	  public void setNode(final OpmodelNodeInstance node) {
	    this.node = node;
	  }
	  
	  public void setContainer(final OpmodelContainerInstance container){
		  this.container = container;
	  }
	  
	  private class LinkDataStorage{
		  public LinkDataStorage(final OpmodelLinkInstance link){
			  this.link = link;
			  this.source = link.getSource();
			  target = link.getTarget();
			  container = link.getContainer();
		  }
		  
		  final OpmodelLinkInstance link;
		  final OpmodelNodeInstance source;
		  final OpmodelNodeInstance target;
		  final OpmodelContainerInstance container;
		  
	  }
}
