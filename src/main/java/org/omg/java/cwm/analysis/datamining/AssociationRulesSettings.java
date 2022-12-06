/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface AssociationRulesSettings
extends org.omg.java.cwm.analysis.datamining.MiningSettings {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public float getMinimumSupport();

  public void setMinimumSupport( float value );

  public float getMinimumConfidence();

  public void setMinimumConfidence( float value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.datamining.MiningAttribute getItemId();

  public void setItemId( org.omg.java.cwm.analysis.datamining.MiningAttribute value );

  public org.omg.java.cwm.analysis.datamining.MiningAttribute getTransactionId();

  public void setTransactionId( org.omg.java.cwm.analysis.datamining.MiningAttribute value );

}
