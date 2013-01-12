package com.vainolo.phd.opmeta.gef.editor.command;

import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;
import com.vainolo.phd.opmeta.model.opmetaFactory;

public class OPMetaModelLinkValidationRuleEditCommand extends Command {

	private OPMetaModelLinkValidationRule orig;
	private OPMetaModelLinkValidationRule changes;
	private OPMetaModelLinkValidationRule rule;
	
	public OPMetaModelLinkValidationRuleEditCommand(OPMetaModelLinkValidationRule rule,OPMetaModelLinkValidationRule changes){
		this.rule = rule;
		this.changes = changes;
		this.orig = opmetaFactory.eINSTANCE.createOPMetaModelLinkValidationRule();
		orig.setLinkTypeName(rule.getLinkTypeName());
		orig.setSourceTypeName(rule.getSourceTypeName());
		orig.setTargetTypeName(rule.getTargetTypeName());
		orig.setValid(rule.isValid());
	}
	
	@Override
	public boolean canExecute(){
		return (changes!=null && rule!= null);
	}
	
	@Override
	public void execute(){
		rule.setLinkTypeName(changes.getLinkTypeName());
		rule.setSourceTypeName(changes.getSourceTypeName());
		rule.setTargetTypeName(changes.getTargetTypeName());
		rule.setValid(changes.isValid());
	}
	
	@Override
	public void undo(){
		rule.setLinkTypeName(orig.getLinkTypeName());
		rule.setSourceTypeName(orig.getSourceTypeName());
		rule.setTargetTypeName(orig.getTargetTypeName());
		rule.setValid(orig.isValid());
	}
	
}
