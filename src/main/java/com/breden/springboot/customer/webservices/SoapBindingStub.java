/**
 * SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.webservices;

import java.util.Enumeration;
import java.util.Map;
import java.util.Vector;

import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.utils.JavaUtils;
import javax.xml.namespace.QName;
import java.net.URL;
import java.rmi.RemoteException;
import org.apache.axis.client.Stub;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class SoapBindingStub extends Stub implements com.breden.springboot.customer.webservices.QdocWebService_PortType {
    private Vector cachedSerClasses = new Vector();
    private Vector cachedSerQNames = new Vector();
    private Vector cachedSerFactories = new Vector();
    private Vector cachedDeserFactories = new Vector();

    static OperationDesc [] _operations;

    static {
        _operations = new OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        OperationDesc oper;
        ParameterDesc param;
        oper = new OperationDesc();
        oper.setName("processQdocMessage");
        param = new ParameterDesc(new QName("http://www.w3.org/2005/08/addressing", "Action"), ParameterDesc.INOUT, new QName("http://www.w3.org/2005/08/addressing", "ActionType"), String.class, true, true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://www.w3.org/2005/08/addressing", "To"), ParameterDesc.INOUT, new QName("http://www.w3.org/2005/08/addressing", "ToType"), String.class, true, true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://www.w3.org/2005/08/addressing", "MessageID"), ParameterDesc.INOUT, new QName("http://www.w3.org/2005/08/addressing", "MessageIDType"), String.class, true, true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://www.w3.org/2005/08/addressing", "ReferenceParameters"), ParameterDesc.IN, new QName("http://www.w3.org/2005/08/addressing", "ReferenceParametersType"), com.breden.springboot.customer.addressing.ReferenceParametersType.class, true, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://www.w3.org/2005/08/addressing", "ReplyTo"), ParameterDesc.IN, new QName("http://www.w3.org/2005/08/addressing", "ReplyToType"), com.breden.springboot.customer.addressing.ReplyToType.class, true, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("urn:schemas-qad-com:xml-services", "maintainCustomer"), ParameterDesc.IN, new QName("urn:schemas-qad-com:xml-services", "WSDLMaintainCustomerType"), com.breden.springboot.customer.webservices.WSDLMaintainCustomerType.class, false, false);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("http://www.w3.org/2005/08/addressing", "RelatesTo"), ParameterDesc.OUT, new QName("http://www.w3.org/2005/08/addressing", "RelatesToType"), String.class, false, true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("urn:schemas-qad-com:xml-services", "maintainCustomerResponse"), ParameterDesc.OUT, new QName("urn:schemas-qad-com:xml-services", "WSDLMaintainCustomerResponseType"), com.breden.springboot.customer.webservices.WSDLMaintainCustomerResponseType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SoapBindingStub(URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new Service();
        } else {
            super.service = service;
        }
        ((Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            QName qName;
            QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new QName("http://www.w3.org/2005/08/addressing", "ActionType");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new QName("http://www.w3.org/2005/08/addressing", "MessageIDType");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new QName("http://www.w3.org/2005/08/addressing", "ReferenceParametersType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.addressing.ReferenceParametersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("http://www.w3.org/2005/08/addressing", "RelatesToType");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new QName("http://www.w3.org/2005/08/addressing", "ReplyToType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.addressing.ReplyToType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("http://www.w3.org/2005/08/addressing", "ToType");
            cachedSerQNames.add(qName);
            cls = String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new QName("urn:schemas-qad-com:xml-services:common", "DsExceptions");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.schemas.Temp_err_msg[].class;
            cachedSerClasses.add(cls);
            qName = new QName("urn:schemas-qad-com:xml-services:common", "Temp_err_msg");
            qName2 = new QName("urn:schemas-qad-com:xml-services:common", "temp_err_msg");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new QName("urn:schemas-qad-com:xml-services:common", "DsSessionContext");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.schemas.TtContext[].class;
            cachedSerClasses.add(cls);
            qName = new QName("urn:schemas-qad-com:xml-services:common", "TtContext");
            qName2 = new QName("urn:schemas-qad-com:xml-services:common", "ttContext");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new QName("urn:schemas-qad-com:xml-services:common", "Temp_err_msg");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.schemas.Temp_err_msg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("urn:schemas-qad-com:xml-services:common", "TtContext");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.schemas.TtContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("urn:schemas-qad-com:xml-services", ">dsCustomer");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.webservices.CustomerType[].class;
            cachedSerClasses.add(cls);
            qName = new QName("urn:schemas-qad-com:xml-services", "CustomerType");
            qName2 = new QName("urn:schemas-qad-com:xml-services", "customer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new QName("urn:schemas-qad-com:xml-services", ">dsCustomerResponse");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.webservices.CustomerResponseType[].class;
            cachedSerClasses.add(cls);
            qName = new QName("urn:schemas-qad-com:xml-services", "CustomerResponseType");
            qName2 = new QName("urn:schemas-qad-com:xml-services", "customer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new QName("urn:schemas-qad-com:xml-services", "BankAccountsResponseType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.webservices.BankAccountsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("urn:schemas-qad-com:xml-services", "BankAccountsType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.webservices.BankAccountsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("urn:schemas-qad-com:xml-services", "CustomerResponseType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.webservices.CustomerResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("urn:schemas-qad-com:xml-services", "CustomerType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.webservices.CustomerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("urn:schemas-qad-com:xml-services", "WSDLMaintainCustomerResponseType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.webservices.WSDLMaintainCustomerResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new QName("urn:schemas-qad-com:xml-services", "WSDLMaintainCustomerType");
            cachedSerQNames.add(qName);
            cls = com.breden.springboot.customer.webservices.WSDLMaintainCustomerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected Call createCall() throws RemoteException {
        try {
            Call _call = super._createCall();
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
            Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
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
                        Class cls = (Class) cachedSerClasses.get(i);
                        QName qName =
                                (QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
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
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void processQdocMessage(javax.xml.rpc.holders.StringHolder action, javax.xml.rpc.holders.StringHolder to, javax.xml.rpc.holders.StringHolder messageID, com.breden.springboot.customer.addressing.ReferenceParametersType referenceParameters, com.breden.springboot.customer.addressing.ReplyToType replyTo, com.breden.springboot.customer.webservices.WSDLMaintainCustomerType body, javax.xml.rpc.holders.StringHolder relatesTo, com.breden.springboot.customer.holders.WSDLMaintainCustomerResponseTypeHolder body2) throws RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("", "processQdocMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        
        try {        
		 	Object _resp = _call.invoke(new Object[] {action.value, to.value, messageID.value, referenceParameters, replyTo, body});
	
	        if (_resp instanceof RemoteException) {
	            throw (RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            Map _output;
	            _output = _call.getOutputParams();
	            try {
	                action.value = (String) _output.get(new QName("http://www.w3.org/2005/08/addressing", "Action"));
	            } catch (Exception _exception) {
	                action.value = (String) JavaUtils.convert(_output.get(new QName("http://www.w3.org/2005/08/addressing", "Action")), String.class);
	            }
	            try {
	                to.value = (String) _output.get(new QName("http://www.w3.org/2005/08/addressing", "To"));
	            } catch (Exception _exception) {
	                to.value = (String) JavaUtils.convert(_output.get(new QName("http://www.w3.org/2005/08/addressing", "To")), String.class);
	            }
	            try {
	                messageID.value = (String) _output.get(new QName("http://www.w3.org/2005/08/addressing", "MessageID"));
	            } catch (Exception _exception) {
	                messageID.value = (String) JavaUtils.convert(_output.get(new QName("http://www.w3.org/2005/08/addressing", "MessageID")), String.class);
	            }
	            try {
	                relatesTo.value = (String) _output.get(new QName("http://www.w3.org/2005/08/addressing", "RelatesTo"));
	            } catch (Exception _exception) {
	                relatesTo.value = (String) JavaUtils.convert(_output.get(new QName("http://www.w3.org/2005/08/addressing", "RelatesTo")), String.class);
	            }
	            try {
	                body2.value = (com.breden.springboot.customer.webservices.WSDLMaintainCustomerResponseType) _output.get(new QName("urn:schemas-qad-com:xml-services", "maintainCustomerResponse"));
	            } catch (Exception _exception) {
	                body2.value = (com.breden.springboot.customer.webservices.WSDLMaintainCustomerResponseType) JavaUtils.convert(_output.get(new QName("urn:schemas-qad-com:xml-services", "maintainCustomerResponse")), com.breden.springboot.customer.webservices.WSDLMaintainCustomerResponseType.class);
	            }
	        }
        } catch (org.apache.axis.AxisFault axisFaultException) {
        	throw axisFaultException;
        }
    }

}
