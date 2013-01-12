package com.vainolo.phd.opmeta.gef.editor.command;

import java.util.List;

import org.eclipse.gef.commands.Command;

import com.vainolo.phd.opmeta.model.OPMetaModelContaimentValidationRule;

public class OPMetaModelContaimentValidationRuleRemoveCommand extends Command {

	private List<OPMetaModelContaimentValidationRule> list;
	private OPMetaModelContaimentValidationRule rule;
	private boolean didRemove;
	
	public OPMetaModelContaimentValidationRuleRemoveCommand(List<OPMetaModelContaimentValidationRule> list, OPMetaModelContaimentValidationRule rule){
		this.list = list;
		this.rule = rule;
	}
	
	@Override
	public boolean canExecute(){
		return (list!=null && rule!= null);
	}
	
	@Override
	public void execute(){
		didRemove = list.remove(rule);
	}
	
	@Override
	public void undo(){
		if (didRemove){
			list.add(rule);
			didRemove = false;
		}
	}
}
