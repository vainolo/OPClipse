/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.GraphicalEditPart;

import com.vainolo.phd.opm.gef.editor.figure.OPMStructuralLinkAggregatorFigure;
import com.vainolo.phd.opm.gef.editor.figure.StructuralLinkKind;
import com.vainolo.phd.opm.gef.utils.OPMStructuralLinkToStructuralLinkKindConverter;
import com.vainolo.phd.opm.model.OPMStructuralLink;

public class OPMStructuralLinkAggregatorEditPart extends OPMNodeEditPart {

    private IFigure figure;
    private StructuralLinkKind linkKind;

    @Override
    protected IFigure createFigure() {
        OPMStructuralLink model = (OPMStructuralLink) getModel();
        linkKind = OPMStructuralLinkToStructuralLinkKindConverter.INSTANCE.Convert(model);
        figure = new OPMStructuralLinkAggregatorFigure(linkKind);
        return figure;
    }

    @Override
    protected void refreshVisuals() {
        OPMStructuralLink model = (OPMStructuralLink) getModel();
        ((GraphicalEditPart) getParent()).setLayoutConstraint(this, figure,model.getConstraints());
    }
}
