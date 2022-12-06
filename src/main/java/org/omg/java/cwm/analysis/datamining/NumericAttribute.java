/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface NumericAttribute
extends org.omg.java.cwm.analysis.datamining.MiningAttribute {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public float getLowerBound();

  public void setLowerBound( float value );

  public float getUpperBound();

  public void setUpperBound( float value );

  public boolean isCyclic();

  public void setCyclic( boolean value );

  public boolean isDiscrete();

  public void setDiscrete( boolean value );

}
