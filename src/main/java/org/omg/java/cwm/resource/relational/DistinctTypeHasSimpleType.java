/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface DistinctTypeHasSimpleType{

  public boolean exists( org.omg.java.cwm.resource.relational.SqldistinctType sqlDistinctType, org.omg.java.cwm.resource.relational.SqlsimpleType sqlSimpleType );

  public org.omg.java.cwm.resource.relational.SqlsimpleType getSqlSimpleType( org.omg.java.cwm.resource.relational.SqldistinctType sqlDistinctType );

  public java.util.Collection getSqlDistinctType( org.omg.java.cwm.resource.relational.SqlsimpleType sqlSimpleType );

  public boolean add( org.omg.java.cwm.resource.relational.SqldistinctType sqlDistinctType, org.omg.java.cwm.resource.relational.SqlsimpleType sqlSimpleType );

  public boolean remove( org.omg.java.cwm.resource.relational.SqldistinctType sqlDistinctType, org.omg.java.cwm.resource.relational.SqlsimpleType sqlSimpleType );

}
