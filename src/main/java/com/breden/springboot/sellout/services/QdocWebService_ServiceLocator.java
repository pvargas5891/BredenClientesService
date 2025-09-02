/**
 * QdocWebService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

 package com.breden.springboot.sellout.services;

public class QdocWebService_ServiceLocator extends org.apache.axis.client.Service implements QdocWebService_Service {

    public QdocWebService_ServiceLocator() {
    }


    public QdocWebService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QdocWebService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for QdocWebService
    private java.lang.String QdocWebService_address = "http://qad-pilo.bredenmaster.com:8080/qxipilo/services/QdocWebService";

    public java.lang.String getQdocWebServiceAddress() {
        return QdocWebService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String QdocWebServiceWSDDServiceName = "QdocWebService";

    public java.lang.String getQdocWebServiceWSDDServiceName() {
        return QdocWebServiceWSDDServiceName;
    }

    public void setQdocWebServiceWSDDServiceName(java.lang.String name) {
        QdocWebServiceWSDDServiceName = name;
    }

    public QdocWebService_PortType getQdocWebService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(QdocWebService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getQdocWebService(endpoint);
    }

    public QdocWebService_PortType getQdocWebService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            SoapBindingStub _stub = new SoapBindingStub(portAddress, this);
            _stub.setPortName(getQdocWebServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setQdocWebServiceEndpointAddress(java.lang.String address) {
        QdocWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (QdocWebService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                SoapBindingStub _stub = new SoapBindingStub(new java.net.URL(QdocWebService_address), this);
                _stub.setPortName(getQdocWebServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("QdocWebService".equals(inputPortName)) {
            return getQdocWebService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "QdocWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "QdocWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("QdocWebService".equals(portName)) {
            setQdocWebServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
