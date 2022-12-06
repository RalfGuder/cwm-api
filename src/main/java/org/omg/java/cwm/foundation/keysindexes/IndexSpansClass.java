/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.keysindexes;



public interface IndexSpansClass {

  public boolean exists( org.omg.java.cwm.objectmodel.core.CoreClass spannedClass, org.omg.java.cwm.foundation.keysindexes.Index index );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.keysindexes.Index> getIndex( org.omg.java.cwm.objectmodel.core.CoreClass spannedClass );

  public org.omg.java.cwm.objectmodel.core.CoreClass getSpannedClass( org.omg.java.cwm.foundation.keysindexes.Index index );

  public boolean add( org.omg.java.cwm.objectmodel.core.CoreClass spannedClass, org.omg.java.cwm.foundation.keysindexes.Index index );

  public boolean remove( org.omg.java.cwm.objectmodel.core.CoreClass spannedClass, org.omg.java.cwm.foundation.keysindexes.Index index );

}
