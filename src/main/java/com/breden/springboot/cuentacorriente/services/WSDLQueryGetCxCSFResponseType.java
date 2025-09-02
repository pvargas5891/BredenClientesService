/**
 * WSDLQueryGetCxCSFResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package com.breden.springboot.cuentacorriente.services;

import com.breden.springboot.cuentacorriente.common.Temp_err_msg;
import com.breden.springboot.cuentacorriente.common.TtContext;

public class WSDLQueryGetCxCSFResponseType implements java.io.Serializable {
    private java.lang.String result;

    private TtContext[] dsSessionContext;

    private Temp_err_msg[] dsExceptions;

    private Tt_doctosResponseType[] dsOrder;

    public WSDLQueryGetCxCSFResponseType() {
    }

    public WSDLQueryGetCxCSFResponseType(
            java.lang.String result,
            TtContext[] dsSessionContext,
            Temp_err_msg[] dsExceptions,
            Tt_doctosResponseType[] dsOrder) {
        this.result = result;
        this.dsSessionContext = dsSessionContext;
        this.dsExceptions = dsExceptions;
        this.dsOrder = dsOrder;
    }

    /**
     * Gets the result value for this WSDLQueryGetCxCSFResponseType.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }

    /**
     * Sets the result value for this WSDLQueryGetCxCSFResponseType.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }

    /**
     * Gets the dsSessionContext value for this WSDLQueryGetCxCSFResponseType.
     * 
     * @return dsSessionContext
     */
    public TtContext[] getDsSessionContext() {
        return dsSessionContext;
    }

    /**
     * Sets the dsSessionContext value for this WSDLQueryGetCxCSFResponseType.
     * 
     * @param dsSessionContext
     */
    public void setDsSessionContext(TtContext[] dsSessionContext) {
        this.dsSessionContext = dsSessionContext;
    }

    /**
     * Gets the dsExceptions value for this WSDLQueryGetCxCSFResponseType.
     * 
     * @return dsExceptions
     */
    public Temp_err_msg[] getDsExceptions() {
        return dsExceptions;
    }

    /**
     * Sets the dsExceptions value for this WSDLQueryGetCxCSFResponseType.
     * 
     * @param dsExceptions
     */
    public void setDsExceptions(Temp_err_msg[] dsExceptions) {
        this.dsExceptions = dsExceptions;
    }

    /**
     * Gets the dsOrder value for this WSDLQueryGetCxCSFResponseType.
     * 
     * @return dsOrder
     */
    public Tt_doctosResponseType[] getDsOrder() {
        return dsOrder;
    }

    /**
     * Sets the dsOrder value for this WSDLQueryGetCxCSFResponseType.
     * 
     * @param dsOrder
     */
    public void setDsOrder(Tt_doctosResponseType[] dsOrder) {
        this.dsOrder = dsOrder;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDLQueryGetCxCSFResponseType))
            return false;
        WSDLQueryGetCxCSFResponseType other = (WSDLQueryGetCxCSFResponseType) obj;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.result == null && other.getResult() == null) ||
                        (this.result != null &&
                                this.result.equals(other.getResult())))
                &&
                ((this.dsSessionContext == null && other.getDsSessionContext() == null) ||
                        (this.dsSessionContext != null &&
                                java.util.Arrays.equals(this.dsSessionContext, other.getDsSessionContext())))
                &&
                ((this.dsExceptions == null && other.getDsExceptions() == null) ||
                        (this.dsExceptions != null &&
                                java.util.Arrays.equals(this.dsExceptions, other.getDsExceptions())))
                &&
                ((this.dsOrder == null && other.getDsOrder() == null) ||
                        (this.dsOrder != null &&
                                java.util.Arrays.equals(this.dsOrder, other.getDsOrder())));
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
            for (int i = 0; i < java.lang.reflect.Array.getLength(getDsSessionContext()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsSessionContext(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDsExceptions() != null) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(getDsExceptions()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsExceptions(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDsOrder() != null) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(getDsOrder()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsOrder(), i);
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
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            WSDLQueryGetCxCSFResponseType.class, true);

    static {
        typeDesc.setXmlType(
                new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "WSDLQueryGetCxCSFResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsSessionContext");
        elemField.setXmlName(
                new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "dsSessionContext"));
        elemField.setXmlType(
                new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "DsSessionContext"));
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
        elemField.setFieldName("dsOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "dsOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", ">dsOrder"));
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
        return new org.apache.axis.encoding.ser.BeanSerializer(
                _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(
                _javaType, _xmlType, typeDesc);
    }

}
