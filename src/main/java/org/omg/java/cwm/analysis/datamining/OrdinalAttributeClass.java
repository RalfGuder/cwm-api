/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface OrdinalAttributeClass{

  public org.omg.java.cwm.analysis.datamining.OrdinalAttribute createOrdinalAttribute( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.objectmodel.core.ScopeKind _ownerScope, org.omg.java.cwm.objectmodel.core.ChangeableKind _changeability, org.omg.java.cwm.objectmodel.core.Multiplicity _multiplicity, org.omg.java.cwm.objectmodel.core.OrderingKind _ordering, org.omg.java.cwm.objectmodel.core.ScopeKind _targetScope, org.omg.java.cwm.objectmodel.core.Expression _initialValue, boolean _isCyclic, org.omg.java.cwm.analysis.datamining.OrderType _orderingType );

  public org.omg.java.cwm.analysis.datamining.OrdinalAttribute createOrdinalAttribute();

}
