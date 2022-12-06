/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface ColumnRefStructuredType {

  public boolean exists( org.omg.java.cwm.resource.relational.SqlstructuredType referencedTableType, org.omg.java.cwm.resource.relational.Column referencingColumn );

  public java.util.Collection getReferencingColumn( org.omg.java.cwm.resource.relational.SqlstructuredType referencedTableType );

  public org.omg.java.cwm.resource.relational.SqlstructuredType getReferencedTableType( org.omg.java.cwm.resource.relational.Column referencingColumn );

  public boolean add( org.omg.java.cwm.resource.relational.SqlstructuredType referencedTableType, org.omg.java.cwm.resource.relational.Column referencingColumn );

  public boolean remove( org.omg.java.cwm.resource.relational.SqlstructuredType referencedTableType, org.omg.java.cwm.resource.relational.Column referencingColumn );

}
