/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.record;



public interface FixedOffsetFieldClass{

  public org.omg.java.cwm.resource.record.FixedOffsetField createFixedOffsetField( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.objectmodel.core.ScopeKind _ownerScope, org.omg.java.cwm.objectmodel.core.ChangeableKind _changeability, org.omg.java.cwm.objectmodel.core.Multiplicity _multiplicity, org.omg.java.cwm.objectmodel.core.OrderingKind _ordering, org.omg.java.cwm.objectmodel.core.ScopeKind _targetScope, org.omg.java.cwm.objectmodel.core.Expression _initialValue, java.lang.Integer _length, java.lang.Integer _precision, java.lang.Integer _scale, int _offset, int _offsetUnitBits );

  public org.omg.java.cwm.resource.record.FixedOffsetField createFixedOffsetField();

}
