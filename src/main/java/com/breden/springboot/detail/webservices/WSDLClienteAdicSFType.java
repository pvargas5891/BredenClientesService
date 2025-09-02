/**
 * WSDLClienteAdicSFType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.detail.webservices;

public class WSDLClienteAdicSFType  implements java.io.Serializable {
    private com.breden.springboot.detail.schemas.TtContext[] dsSessionContext;

    private com.breden.springboot.detail.webservices.Tt_customerType[] dsCustomerAdic;

    public WSDLClienteAdicSFType() {
    }

    public WSDLClienteAdicSFType(
           com.breden.springboot.detail.schemas.TtContext[] dsSessionContext,
           com.breden.springboot.detail.webservices.Tt_customerType[] dsCustomerAdic) {
           this.dsSessionContext = dsSessionContext;
           this.dsCustomerAdic = dsCustomerAdic;
    }


    /**
     * Gets the dsSessionContext value for this WSDLClienteAdicSFType.
     * 
     * @return dsSessionContext
     */
    public com.breden.springboot.detail.schemas.TtContext[] getDsSessionContext() {
        return dsSessionContext;
    }


    /**
     * Sets the dsSessionContext value for this WSDLClienteAdicSFType.
     * 
     * @param dsSessionContext
     */
    public void setDsSessionContext(com.breden.springboot.detail.schemas.TtContext[] dsSessionContext) {
        this.dsSessionContext = dsSessionContext;
    }


    /**
     * Gets the dsCustomerAdic value for this WSDLClienteAdicSFType.
     * 
     * @return dsCustomerAdic
     */
    public com.breden.springboot.detail.webservices.Tt_customerType[] getDsCustomerAdic() {
        return dsCustomerAdic;
    }


    /**
     * Sets the dsCustomerAdic value for this WSDLClienteAdicSFType.
     * 
     * @param dsCustomerAdic
     */
    public void setDsCustomerAdic(com.breden.springboot.detail.webservices.Tt_customerType[] dsCustomerAdic) {
        this.dsCustomerAdic = dsCustomerAdic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDLClienteAdicSFType)) return false;
        WSDLClienteAdicSFType other = (WSDLClienteAdicSFType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dsSessionContext==null && other.getDsSessionContext()==null) || 
             (this.dsSessionContext!=null &&
              java.util.Arrays.equals(this.dsSessionContext, other.getDsSessionContext()))) &&
            ((this.dsCustomerAdic==null && other.getDsCustomerAdic()==null) || 
             (this.dsCustomerAdic!=null &&
              java.util.Arrays.equals(this.dsCustomerAdic, other.getDsCustomerAdic())));
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
        if (getDsCustomerAdic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDsCustomerAdic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsCustomerAdic(), i);
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
        new org.apache.axis.description.TypeDesc(WSDLClienteAdicSFType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "WSDLClienteAdicSFType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsSessionContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "dsSessionContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "DsSessionContext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsCustomerAdic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "dsCustomerAdic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", ">dsCustomerAdic"));
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
