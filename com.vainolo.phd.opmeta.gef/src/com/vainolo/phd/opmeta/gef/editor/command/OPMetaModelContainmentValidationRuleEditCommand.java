package com.vainolo.phd.opmeta.gef.editor.command;

import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule;
import com.vainolo.phd.opmeta.model.opmetaFactory;

public class OPMetaModelContainmentValidationRuleEditCommand extends Command {

	private OPMetaModelContainmentValidationRule orig;
	private OPMetaModelContainmentValidationRule changes;
	private OPMetaModelContainmentValidationRule rule;
	
	public OPMetaModelContainmentValidationRuleEditCommand(OPMetaModelContainmentValidationRule rule,OPMetaModelContainmentValidationRule changes){
		this.rule = rule;
		this.changes = changes;
		this.orig = opmetaFactory.eINSTANCE.createOPMetaModelContainmentValidationRule();
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
