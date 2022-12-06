/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface UsesItemId{

  public boolean exists( org.omg.java.cwm.analysis.datamining.AssociationRulesSettings settings, org.omg.java.cwm.analysis.datamining.MiningAttribute itemId );

  public org.omg.java.cwm.analysis.datamining.MiningAttribute getItemId( org.omg.java.cwm.analysis.datamining.AssociationRulesSettings settings );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.AssociationRulesSettings> getSettings( org.omg.java.cwm.analysis.datamining.MiningAttribute itemId );

  public boolean add( org.omg.java.cwm.analysis.datamining.AssociationRulesSettings settings, org.omg.java.cwm.analysis.datamining.MiningAttribute itemId );

  public boolean remove( org.omg.java.cwm.analysis.datamining.AssociationRulesSettings settings, org.omg.java.cwm.analysis.datamining.MiningAttribute itemId );

}
