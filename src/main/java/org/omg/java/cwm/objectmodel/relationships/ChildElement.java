/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.relationships;



public interface ChildElement{

  public boolean exists( org.omg.java.cwm.objectmodel.core.Classifier child, org.omg.java.cwm.objectmodel.relationships.Generalization generalization );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.relationships.Generalization> getGeneralization( org.omg.java.cwm.objectmodel.core.Classifier child );

  public org.omg.java.cwm.objectmodel.core.Classifier getChild( org.omg.java.cwm.objectmodel.relationships.Generalization generalization );

  public boolean add( org.omg.java.cwm.objectmodel.core.Classifier child, org.omg.java.cwm.objectmodel.relationships.Generalization generalization );

  public boolean remove( org.omg.java.cwm.objectmodel.core.Classifier child, org.omg.java.cwm.objectmodel.relationships.Generalization generalization );

}
