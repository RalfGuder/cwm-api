/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;

public interface Taxonomy
extends org.omg.java.cwm.analysis.businessnomenclature.Nomenclature {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.objectmodel.core.Namespace getDomain();

  public void setDomain( org.omg.java.cwm.objectmodel.core.Namespace value );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getConcept();

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Nomenclature> getSubtaxonomy();

}
