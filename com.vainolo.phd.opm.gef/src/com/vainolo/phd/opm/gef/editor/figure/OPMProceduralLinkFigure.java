/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.gef.editor.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

import com.vainolo.phd.opm.model.OPMProceduralActivationKind;

public class OPMProceduralLinkFigure extends PolylineConnection {
  private static final PolylineDecoration arrow = new PolylineDecoration();
  private ProceduralLinkKind linkKind;
  private OPMProceduralActivationKind activationKind;
  
  public OPMProceduralLinkFigure(ProceduralLinkKind linkKind, OPMProceduralActivationKind activationKind) {
    this.linkKind = linkKind;
    this.activationKind = activationKind;
  }

  @Override
  protected void outlineShape(Graphics g) {
    g.drawPolyline(getPoints());
    PointList points = getPoints();

    Point source = points.getFirstPoint();
    Point pointAfterSource = points.getPoint(1);
    Point target = points.getLastPoint();
    Point pointBeforeTarget = points.getPoint(points.size() - 2);

    switch(linkKind) {
      case CONSUMPTION:
      case RESULT:
      case EFFECT:
      case INVOCATION:
        arrow.setLocation(target);
        arrow.setReferencePoint(pointBeforeTarget);
        g.drawPolyline(arrow.getPoints());
        break;
      case INSTRUMENT:
        int radius = OPMFigureConstants.agentCircleRadius;
        g.pushState();
        g.setBackgroundColor(ColorConstants.black);
        g.fillOval(target.x() - radius, target.y() - radius, radius * 2, radius * 2);
        g.setBackgroundColor(ColorConstants.white);
        g.fillOval(target.x() - (radius - 2), target.y() - (radius - 2), (radius - 2) * 2, (radius - 2) * 2);
        g.popState();
        break;
    }

    switch(activationKind) {
      case CONDITION:
        if(pointBeforeTarget.x() < target.x())
          g.drawText("c", target.x() - 20, target.y() - 20);
        else
          g.drawText("c", target.x() + 20, target.y() - 20);
        break;
      case EVENT:
        if(pointBeforeTarget.x() < target.x())
          g.drawText("e", target.x() - 20, target.y() - 20);
        else
          g.drawText("e", target.x() + 20, target.y() - 20);
        break;
    }
  }

  @Override
  public Rectangle getBounds() {
    if(bounds == null) {
      bounds = super.getBounds();
      bounds.expand(30, 30);
    }
    return bounds;
  }
}
