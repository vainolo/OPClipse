package com.vainolo.phd.opm.gef.editor.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class OPMStructuralLinkFigure extends Figure implements Connection {

	private OPMStructuralLinkAggregatorFigure aggregatorFigure;
	private PolylineConnection sourceToAggregator;
	private PolylineConnection aggregatorToTarget;
	private IsoscelesTriangle triangle;
	
	public OPMStructuralLinkFigure(final StructuralLinkKind kind){
		setLayoutManager(new XYLayout());
		aggregatorFigure = new OPMStructuralLinkAggregatorFigure(kind);
		sourceToAggregator = new PolylineConnection();
		sourceToAggregator.setTargetAnchor(aggregatorFigure.getSourceConnectionAnchor());
		aggregatorToTarget = new PolylineConnection();
		aggregatorToTarget.setSourceAnchor(aggregatorFigure.getTargetConnectionAnchor());
		setAggregatorLocation(0,0);
		triangle = new IsoscelesTriangle();
		triangle.setBackgroundColor(ColorConstants.black);
		triangle.setForegroundColor(ColorConstants.black);
		triangle.setFill(true);
		triangle.setBounds(new Rectangle(0,0,30,30));
		add(triangle);
	}

	public void setAggregatorLocation(int x, int y){
		aggregatorFigure.setBounds(new Rectangle(x, y, OPMFigureConstants.defaultAggregatorDimension.height, OPMFigureConstants.defaultAggregatorDimension.width));
		revalidate();
	}
	
	@Override
	protected void paintFigure(Graphics g) {
		aggregatorFigure.paint(g);
		g.drawPolyline(sourceToAggregator.getPoints());
		g.drawPolyline(aggregatorToTarget.getPoints());
		triangle.invalidate();
	    }

	@Override
	public ConnectionRouter getConnectionRouter() {
		return sourceToAggregator.getConnectionRouter();
	}

	@Override
	public void setConnectionRouter(ConnectionRouter router) {
		sourceToAggregator.setConnectionRouter(router);
		sourceToAggregator.layout();
		aggregatorToTarget.setConnectionRouter(router);
		aggregatorToTarget.layout();
	}

	@Override
	public ConnectionAnchor getSourceAnchor() {
		return sourceToAggregator.getSourceAnchor();
	}

	@Override
	public ConnectionAnchor getTargetAnchor() {
		return aggregatorToTarget.getTargetAnchor();
	}

	@Override
	public Object getRoutingConstraint() {
		return sourceToAggregator.getRoutingConstraint();
	}

	@Override
	public void setRoutingConstraint(Object cons) {
		sourceToAggregator.setRoutingConstraint(cons);
		sourceToAggregator.layout();
		aggregatorToTarget.setRoutingConstraint(cons);
		aggregatorToTarget.layout();
		revalidate();
	}

	@Override
	public void setSourceAnchor(ConnectionAnchor anchor) {
		sourceToAggregator.setSourceAnchor(anchor);
		sourceToAggregator.layout();
		revalidate();
	}

	@Override
	public void setTargetAnchor(ConnectionAnchor anchor) {
		aggregatorToTarget.setTargetAnchor(anchor);
		aggregatorToTarget.layout();
		revalidate();
	}

	@Override
	public PointList getPoints() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPoints(PointList list) {
		// TODO Auto-generated method stub
		
	}
	
	public void setLineWidth(int w){
		sourceToAggregator.setLineWidth(w);
		sourceToAggregator.layout();
		aggregatorToTarget.setLineWidth(w);
		aggregatorToTarget.layout();
	}
	
	@Override
	public Rectangle getBounds(){
		Rectangle bounds = sourceToAggregator.getBounds();
		bounds.union(aggregatorFigure.getBounds());
		bounds.union(aggregatorToTarget.getBounds());
		return bounds;
	}
}
