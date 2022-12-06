/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface DerivedFromSettings {

  public boolean exists( org.omg.java.cwm.analysis.datamining.MiningModel miningModel, org.omg.java.cwm.analysis.datamining.MiningSettings settings );

  public org.omg.java.cwm.analysis.datamining.MiningSettings getSettings( org.omg.java.cwm.analysis.datamining.MiningModel miningModel );

  public org.omg.java.cwm.analysis.datamining.MiningModel getMiningModel( org.omg.java.cwm.analysis.datamining.MiningSettings settings );

  public boolean add( org.omg.java.cwm.analysis.datamining.MiningModel miningModel, org.omg.java.cwm.analysis.datamining.MiningSettings settings );

  public boolean remove( org.omg.java.cwm.analysis.datamining.MiningModel miningModel, org.omg.java.cwm.analysis.datamining.MiningSettings settings );

}
