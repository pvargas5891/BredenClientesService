/**
 * QdocWebService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

 package com.breden.springboot.sellout.services;

public interface QdocWebService_Service extends javax.xml.rpc.Service {
    public java.lang.String getQdocWebServiceAddress();

    public QdocWebService_PortType getQdocWebService() throws javax.xml.rpc.ServiceException;

    public QdocWebService_PortType getQdocWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
