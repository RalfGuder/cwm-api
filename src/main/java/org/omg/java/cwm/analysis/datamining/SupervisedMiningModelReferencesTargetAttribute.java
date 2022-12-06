/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface SupervisedMiningModelReferencesTargetAttribute{

  public boolean exists( org.omg.java.cwm.analysis.datamining.ApplicationAttribute target, org.omg.java.cwm.analysis.datamining.SupervisedMiningModel supervisedMiningModel );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.SupervisedMiningModel> getSupervisedMiningModel( org.omg.java.cwm.analysis.datamining.ApplicationAttribute target );

  public org.omg.java.cwm.analysis.datamining.ApplicationAttribute getTarget( org.omg.java.cwm.analysis.datamining.SupervisedMiningModel supervisedMiningModel );

  public boolean add( org.omg.java.cwm.analysis.datamining.ApplicationAttribute target, org.omg.java.cwm.analysis.datamining.SupervisedMiningModel supervisedMiningModel );

  public boolean remove( org.omg.java.cwm.analysis.datamining.ApplicationAttribute target, org.omg.java.cwm.analysis.datamining.SupervisedMiningModel supervisedMiningModel );

}
