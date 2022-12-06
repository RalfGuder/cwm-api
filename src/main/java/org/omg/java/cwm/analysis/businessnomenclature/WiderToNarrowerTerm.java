/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;


/**
 * This association relates a wider term to its narrower terms.
 * 
 * @author Ralf Guder
 */
public interface WiderToNarrowerTerm{

  public boolean exists( org.omg.java.cwm.analysis.businessnomenclature.Term widerTerm, org.omg.java.cwm.analysis.businessnomenclature.Term narrowerTerm );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Term> getNarrowerTerm( org.omg.java.cwm.analysis.businessnomenclature.Term widerTerm );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Term> getWiderTerm( org.omg.java.cwm.analysis.businessnomenclature.Term narrowerTerm );

  public boolean add( org.omg.java.cwm.analysis.businessnomenclature.Term widerTerm, org.omg.java.cwm.analysis.businessnomenclature.Term narrowerTerm );

  public boolean remove( org.omg.java.cwm.analysis.businessnomenclature.Term widerTerm, org.omg.java.cwm.analysis.businessnomenclature.Term narrowerTerm );

}
