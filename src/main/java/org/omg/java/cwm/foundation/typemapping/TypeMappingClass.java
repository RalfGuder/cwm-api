/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.typemapping;



public interface TypeMappingClass {

  public org.omg.java.cwm.foundation.typemapping.TypeMapping createTypeMapping( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, boolean _isBestMatch, boolean _isLossy );

  public org.omg.java.cwm.foundation.typemapping.TypeMapping createTypeMapping();

}
