/**
 * QdocWebService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.webservices;
import java.net.URL;

import javax.xml.rpc.ServiceException;

import com.breden.springboot.customer.webservices.QdocWebService_PortType;

public interface QdocWebService_Service extends javax.xml.rpc.Service {
    public java.lang.String getQdocWebServiceAddress();

    public QdocWebService_PortType getQdocWebService() throws ServiceException;

    public QdocWebService_PortType getQdocWebService(URL portAddress) throws ServiceException;
}
