/**
 * TtContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.facturacion.common;

public class TtContext  implements java.io.Serializable {
    private java.lang.String propertyQualifier;

    private java.lang.String propertyName;

    private java.lang.String propertyValue;

    public TtContext() {
    }

    public TtContext(
           java.lang.String propertyQualifier,
           java.lang.String propertyName,
           java.lang.String propertyValue) {
           this.propertyQualifier = propertyQualifier;
           this.propertyName = propertyName;
           this.propertyValue = propertyValue;
    }


    /**
     * Gets the propertyQualifier value for this TtContext.
     * 
     * @return propertyQualifier
     */
    public java.lang.String getPropertyQualifier() {
        return propertyQualifier;
    }


    /**
     * Sets the propertyQualifier value for this TtContext.
     * 
     * @param propertyQualifier
     */
    public void setPropertyQualifier(java.lang.String propertyQualifier) {
        this.propertyQualifier = propertyQualifier;
    }


    /**
     * Gets the propertyName value for this TtContext.
     * 
     * @return propertyName
     */
    public java.lang.String getPropertyName() {
        return propertyName;
    }


    /**
     * Sets the propertyName value for this TtContext.
     * 
     * @param propertyName
     */
    public void setPropertyName(java.lang.String propertyName) {
        this.propertyName = propertyName;
    }


    /**
     * Gets the propertyValue value for this TtContext.
     * 
     * @return propertyValue
     */
    public java.lang.String getPropertyValue() {
        return propertyValue;
    }


    /**
     * Sets the propertyValue value for this TtContext.
     * 
     * @param propertyValue
     */
    public void setPropertyValue(java.lang.String propertyValue) {
        this.propertyValue = propertyValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TtContext)) return false;
        TtContext other = (TtContext) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.propertyQualifier==null && other.getPropertyQualifier()==null) || 
             (this.propertyQualifier!=null &&
              this.propertyQualifier.equals(other.getPropertyQualifier()))) &&
            ((this.propertyName==null && other.getPropertyName()==null) || 
             (this.propertyName!=null &&
              this.propertyName.equals(other.getPropertyName()))) &&
            ((this.propertyValue==null && other.getPropertyValue()==null) || 
             (this.propertyValue!=null &&
              this.propertyValue.equals(other.getPropertyValue())));
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
        if (getPropertyQualifier() != null) {
            _hashCode += getPropertyQualifier().hashCode();
        }
        if (getPropertyName() != null) {
            _hashCode += getPropertyName().hashCode();
        }
        if (getPropertyValue() != null) {
            _hashCode += getPropertyValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TtContext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "TtContext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyQualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "propertyQualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "propertyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "propertyValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
