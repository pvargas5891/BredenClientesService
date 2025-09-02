/**
 * TtContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.schemas;

public class TtContext  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String propertyQualifier;

    private String propertyName;

    private String propertyValue;

    public TtContext() {
    }

    public TtContext(
           String propertyQualifier,
           String propertyName,
           String propertyValue) {
           this.propertyQualifier = propertyQualifier;
           this.propertyName = propertyName;
           this.propertyValue = propertyValue;
    }


    /**
     * Gets the propertyQualifier value for this TtContext.
     * 
     * @return propertyQualifier
     */
    public String getPropertyQualifier() {
        return propertyQualifier;
    }


    /**
     * Sets the propertyQualifier value for this TtContext.
     * 
     * @param propertyQualifier
     */
    public void setPropertyQualifier(String propertyQualifier) {
        this.propertyQualifier = propertyQualifier;
    }


    /**
     * Gets the propertyName value for this TtContext.
     * 
     * @return propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }


    /**
     * Sets the propertyName value for this TtContext.
     * 
     * @param propertyName
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }


    /**
     * Gets the propertyValue value for this TtContext.
     * 
     * @return propertyValue
     */
    public String getPropertyValue() {
        return propertyValue;
    }


    /**
     * Sets the propertyValue value for this TtContext.
     * 
     * @param propertyValue
     */
    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
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
           String mechType, 
           Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType, 
           Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
