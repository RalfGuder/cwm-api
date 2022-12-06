/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;



public interface TermToConcept {

  public boolean exists( org.omg.java.cwm.analysis.businessnomenclature.Concept concept, org.omg.java.cwm.analysis.businessnomenclature.Term term );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Term> getTerm( org.omg.java.cwm.analysis.businessnomenclature.Concept concept );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Concept> getConcept( org.omg.java.cwm.analysis.businessnomenclature.Term term );

  public boolean add( org.omg.java.cwm.analysis.businessnomenclature.Concept concept, org.omg.java.cwm.analysis.businessnomenclature.Term term );

  public boolean remove( org.omg.java.cwm.analysis.businessnomenclature.Concept concept, org.omg.java.cwm.analysis.businessnomenclature.Term term );

}
