/**
 * QdocWebService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package com.breden.springboot.cuentacorriente.services;

import com.breden.springboot.cuentacorriente.addressing.ReferenceParametersType;
import com.breden.springboot.cuentacorriente.addressing.ReplyToType;
import com.breden.springboot.cuentacorriente.holders.WSDLQueryGetCxCSFResponseTypeHolder;

public interface QdocWebService_PortType extends java.rmi.Remote {
    public void processQdocMessage(javax.xml.rpc.holders.StringHolder action, javax.xml.rpc.holders.StringHolder to,
            javax.xml.rpc.holders.StringHolder messageID,
            ReferenceParametersType referenceParameters,
            ReplyToType replyTo,
            WSDLQueryGetCxCSFType body, javax.xml.rpc.holders.StringHolder relatesTo,
            WSDLQueryGetCxCSFResponseTypeHolder body2)
            throws java.rmi.RemoteException;
}
