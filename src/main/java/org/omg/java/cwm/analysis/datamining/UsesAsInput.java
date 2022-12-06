/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface UsesAsInput {

  public boolean exists( org.omg.java.cwm.analysis.datamining.MiningSettings settings, org.omg.java.cwm.analysis.datamining.MiningDataSpecification dataSpecification );

  public org.omg.java.cwm.analysis.datamining.MiningDataSpecification getDataSpecification( org.omg.java.cwm.analysis.datamining.MiningSettings settings );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.MiningSettings> getSettings( org.omg.java.cwm.analysis.datamining.MiningDataSpecification dataSpecification );

  public boolean add( org.omg.java.cwm.analysis.datamining.MiningSettings settings, org.omg.java.cwm.analysis.datamining.MiningDataSpecification dataSpecification );

  public boolean remove( org.omg.java.cwm.analysis.datamining.MiningSettings settings, org.omg.java.cwm.analysis.datamining.MiningDataSpecification dataSpecification );

}
