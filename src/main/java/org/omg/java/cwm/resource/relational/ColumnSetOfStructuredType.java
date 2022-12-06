/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface ColumnSetOfStructuredType{

  public boolean exists( org.omg.java.cwm.resource.relational.SqlstructuredType type, org.omg.java.cwm.resource.relational.NamedColumnSet columnSet );

  public java.util.Collection getColumnSet( org.omg.java.cwm.resource.relational.SqlstructuredType type );

  public org.omg.java.cwm.resource.relational.SqlstructuredType getType( org.omg.java.cwm.resource.relational.NamedColumnSet columnSet );

  public boolean add( org.omg.java.cwm.resource.relational.SqlstructuredType type, org.omg.java.cwm.resource.relational.NamedColumnSet columnSet );

  public boolean remove( org.omg.java.cwm.resource.relational.SqlstructuredType type, org.omg.java.cwm.resource.relational.NamedColumnSet columnSet );

}
