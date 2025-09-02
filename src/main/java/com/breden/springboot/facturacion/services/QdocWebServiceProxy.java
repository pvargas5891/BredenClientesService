package com.breden.springboot.facturacion.services;

public class QdocWebServiceProxy implements com.breden.springboot.facturacion.services.QdocWebService_PortType {
  private String _endpoint = null;
  private com.breden.springboot.facturacion.services.QdocWebService_PortType qdocWebService_PortType = null;
  
  public QdocWebServiceProxy() {
    _initQdocWebServiceProxy();
  }
  
  public QdocWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initQdocWebServiceProxy();
  }
  
  private void _initQdocWebServiceProxy() {
    try {
      qdocWebService_PortType = (new com.breden.springboot.facturacion.services.QdocWebService_ServiceLocator()).getQdocWebService();
      if (qdocWebService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)qdocWebService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)qdocWebService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (qdocWebService_PortType != null)
      ((javax.xml.rpc.Stub)qdocWebService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.breden.springboot.facturacion.services.QdocWebService_PortType getQdocWebService_PortType() {
    if (qdocWebService_PortType == null)
      _initQdocWebServiceProxy();
    return qdocWebService_PortType;
  }
  
  public void processQdocMessage(javax.xml.rpc.holders.StringHolder action, javax.xml.rpc.holders.StringHolder to, javax.xml.rpc.holders.StringHolder messageID, com.breden.springboot.facturacion.addressing.ReferenceParametersType referenceParameters, com.breden.springboot.facturacion.addressing.ReplyToType replyTo, com.breden.springboot.facturacion.services.WSDLQueryGetIh3SFType body, javax.xml.rpc.holders.StringHolder relatesTo, com.breden.springboot.facturacion.holders.WSDLQueryGetIh3SFResponseTypeHolder body2) throws java.rmi.RemoteException{
    if (qdocWebService_PortType == null)
      _initQdocWebServiceProxy();
    qdocWebService_PortType.processQdocMessage(action, to, messageID, referenceParameters, replyTo, body, relatesTo, body2);
  }
  
  
}