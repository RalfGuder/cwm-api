/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.relationships;



public interface ParentElement{

  public boolean exists( org.omg.java.cwm.objectmodel.core.Classifier parent, org.omg.java.cwm.objectmodel.relationships.Generalization specialization );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.relationships.Generalization> getSpecialization( org.omg.java.cwm.objectmodel.core.Classifier parent );

  public org.omg.java.cwm.objectmodel.core.Classifier getParent( org.omg.java.cwm.objectmodel.relationships.Generalization specialization );

  public boolean add( org.omg.java.cwm.objectmodel.core.Classifier parent, org.omg.java.cwm.objectmodel.relationships.Generalization specialization );

  public boolean remove( org.omg.java.cwm.objectmodel.core.Classifier parent, org.omg.java.cwm.objectmodel.relationships.Generalization specialization );

}
