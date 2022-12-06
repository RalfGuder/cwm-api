/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface MiningModelOwnsInputSpecification{

  public boolean exists( org.omg.java.cwm.analysis.datamining.MiningModel miningModel, org.omg.java.cwm.analysis.datamining.ApplicationInputSpecification inputSpec );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.ApplicationInputSpecification> getInputSpec( org.omg.java.cwm.analysis.datamining.MiningModel miningModel );

  public org.omg.java.cwm.analysis.datamining.MiningModel getMiningModel( org.omg.java.cwm.analysis.datamining.ApplicationInputSpecification inputSpec );

  public boolean add( org.omg.java.cwm.analysis.datamining.MiningModel miningModel, org.omg.java.cwm.analysis.datamining.ApplicationInputSpecification inputSpec );

  public boolean remove( org.omg.java.cwm.analysis.datamining.MiningModel miningModel, org.omg.java.cwm.analysis.datamining.ApplicationInputSpecification inputSpec );

}
