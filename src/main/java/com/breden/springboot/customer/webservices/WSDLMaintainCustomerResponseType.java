/**
 * WSDLMaintainCustomerResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.webservices;

public class WSDLMaintainCustomerResponseType  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String result;

    private com.breden.springboot.customer.schemas.TtContext[] dsSessionContext;

    private com.breden.springboot.customer.schemas.Temp_err_msg[] dsExceptions;

    private com.breden.springboot.customer.webservices.CustomerResponseType[] dsCustomerResponse;

    public WSDLMaintainCustomerResponseType() {
    }

    public WSDLMaintainCustomerResponseType(
           java.lang.String result,
           com.breden.springboot.customer.schemas.TtContext[] dsSessionContext,
           com.breden.springboot.customer.schemas.Temp_err_msg[] dsExceptions,
           com.breden.springboot.customer.webservices.CustomerResponseType[] dsCustomerResponse) {
           this.result = result;
           this.dsSessionContext = dsSessionContext;
           this.dsExceptions = dsExceptions;
           this.dsCustomerResponse = dsCustomerResponse;
    }


    /**
     * Gets the result value for this WSDLMaintainCustomerResponseType.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this WSDLMaintainCustomerResponseType.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the dsSessionContext value for this WSDLMaintainCustomerResponseType.
     * 
     * @return dsSessionContext
     */
    public com.breden.springboot.customer.schemas.TtContext[] getDsSessionContext() {
        return dsSessionContext;
    }


    /**
     * Sets the dsSessionContext value for this WSDLMaintainCustomerResponseType.
     * 
     * @param dsSessionContext
     */
    public void setDsSessionContext(com.breden.springboot.customer.schemas.TtContext[] dsSessionContext) {
        this.dsSessionContext = dsSessionContext;
    }


    /**
     * Gets the dsExceptions value for this WSDLMaintainCustomerResponseType.
     * 
     * @return dsExceptions
     */
    public com.breden.springboot.customer.schemas.Temp_err_msg[] getDsExceptions() {
        return dsExceptions;
    }


    /**
     * Sets the dsExceptions value for this WSDLMaintainCustomerResponseType.
     * 
     * @param dsExceptions
     */
    public void setDsExceptions(com.breden.springboot.customer.schemas.Temp_err_msg[] dsExceptions) {
        this.dsExceptions = dsExceptions;
    }


    /**
     * Gets the dsCustomerResponse value for this WSDLMaintainCustomerResponseType.
     * 
     * @return dsCustomerResponse
     */
    public com.breden.springboot.customer.webservices.CustomerResponseType[] getDsCustomerResponse() {
        return dsCustomerResponse;
    }


    /**
     * Sets the dsCustomerResponse value for this WSDLMaintainCustomerResponseType.
     * 
     * @param dsCustomerResponse
     */
    public void setDsCustomerResponse(com.breden.springboot.customer.webservices.CustomerResponseType[] dsCustomerResponse) {
        this.dsCustomerResponse = dsCustomerResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDLMaintainCustomerResponseType)) return false;
        WSDLMaintainCustomerResponseType other = (WSDLMaintainCustomerResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.dsSessionContext==null && other.getDsSessionContext()==null) || 
             (this.dsSessionContext!=null &&
              java.util.Arrays.equals(this.dsSessionContext, other.getDsSessionContext()))) &&
            ((this.dsExceptions==null && other.getDsExceptions()==null) || 
             (this.dsExceptions!=null &&
              java.util.Arrays.equals(this.dsExceptions, other.getDsExceptions()))) &&
            ((this.dsCustomerResponse==null && other.getDsCustomerResponse()==null) || 
             (this.dsCustomerResponse!=null &&
              java.util.Arrays.equals(this.dsCustomerResponse, other.getDsCustomerResponse())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getDsSessionContext() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDsSessionContext());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsSessionContext(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDsExceptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDsExceptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsExceptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDsCustomerResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDsCustomerResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsCustomerResponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSDLMaintainCustomerResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "WSDLMaintainCustomerResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsSessionContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "dsSessionContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "DsSessionContext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsExceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "dsExceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "DsExceptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsCustomerResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "dsCustomerResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", ">dsCustomerResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
