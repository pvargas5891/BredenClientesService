/**
 * TtqueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package com.breden.springboot.cuentacorriente.services;

public class TtqueryType implements java.io.Serializable {
    private java.lang.String tt_domain;

    private java.util.Date tt_dia;

    public TtqueryType() {
    }

    public TtqueryType(
            java.lang.String tt_domain,
            java.util.Date tt_dia) {
        this.tt_domain = tt_domain;
        this.tt_dia = tt_dia;
    }

    /**
     * Gets the tt_domain value for this TtqueryType.
     * 
     * @return tt_domain
     */
    public java.lang.String getTt_domain() {
        return tt_domain;
    }

    /**
     * Sets the tt_domain value for this TtqueryType.
     * 
     * @param tt_domain
     */
    public void setTt_domain(java.lang.String tt_domain) {
        this.tt_domain = tt_domain;
    }

    /**
     * Gets the tt_dia value for this TtqueryType.
     * 
     * @return tt_dia
     */
    public java.util.Date getTt_dia() {
        return tt_dia;
    }

    /**
     * Sets the tt_dia value for this TtqueryType.
     * 
     * @param tt_dia
     */
    public void setTt_dia(java.util.Date tt_dia) {
        this.tt_dia = tt_dia;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TtqueryType))
            return false;
        TtqueryType other = (TtqueryType) obj;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.tt_domain == null && other.getTt_domain() == null) ||
                        (this.tt_domain != null &&
                                this.tt_domain.equals(other.getTt_domain())))
                &&
                ((this.tt_dia == null && other.getTt_dia() == null) ||
                        (this.tt_dia != null &&
                                this.tt_dia.equals(other.getTt_dia())));
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
        if (getTt_domain() != null) {
            _hashCode += getTt_domain().hashCode();
        }
        if (getTt_dia() != null) {
            _hashCode += getTt_dia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            TtqueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "TtqueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_domain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_dia");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_dia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
