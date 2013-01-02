package com.vainolo.phd.opmeta.gef.editor.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import com.vainolo.phd.opm.gef.utils.OPMFigureConstants;
import com.vainolo.phd.opm.model.VerticalAlignment;

public abstract class OPModelNodeFigure extends Figure {

	private final Label nameLabel;
	
	public OPModelNodeFigure(){
		super();
		setLayoutManager(new XYLayout());
		verticalAlign = VerticalAlignment.CENTER;
		nameLabel = new Label();
	    nameLabel.setForegroundColor(ColorConstants.black);
	    //nameLabel.setTextAlignment(PositionConstants.MIDDLE);
	    add(nameLabel);
	}
	
	@Override
	protected final boolean useLocalCoordinates() {
		return true;
	}
	
	public ConnectionAnchor getSourceConnectionAnchor() {
	    return getConnectionAnchor();
	}

	public ConnectionAnchor getTargetConnectionAnchor() {
	    return getConnectionAnchor();
	}

	abstract protected ConnectionAnchor getConnectionAnchor();

	/**
	   * Get the label used to set the name of the state.
	   * 
	   * @return the label where the name of the state is shown.
	   */
	  protected Label getNameLabel() {
	    return nameLabel;
	  }
	
	  public void setText(String text){
		  nameLabel.setText(text);
	  }
	  
	  public void setLabelAlignment(VerticalAlignment align){
		  verticalAlign = align;
	  }
	  
	  private VerticalAlignment verticalAlign;
	  
	  protected int getLabelY(int figureHeight, int labelHeight){
		  
		  switch(verticalAlign){
		  	case TOP:
		  		return OPMFigureConstants.opmNodeInsets;
		  	case BOTTOM:
		  		return figureHeight - OPMFigureConstants.opmNodeInsets- labelHeight;
		  }
		  return (figureHeight - labelHeight)/2;
	  }
	  
	  @Override
	  protected void paintFigure(Graphics graphics) {
	    super.paintFigure(graphics);
	    Rectangle r = getBounds().getCopy();
	    // place label in middle
	    Dimension labelDim = nameLabel.getPreferredSize();
	    int newx=(r.width() - labelDim.width)/2;
	    int newy= getLabelY(r.height(), labelDim.height()); 
	    
	    setConstraint(nameLabel, new Rectangle(new Point(newx, newy), labelDim));
	    nameLabel.invalidate();
	  }
	abstract public IFigure getContentPane();
}
