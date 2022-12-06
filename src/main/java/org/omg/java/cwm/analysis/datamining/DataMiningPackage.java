/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface DataMiningPackage {

  public org.omg.java.cwm.objectmodel.core.CorePackage getCore();

  public org.omg.java.cwm.objectmodel.instance.InstancePackage getInstance();

  public org.omg.java.cwm.analysis.datamining.ApplicationInputSpecificationClass getApplicationInputSpecification();

  public org.omg.java.cwm.analysis.datamining.AttributeUsageRelationClass getAttributeUsageRelation();

  public org.omg.java.cwm.analysis.datamining.CategoryClass getCategory();

  public org.omg.java.cwm.analysis.datamining.CategoryHierarchyClass getCategoryHierarchy();

  public org.omg.java.cwm.analysis.datamining.CostMatrixClass getCostMatrix();

  public org.omg.java.cwm.analysis.datamining.MiningAttributeClass getMiningAttribute();

  public org.omg.java.cwm.analysis.datamining.MiningDataSpecificationClass getMiningDataSpecification();

  public org.omg.java.cwm.analysis.datamining.MiningModelClass getMiningModel();

  public org.omg.java.cwm.analysis.datamining.MiningModelResultClass getMiningModelResult();

  public org.omg.java.cwm.analysis.datamining.NumericAttributeClass getNumericAttribute();

  public org.omg.java.cwm.analysis.datamining.SupervisedMiningModelClass getSupervisedMiningModel();

  public org.omg.java.cwm.analysis.datamining.CategoricalAttributeClass getCategoricalAttribute();

  public org.omg.java.cwm.analysis.datamining.OrdinalAttributeClass getOrdinalAttribute();

  public org.omg.java.cwm.analysis.datamining.MiningSettingsClass getMiningSettings();

  public org.omg.java.cwm.analysis.datamining.ClusteringSettingsClass getClusteringSettings();

  public org.omg.java.cwm.analysis.datamining.StatisticsSettingsClass getStatisticsSettings();

  public org.omg.java.cwm.analysis.datamining.SupervisedMiningSettingsClass getSupervisedMiningSettings();

  public org.omg.java.cwm.analysis.datamining.ClassificationSettingsClass getClassificationSettings();

  public org.omg.java.cwm.analysis.datamining.RegressionSettingsClass getRegressionSettings();

  public org.omg.java.cwm.analysis.datamining.AssociationRulesSettingsClass getAssociationRulesSettings();

  public org.omg.java.cwm.analysis.datamining.ApplicationAttributeClass getApplicationAttribute();

  public org.omg.java.cwm.analysis.datamining.OrdersCategory getOrdersCategory();

  public org.omg.java.cwm.analysis.datamining.SupervisedMiningModelReferencesTargetAttribute getSupervisedMiningModelReferencesTargetAttribute();

  public org.omg.java.cwm.analysis.datamining.MiningModelOwnsInputSpecification getMiningModelOwnsInputSpecification();

  public org.omg.java.cwm.analysis.datamining.UsesCostMatrix getUsesCostMatrix();

  public org.omg.java.cwm.analysis.datamining.UsesAsTarget getUsesAsTarget();

  public org.omg.java.cwm.analysis.datamining.UsesTransactionId getUsesTransactionId();

  public org.omg.java.cwm.analysis.datamining.UsesItemId getUsesItemId();

  public org.omg.java.cwm.analysis.datamining.PertainsToAttribute getPertainsToAttribute();

  public org.omg.java.cwm.analysis.datamining.UsesAsInput getUsesAsInput();

  public org.omg.java.cwm.analysis.datamining.ContainsAttributeUsage getContainsAttributeUsage();

  public org.omg.java.cwm.analysis.datamining.ContainsCategory getContainsCategory();

  public org.omg.java.cwm.analysis.datamining.UsesAsTaxonomy getUsesAsTaxonomy();

  public org.omg.java.cwm.analysis.datamining.HasAttribute getHasAttribute();

  public org.omg.java.cwm.analysis.datamining.ProducedByModel getProducedByModel();

  public org.omg.java.cwm.analysis.datamining.InputSpecOwnsAttributes getInputSpecOwnsAttributes();

  public org.omg.java.cwm.analysis.datamining.DerivedFromSettings getDerivedFromSettings();

}
