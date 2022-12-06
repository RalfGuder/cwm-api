/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;



public interface AttributeClass {

  public org.omg.java.cwm.objectmodel.core.Attribute createAttribute( java.lang.String name, org.omg.java.cwm.objectmodel.core.VisibilityKind visibility, org.omg.java.cwm.objectmodel.core.ScopeKind ownerScope, org.omg.java.cwm.objectmodel.core.ChangeableKind changeability, org.omg.java.cwm.objectmodel.core.Multiplicity multiplicity, org.omg.java.cwm.objectmodel.core.OrderingKind ordering, org.omg.java.cwm.objectmodel.core.ScopeKind targetScope, org.omg.java.cwm.objectmodel.core.Expression initialValue );
  public org.omg.java.cwm.objectmodel.core.Attribute createAttribute();

}
