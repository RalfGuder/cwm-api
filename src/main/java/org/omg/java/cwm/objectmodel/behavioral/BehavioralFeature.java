/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.behavioral;



public interface BehavioralFeature
extends org.omg.java.cwm.objectmodel.core.Feature {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public boolean isQuery();

  public void setQuery( boolean value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.List<? extends org.omg.java.cwm.objectmodel.behavioral.Parameter> getParameter();

}
