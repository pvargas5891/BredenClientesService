/**
 * TtResponseResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.webservices23;

public class TtResponseResponseType  implements java.io.Serializable {
    private java.lang.String ttNbr;

    private java.lang.String ttSev;

    private java.lang.String ttMsg;

    public TtResponseResponseType() {
    }

    public TtResponseResponseType(
           java.lang.String ttNbr,
           java.lang.String ttSev,
           java.lang.String ttMsg) {
           this.ttNbr = ttNbr;
           this.ttSev = ttSev;
           this.ttMsg = ttMsg;
    }


    /**
     * Gets the ttNbr value for this TtResponseResponseType.
     * 
     * @return ttNbr
     */
    public java.lang.String getTtNbr() {
        return ttNbr;
    }


    /**
     * Sets the ttNbr value for this TtResponseResponseType.
     * 
     * @param ttNbr
     */
    public void setTtNbr(java.lang.String ttNbr) {
        this.ttNbr = ttNbr;
    }


    /**
     * Gets the ttSev value for this TtResponseResponseType.
     * 
     * @return ttSev
     */
    public java.lang.String getTtSev() {
        return ttSev;
    }


    /**
     * Sets the ttSev value for this TtResponseResponseType.
     * 
     * @param ttSev
     */
    public void setTtSev(java.lang.String ttSev) {
        this.ttSev = ttSev;
    }


    /**
     * Gets the ttMsg value for this TtResponseResponseType.
     * 
     * @return ttMsg
     */
    public java.lang.String getTtMsg() {
        return ttMsg;
    }


    /**
     * Sets the ttMsg value for this TtResponseResponseType.
     * 
     * @param ttMsg
     */
    public void setTtMsg(java.lang.String ttMsg) {
        this.ttMsg = ttMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TtResponseResponseType)) return false;
        TtResponseResponseType other = (TtResponseResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ttNbr==null && other.getTtNbr()==null) || 
             (this.ttNbr!=null &&
              this.ttNbr.equals(other.getTtNbr()))) &&
            ((this.ttSev==null && other.getTtSev()==null) || 
             (this.ttSev!=null &&
              this.ttSev.equals(other.getTtSev()))) &&
            ((this.ttMsg==null && other.getTtMsg()==null) || 
             (this.ttMsg!=null &&
              this.ttMsg.equals(other.getTtMsg())));
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
        if (getTtNbr() != null) {
            _hashCode += getTtNbr().hashCode();
        }
        if (getTtSev() != null) {
            _hashCode += getTtSev().hashCode();
        }
        if (getTtMsg() != null) {
            _hashCode += getTtMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TtResponseResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "TtResponseResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttSev");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttSev"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
