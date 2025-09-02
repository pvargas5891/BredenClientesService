/**
 * QdocWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package com.breden.springboot.sellout.services;

import com.breden.springboot.sellout.addressing.ReferenceParametersType;
import com.breden.springboot.sellout.addressing.ReplyToType;
import com.breden.springboot.sellout.holders.WSDLSFSellOutResponseTypeHolder;

public interface QdocWebService_PortType extends java.rmi.Remote {
    public void processQdocMessage(javax.xml.rpc.holders.StringHolder action, javax.xml.rpc.holders.StringHolder to, javax.xml.rpc.holders.StringHolder messageID, ReferenceParametersType referenceParameters, ReplyToType replyTo, WSDLSFSellOutType body, javax.xml.rpc.holders.StringHolder relatesTo, WSDLSFSellOutResponseTypeHolder body2) throws java.rmi.RemoteException;
}
