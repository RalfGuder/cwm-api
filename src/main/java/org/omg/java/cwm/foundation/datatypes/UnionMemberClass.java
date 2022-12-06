/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.datatypes;

import org.omg.java.cwm.objectmodel.core.ChangeableKind;
import org.omg.java.cwm.objectmodel.core.Expression;
import org.omg.java.cwm.objectmodel.core.Multiplicity;
import org.omg.java.cwm.objectmodel.core.OrderingKind;
import org.omg.java.cwm.objectmodel.core.ScopeKind;
import org.omg.java.cwm.objectmodel.core.VisibilityKind;

public interface UnionMemberClass {

	public UnionMember createUnionMember(String _name, VisibilityKind _visibility, ScopeKind _ownerScope,
			ChangeableKind _changeability, Multiplicity _multiplicity, OrderingKind _ordering, ScopeKind _targetScope,
			Expression _initialValue, Expression _memberCase, boolean _isDefault);

	public org.omg.java.cwm.foundation.datatypes.UnionMember createUnionMember();

}
