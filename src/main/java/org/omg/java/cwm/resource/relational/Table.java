/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface Table
extends org.omg.java.cwm.resource.relational.NamedColumnSet {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public boolean isTemporary();

  public void setTemporary( boolean value );

  public java.lang.String getTemporaryScope();

  public void setTemporaryScope( java.lang.String value );

  public boolean isSystem();

  public void setSystem( boolean value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.List getTrigger();

}
