package com.vainolo.phd.opmeta.interpreter.validation;

import java.util.List;

import com.vainolo.phd.opm.validation.ContainmentValidator;
import com.vainolo.phd.opm.validation.LinkValidator;
import com.vainolo.phd.opmodel.model.ContainerInstance;
import com.vainolo.phd.opmodel.model.LinkInstance;
import com.vainolo.phd.opmodel.model.NodeInstance;
import com.vainolo.phd.opmodel.model.OPmetaDefinition;
import com.vainolo.phd.opmodel.model.OPmodelContainmentValidationRule;
import com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule;

public class OpmodelValidator {

	private OPmetaDefinition interpretation;
	private LinkValidator linkValidator;
	private ContainmentValidator containmentValidator;
	
	public OpmodelValidator(OPmetaDefinition interpretation){
		this.interpretation = interpretation;
		linkValidator = new LinkValidator();
		containmentValidator = new ContainmentValidator();
		
		initValidationRules();
	}
	
	private void initValidationRules(){
		List<OPmodelLinkValidationRule> rawLinkRules =  interpretation.getLinkValidationRules();
		List<OPmodelContainmentValidationRule> rawContainmentRules =  interpretation.getContainmentValidationRules();
		
		for (OPmodelLinkValidationRule rule:rawLinkRules){
			ElementTypeDecriptor from = new ElementTypeDecriptor(rule.getSourceType());
			ElementTypeDecriptor to = new ElementTypeDecriptor(rule.getTargetType());
			ElementTypeDecriptor link = new ElementTypeDecriptor(rule.getLinkType());
			linkValidator.addRule(from, link, to, rule.isValid());
		}
		
		for (OPmodelContainmentValidationRule rule:rawContainmentRules){
			ElementTypeDecriptor container = new ElementTypeDecriptor(rule.getContainerType());
			ElementTypeDecriptor containedItem = new ElementTypeDecriptor(rule.getNodeType());
			containmentValidator.addRule(container, containedItem, rule.isValid());
		}
		
		try
		{
			linkValidator.finalizeInit();
			containmentValidator.finalizeInit();
		} catch (Exception ex){
			throw new RuntimeException("Failed to initialize OpmodelValidator", ex);
		}
	}
	
	public boolean validateLink(NodeInstance from, LinkInstance link){
		if ((from == null) || (link==null)) return false;
		ElementTypeDecriptor fromType = new ElementTypeDecriptor(from.getType());
		ElementTypeDecriptor linkType = new ElementTypeDecriptor(link.getType());
		
		return linkValidator.valdidate(fromType, linkType);
	}
	
	public boolean validateLink(NodeInstance from, LinkInstance link, NodeInstance to){
		if ((from == null) || (link==null) || (to ==null)) return false;
		ElementTypeDecriptor fromType = new ElementTypeDecriptor(from.getType());
		ElementTypeDecriptor linkType = new ElementTypeDecriptor(link.getType());
		ElementTypeDecriptor toType = new ElementTypeDecriptor(to.getType());
		
		return linkValidator.valdidate(fromType, linkType,toType);
	}
	
	public boolean validateContainment(ContainerInstance container, NodeInstance containedItem){
		if ((container == null) || (containedItem == null)) return false;
		ElementTypeDecriptor containerType = new ElementTypeDecriptor(container.getType());
		ElementTypeDecriptor containedItemType = new ElementTypeDecriptor(containedItem.getType());
		
		return containmentValidator.valdidate(containerType, containedItemType);
	}
}
