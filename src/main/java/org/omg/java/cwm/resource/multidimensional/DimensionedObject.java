/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.multidimensional;



public interface DimensionedObject
extends org.omg.java.cwm.objectmodel.core.Attribute {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection getDimension();

  public org.omg.java.cwm.resource.multidimensional.Schema getSchema();

  public void setSchema( org.omg.java.cwm.resource.multidimensional.Schema value );

}
