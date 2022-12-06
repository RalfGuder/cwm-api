/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.relationships;



public interface AssociationEndClass{

  public org.omg.java.cwm.objectmodel.relationships.AssociationEnd createAssociationEnd( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.objectmodel.core.ScopeKind _ownerScope, org.omg.java.cwm.objectmodel.core.ChangeableKind _changeability, org.omg.java.cwm.objectmodel.core.Multiplicity _multiplicity, org.omg.java.cwm.objectmodel.core.OrderingKind _ordering, org.omg.java.cwm.objectmodel.core.ScopeKind _targetScope, org.omg.java.cwm.objectmodel.relationships.AggregationKind _aggregation, boolean _isNavigable );

  public org.omg.java.cwm.objectmodel.relationships.AssociationEnd createAssociationEnd();

}
