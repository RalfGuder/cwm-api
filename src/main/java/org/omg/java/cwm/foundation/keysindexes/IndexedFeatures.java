/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.keysindexes;



public interface IndexedFeatures {

	public boolean exists( org.omg.java.cwm.objectmodel.core.StructuralFeature feature, org.omg.java.cwm.foundation.keysindexes.IndexedFeature indexedFeature );

	public java.util.Collection<? extends org.omg.java.cwm.foundation.keysindexes.IndexedFeature> getIndexedFeature( org.omg.java.cwm.objectmodel.core.StructuralFeature feature );

	public org.omg.java.cwm.objectmodel.core.StructuralFeature getFeature( org.omg.java.cwm.foundation.keysindexes.IndexedFeature indexedFeature );

	public boolean add( org.omg.java.cwm.objectmodel.core.StructuralFeature feature, org.omg.java.cwm.foundation.keysindexes.IndexedFeature indexedFeature );

	public boolean remove( org.omg.java.cwm.objectmodel.core.StructuralFeature feature, org.omg.java.cwm.foundation.keysindexes.IndexedFeature indexedFeature );

}
