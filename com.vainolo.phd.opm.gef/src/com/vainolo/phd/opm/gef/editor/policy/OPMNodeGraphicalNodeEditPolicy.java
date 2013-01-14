/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.policy;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import com.vainolo.phd.opm.gef.decorationLayer.OPMStructuralLinkAggregator;
import com.vainolo.phd.opm.gef.editor.command.OPMLinkCreateCommand;
import com.vainolo.phd.opm.gef.editor.command.OPMNodeCreateCommand;
import com.vainolo.phd.opm.gef.editor.part.OPMStructuralLinkAggregatorEditPart;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMObjectProcessDiagram;
import com.vainolo.phd.opm.model.OPMStructuralLink;
import com.vainolo.phd.opm.model.OPMThing;
import com.vainolo.phd.opm.utilities.OPMDecorated;
import com.vainolo.phd.opm.utilities.analysis.OPDAnalysis;
import com.vainolo.phd.opm.validation.OpmValidator;

/**
 * Policy used to connect two nodes in the diagram. Currently connections can
 * only be created between two {@link OPMThing} instances.
 * 
 * @author vainolo
 */
public class OPMNodeGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

  private static final Dimension DEFAULT_AGGREGATOR_DIMENSION = new Dimension(15, 15);

  /**
   * Create a command used to begin connecting to nodes. {@link OPMStructuralLinkAggregatorEditPart} nodes cannot be
   * source nodes,
   * therefore in this case a {@link UnexecutableCommand} is returned.
   * 
   * @return a {@link Command} that contains the initial information neede to
   *         create a connection between two nodes.
   */
  @Override
  protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
    // We must return null and not the usual UnexecutableCommand because is
    // we return a
    // non-null value the framework thinks that the link can be created from
    // this host,
    // something that we don't want to happen.
    if(getHost() instanceof OPMStructuralLinkAggregatorEditPart) {
      return null;
    }

    OPMLinkCreateCommand result = new OPMLinkCreateCommand();
    OPMNode source = (OPMNode) getHost().getModel();
    if (source instanceof OPMDecorated<?>) source = (OPMNode)((OPMDecorated<?>)source).getDecorated();
    
    if (!OpmValidator.eINSTANCE.validateLink(source.eClass(), (EClass)request.getNewObjectType()))
    	return null;
    
    result.setSource(source);
    result.setLink((OPMLink) request.getNewObject());
    OPMObjectProcessDiagram opd =OPDAnalysis.findOPD((OPMNode) getHost().getModel());
    if (opd instanceof OPMDecorated<?>) opd = (OPMObjectProcessDiagram)((OPMDecorated<?>)opd).getDecorated();
    result.setOPD(opd);
    request.setStartCommand(result);
    return result;
  }

  /**
   * Retrieves the command created by
   * {@link OPMNodeGraphicalNodeEditPolicy#getConnectionCreateCommand(CreateConnectionRequest)
   * getConnectionCreateCommand}, and adds it information so that the command
   * can be executed. {@link OPMStructuralLinkAggregatorEditPart} nodes cannot
   * be source nodes, therefore in this case a {@link UnexecutableCommand} is
   * returned.
   * 
   * @return a {@link Command} that can be executed to create a connection
   *         between two nodes.
   */
  @Override
  protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
    // A null command must be returned (and not the usual UnexecutableCommand), otherwise GEF shows the used a symbol
    // that the connection can be completed but when the used clicks it is not created.
    if(request.getStartCommand() == null || request.getTargetEditPart() instanceof OPMStructuralLinkAggregatorEditPart || 
    		getHost() instanceof OPMStructuralLinkAggregatorEditPart) {
      return null;
    }
    
    OPMLinkCreateCommand linkCreateCommand = (OPMLinkCreateCommand) request.getStartCommand();
    OPMNode target = (OPMNode) getHost().getModel();
    if (target instanceof OPMDecorated<?>) target = (OPMNode)((OPMDecorated<?>)target).getDecorated();
    if (!OpmValidator.eINSTANCE.validateLink(linkCreateCommand.getSource().eClass(), target.eClass(), linkCreateCommand.getLink().eClass()))
    	return null;
    
    linkCreateCommand.setTarget(target);
    if(request.getNewObject() instanceof OPMStructuralLink){
    	setStructuralLinkAggregatorPosition(request);
    }
    
    return linkCreateCommand;
  }

  private void setStructuralLinkAggregatorPosition(CreateConnectionRequest request){
	  OPMStructuralLink structuralLink = (OPMStructuralLink) request.getNewObject();
	  OPMNode source = (OPMNode) request.getSourceEditPart().getModel();
	  if (source instanceof OPMDecorated<?>) source = (OPMNode)((OPMDecorated<?>)source).getDecorated();
	  OPMNode target = (OPMNode) request.getTargetEditPart().getModel();
	  if (target instanceof OPMDecorated<?>) target = (OPMNode)((OPMDecorated<?>)target).getDecorated();
  	structuralLink.setAggregatorPosition(getAggregatorPosition(source,target));
  }
  
  
  /**
   * Create a command that adds the provided {@link OPMStructuralLinkAggregator} to the diagram located between the
   * source and the target {@link OPMNode}.
   * 
   * @param source
   *          the source for the structural link.
   * @param target
   *          the target of the structural link.
   * @param aggregator
   *          the aggregator that should be added to the diagram.
   * @return A {@link OPMNodeCreateCommand} whose execution add the aggregator
   *         to the diagram.
   */
  public OPMNodeCreateCommand createCreateAggregatorNodeCommand(OPMNode source, OPMNode target, OPMNode aggregator) {
    OPMNodeCreateCommand command = new OPMNodeCreateCommand();
    command.setNode(aggregator);
    command.setContainer(source.getContainer());

    // Calculate location of aggregator, between the source and targetnodes.
    Rectangle sCnstrnts = source.getConstraints();
    Rectangle tCnstrnts = target.getConstraints();
    Point sCenter = new Point(sCnstrnts.x + sCnstrnts.width / 2, sCnstrnts.y + sCnstrnts.height / 2);
    Point tCenter = new Point(tCnstrnts.x + tCnstrnts.width / 2, tCnstrnts.y + tCnstrnts.height / 2);
    Point aggrgLeftTopCorner = new Point();
    aggrgLeftTopCorner.x = sCenter.x + (tCenter.x - sCenter.x) / 2 - DEFAULT_AGGREGATOR_DIMENSION.width / 2;
    aggrgLeftTopCorner.y = sCenter.y + (tCenter.y - sCenter.y) / 2 - DEFAULT_AGGREGATOR_DIMENSION.height / 2;
    if(aggrgLeftTopCorner.x < 0) {
      aggrgLeftTopCorner.x = 0;
    }
    if(aggrgLeftTopCorner.y < 0) {
      aggrgLeftTopCorner.y = 0;
    }
    command.setConstraints(new Rectangle(aggrgLeftTopCorner, DEFAULT_AGGREGATOR_DIMENSION));

    return command;
  }

  private Point getAggregatorPosition(OPMNode source, OPMNode target) {
		// Calculate location of aggregator, between the source and targetnodes.
		    Rectangle sCnstrnts = getTrueCinstraints(source);
		    Rectangle tCnstrnts = getTrueCinstraints(target);
		    Point sCenter = new Point(sCnstrnts.x + sCnstrnts.width / 2, sCnstrnts.y + sCnstrnts.height / 2);
		    Point tCenter = new Point(tCnstrnts.x + tCnstrnts.width / 2, tCnstrnts.y + tCnstrnts.height / 2);
		    Point aggrgLeftTopCorner = new Point();
		    aggrgLeftTopCorner.x = sCenter.x + (tCenter.x - sCenter.x) / 2 - DEFAULT_AGGREGATOR_DIMENSION.width / 2;
		    aggrgLeftTopCorner.y = sCenter.y + (tCenter.y - sCenter.y) / 2 - DEFAULT_AGGREGATOR_DIMENSION.height / 2;
		    if(aggrgLeftTopCorner.x < 0) {
		      aggrgLeftTopCorner.x = 0;
		    }
		    if(aggrgLeftTopCorner.y < 0) {
		      aggrgLeftTopCorner.y = 0;
		    }
		    return aggrgLeftTopCorner;
	}
  
  private Rectangle getTrueCinstraints(OPMNode node){
	  Rectangle rect = node.getConstraints().getCopy();
	  if ((node.getContainer() instanceof OPMNode) && (node.getContainer() != getHost().getRoot().getModel())){
		  Rectangle added = getTrueCinstraints((OPMNode)node.getContainer());
		  rect.x += added.x;
		  rect.y += added.y;
	  }
	  return rect;
  }
  
  @Override
  protected Command getReconnectTargetCommand(ReconnectRequest request) {
    return null;
  }

  @Override
  protected Command getReconnectSourceCommand(ReconnectRequest request) {
    return null;
  }
}