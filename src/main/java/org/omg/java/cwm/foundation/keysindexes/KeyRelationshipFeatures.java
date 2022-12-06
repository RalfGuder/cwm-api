/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.keysindexes;



public interface KeyRelationshipFeatures{

	public boolean exists( org.omg.java.cwm.objectmodel.core.StructuralFeature feature, org.omg.java.cwm.foundation.keysindexes.KeyRelationship keyRelationship );

	public java.util.Collection<? extends org.omg.java.cwm.foundation.keysindexes.KeyRelationship> getKeyRelationship( org.omg.java.cwm.objectmodel.core.StructuralFeature feature );

	public java.util.List<? extends org.omg.java.cwm.objectmodel.core.StructuralFeature> getFeature( org.omg.java.cwm.foundation.keysindexes.KeyRelationship keyRelationship );

	public boolean add( org.omg.java.cwm.objectmodel.core.StructuralFeature feature, org.omg.java.cwm.foundation.keysindexes.KeyRelationship keyRelationship );

	public boolean remove( org.omg.java.cwm.objectmodel.core.StructuralFeature feature, org.omg.java.cwm.foundation.keysindexes.KeyRelationship keyRelationship );

}
