/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.keysindexes;



public interface IndexedFeatureInfo {

	public boolean exists( org.omg.java.cwm.foundation.keysindexes.Index index, org.omg.java.cwm.foundation.keysindexes.IndexedFeature indexedFeature );

	public java.util.List<? extends org.omg.java.cwm.foundation.keysindexes.IndexedFeature> getIndexedFeature( org.omg.java.cwm.foundation.keysindexes.Index index );

	public org.omg.java.cwm.foundation.keysindexes.Index getIndex( org.omg.java.cwm.foundation.keysindexes.IndexedFeature indexedFeature );

	public boolean add( org.omg.java.cwm.foundation.keysindexes.Index index, org.omg.java.cwm.foundation.keysindexes.IndexedFeature indexedFeature );

	public boolean remove( org.omg.java.cwm.foundation.keysindexes.Index index, org.omg.java.cwm.foundation.keysindexes.IndexedFeature indexedFeature );

}
