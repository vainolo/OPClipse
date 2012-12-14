package com.vainolo.phd.opmeta.gef.editor.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

import com.vainolo.phd.opm.gef.utils.OPMFigureConstants;

public class OPModelNodeRectangleFigure extends OPModelNodeFigure{
	private final RectangleFigure rectangle;
	  private ConnectionAnchor connectionAnchor;
	  
	  public OPModelNodeRectangleFigure() {
	    super();
	    
	    rectangle = new RectangleFigure();
	    rectangle.setLayoutManager(new XYLayout());
	    rectangle.setForegroundColor(ColorConstants.black);
	    rectangle.setLineWidth(OPMFigureConstants.entityBorderWidth);
	    rectangle.setFill(true);
	    add(rectangle,0);
	    
	  }

	  /**
	   * All connections to the figure use the same anchor: a {@link ChopboxAnchor}.
	   * 
	   * @return a {@link ChopboxAnchor} for the state.
	   */
	  @Override
	  protected ConnectionAnchor getConnectionAnchor() {
	    if(connectionAnchor == null) {
	      connectionAnchor = new ChopboxAnchor(this);
	    }
	    return connectionAnchor;
	  }

	  @Override
	  public Dimension getPreferredSize(int wHint, int hHint) {
	    Dimension d = new Dimension();
	    Rectangle textRectangle = getNameLabel().getTextBounds().getCopy();
	    d.width = textRectangle.width;
	    d.height = textRectangle.height;
	    setPreferredSize(d);
	    return super.getPreferredSize(wHint, hHint);
	  }
 
	  @Override
	  protected void paintFigure(Graphics graphics) {
		  super.paintFigure(graphics);
	    Rectangle r = getBounds().getCopy();
	    setConstraint(rectangle, new Rectangle(0, 0, r.width(), r.height()));
	    rectangle.invalidate();
	  }
	  
	  @Override
	  public IFigure getContentPane(){
		  return rectangle;
	  }
}
