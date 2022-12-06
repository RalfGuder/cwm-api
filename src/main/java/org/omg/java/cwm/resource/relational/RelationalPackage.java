/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface RelationalPackage {

  public org.omg.java.cwm.resource.relational.enumerations.EnumerationsPackage getEnumerations();

  public org.omg.java.cwm.objectmodel.core.CorePackage getCore();

  public org.omg.java.cwm.foundation.datatypes.DataTypesPackage getDataTypes();

  public org.omg.java.cwm.objectmodel.behavioral.BehavioralPackage getBehavioral();

  public org.omg.java.cwm.objectmodel.instance.InstancePackage getInstance();

  public org.omg.java.cwm.foundation.keysindexes.KeysIndexesPackage getKeysIndexes();

  public org.omg.java.cwm.resource.relational.CatalogClass getCatalog();

  public org.omg.java.cwm.resource.relational.SchemaClass getSchema();

  public org.omg.java.cwm.resource.relational.ColumnSetClass getColumnSet();

  public org.omg.java.cwm.resource.relational.NamedColumnSetClass getNamedColumnSet();

  public org.omg.java.cwm.resource.relational.TableClass getTable();

  public org.omg.java.cwm.resource.relational.ViewClass getView();

  public org.omg.java.cwm.resource.relational.QueryColumnSetClass getQueryColumnSet();

  public org.omg.java.cwm.resource.relational.SqldataTypeClass getSqldataType();

  public org.omg.java.cwm.resource.relational.SqldistinctTypeClass getSqldistinctType();

  public org.omg.java.cwm.resource.relational.SqlsimpleTypeClass getSqlsimpleType();

  public org.omg.java.cwm.resource.relational.SqlstructuredTypeClass getSqlstructuredType();

  public org.omg.java.cwm.resource.relational.ColumnClass getColumn();

  public org.omg.java.cwm.resource.relational.ProcedureClass getProcedure();

  public org.omg.java.cwm.resource.relational.TriggerClass getTrigger();

  public org.omg.java.cwm.resource.relational.SqlindexClass getSqlindex();

  public org.omg.java.cwm.resource.relational.UniqueConstraintClass getUniqueConstraint();

  public org.omg.java.cwm.resource.relational.ForeignKeyClass getForeignKey();

  public org.omg.java.cwm.resource.relational.SqlindexColumnClass getSqlindexColumn();

  public org.omg.java.cwm.resource.relational.PrimaryKeyClass getPrimaryKey();

  public org.omg.java.cwm.resource.relational.RowClass getRow();

  public org.omg.java.cwm.resource.relational.ColumnValueClass getColumnValue();

  public org.omg.java.cwm.resource.relational.CheckConstraintClass getCheckConstraint();

  public org.omg.java.cwm.resource.relational.RowSetClass getRowSet();

  public org.omg.java.cwm.resource.relational.SqlparameterClass getSqlparameter();

  public org.omg.java.cwm.resource.relational.DistinctTypeHasSimpleType getDistinctTypeHasSimpleType();

  public org.omg.java.cwm.resource.relational.ColumnOptionsColumnSet getColumnOptionsColumnSet();

  public org.omg.java.cwm.resource.relational.ColumnRefStructuredType getColumnRefStructuredType();

  public org.omg.java.cwm.resource.relational.ColumnSetOfStructuredType getColumnSetOfStructuredType();

  public org.omg.java.cwm.resource.relational.TableOwningTrigger getTableOwningTrigger();

  public org.omg.java.cwm.resource.relational.TriggerUsingColumnSet getTriggerUsingColumnSet();

}
