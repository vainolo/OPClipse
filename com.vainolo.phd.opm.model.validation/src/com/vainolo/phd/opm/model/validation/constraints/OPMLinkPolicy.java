package com.vainolo.phd.opm.model.validation.constraints;

import java.util.HashSet;
import java.util.Hashtable;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;

public class OPMLinkPolicy {

	private static OPMLinkPolicy instance;
	
	public static OPMLinkPolicy getInstance(){
		if (null==instance) instance = new OPMLinkPolicy();
		return instance;
	}
	
	private OPMLinkPolicy(){}
	
	private boolean allowUnkown = false;
	private boolean isRuleUpdating = false;
	private Hashtable<String,HashSet<SourceTargetPair>> policyRules = new  Hashtable<String,HashSet<SourceTargetPair>>();
	
	public void beginUpdate(){
		//TODO maybe throw exception if already updating?
		isRuleUpdating = true;
	}
	
	public void endUpdate(){
		isRuleUpdating = false;
	}
	
	public boolean inquireIsAllowed(OPMLink link, Object source){
		if (isRuleUpdating) return false;
		if (null==source) return false;
		// policy of connection to an object not of this model
		if (!(source instanceof OPMNode)) 
			return allowUnkown; 
		String linkName =  link.getClass().getName();
		HashSet<SourceTargetPair> linkRules= policyRules.get(linkName);
		if (null == linkRules) return false;
		for (SourceTargetPair pair: linkRules)
			if (pair.source.isAssignableFrom(source.getClass())) return true;
		return false;
	}
	
	public boolean inquireIsAllowed(OPMLink link, Object source, Object target){
		if (isRuleUpdating) return false;
		if (null==source || null==target) return false;
		// policy of connection to an object not of this model
		if (!(source instanceof OPMNode) || !(target instanceof OPMNode)) 
			return allowUnkown; 
		String linkName = link.getClass().getName();
		HashSet<SourceTargetPair> linkRules= policyRules.get(linkName);
		if (null == linkRules) return false;
		for (SourceTargetPair pair: linkRules)
			if ((pair.source.isAssignableFrom(source.getClass())) &&
					pair.target.isAssignableFrom(target.getClass())) return true;
		return false;
	}

	public boolean addRule(OPMLink link, Class<?> source, Class<?> target){
		if (!isRuleUpdating) return false;
		if (!isOfOPMNode(source)) return false;
		if (!isOfOPMNode(target)) return false;
		
		String linkName =  link.getClass().getName();
		if (!policyRules.containsKey(linkName))
			policyRules.put(linkName,  new HashSet<SourceTargetPair>());
		HashSet<SourceTargetPair> linkRules = policyRules.get(linkName);
		
		SourceTargetPair added = new SourceTargetPair(source, target);
		return linkRules.add(added);
	}
	
	private boolean isOfOPMNode(Class<?> c){
		return OPMNode.class.isAssignableFrom(c);
	}
	
	/**
	 * Sets the policy for handling objects not of this Model.
	 * returns: true if update succeeded; otherwise false 
	 */
	public boolean setAllowUnkownObjects(boolean allowUnkown){
		if (!isRuleUpdating) return false;
		this.allowUnkown = allowUnkown;
		return true;
	}
	
	private class SourceTargetPair{
		private Class<?> source,target;
		private int hash;
		public SourceTargetPair(Class<?> source, Class<?> target){
			this.source = source;
			this.target = target;
			hash = source.hashCode() * 130+target.hashCode();
		}
		@Override public boolean equals(Object other){
			if (null==other) return false;
			if (!(other instanceof SourceTargetPair)) return false;
			SourceTargetPair otherPair = (SourceTargetPair) other;
			return (source.equals(otherPair.source) && target.equals(otherPair.target));
		}
		@Override public int hashCode(){return hash;}
	}
}
 