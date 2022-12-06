/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;



public interface SynonymToPreferredTerm{

  public boolean exists( org.omg.java.cwm.analysis.businessnomenclature.Term preferredTerm, org.omg.java.cwm.analysis.businessnomenclature.Term synonym );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Term> getSynonym( org.omg.java.cwm.analysis.businessnomenclature.Term preferredTerm );

  public org.omg.java.cwm.analysis.businessnomenclature.Term getPreferredTerm( org.omg.java.cwm.analysis.businessnomenclature.Term synonym );

  public boolean add( org.omg.java.cwm.analysis.businessnomenclature.Term preferredTerm, org.omg.java.cwm.analysis.businessnomenclature.Term synonym );

  public boolean remove( org.omg.java.cwm.analysis.businessnomenclature.Term preferredTerm, org.omg.java.cwm.analysis.businessnomenclature.Term synonym );

}
