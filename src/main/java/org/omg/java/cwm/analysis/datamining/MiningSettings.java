/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface MiningSettings
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

  /**
   * @see ContainsAttributeUsage#getAttributeUsage(MiningSettings)
   */
  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.AttributeUsageRelation> getAttributeUsage();

  public org.omg.java.cwm.analysis.datamining.MiningDataSpecification getDataSpecification();

  public void setDataSpecification( org.omg.java.cwm.analysis.datamining.MiningDataSpecification value );

}
