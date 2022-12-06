/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface AttributeUsageRelation
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.datamining.AttributeUsage getUsageType();

  public void setUsageType( org.omg.java.cwm.analysis.datamining.AttributeUsage value );

  public boolean isIncludeInApplyResult();

  public void setIncludeInApplyResult( boolean value );

  public float getWeight();

  public void setWeight( float value );

  public boolean isSuppressNormalization();

  public void setSuppressNormalization( boolean value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.datamining.MiningAttribute getAttribute();

  public void setAttribute( org.omg.java.cwm.analysis.datamining.MiningAttribute value );

}
