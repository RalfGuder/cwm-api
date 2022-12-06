/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.keysindexes;



public interface IndexClass{

  public org.omg.java.cwm.foundation.keysindexes.Index createIndex( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, boolean _isPartitioning, boolean _isSorted, boolean _isUnique );

  public org.omg.java.cwm.foundation.keysindexes.Index createIndex();

}
