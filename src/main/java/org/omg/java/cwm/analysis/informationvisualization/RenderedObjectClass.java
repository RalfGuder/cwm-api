/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.informationvisualization;



public interface RenderedObjectClass{

  public org.omg.java.cwm.analysis.informationvisualization.RenderedObject createRenderedObject( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, boolean _isAbstract, org.omg.java.cwm.foundation.expressions.ExpressionNode _formula, java.lang.String _action, java.lang.String _fileName, java.lang.String _type, java.lang.String _url );

  public org.omg.java.cwm.analysis.informationvisualization.RenderedObject createRenderedObject();

}
