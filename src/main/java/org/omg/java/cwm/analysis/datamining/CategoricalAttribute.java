/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface CategoricalAttribute
extends org.omg.java.cwm.analysis.datamining.MiningAttribute {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.datamining.CategoryHierarchy getTaxonomy();

  public void setTaxonomy( org.omg.java.cwm.analysis.datamining.CategoryHierarchy value );

  public java.util.Collection<? extends Category> getCategory();

}
