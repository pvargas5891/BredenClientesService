/**
 * QdocWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.webservices;

import javax.xml.rpc.holders.StringHolder;

import com.breden.springboot.customer.addressing.ReferenceParametersType;
import com.breden.springboot.customer.addressing.ReplyToType;
import com.breden.springboot.customer.holders.WSDLMaintainCustomerResponseTypeHolder;
import com.breden.springboot.customer.webservices.WSDLMaintainCustomerType;

public interface QdocWebService_PortType extends java.rmi.Remote {
    public void processQdocMessage(StringHolder action, 
    		StringHolder to, 
    		StringHolder messageID, 
    		ReferenceParametersType referenceParameters, 
    		ReplyToType replyTo, 
    		WSDLMaintainCustomerType body, 
    		StringHolder relatesTo, 
    		WSDLMaintainCustomerResponseTypeHolder body2) 
    throws java.rmi.RemoteException;
}
