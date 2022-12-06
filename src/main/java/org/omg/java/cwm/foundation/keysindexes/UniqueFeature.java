/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.keysindexes;


/**
 * The UniqueFeature association identifies the Feature instances of a Class instance that
 * confer uniqueness. The ordered constraint is used to determine the order of
 * StructuralFeature instances in the UniqueKey instance. 
 */
public interface UniqueFeature {

	public boolean exists( org.omg.java.cwm.objectmodel.core.StructuralFeature feature, org.omg.java.cwm.foundation.keysindexes.UniqueKey uniqueKey );

	public java.util.Collection<? extends org.omg.java.cwm.foundation.keysindexes.UniqueKey> getUniqueKey( org.omg.java.cwm.objectmodel.core.StructuralFeature feature );

	public java.util.List<? extends org.omg.java.cwm.objectmodel.core.StructuralFeature> getFeature( org.omg.java.cwm.foundation.keysindexes.UniqueKey uniqueKey );

	public boolean add( org.omg.java.cwm.objectmodel.core.StructuralFeature feature, org.omg.java.cwm.foundation.keysindexes.UniqueKey uniqueKey );

	public boolean remove( org.omg.java.cwm.objectmodel.core.StructuralFeature feature, org.omg.java.cwm.foundation.keysindexes.UniqueKey uniqueKey );

}
