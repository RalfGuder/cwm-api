/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.businessinformation;

public interface BusinessInformationPackage{

  public org.omg.java.cwm.objectmodel.core.CorePackage getCore();

  public org.omg.java.cwm.foundation.businessinformation.ResponsiblePartyClass getResponsibleParty();

  public org.omg.java.cwm.foundation.businessinformation.TelephoneClass getTelephone();

  public org.omg.java.cwm.foundation.businessinformation.EmailClass getEmail();

  public org.omg.java.cwm.foundation.businessinformation.LocationClass getLocation();

  public org.omg.java.cwm.foundation.businessinformation.ContactClass getContact();

  public org.omg.java.cwm.foundation.businessinformation.DescriptionClass getDescription();

  public org.omg.java.cwm.foundation.businessinformation.DocumentClass getDocument();

  public org.omg.java.cwm.foundation.businessinformation.ResourceLocatorClass getResourceLocator();

  public org.omg.java.cwm.foundation.businessinformation.ResponsiblePartyContact getResponsiblePartyContact();

  public org.omg.java.cwm.foundation.businessinformation.ModelElementResponsibility getModelElementResponsibility();

  public org.omg.java.cwm.foundation.businessinformation.ModelElementDescription getModelElementDescription();

  public org.omg.java.cwm.foundation.businessinformation.DocumentDescribes getDocumentDescribes();

  public org.omg.java.cwm.foundation.businessinformation.ContactTelephone getContactTelephone();

  public org.omg.java.cwm.foundation.businessinformation.ContactResourceLocator getContactResourceLocator();

  public org.omg.java.cwm.foundation.businessinformation.ContactLocation getContactLocation();

  public org.omg.java.cwm.foundation.businessinformation.ContactEmail getContactEmail();

}
