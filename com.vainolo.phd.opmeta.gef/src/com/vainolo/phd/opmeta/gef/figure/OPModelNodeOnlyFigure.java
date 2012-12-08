package com.vainolo.phd.opmeta.gef.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;

import com.vainolo.phd.opm.gef.utils.OPMFigureConstants;

public class OPModelNodeOnlyFigure extends Figure{
	private final RectangleFigure rectangle;
	  private ConnectionAnchor connectionAnchor;
	  private final Label nameLabel;

	  public OPModelNodeOnlyFigure() {
	    super();
	    setLayoutManager(new XYLayout());
	    nameLabel = new Label();
	    //nameLabel.setForegroundColor(ColorConstants.black);
	    //add(nameLabel);
	    rectangle = new RectangleFigure();
	    rectangle.setForegroundColor(ColorConstants.black);
	    rectangle.setLineWidth(OPMFigureConstants.entityBorderWidth);
	    add(rectangle);
	  }

	  /**
	   * Get the label used to set the name of the state.
	   * 
	   * @return the label where the name of the state is shown.
	   */
	  public Label getNameLabel() {
	    return nameLabel;
	  }

	  /**
	   * All connections to the figure use the same anchor: a {@link ChopboxAnchor}.
	   * 
	   * @return a {@link ChopboxAnchor} for the state.
	   */
	  private ConnectionAnchor getConnectionAnchor() {
	    if(connectionAnchor == null) {
	      connectionAnchor = new ChopboxAnchor(this);
	    }
	    return connectionAnchor;
	  }

	  public ConnectionAnchor getSourceConnectionAnchor() {
	    return getConnectionAnchor();
	  }

	  public ConnectionAnchor getTargetConnectionAnchor() {
	    return getConnectionAnchor();
	  }

	  @Override
	  public Dimension getPreferredSize(int wHint, int hHint) {
	    Dimension d = new Dimension();
	    Rectangle textRectangle = nameLabel.getTextBounds().getCopy();
	    d.width = textRectangle.width;
	    d.height = textRectangle.height;
	    setPreferredSize(d);
	    return super.getPreferredSize(wHint, hHint);
	  }

	  @Override
	  protected void paintFigure(Graphics graphics) {
	    Rectangle r = getBounds().getCopy();
	    ///int insets = OPMFigureConstants.opmNodeInsets;
	    //setConstraint(nameLabel, new Rectangle(insets, insets, r.width() - insets, r.height() - insets));
	    setConstraint(rectangle, new Rectangle(0, 0, r.width(), r.height()));
	   
	    rectangle.invalidate();
	    //getNameLabel().invalidate();
	  }
}
