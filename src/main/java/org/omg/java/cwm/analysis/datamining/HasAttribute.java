/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface HasAttribute{

  public boolean exists( org.omg.java.cwm.analysis.datamining.MiningDataSpecification dataSpecification, org.omg.java.cwm.analysis.datamining.MiningAttribute attribute );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.MiningAttribute> getAttribute( org.omg.java.cwm.analysis.datamining.MiningDataSpecification dataSpecification );

  public org.omg.java.cwm.analysis.datamining.MiningDataSpecification getDataSpecification( org.omg.java.cwm.analysis.datamining.MiningAttribute attribute );

  public boolean add( org.omg.java.cwm.analysis.datamining.MiningDataSpecification dataSpecification, org.omg.java.cwm.analysis.datamining.MiningAttribute attribute );

  public boolean remove( org.omg.java.cwm.analysis.datamining.MiningDataSpecification dataSpecification, org.omg.java.cwm.analysis.datamining.MiningAttribute attribute );

}
