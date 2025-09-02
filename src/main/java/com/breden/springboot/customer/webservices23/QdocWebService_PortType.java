/**
 * QdocWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.webservices23;

public interface QdocWebService_PortType extends java.rmi.Remote {
    public void processQdocMessage(javax.xml.rpc.holders.StringHolder action, javax.xml.rpc.holders.StringHolder to, javax.xml.rpc.holders.StringHolder messageID, com.breden.springboot.customer.addressing23.ReferenceParametersType referenceParameters, com.breden.springboot.customer.addressing23.ReplyToType replyTo, com.breden.springboot.customer.webservices23.WSDLMaintainCustomerSFType body, javax.xml.rpc.holders.StringHolder relatesTo, com.breden.springboot.customer.holders23.WSDLMaintainCustomerSFResponseTypeHolder body2) throws java.rmi.RemoteException;
}
