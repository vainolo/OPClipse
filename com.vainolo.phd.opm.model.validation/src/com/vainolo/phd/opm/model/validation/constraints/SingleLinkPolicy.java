package com.vainolo.phd.opm.model.validation.constraints;

import java.util.Hashtable;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;

class SingleLinkPolicy {
	
	private Class<?> linkType;
	
	public SingleLinkPolicy(Class<?> linkType){
		this.linkType = linkType;
	}
	
	public Class<?> getLinkType() { return linkType;}
	
	public OPMValidationResult inquireIsAllowed(OPMLink link){
		if (!linkType.isInstance(link)) return OPMValidationResult.NoResult;
		OPMNode source = link.getSource();
		OPMNode target = link.getTarget();
		if (target == null){
			return inquireIsAllowedSource(source);
		}
		Hashtable<Object,Boolean> ruleSet = policyRules.get(source);
		if (ruleSet != null) { 
			if (ruleSet.containsKey(target)) return getKeysAnswer(ruleSet,target);
			if (ruleSet.containsKey(blockInheritanceHolder)) return getKeysAnswer(ruleSet,blockInheritanceHolder);
		}
		
		return OPMValidationResult.NoResult;
	}
	
	private OPMValidationResult inquireIsAllowedSource(Object source){
		Hashtable<Object,Boolean> ruleSet = policyRules.get(source);
		if (ruleSet != null) { 
			if (ruleSet.containsValue(new Boolean(true))) return OPMValidationResult.Valid;
			// no need to check the value cause if was true the former if would have caught it
			if (ruleSet.containsKey(blockInheritanceHolder)) return OPMValidationResult.InValid; 
		}
		if (source instanceof Class<?>){
			Class<?> sourceType = (Class<?>) source;
			Class<?>[] sourceClasses =  sourceType.getDeclaredClasses();
			boolean hasInvalid = false;
			for (Class<?> superclass:sourceClasses){
				OPMValidationResult result = inquireIsAllowedSource(superclass);
				if (result== OPMValidationResult.Valid) return OPMValidationResult.Valid;
				else if(result == OPMValidationResult.InValid) hasInvalid = true;
			}
			if (hasInvalid) return OPMValidationResult.InValid;
		}else{
			return inquireIsAllowedSource(source.getClass());
		}
		return OPMValidationResult.NoResult;
	}
	
	private OPMValidationResult getKeysAnswer(Hashtable<Object,Boolean> ruleSet, Object key){
		return ruleSet.get(key)? OPMValidationResult.Valid : OPMValidationResult.InValid;
	}
	
	private Hashtable<Object,Hashtable<Object,Boolean>> policyRules = new  Hashtable<Object,Hashtable<Object,Boolean>>();
	
	private static Object blockInheritanceHolder = new Object(); 	
	
}
