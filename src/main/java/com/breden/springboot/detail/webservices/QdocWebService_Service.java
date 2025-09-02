/**
 * QdocWebService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.detail.webservices;

public interface QdocWebService_Service extends javax.xml.rpc.Service {
    public java.lang.String getQdocWebServiceAddress();

    public com.breden.springboot.detail.webservices.QdocWebService_PortType getQdocWebService() throws javax.xml.rpc.ServiceException;

    public com.breden.springboot.detail.webservices.QdocWebService_PortType getQdocWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
