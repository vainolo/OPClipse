/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalEditPart;

import com.vainolo.phd.opm.gef.editor.figure.OPMFigureConstants;
import com.vainolo.phd.opm.gef.editor.figure.OPMStructuralLinkAggregatorFigure;
import com.vainolo.phd.opm.gef.editor.figure.StructuralLinkKind;
import com.vainolo.phd.opm.gef.utils.OPMStructuralLinkToStructuralLinkKindConverter;
import com.vainolo.phd.opm.model.OPMStructuralLink;

public class OPMStructuralLinkAggregatorEditPart extends OPMNodeEditPart {

    private OPMStructuralLinkAggregatorFigure figure;
    private StructuralLinkKind linkKind;

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
    	OPMStructuralLink model = (OPMStructuralLink) getModel();
		figure.setAggregatorLocation(model.getAggregatorPosition().x, model.getAggregatorPosition().y);
		getFigure().repaint();
    }
}
