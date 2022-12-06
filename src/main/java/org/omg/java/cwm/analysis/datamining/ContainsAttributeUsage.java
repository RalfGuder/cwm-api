/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface ContainsAttributeUsage{

  public boolean exists( org.omg.java.cwm.analysis.datamining.MiningSettings settings, org.omg.java.cwm.analysis.datamining.AttributeUsageRelation attributeUsage );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.AttributeUsageRelation> getAttributeUsage( org.omg.java.cwm.analysis.datamining.MiningSettings settings );

  public org.omg.java.cwm.analysis.datamining.MiningSettings getSettings( org.omg.java.cwm.analysis.datamining.AttributeUsageRelation attributeUsage );

  public boolean add( org.omg.java.cwm.analysis.datamining.MiningSettings settings, org.omg.java.cwm.analysis.datamining.AttributeUsageRelation attributeUsage );

  public boolean remove( org.omg.java.cwm.analysis.datamining.MiningSettings settings, org.omg.java.cwm.analysis.datamining.AttributeUsageRelation attributeUsage );

}
