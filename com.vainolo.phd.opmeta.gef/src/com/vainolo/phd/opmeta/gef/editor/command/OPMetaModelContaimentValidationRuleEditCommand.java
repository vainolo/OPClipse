package com.vainolo.phd.opmeta.gef.editor.command;

import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule;
import com.vainolo.phd.opmeta.model.opmetaFactory;

public class OPMetaModelContaimentValidationRuleEditCommand extends Command {

	private OPMetaModelContaimentValidationRule orig;
	private OPMetaModelContaimentValidationRule changes;
	private OPMetaModelContaimentValidationRule rule;
	
	public OPMetaModelContaimentValidationRuleEditCommand(OPMetaModelContaimentValidationRule rule,OPMetaModelContaimentValidationRule changes){
		this.rule = rule;
		this.changes = changes;
		this.orig = opmetaFactory.eINSTANCE.createOPMetaModelContaimentValidationRule();
		orig.setContainerTypeName(rule.getContainerTypeName());
		orig.setNodeTypeName(rule.getNodeTypeName());
		orig.setValid(rule.isValid());
	}
	
	@Override
	public boolean canExecute(){
		return (changes!=null && rule!= null);
	}
	
	@Override
	public void execute(){
		rule.setContainerTypeName(changes.getContainerTypeName());
		rule.setNodeTypeName(changes.getNodeTypeName());
		rule.setValid(changes.isValid());
	}
	
	@Override
	public void undo(){
		rule.setContainerTypeName(orig.getContainerTypeName());
		rule.setNodeTypeName(orig.getNodeTypeName());
		rule.setValid(orig.isValid());
	}
	
}
