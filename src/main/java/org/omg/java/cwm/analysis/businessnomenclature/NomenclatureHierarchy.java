/*
 *  CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.businessnomenclature;



public interface NomenclatureHierarchy{

  public boolean exists( org.omg.java.cwm.analysis.businessnomenclature.Nomenclature parent, org.omg.java.cwm.analysis.businessnomenclature.Nomenclature child );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.businessnomenclature.Nomenclature> getChild( org.omg.java.cwm.analysis.businessnomenclature.Nomenclature parent );

  public org.omg.java.cwm.analysis.businessnomenclature.Nomenclature getParent( org.omg.java.cwm.analysis.businessnomenclature.Nomenclature child );

  public boolean add( org.omg.java.cwm.analysis.businessnomenclature.Nomenclature parent, org.omg.java.cwm.analysis.businessnomenclature.Nomenclature child );

  public boolean remove( org.omg.java.cwm.analysis.businessnomenclature.Nomenclature parent, org.omg.java.cwm.analysis.businessnomenclature.Nomenclature child );

}
