/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;



public interface BusinessNomenclaturePackage{

  public org.omg.java.cwm.objectmodel.core.CorePackage getCore();

  public org.omg.java.cwm.analysis.businessnomenclature.VocabularyElementClass getVocabularyElement();

  public org.omg.java.cwm.analysis.businessnomenclature.NomenclatureClass getNomenclature();

  public org.omg.java.cwm.analysis.businessnomenclature.TaxonomyClass getTaxonomy();

  public org.omg.java.cwm.analysis.businessnomenclature.GlossaryClass getGlossary();

  public org.omg.java.cwm.analysis.businessnomenclature.BusinessDomainClass getBusinessDomain();

  public org.omg.java.cwm.analysis.businessnomenclature.ConceptClass getConcept();

  public org.omg.java.cwm.analysis.businessnomenclature.TermClass getTerm();

  public org.omg.java.cwm.analysis.businessnomenclature.NomenclatureHierarchy getNomenclatureHierarchy();

  public org.omg.java.cwm.analysis.businessnomenclature.WiderToNarrowerTerm getWiderToNarrowerTerm();

  public org.omg.java.cwm.analysis.businessnomenclature.SynonymToPreferredTerm getSynonymToPreferredTerm();

  public org.omg.java.cwm.analysis.businessnomenclature.VocabularyElementToModelElement getVocabularyElementToModelElement();

  public org.omg.java.cwm.analysis.businessnomenclature.RelatedTerms getRelatedTerms();

  public org.omg.java.cwm.analysis.businessnomenclature.RelatedConcepts getRelatedConcepts();

  public org.omg.java.cwm.analysis.businessnomenclature.RelatedVocabularyElements getRelatedVocabularyElements();

  public org.omg.java.cwm.analysis.businessnomenclature.TermToConcept getTermToConcept();

  public org.omg.java.cwm.analysis.businessnomenclature.GlossaryToTaxonomy getGlossaryToTaxonomy();

}
