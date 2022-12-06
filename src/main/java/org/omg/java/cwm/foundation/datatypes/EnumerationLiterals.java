/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.datatypes;



public interface EnumerationLiterals {

  public boolean exists( org.omg.java.cwm.foundation.datatypes.Enumeration enumeration, org.omg.java.cwm.foundation.datatypes.EnumerationLiteral literal );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.datatypes.EnumerationLiteral> getLiteral( org.omg.java.cwm.foundation.datatypes.Enumeration enumeration );

  public org.omg.java.cwm.foundation.datatypes.Enumeration getEnumeration( org.omg.java.cwm.foundation.datatypes.EnumerationLiteral literal );

  public boolean add( org.omg.java.cwm.foundation.datatypes.Enumeration enumeration, org.omg.java.cwm.foundation.datatypes.EnumerationLiteral literal );

  public boolean remove( org.omg.java.cwm.foundation.datatypes.Enumeration enumeration, org.omg.java.cwm.foundation.datatypes.EnumerationLiteral literal );

}
