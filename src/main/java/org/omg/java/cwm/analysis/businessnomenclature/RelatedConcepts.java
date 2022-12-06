/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;



public interface RelatedConcepts{

  public boolean exists( org.omg.java.cwm.analysis.businessnomenclature.Concept relatedConcept, org.omg.java.cwm.analysis.businessnomenclature.Concept concept );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Concept> getConcept( org.omg.java.cwm.analysis.businessnomenclature.Concept relatedConcept );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Concept> getRelatedConcept( org.omg.java.cwm.analysis.businessnomenclature.Concept concept );

  public boolean add( org.omg.java.cwm.analysis.businessnomenclature.Concept relatedConcept, org.omg.java.cwm.analysis.businessnomenclature.Concept concept );

  public boolean remove( org.omg.java.cwm.analysis.businessnomenclature.Concept relatedConcept, org.omg.java.cwm.analysis.businessnomenclature.Concept concept );

}
