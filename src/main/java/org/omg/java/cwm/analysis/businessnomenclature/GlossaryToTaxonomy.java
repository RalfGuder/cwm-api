/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;



public interface GlossaryToTaxonomy {

  public boolean exists( org.omg.java.cwm.analysis.businessnomenclature.Glossary glossary, org.omg.java.cwm.analysis.businessnomenclature.Taxonomy taxonomy );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Taxonomy> getTaxonomy( org.omg.java.cwm.analysis.businessnomenclature.Glossary glossary );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Glossary> getGlossary( org.omg.java.cwm.analysis.businessnomenclature.Taxonomy taxonomy );

  public boolean add( org.omg.java.cwm.analysis.businessnomenclature.Glossary glossary, org.omg.java.cwm.analysis.businessnomenclature.Taxonomy taxonomy );

  public boolean remove( org.omg.java.cwm.analysis.businessnomenclature.Glossary glossary, org.omg.java.cwm.analysis.businessnomenclature.Taxonomy taxonomy );

}
