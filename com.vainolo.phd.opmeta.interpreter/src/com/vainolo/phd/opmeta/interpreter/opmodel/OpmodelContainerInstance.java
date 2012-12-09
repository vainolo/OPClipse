package com.vainolo.phd.opmeta.interpreter.opmodel;

import java.util.Collection;

public interface OpmodelContainerInstance extends OpmodelInstance{

	Collection<OpmodelNodeInstance> getNodes();
	
	Collection<OpmodelLinkInstance> getLinks();
}
