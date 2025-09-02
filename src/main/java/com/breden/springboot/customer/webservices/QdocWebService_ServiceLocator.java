/**
 * QdocWebService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.webservices;

import org.apache.axis.client.Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import org.apache.axis.client.Stub;

public class QdocWebService_ServiceLocator extends Service implements QdocWebService_Service {

	private static final long serialVersionUID = 1L;
	private HashSet ports = null;	
    private String QdocWebServiceWSDDServiceName = "QdocWebService";
    private String QdocWebService_address = "http://qad-pilo.bredenmaster.com:8080/qxipilo/services/QdocWebService";
    
	public QdocWebService_ServiceLocator() {
    }


    public QdocWebService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QdocWebService_ServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    
    public String getQdocWebServiceAddress() {
        return QdocWebService_address;
    }

   
    public String getQdocWebServiceWSDDServiceName() {
        return QdocWebServiceWSDDServiceName;
    }

    public void setQdocWebServiceWSDDServiceName(String name) {
        QdocWebServiceWSDDServiceName = name;
    }

    

    public void setQdocWebServiceEndpointAddress(String address) {
        QdocWebService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (QdocWebService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                SoapBindingStub _stub = new SoapBindingStub(new URL(QdocWebService_address), this);
                _stub.setPortName(getQdocWebServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new ServiceException(t);
        }
        throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("QdocWebService".equals(inputPortName)) {
            return getQdocWebService();
        }
        else  {
            Remote _stub = getPort(serviceEndpointInterface);
            ((Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public QName getServiceName() {
        return new QName("urn:schemas-qad-com:xml-services", "QdocWebService");
    }

    

    public Iterator getPorts() {
        if (ports == null) {
            ports = new HashSet();
            ports.add(new QName("urn:schemas-qad-com:xml-services", "QdocWebService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws ServiceException {
        
		if ("QdocWebService".equals(portName)) {
		     setQdocWebServiceEndpointAddress(address);
        }
        else 
		{ // Unknown Port Name
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

    @Override
    public QdocWebService_PortType getQdocWebService() throws ServiceException {
        URL endpoint;
         try {
             endpoint = new URL(QdocWebService_address);
         }
         catch (MalformedURLException e) {
             throw new ServiceException(e);
         }
         return getQdocWebService(endpoint);
     }
    
     @Override	
     public QdocWebService_PortType getQdocWebService(URL portAddress) throws ServiceException {
         try {
             SoapBindingStub _stub = new SoapBindingStub(portAddress, this);
             _stub.setPortName(getQdocWebServiceWSDDServiceName());
             return _stub;
         }
         catch (org.apache.axis.AxisFault e) {
             return null;
         }
     }

}
