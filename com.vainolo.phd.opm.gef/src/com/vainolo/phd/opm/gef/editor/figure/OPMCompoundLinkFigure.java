package com.vainolo.phd.opm.gef.editor.figure;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

public class OPMCompoundLinkFigure extends Figure implements Connection{

	private OPMNodeFigure midFigure;
	private PolylineConnection sourceToFigure;
	private PolylineConnection figureToTarget;
	
	public OPMCompoundLinkFigure(OPMNodeFigure midFigure, PolylineConnection sourceToFigure, PolylineConnection figureToTarget){
		super();
		
		if (midFigure == null) throw new NullPointerException();
		setLayoutManager(new XYLayout());
		this.midFigure = midFigure;
		
		if (null == sourceToFigure) this.sourceToFigure = new PolylineConnection();
		else this.sourceToFigure = sourceToFigure;
		add(sourceToFigure);
		sourceToFigure.setTargetAnchor(midFigure.getSourceConnectionAnchor());
		
		if (null == figureToTarget) this.figureToTarget = new PolylineConnection();
		else this.figureToTarget = figureToTarget;
		add(figureToTarget);
		figureToTarget.setSourceAnchor(midFigure.getTargetConnectionAnchor());
	}
	
	@Override
	protected void paintFigure(Graphics g) {
		midFigure.paint(g);
		super.paintFigure(g);
	}

	@Override
	public ConnectionRouter getConnectionRouter() {
		return sourceToFigure.getConnectionRouter();
	}

	@Override
	public void setConnectionRouter(ConnectionRouter router) {
		sourceToFigure.setConnectionRouter(router);
		figureToTarget.setConnectionRouter(router);
		revalidate();
	}

	@Override
	public ConnectionAnchor getSourceAnchor() {
		return sourceToFigure.getSourceAnchor();
	}

	@Override
	public ConnectionAnchor getTargetAnchor() {
		return figureToTarget.getTargetAnchor();
	}

	@Override
	public Object getRoutingConstraint() {
		return sourceToFigure.getRoutingConstraint();
	}

	@Override
	public void setRoutingConstraint(Object cons) {
		sourceToFigure.setRoutingConstraint(cons);
		figureToTarget.setRoutingConstraint(cons);
		revalidate();
	}

	@Override
	public void setSourceAnchor(ConnectionAnchor anchor) {
		sourceToFigure.setSourceAnchor(anchor);
		revalidate();
	}

	@Override
	public void setTargetAnchor(ConnectionAnchor anchor) {
		figureToTarget.setTargetAnchor(anchor);
		revalidate();
	}

	@Override
	public PointList getPoints() {
		PointList points = sourceToFigure.getPoints().getCopy();
		// points.addAll(midFigure.getPoints()); TODO: re-think?
		points.addAll(figureToTarget.getPoints());
		return points;
	}

	@Override
	public void setPoints(PointList list) {
		System.out.println("In OPMStructuralLinkFigure.setPoints");
	}
	
	@Override
	public Rectangle getBounds(){
		if (bounds == null){
			sourceToFigure.layout();
			bounds = sourceToFigure.getBounds();
			bounds.union(midFigure.getBounds());
			figureToTarget.layout();
			bounds.union(figureToTarget.getBounds());
		}
		return bounds;
	}
	
	@Override
	public void revalidate(){
		bounds = null;
		super.revalidate();
	}

	public void repaint() {
		bounds = null;
		super.repaint();
	}
}
