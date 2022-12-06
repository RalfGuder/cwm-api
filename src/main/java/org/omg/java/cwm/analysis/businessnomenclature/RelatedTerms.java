/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;



public interface RelatedTerms {

  public boolean exists( org.omg.java.cwm.analysis.businessnomenclature.Term relatedTerm, org.omg.java.cwm.analysis.businessnomenclature.Term term );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Term> getTerm( org.omg.java.cwm.analysis.businessnomenclature.Term relatedTerm );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Term> getRelatedTerm( org.omg.java.cwm.analysis.businessnomenclature.Term term );

  public boolean add( org.omg.java.cwm.analysis.businessnomenclature.Term relatedTerm, org.omg.java.cwm.analysis.businessnomenclature.Term term );

  public boolean remove( org.omg.java.cwm.analysis.businessnomenclature.Term relatedTerm, org.omg.java.cwm.analysis.businessnomenclature.Term term );

}
