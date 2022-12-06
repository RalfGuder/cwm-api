/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface PertainsToAttribute {

  public boolean exists( org.omg.java.cwm.analysis.datamining.AttributeUsageRelation attributeUsage, org.omg.java.cwm.analysis.datamining.MiningAttribute attribute );

  public org.omg.java.cwm.analysis.datamining.MiningAttribute getAttribute( org.omg.java.cwm.analysis.datamining.AttributeUsageRelation attributeUsage );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.AttributeUsageRelation> getAttributeUsage( org.omg.java.cwm.analysis.datamining.MiningAttribute attribute );

  public boolean add( org.omg.java.cwm.analysis.datamining.AttributeUsageRelation attributeUsage, org.omg.java.cwm.analysis.datamining.MiningAttribute attribute );

  public boolean remove( org.omg.java.cwm.analysis.datamining.AttributeUsageRelation attributeUsage, org.omg.java.cwm.analysis.datamining.MiningAttribute attribute );

}
