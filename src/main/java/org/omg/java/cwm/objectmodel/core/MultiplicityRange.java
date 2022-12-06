/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;



public interface MultiplicityRange
extends org.omg.java.cwm.objectmodel.core.Element {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public int getLower();

  public void setLower( int value );

  public int getUpper();

  public void setUpper( int value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.objectmodel.core.Multiplicity getMultiplicity();

  public void setMultiplicity( org.omg.java.cwm.objectmodel.core.Multiplicity value );

}
