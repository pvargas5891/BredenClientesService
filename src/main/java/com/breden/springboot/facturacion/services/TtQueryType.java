/**
 * TtQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.facturacion.services;

public class TtQueryType  implements java.io.Serializable {
    private java.lang.String tt_domain;

    private java.util.Date tt_fecha;

    public TtQueryType() {
    }

    public TtQueryType(
           java.lang.String tt_domain,
           java.util.Date tt_fecha) {
           this.tt_domain = tt_domain;
           this.tt_fecha = tt_fecha;
    }


    /**
     * Gets the tt_domain value for this TtQueryType.
     * 
     * @return tt_domain
     */
    public java.lang.String getTt_domain() {
        return tt_domain;
    }


    /**
     * Sets the tt_domain value for this TtQueryType.
     * 
     * @param tt_domain
     */
    public void setTt_domain(java.lang.String tt_domain) {
        this.tt_domain = tt_domain;
    }


    /**
     * Gets the tt_fecha value for this TtQueryType.
     * 
     * @return tt_fecha
     */
    public java.util.Date getTt_fecha() {
        return tt_fecha;
    }


    /**
     * Sets the tt_fecha value for this TtQueryType.
     * 
     * @param tt_fecha
     */
    public void setTt_fecha(java.util.Date tt_fecha) {
        this.tt_fecha = tt_fecha;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TtQueryType)) return false;
        TtQueryType other = (TtQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tt_domain==null && other.getTt_domain()==null) || 
             (this.tt_domain!=null &&
              this.tt_domain.equals(other.getTt_domain()))) &&
            ((this.tt_fecha==null && other.getTt_fecha()==null) || 
             (this.tt_fecha!=null &&
              this.tt_fecha.equals(other.getTt_fecha())));
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
        if (getTt_fecha() != null) {
            _hashCode += getTt_fecha().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TtQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "TtQueryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_domain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_fecha"));
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
