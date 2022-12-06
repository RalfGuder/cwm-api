/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;

public interface Glossary
extends org.omg.java.cwm.analysis.businessnomenclature.Nomenclature {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.String getLanguage();

  public void setLanguage( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Taxonomy> getTaxonomy();

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getTerm();

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Nomenclature> getSubglossary();

}
