package com.vainolo.phd.opmeta.interpreter.opmodel;

import java.util.List;

public interface OpmodelContainerInstance extends OpmodelInstance{

	List<OpmodelNodeInstance> getNodes();
	
	List<OpmodelLinkInstance> getLinks();
}
