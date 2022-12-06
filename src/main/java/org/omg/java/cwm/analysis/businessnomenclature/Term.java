/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;



public interface Term
extends VocabularyElement {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.objectmodel.core.Namespace getGlossary();

  public void setGlossary( org.omg.java.cwm.objectmodel.core.Namespace value );

  public java.util.Collection<? extends Concept> getConcept();

  public java.util.Collection<? extends Term> getRelatedTerm();

  public Term getPreferredTerm();

  public void setPreferredTerm( Term value );

  public java.util.Collection<? extends Term> getNarrowerTerm();

}
