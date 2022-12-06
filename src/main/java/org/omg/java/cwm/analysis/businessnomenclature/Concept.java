/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;



public interface Concept
extends org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.objectmodel.core.Namespace getTaxonomy();

  public void setTaxonomy( org.omg.java.cwm.objectmodel.core.Namespace value );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Concept> getRelatedConcept();

}
