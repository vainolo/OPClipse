/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;

import com.vainolo.phd.opm.gef.editor.figure.OPMFigureConstants;
import com.vainolo.phd.opm.gef.editor.figure.OPMStructuralLinkAggregatorFigure;
import com.vainolo.phd.opm.gef.editor.figure.StructuralLinkKind;
import com.vainolo.phd.opm.gef.utils.OPMStructuralLinkToStructuralLinkKindConverter;
import com.vainolo.phd.opm.model.OPMStructuralLink;

public class OPMStructuralLinkAggregatorEditPart extends OPMNodeEditPart implements ConnectionEditPart {

    private OPMStructuralLinkAggregatorFigure figure;
    private StructuralLinkKind linkKind;
    private EditPart source;
    private EditPart target;

    @Override
    protected IFigure createFigure() {
    	
        OPMStructuralLink model = (OPMStructuralLink) getModel();
        linkKind = OPMStructuralLinkToStructuralLinkKindConverter.INSTANCE.Convert(model);
        figure = new OPMStructuralLinkAggregatorFigure(linkKind);
        figure.setBounds(new Rectangle(model.getAggregatorPosition().x,model.getAggregatorPosition().y,OPMFigureConstants.defaultAggregatorDimension.height,OPMFigureConstants.defaultAggregatorDimension.width));
        ((GraphicalEditPart) getParent()).setLayoutConstraint(this, figure,figure.getBounds());
        return figure;
    }

    @Override
    protected void refreshVisuals() {
        
    	figure.repaint();
    }

	@Override
	public EditPart getSource() {
		return source;
	}

	@Override
	public EditPart getTarget() {
		return target;
	}

	@Override
	public void setSource(EditPart source) {
		if (this.source == source) return;
		this.source = source;
	}

	@Override
	public void setTarget(EditPart target) {
		if (this.target == target) return;
		this.target = target;
	}
}
