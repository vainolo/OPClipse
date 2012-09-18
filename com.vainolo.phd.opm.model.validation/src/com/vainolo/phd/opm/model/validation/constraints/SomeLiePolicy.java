package com.vainolo.phd.opm.model.validation.constraints;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMNode;

public class SomeLiePolicy {

	
	public boolean put(Class<?> linkType, Object source, Object target, boolean isValid){
		if (!OPMLink.class.isAssignableFrom(linkType)) return false;
		
		
		
		return true;
	}
	
	public boolean InquireIsAllowed(OPMLink link){
		Class<?> linkType = link.getClass();
		OPMNode source = link.getSource();
		OPMNode target = link.getTarget();
		
		
		return false;
	}
	
}
