/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/

package com.vainolo.phd.opm.gef.editor.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import com.vainolo.phd.opm.gef.editor.figure.OPMStructuralLinkAggregatorFigure;
import com.vainolo.phd.opm.gef.editor.figure.StructuralLinkKind;
import com.vainolo.phd.opm.gef.utils.OPMStructuralLinkToStructuralLinkKindConverter;
import com.vainolo.phd.opm.model.OPMContainer;
import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;
import com.vainolo.phd.opm.model.OPMStructuralLink;

public class OPMStructuralLinkAggregatorEditPart extends OPMNodeEditPart {

    private OPMStructuralLinkAggregatorFigure figure;
    private StructuralLinkKind linkKind;

    public OPMStructuralLinkAggregatorEditPart(OPMStructuralLink model){
    	setModel(model);
    }
    
    @Override
    protected IFigure createFigure() {
        OPMStructuralLink model = (OPMStructuralLink) getModel();
        linkKind = OPMStructuralLinkToStructuralLinkKindConverter.INSTANCE.Convert(model);
        figure = new OPMStructuralLinkAggregatorFigure(linkKind);
        //figure.setAggregatorLocation(model.getAggregatorPosition().x,model.getAggregatorPosition().y);
        //((GraphicalEditPart) getParent()).setLayoutConstraint(this, figure,figure.getBounds());
        return figure;
    }

    @Override
    protected void refreshVisuals() {
    	OPMStructuralLink model = (OPMStructuralLink) getModel();
		figure.setAggregatorLocation(model.getAggregatorPosition().x, model.getAggregatorPosition().y);
		getFigure().repaint();
    }
    
    @Override
	protected List getModelChildren() {
			return Collections.EMPTY_LIST;
	}
    
    @Override
	protected List<OPMLink> getModelSourceConnections() {
    	return Collections.emptyList();
	}

	@Override
	protected List<OPMLink> getModelTargetConnections() {
		return Collections.emptyList();
	}
}
