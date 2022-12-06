/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface UsesAsTaxonomy {

  public boolean exists( org.omg.java.cwm.analysis.datamining.CategoricalAttribute categoricalAttribute, org.omg.java.cwm.analysis.datamining.CategoryHierarchy taxonomy );

  public org.omg.java.cwm.analysis.datamining.CategoryHierarchy getTaxonomy( org.omg.java.cwm.analysis.datamining.CategoricalAttribute categoricalAttribute );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.CategoricalAttribute> getCategoricalAttribute( org.omg.java.cwm.analysis.datamining.CategoryHierarchy taxonomy );

  public boolean add( org.omg.java.cwm.analysis.datamining.CategoricalAttribute categoricalAttribute, org.omg.java.cwm.analysis.datamining.CategoryHierarchy taxonomy );

  public boolean remove( org.omg.java.cwm.analysis.datamining.CategoricalAttribute categoricalAttribute, org.omg.java.cwm.analysis.datamining.CategoryHierarchy taxonomy );

}
