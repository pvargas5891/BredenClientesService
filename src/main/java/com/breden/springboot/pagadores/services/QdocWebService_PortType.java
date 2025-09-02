/**
 * QdocWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.pagadores.services;

public interface QdocWebService_PortType extends java.rmi.Remote {
    public void processQdocMessage(javax.xml.rpc.holders.StringHolder action, javax.xml.rpc.holders.StringHolder to, javax.xml.rpc.holders.StringHolder messageID, com.breden.springboot.pagadores.addressing.ReferenceParametersType referenceParameters, com.breden.springboot.pagadores.addressing.ReplyToType replyTo, com.breden.springboot.pagadores.services.WSDLSFRUTPagadoresType body, javax.xml.rpc.holders.StringHolder relatesTo, com.breden.springboot.pagadores.holders.WSDLSFRUTPagadoresResponseTypeHolder body2) throws java.rmi.RemoteException;
}
