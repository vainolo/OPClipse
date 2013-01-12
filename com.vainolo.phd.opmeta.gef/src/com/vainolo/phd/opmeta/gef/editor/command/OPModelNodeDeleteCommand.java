package com.vainolo.phd.opmeta.gef.editor.command;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;

public class OPModelNodeDeleteCommand extends Command {

	 /** Node to be deleted. */
	  private NodeInstance node;
	  /** Container of the node. */
	  private ContainerInstance container;
	  /** Incoming and outgoing links. */
	  private List<LinkDataStorage> linksDs;

	  /**
		 * The command can be executed if all parameters have been set.
		 */
		@Override
		public boolean canExecute() {
			return node != null && container != null && container.getNodes().contains(node);
		}
	  
	  @Override
	  public void execute() {
	    detachLinks();
	    container.getNodes().remove(node);
	  }

	  @Override
	  public void undo() {
	    reattachLinks();
	    container.getNodes().add(node);
	  }

	  /**
	   * Detach all links from the node and from the other connecting node,
	   * storing the connection information in local data structures.
	   */
	  private void detachLinks() {
		  linksDs = new ArrayList<>();
		  ArrayList<LinkInstance> links = new ArrayList<>();
		  links.addAll(node.getIncomingLinks());
		  links.addAll(node.getOutgoingLinks());
		  for (LinkInstance link:links){
			  LinkDataStorage ds = new LinkDataStorage(link);
			  link.setSource(null);
			  link.setTarget(null);
			  ds.container.getLinks().remove(link);
			  linksDs.add(ds);
		  }
	  }

	  /**
	   * Re-attach all links to their source and target node.
	   */
	  private void reattachLinks() {
	    for(LinkDataStorage linkds : linksDs) {
	    	LinkInstance link = linkds.link;
	      link.setSource(linkds.source);
	      link.setTarget(linkds.target);
	      linkds.container.getLinks().add(link);

	    }
	  }

	  /**
	   * Set the node to delete from the diagram.
	   * 
	   * @param node
	   *          the Node to delete from the diagram.
	   */
	  public void setNode(final NodeInstance node) {
	    this.node = node;
	  }
	  
	  public void setContainer(final ContainerInstance container){
		  this.container = container;
	  }
	  
	  private class LinkDataStorage{
		  public LinkDataStorage(final LinkInstance link){
			  this.link = link;
			  this.source = link.getSource();
			  target = link.getTarget();
			  container = link.getContainer();
		  }
		  
		  final LinkInstance link;
		  final NodeInstance source;
		  final NodeInstance target;
		  final ContainerInstance container;
		  
	  }
}
