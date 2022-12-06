/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface SupervisedMiningSettings
extends org.omg.java.cwm.analysis.datamining.MiningSettings {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.String getConfidenceAttributeName();

  public void setConfidenceAttributeName( java.lang.String value );

  public java.lang.String getPredictedAttributeName();

  public void setPredictedAttributeName( java.lang.String value );

  public java.lang.String getCostFunction();

  public void setCostFunction( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.datamining.MiningAttribute getTarget();

  public void setTarget( org.omg.java.cwm.analysis.datamining.MiningAttribute value );

}
