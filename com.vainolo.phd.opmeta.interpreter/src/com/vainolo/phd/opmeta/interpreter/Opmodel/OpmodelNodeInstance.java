package com.vainolo.phd.opmeta.interpreter.opmodel;

import java.awt.Rectangle;

public interface OpmodelNodeInstance extends OpmodelInstance {

	public void setConstraints(Rectangle constraints);
	
	public Rectangle getConstraints();
}
