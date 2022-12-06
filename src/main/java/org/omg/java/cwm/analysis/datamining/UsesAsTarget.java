/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface UsesAsTarget{

  public boolean exists( org.omg.java.cwm.analysis.datamining.SupervisedMiningSettings settings, org.omg.java.cwm.analysis.datamining.MiningAttribute target );

  public org.omg.java.cwm.analysis.datamining.MiningAttribute getTarget( org.omg.java.cwm.analysis.datamining.SupervisedMiningSettings settings );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.SupervisedMiningSettings> getSettings( org.omg.java.cwm.analysis.datamining.MiningAttribute target );

  public boolean add( org.omg.java.cwm.analysis.datamining.SupervisedMiningSettings settings, org.omg.java.cwm.analysis.datamining.MiningAttribute target );

  public boolean remove( org.omg.java.cwm.analysis.datamining.SupervisedMiningSettings settings, org.omg.java.cwm.analysis.datamining.MiningAttribute target );

}
