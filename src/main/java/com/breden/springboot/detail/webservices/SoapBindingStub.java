/**
 * SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.detail.webservices;

public class SoapBindingStub extends org.apache.axis.client.Stub implements com.breden.springboot.detail.webservices.QdocWebService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("processQdocMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "Action"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "ActionType"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "To"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "ToType"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "MessageID"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "MessageIDType"), java.lang.String.class, true, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "ReferenceParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "ReferenceParametersType"), com.breden.springboot.detail.addressing.ReferenceParametersType.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "ReplyTo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "ReplyToType"), com.breden.springboot.detail.addressing.ReplyToType.class, true, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ClienteAdicSF"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "WSDLClienteAdicSFType"), com.breden.springboot.detail.webservices.WSDLClienteAdicSFType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "RelatesTo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "RelatesToType"), java.lang.String.class, false, true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ClienteAdicSFResponse"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "WSDLClienteAdicSFResponseType"), com.breden.springboot.detail.webservices.WSDLClienteAdicSFResponseType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "ActionType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "MessageIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "ReferenceParametersType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.detail.addressing.ReferenceParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "RelatesToType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "ReplyToType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.detail.addressing.ReplyToType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "ToType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "DsExceptions");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.detail.schemas.Temp_err_msg[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "Temp_err_msg");
            qName2 = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "temp_err_msg");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "DsSessionContext");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.detail.schemas.TtContext[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "TtContext");
            qName2 = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "ttContext");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "Temp_err_msg");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.detail.schemas.Temp_err_msg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "TtContext");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.detail.schemas.TtContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", ">dsCustomerAdic");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.detail.webservices.Tt_customerType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "Tt_customerType");
            qName2 = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_customer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", ">dsResponse");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.detail.webservices.TtResponseResponseType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "TtResponseResponseType");
            qName2 = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttResponse");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "Tt_customerType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.detail.webservices.Tt_customerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "TtResponseResponseType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.detail.webservices.TtResponseResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "WSDLClienteAdicSFResponseType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.detail.webservices.WSDLClienteAdicSFResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "WSDLClienteAdicSFType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.detail.webservices.WSDLClienteAdicSFType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void processQdocMessage(javax.xml.rpc.holders.StringHolder action, javax.xml.rpc.holders.StringHolder to, javax.xml.rpc.holders.StringHolder messageID, com.breden.springboot.detail.addressing.ReferenceParametersType referenceParameters, com.breden.springboot.detail.addressing.ReplyToType replyTo, com.breden.springboot.detail.webservices.WSDLClienteAdicSFType body, javax.xml.rpc.holders.StringHolder relatesTo, com.breden.springboot.detail.holders.WSDLClienteAdicSFResponseTypeHolder body2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "processQdocMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {action.value, to.value, messageID.value, referenceParameters, replyTo, body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                action.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "Action"));
            } catch (java.lang.Exception _exception) {
                action.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "Action")), java.lang.String.class);
            }
            try {
                to.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "To"));
            } catch (java.lang.Exception _exception) {
                to.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "To")), java.lang.String.class);
            }
            try {
                messageID.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "MessageID"));
            } catch (java.lang.Exception _exception) {
                messageID.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "MessageID")), java.lang.String.class);
            }
            try {
                relatesTo.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "RelatesTo"));
            } catch (java.lang.Exception _exception) {
                relatesTo.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.w3.org/2005/08/addressing", "RelatesTo")), java.lang.String.class);
            }
            try {
                body2.value = (com.breden.springboot.detail.webservices.WSDLClienteAdicSFResponseType) _output.get(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ClienteAdicSFResponse"));
            } catch (java.lang.Exception _exception) {
                body2.value = (com.breden.springboot.detail.webservices.WSDLClienteAdicSFResponseType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ClienteAdicSFResponse")), com.breden.springboot.detail.webservices.WSDLClienteAdicSFResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
