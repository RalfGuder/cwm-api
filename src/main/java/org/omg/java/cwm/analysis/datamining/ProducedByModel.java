/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface ProducedByModel {

  public boolean exists( org.omg.java.cwm.analysis.datamining.MiningModelResult miningResult, org.omg.java.cwm.analysis.datamining.MiningModel model );

  public org.omg.java.cwm.analysis.datamining.MiningModel getModel( org.omg.java.cwm.analysis.datamining.MiningModelResult miningResult );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.MiningModelResult> getMiningResult( org.omg.java.cwm.analysis.datamining.MiningModel model );

  public boolean add( org.omg.java.cwm.analysis.datamining.MiningModelResult miningResult, org.omg.java.cwm.analysis.datamining.MiningModel model );

  public boolean remove( org.omg.java.cwm.analysis.datamining.MiningModelResult miningResult, org.omg.java.cwm.analysis.datamining.MiningModel model );

}
