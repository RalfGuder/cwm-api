/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.keysindexes;



public interface UniqueKeyRelationship {

	public boolean exists( org.omg.java.cwm.foundation.keysindexes.KeyRelationship keyRelationship, org.omg.java.cwm.foundation.keysindexes.UniqueKey uniqueKey );

	public org.omg.java.cwm.foundation.keysindexes.UniqueKey getUniqueKey( org.omg.java.cwm.foundation.keysindexes.KeyRelationship keyRelationship );

	public java.util.Collection<? extends org.omg.java.cwm.foundation.keysindexes.KeyRelationship> getKeyRelationship( org.omg.java.cwm.foundation.keysindexes.UniqueKey uniqueKey );

	public boolean add( org.omg.java.cwm.foundation.keysindexes.KeyRelationship keyRelationship, org.omg.java.cwm.foundation.keysindexes.UniqueKey uniqueKey );

	public boolean remove( org.omg.java.cwm.foundation.keysindexes.KeyRelationship keyRelationship, org.omg.java.cwm.foundation.keysindexes.UniqueKey uniqueKey );

}
