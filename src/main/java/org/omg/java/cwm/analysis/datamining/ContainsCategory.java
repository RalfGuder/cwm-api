/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface ContainsCategory{

  public boolean exists( org.omg.java.cwm.analysis.datamining.CategoricalAttribute categoricalAttribute, org.omg.java.cwm.analysis.datamining.Category category );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.Category> getCategory( org.omg.java.cwm.analysis.datamining.CategoricalAttribute categoricalAttribute );

  public org.omg.java.cwm.analysis.datamining.CategoricalAttribute getCategoricalAttribute( org.omg.java.cwm.analysis.datamining.Category category );

  public boolean add( org.omg.java.cwm.analysis.datamining.CategoricalAttribute categoricalAttribute, org.omg.java.cwm.analysis.datamining.Category category );

  public boolean remove( org.omg.java.cwm.analysis.datamining.CategoricalAttribute categoricalAttribute, org.omg.java.cwm.analysis.datamining.Category category );

}
