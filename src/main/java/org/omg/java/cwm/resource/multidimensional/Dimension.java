/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.multidimensional;



public interface Dimension
extends org.omg.java.cwm.objectmodel.core.CoreClass {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.List getDimensionedObject();

  public java.util.Collection getComponent();

  public java.util.Collection getComposite();

  public java.util.Collection getMemberSet();

  public org.omg.java.cwm.resource.multidimensional.Schema getSchema();

  public void setSchema( org.omg.java.cwm.resource.multidimensional.Schema value );

}
