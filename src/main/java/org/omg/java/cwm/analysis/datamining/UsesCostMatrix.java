/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface UsesCostMatrix{

  public boolean exists( org.omg.java.cwm.analysis.datamining.ClassificationSettings settings, org.omg.java.cwm.analysis.datamining.CostMatrix costMatrix );

  public org.omg.java.cwm.analysis.datamining.CostMatrix getCostMatrix( org.omg.java.cwm.analysis.datamining.ClassificationSettings settings );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.ClassificationSettings> getSettings( org.omg.java.cwm.analysis.datamining.CostMatrix costMatrix );

  public boolean add( org.omg.java.cwm.analysis.datamining.ClassificationSettings settings, org.omg.java.cwm.analysis.datamining.CostMatrix costMatrix );

  public boolean remove( org.omg.java.cwm.analysis.datamining.ClassificationSettings settings, org.omg.java.cwm.analysis.datamining.CostMatrix costMatrix );

}
