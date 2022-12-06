/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface OlapPackage {

  public org.omg.java.cwm.objectmodel.core.CorePackage getCore();

  public org.omg.java.cwm.foundation.expressions.ExpressionsPackage getExpressions();

  public org.omg.java.cwm.analysis.transformation.TransformationPackage getTransformation();

  public org.omg.java.cwm.analysis.olap.ContentMapClass getContentMap();

  public org.omg.java.cwm.analysis.olap.CubeClass getCube();

  public org.omg.java.cwm.analysis.olap.CubeDeploymentClass getCubeDeployment();

  public org.omg.java.cwm.analysis.olap.CubeDimensionAssociationClass getCubeDimensionAssociation();

  public org.omg.java.cwm.analysis.olap.CubeRegionClass getCubeRegion();

  public org.omg.java.cwm.analysis.olap.DeploymentGroupClass getDeploymentGroup();

  public org.omg.java.cwm.analysis.olap.DimensionClass getDimension();

  public org.omg.java.cwm.analysis.olap.DimensionDeploymentClass getDimensionDeployment();

  public org.omg.java.cwm.analysis.olap.HierarchyClass getHierarchy();

  public org.omg.java.cwm.analysis.olap.HierarchyLevelAssociationClass getHierarchyLevelAssociation();

  public org.omg.java.cwm.analysis.olap.LevelBasedHierarchyClass getLevelBasedHierarchy();

  public org.omg.java.cwm.analysis.olap.MemberSelectionGroupClass getMemberSelectionGroup();

  public org.omg.java.cwm.analysis.olap.MemberSelectionClass getMemberSelection();

  public org.omg.java.cwm.analysis.olap.SchemaClass getSchema();

  public org.omg.java.cwm.analysis.olap.ValueBasedHierarchyClass getValueBasedHierarchy();

  public org.omg.java.cwm.analysis.olap.LevelClass getLevel();

  public org.omg.java.cwm.analysis.olap.CodedLevelClass getCodedLevel();

  public org.omg.java.cwm.analysis.olap.MeasureClass getMeasure();

  public org.omg.java.cwm.analysis.olap.StructureMapClass getStructureMap();

  public org.omg.java.cwm.analysis.olap.CubeDeploymentOwnsContentMaps getCubeDeploymentOwnsContentMaps();

  public org.omg.java.cwm.analysis.olap.DeploymentGroupReferencesDimensionDeployments getDeploymentGroupReferencesDimensionDeployments();

  public org.omg.java.cwm.analysis.olap.DeploymentGroupReferencesCubeDeployments getDeploymentGroupReferencesCubeDeployments();

  public org.omg.java.cwm.analysis.olap.SchemaOwnsDeploymentGroups getSchemaOwnsDeploymentGroups();

  public org.omg.java.cwm.analysis.olap.CubeRegionOwnsCubeDeployments getCubeRegionOwnsCubeDeployments();

  public org.omg.java.cwm.analysis.olap.CubeRegionOwnsMemberSelectionGroups getCubeRegionOwnsMemberSelectionGroups();

  public org.omg.java.cwm.analysis.olap.CubeOwnsCubeRegions getCubeOwnsCubeRegions();

  public org.omg.java.cwm.analysis.olap.DimensionDeploymentHasImmediateParent getDimensionDeploymentHasImmediateParent();

  public org.omg.java.cwm.analysis.olap.DimensionDeploymentHasListOfValues getDimensionDeploymentHasListOfValues();

  public org.omg.java.cwm.analysis.olap.DimensionDeploymentOwnsStructureMaps getDimensionDeploymentOwnsStructureMaps();

  public org.omg.java.cwm.analysis.olap.ValueBasedHierarchyOwnsDimensionDeployments getValueBasedHierarchyOwnsDimensionDeployments();

  public org.omg.java.cwm.analysis.olap.HierarchyLevelAssociationOwnsDimensionDeployments getHierarchyLevelAssociationOwnsDimensionDeployments();

  public org.omg.java.cwm.analysis.olap.SchemaOwnsDimensions getSchemaOwnsDimensions();

  public org.omg.java.cwm.analysis.olap.SchemaOwnsCubes getSchemaOwnsCubes();

  public org.omg.java.cwm.analysis.olap.MemberSelectionGroupReferencesMemberSelections getMemberSelectionGroupReferencesMemberSelections();

  public org.omg.java.cwm.analysis.olap.CubeDimensionAssociationsReferenceCalcHierarchy getCubeDimensionAssociationsReferenceCalcHierarchy();

  public org.omg.java.cwm.analysis.olap.DimensionHasDefaultHierarchy getDimensionHasDefaultHierarchy();

  public org.omg.java.cwm.analysis.olap.DimensionOwnsHierarchies getDimensionOwnsHierarchies();

  public org.omg.java.cwm.analysis.olap.CubeDimensionAssociationsReferenceDimension getCubeDimensionAssociationsReferenceDimension();

  public org.omg.java.cwm.analysis.olap.CubeOwnsCubeDimensionAssociations getCubeOwnsCubeDimensionAssociations();

  public org.omg.java.cwm.analysis.olap.DimensionOwnsMemberSelections getDimensionOwnsMemberSelections();

  public org.omg.java.cwm.analysis.olap.HierarchyLevelAssocsReferenceLevel getHierarchyLevelAssocsReferenceLevel();

  public org.omg.java.cwm.analysis.olap.LevelBasedHierarchyOwnsHierarchyLevelAssociations getLevelBasedHierarchyOwnsHierarchyLevelAssociations();

}
