/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface OrdersCategory {

  public boolean exists( org.omg.java.cwm.analysis.datamining.OrdinalAttribute ordinalAttribute, org.omg.java.cwm.analysis.datamining.Category category );

  public java.util.List<? extends org.omg.java.cwm.analysis.datamining.Category> getCategory( org.omg.java.cwm.analysis.datamining.OrdinalAttribute ordinalAttribute );

  public org.omg.java.cwm.analysis.datamining.OrdinalAttribute getOrdinalAttribute( org.omg.java.cwm.analysis.datamining.Category category );

  public boolean add( org.omg.java.cwm.analysis.datamining.OrdinalAttribute ordinalAttribute, org.omg.java.cwm.analysis.datamining.Category category );

  public boolean remove( org.omg.java.cwm.analysis.datamining.OrdinalAttribute ordinalAttribute, org.omg.java.cwm.analysis.datamining.Category category );

}
