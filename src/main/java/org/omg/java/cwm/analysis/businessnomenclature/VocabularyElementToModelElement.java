/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;


/**
 * This association relates a VocabularyElement to the ModelElements for which the
 * VocabularyElement provides business meaning.
 */
public interface VocabularyElementToModelElement{

  public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement vocabularyElement );

  /**
   * Identifies a VocabularyElement.
   */
  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement> getVocabularyElement( org.omg.java.cwm.objectmodel.core.ModelElement modelElement );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getModelElement( org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement vocabularyElement );

  public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement vocabularyElement );

  public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.analysis.businessnomenclature.VocabularyElement vocabularyElement );

}
