package com.vainolo.phd.opmeta.gef.editor.command;

import java.util.List;

import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule;

public class OPMetaModelContaimentValidationRuleAddCommand extends Command {

	private List<OPMetaModelContaimentValidationRule> list;
	private OPMetaModelContaimentValidationRule rule;
	
	public OPMetaModelContaimentValidationRuleAddCommand(List<OPMetaModelContaimentValidationRule> list, OPMetaModelContaimentValidationRule rule){
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
