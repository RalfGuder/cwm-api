/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;



public interface RelatedVocabularyElements{

  public boolean exists( org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement relatedElement, org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement element );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement> getElement( org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement relatedElement );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement> getRelatedElement( org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement element );

  public boolean add( org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement relatedElement, org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement element );

  public boolean remove( org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement relatedElement, org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement element );

}
