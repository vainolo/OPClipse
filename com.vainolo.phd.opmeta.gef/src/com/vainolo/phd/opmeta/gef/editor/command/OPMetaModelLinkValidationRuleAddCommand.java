package com.vainolo.phd.opmeta.gef.editor.command;

import java.util.List;

import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opmeta.model.OPMetaModelLinkValidationRule;

public class OPMetaModelLinkValidationRuleAddCommand extends Command {

	private List<OPMetaModelLinkValidationRule> list;
	private OPMetaModelLinkValidationRule rule;
	
	public OPMetaModelLinkValidationRuleAddCommand(List<OPMetaModelLinkValidationRule> list, OPMetaModelLinkValidationRule rule){
		this.list = list;
		this.rule = rule;
	}
	
	@Override
	public boolean canExecute(){
		return (list!=null && rule!= null);
	}
	
	@Override
	public void execute(){
		list.add(rule);
	}
	
	@Override
	public void undo(){
		list.remove(rule);
	}
	
}
