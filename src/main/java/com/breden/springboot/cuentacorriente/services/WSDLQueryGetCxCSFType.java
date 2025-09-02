/**
 * WSDLQueryGetCxCSFType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package com.breden.springboot.cuentacorriente.services;

import com.breden.springboot.cuentacorriente.common.TtContext;

public class WSDLQueryGetCxCSFType implements java.io.Serializable {
    private TtContext[] dsSessionContext;

    private TtqueryType[] dsQuery;

    public WSDLQueryGetCxCSFType() {
    }

    public WSDLQueryGetCxCSFType(
            TtContext[] dsSessionContext,
            TtqueryType[] dsQuery) {
        this.dsSessionContext = dsSessionContext;
        this.dsQuery = dsQuery;
    }

    /**
     * Gets the dsSessionContext value for this WSDLQueryGetCxCSFType.
     * 
     * @return dsSessionContext
     */
    public TtContext[] getDsSessionContext() {
        return dsSessionContext;
    }

    /**
     * Sets the dsSessionContext value for this WSDLQueryGetCxCSFType.
     * 
     * @param dsSessionContext
     */
    public void setDsSessionContext(TtContext[] dsSessionContext) {
        this.dsSessionContext = dsSessionContext;
    }

    /**
     * Gets the dsQuery value for this WSDLQueryGetCxCSFType.
     * 
     * @return dsQuery
     */
    public TtqueryType[] getDsQuery() {
        return dsQuery;
    }

    /**
     * Sets the dsQuery value for this WSDLQueryGetCxCSFType.
     * 
     * @param dsQuery
     */
    public void setDsQuery(TtqueryType[] dsQuery) {
        this.dsQuery = dsQuery;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDLQueryGetCxCSFType))
            return false;
        WSDLQueryGetCxCSFType other = (WSDLQueryGetCxCSFType) obj;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.dsSessionContext == null && other.getDsSessionContext() == null) ||
                        (this.dsSessionContext != null &&
                                java.util.Arrays.equals(this.dsSessionContext, other.getDsSessionContext())))
                &&
                ((this.dsQuery == null && other.getDsQuery() == null) ||
                        (this.dsQuery != null &&
                                java.util.Arrays.equals(this.dsQuery, other.getDsQuery())));
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
        if (getDsSessionContext() != null) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(getDsSessionContext()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsSessionContext(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDsQuery() != null) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(getDsQuery()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsQuery(), i);
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
            WSDLQueryGetCxCSFType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "WSDLQueryGetCxCSFType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsSessionContext");
        elemField.setXmlName(
                new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "dsSessionContext"));
        elemField.setXmlType(
                new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "DsSessionContext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "dsQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", ">dsQuery"));
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
