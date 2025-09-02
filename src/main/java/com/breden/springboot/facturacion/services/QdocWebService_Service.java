/**
 * QdocWebService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.facturacion.services;

public interface QdocWebService_Service extends javax.xml.rpc.Service {
    public java.lang.String getQdocWebServiceAddress();

    public com.breden.springboot.facturacion.services.QdocWebService_PortType getQdocWebService() throws javax.xml.rpc.ServiceException;

    public com.breden.springboot.facturacion.services.QdocWebService_PortType getQdocWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
