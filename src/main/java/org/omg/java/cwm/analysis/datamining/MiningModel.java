/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface MiningModel
extends org.omg.java.cwm.objectmodel.core.CoreClass {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.String getFunction();

  public void setFunction( java.lang.String value );

  public java.lang.String getAlgorithm();

  public void setAlgorithm( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.datamining.MiningSettings getSettings();

  public void setSettings( org.omg.java.cwm.analysis.datamining.MiningSettings value );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.ApplicationInputSpecification> getInputSpec();

}
