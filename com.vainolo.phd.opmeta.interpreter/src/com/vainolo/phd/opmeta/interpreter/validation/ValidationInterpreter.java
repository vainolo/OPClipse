package com.vainolo.phd.opmeta.interpreter.validation;

import java.util.LinkedList;
import java.util.List;

import com.vainolo.phd.opm.validation.ContainmentValidator;
import com.vainolo.phd.opm.validation.IContainmentRule;
import com.vainolo.phd.opm.validation.ILinkRule;
import com.vainolo.phd.opm.validation.LinkValidator;
import com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule;
import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;
import com.vainolo.phd.opmodel.model.OPmetaDefinition;
import com.vainolo.phd.opmodel.model.OPmodelContainmentValidationRule;
import com.vainolo.phd.opmodel.model.OPmodelLinkValidationRule;
import com.vainolo.phd.opmodel.model.TypeDescriptor;
import com.vainolo.phd.opmodel.model.opmodelFactory;

public class ValidationInterpreter {

	public static List<OPmodelLinkValidationRule> calculateLinkValidationRules(List<OPMetaModelLinkValidationRule> linkValidations,
			OPmetaDefinition interpretation) {
		LinkValidator linkValidator = new LinkValidator();
		
		// for every rule defined as link rule
		for (OPMetaModelLinkValidationRule validation:linkValidations){
			// try get the type descriptors mentioned, if fails throw an exception (cannot continue interpretation)
			TypeDescriptor source = getDescriptor(interpretation.getNodes(),validation.getSourceTypeName());
			if (source == null) throw new RuntimeException("Cannot find Node with name '" + validation.getSourceTypeName() + "' to use as source type");
			ElementTypeDecriptor sourceType = new ElementTypeDecriptor(source);
			
			TypeDescriptor target = getDescriptor(interpretation.getNodes(),validation.getTargetTypeName());
			if (target == null) throw new RuntimeException("Cannot find Node with name '" + validation.getTargetTypeName() + "' to use as target type");
			ElementTypeDecriptor targetType = new ElementTypeDecriptor(target);
			
			TypeDescriptor link = getDescriptor(interpretation.getLinks(),validation.getLinkTypeName());
			if (link == null) throw new RuntimeException("Cannot find Link with name '" + validation.getLinkTypeName() + "' to use as link type");
			ElementTypeDecriptor linkType = new ElementTypeDecriptor(link);
			
			// add rule into 
			linkValidator.addRule(sourceType, linkType, targetType, validation.isValid());
		}
		
		try {
			linkValidator.finalizeInit();
		} catch (Exception ex){
			throw new RuntimeException("Failed translate Link Validation Rules.\nInner Error:\n"+ex.getMessage(),ex);
		}
		
		Iterable<ILinkRule> linkRules = linkValidator.getLeafRules();
		List<OPmodelLinkValidationRule> result = new LinkedList<>();
		for (ILinkRule rule:linkRules){
			ElementTypeDecriptor source=null,target=null, link =null;
			if (rule.From() instanceof ElementTypeDecriptor) source = (ElementTypeDecriptor) rule.From();
			if (rule.Link() instanceof ElementTypeDecriptor) link = (ElementTypeDecriptor) rule.Link();
			if (rule.To() instanceof ElementTypeDecriptor) target = (ElementTypeDecriptor) rule.To();
			
			OPmodelLinkValidationRule created = opmodelFactory.eINSTANCE.createOPmodelLinkValidationRule();
			created.setLinkType(link.getDescriptor());
			created.setSourceType(source.getDescriptor());
			created.setTargetType(target.getDescriptor());
			created.setValid(rule.getValue());
			result.add(created);
		}
		
		
		return result;
	}
	
	public static List<OPmodelContainmentValidationRule> calculateContainmentValidationRules(List<OPMetaModelContainmentValidationRule> containmentValidations,
			OPmetaDefinition interpretation){
		ContainmentValidator validator = new ContainmentValidator(); 
		
		for (OPMetaModelContainmentValidationRule validation:containmentValidations){
			// try get the type descriptors mentioned, if fails throw an exception (cannot continue interpretation)
			TypeDescriptor containerDescriptor = getDescriptor(interpretation.getContainers(),validation.getContainerTypeName());
			if (containerDescriptor == null) throw new RuntimeException("Cannot find Container with name '" + validation.getContainerTypeName() + "' to use as container type");
			ElementTypeDecriptor container = new ElementTypeDecriptor(containerDescriptor);
			
			TypeDescriptor containedItemDescriptor = getDescriptor(interpretation.getNodes(),validation.getNodeTypeName());
			if (containedItemDescriptor == null) throw new RuntimeException("Cannot find Container with name '" + validation.getNodeTypeName() + "' to use as contained item type");
			ElementTypeDecriptor containedItem = new ElementTypeDecriptor(containedItemDescriptor);
			
			validator.addRule(container, containedItem, validation.isValid());
		}
	
		try {
			validator.finalizeInit();
		} catch (Exception ex){
			throw new RuntimeException("Failed translate Link Validation Rules.\nInner Error:\n"+ex.getMessage(),ex);
		}
		
		Iterable<IContainmentRule> containmentRules = validator.getLeafRules();
		List<OPmodelContainmentValidationRule> result = new LinkedList<>();
		for (IContainmentRule rule:containmentRules){
			ElementTypeDecriptor container=null,node=null;
			if (rule.container() instanceof ElementTypeDecriptor) container = (ElementTypeDecriptor) rule.container();
			if (rule.containedItem() instanceof ElementTypeDecriptor) node = (ElementTypeDecriptor) rule.containedItem();
			
			OPmodelContainmentValidationRule created = opmodelFactory.eINSTANCE.createOPmodelContainmentValidationRule();
			created.setContainerType(container.getDescriptor());
			created.setNodeType(node.getDescriptor());
			created.setValid(rule.getValue());
			result.add(created);
		}
		
		return result;
	}
	
	// TODO : consider putting this in a more general location
	private static TypeDescriptor getDescriptor(Iterable<TypeDescriptor> descriptors, String name){
		for (TypeDescriptor descriptor:descriptors){
			if (descriptor.getName().equals(name)) return descriptor;
		}
		return null;
	}
	
}
