package org.omg.java.cwm;
/*
 * CWM "Complete Package" Factory Interface
 *
 * Based on CWM Version 1.0 and Java(TM) Metadata Interface Version 1.0.
 *
 * CwmCompletePackage.java is a factory interface for instantiating CWM packages. It can be used as a top-level
 * entry point to a CWM implementation. Note that CwmCompletePackage is not a part of the CWM itself, and it
 * is not mandatory that it be used. Any conceivable mechanism whereby instances of CWM packages are obtained
 * may be used for accessing a CWM resource.
 *
 * How a Java client might acquire an instance of CwmCompletePackage is determined by the CWM implementation itself.
 * For example, an instance of CwmCompletePackage might be provided by some factory object, or possibly via a
 * connection (e.g., see http://www.wiley.com/legacy/compbooks/poole/whitepapers/JMIJ2EEConnectorArchitecture.pdf).
 * A skeletal implementation class of the CwmCompletePackage interface, CwmCompletePackageImpl.java, is also available.
 * This implementation class, as distributed, compiles, but its methods do not do anything useful (each method returns
 * null or some other constant value of its return type). It is the responsibility of the CWM developer to decide whether
 * or not to use CwmCompletePackage or CwmCompletePackageImpl, and, if so, to write the actual implementation code for 
 * each method. In typical usage, a Java client will "new" the implementation class. This is illustrated by the following
 * sample code fragment:
 * 
 *        CwmCompletePackage cwmCompPkg = new CwmCompletePackageImpl();
 *        org.omg.java.cwm.analysis.olap.OlapPackage olapPkg = cwmCompPkg.getOlap();
 *        org.omg.java.cwm.analysis.olap.DimensionClass dimClass = olapPkg.getDimension();
 *        org.omg.java.cwm.analysis.olap.Dimension dim = dimClass.createDimension();
 *            ...etc...
 */

public interface CwmCompletePackage{

  public org.omg.java.cwm.objectmodel.core.CorePackage getCore();

  public org.omg.java.cwm.objectmodel.behavioral.BehavioralPackage getBehavioral();

  public org.omg.java.cwm.objectmodel.relationships.RelationshipsPackage getRelationships();

  public org.omg.java.cwm.objectmodel.instance.InstancePackage getInstance();

  public org.omg.java.cwm.foundation.businessinformation.BusinessInformationPackage getBusinessInformation();

  public org.omg.java.cwm.foundation.datatypes.DataTypesPackage getDataTypes();

  public org.omg.java.cwm.foundation.expressions.ExpressionsPackage getExpressions();

  public org.omg.java.cwm.foundation.keysindexes.KeysIndexesPackage getKeysIndexes();

  public org.omg.java.cwm.foundation.softwaredeployment.SoftwareDeploymentPackage getSoftwareDeployment();

  public org.omg.java.cwm.foundation.typemapping.TypeMappingPackage getTypeMapping();

  public org.omg.java.cwm.resource.relational.RelationalPackage getRelational();

  public org.omg.java.cwm.resource.record.RecordPackage getRecord();

  public org.omg.java.cwm.resource.multidimensional.MultidimensionalPackage getMultidimensional();

  public org.omg.java.cwm.resource.xml.XmlPackage getXml();

  public org.omg.java.cwm.analysis.transformation.TransformationPackage getTransformation();

  public org.omg.java.cwm.analysis.olap.OlapPackage getOlap();

  public org.omg.java.cwm.analysis.businessnomenclature.BusinessNomenclaturePackage getBusinessNomenclature();

  public org.omg.java.cwm.analysis.datamining.DataMiningPackage getDataMining();

  public org.omg.java.cwm.analysis.informationvisualization.InformationVisualizationPackage getInformationVisualization();

  public org.omg.java.cwm.management.warehouseprocess.WarehouseProcessPackage getWarehouseProcess();

  public org.omg.java.cwm.management.warehouseoperation.WarehouseOperationPackage getWarehouseOperation();

}
