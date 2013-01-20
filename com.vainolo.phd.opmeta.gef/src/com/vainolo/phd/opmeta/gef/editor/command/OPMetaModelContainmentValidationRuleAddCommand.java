package com.vainolo.phd.opmeta.gef.editor.command;

import java.util.List;

import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opmeta.model.OPMetaModelContainmentValidationRule;

public class OPMetaModelContainmentValidationRuleAddCommand extends Command {

	private List<OPMetaModelContainmentValidationRule> list;
	private OPMetaModelContainmentValidationRule rule;
	
	public OPMetaModelContainmentValidationRuleAddCommand(List<OPMetaModelContainmentValidationRule> list, OPMetaModelContainmentValidationRule rule){
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
