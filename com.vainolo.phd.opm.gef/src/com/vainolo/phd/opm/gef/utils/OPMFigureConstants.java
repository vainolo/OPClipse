/*******************************************************************************
 * Copyright (c) 2012 Arieh 'Vainolo' Bibliowicz
 * You can use this code for educational purposes. For any other uses
 * please contact me: vainolo@gmail.com
 *******************************************************************************/
package com.vainolo.phd.opm.gef.utils;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.graphics.Color;

public enum OPMFigureConstants {
  INSTANCE;
  public static Color opmLabelColor = ColorConstants.black;
  public static Color opmObjectColor = ColorConstants.green;
  public static Color opmProcessColor = ColorConstants.blue;
  public static Color opmStateColor = ColorConstants.gray;
  public static int entityBorderWidth = 2;
  public static int inZoomedThingBorderWidth = 3;
  public static int connectionLineWidth = 1;
  public static int agentCircleRadius = 5;
  public static final int opmNodeInsets = 2;

}
