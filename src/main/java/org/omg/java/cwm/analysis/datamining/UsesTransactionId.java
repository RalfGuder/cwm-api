/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface UsesTransactionId {

  public boolean exists( org.omg.java.cwm.analysis.datamining.AssociationRulesSettings settings, org.omg.java.cwm.analysis.datamining.MiningAttribute transactionId );

  public org.omg.java.cwm.analysis.datamining.MiningAttribute getTransactionId( org.omg.java.cwm.analysis.datamining.AssociationRulesSettings settings );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.AssociationRulesSettings> getSettings( org.omg.java.cwm.analysis.datamining.MiningAttribute transactionId );

  public boolean add( org.omg.java.cwm.analysis.datamining.AssociationRulesSettings settings, org.omg.java.cwm.analysis.datamining.MiningAttribute transactionId );

  public boolean remove( org.omg.java.cwm.analysis.datamining.AssociationRulesSettings settings, org.omg.java.cwm.analysis.datamining.MiningAttribute transactionId );

}
