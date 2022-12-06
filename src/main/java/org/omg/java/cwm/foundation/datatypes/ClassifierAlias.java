/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.datatypes;



public interface ClassifierAlias {

  public boolean exists( org.omg.java.cwm.objectmodel.core.Classifier type, org.omg.java.cwm.foundation.datatypes.TypeAlias alias );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.datatypes.TypeAlias> getAlias( org.omg.java.cwm.objectmodel.core.Classifier type );

  public org.omg.java.cwm.objectmodel.core.Classifier getType( org.omg.java.cwm.foundation.datatypes.TypeAlias alias );

  public boolean add( org.omg.java.cwm.objectmodel.core.Classifier type, org.omg.java.cwm.foundation.datatypes.TypeAlias alias );

  public boolean remove( org.omg.java.cwm.objectmodel.core.Classifier type, org.omg.java.cwm.foundation.datatypes.TypeAlias alias );

}
