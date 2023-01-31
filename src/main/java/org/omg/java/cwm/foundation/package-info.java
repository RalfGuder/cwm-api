/**
 * <h2>Foundation</h2>
 * <h3>Overview</h3>
 * 
 * <p>The Foundation is a collection of metamodel packages that 
 * contain model elements representing concepts and structures 
 * that are shared by other CWM packages. Consequently, Foundation 
 * model elements often have a more general-purpose nature than 
 * model elements found in packages at higher CWM organizational 
 * levels.
 * 
 * <p>Foundation model elements in a particular metamodel package 
 * are not necessarily intended to describe fully all aspects of 
 * concepts and structures they represent. Rather, they are meant 
 * to provide a common foundation which other packages can extend 
 * as necessary to meet their specific needs.
 * 
 * <p>Foundation model elements differ from ObjectModel elements 
 * because they are specific to the goals and purposes of CWM. 
 * ObjectModel elements, in contrast, are of a general purpose 
 * nature and applicable in diverse areas.
 * 
 * <h3>Organization of the Foundation</h3>
 * 
 * <p>The CWM uses packages to control complexity and create 
 * groupings of logically interrelated classes. The Foundation is 
 * a collection of packages that are described together because they 
 * all provide metamodel services to other CWM packages. A subsection 
 * of this chapter is devoted to each of the Foundation packages, 
 * presented in alphabetical order. The relationship between the 
 * Foundation and each of its constituent packages is shown in Figure 5-1
 * 
 * <p>Organizing the Foundation in this fashion allows the individual 
 * metamodel packages to be understood and used independently of each 
 * other without sacrificing their common purpose. For example, a CWM 
 * extension package supporting a programming language might need the 
 * DataTypes, Expressions, TypeMapping, and SoftwareDeployment packages 
 * but not need the KeysIndexes or BusinessInformation packages.
 */
package org.omg.java.cwm.foundation;