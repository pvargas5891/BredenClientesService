/**
 * QdocWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.detail.webservices;

public interface QdocWebService_PortType extends java.rmi.Remote {
    public void processQdocMessage(javax.xml.rpc.holders.StringHolder action, javax.xml.rpc.holders.StringHolder to, javax.xml.rpc.holders.StringHolder messageID, com.breden.springboot.detail.addressing.ReferenceParametersType referenceParameters, com.breden.springboot.detail.addressing.ReplyToType replyTo, com.breden.springboot.detail.webservices.WSDLClienteAdicSFType body, javax.xml.rpc.holders.StringHolder relatesTo, com.breden.springboot.detail.holders.WSDLClienteAdicSFResponseTypeHolder body2) throws java.rmi.RemoteException;
}
