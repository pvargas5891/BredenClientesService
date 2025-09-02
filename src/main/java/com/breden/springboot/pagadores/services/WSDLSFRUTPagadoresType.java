/**
 * WSDLSFRUTPagadoresType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.pagadores.services;

public class WSDLSFRUTPagadoresType  implements java.io.Serializable {
    private com.breden.springboot.pagadores.common.TtContext[] dsSessionContext;

    private com.breden.springboot.pagadores.services.TtClientesType[] dsClientes;

    public WSDLSFRUTPagadoresType() {
    }

    public WSDLSFRUTPagadoresType(
           com.breden.springboot.pagadores.common.TtContext[] dsSessionContext,
           com.breden.springboot.pagadores.services.TtClientesType[] dsClientes) {
           this.dsSessionContext = dsSessionContext;
           this.dsClientes = dsClientes;
    }


    /**
     * Gets the dsSessionContext value for this WSDLSFRUTPagadoresType.
     * 
     * @return dsSessionContext
     */
    public com.breden.springboot.pagadores.common.TtContext[] getDsSessionContext() {
        return dsSessionContext;
    }


    /**
     * Sets the dsSessionContext value for this WSDLSFRUTPagadoresType.
     * 
     * @param dsSessionContext
     */
    public void setDsSessionContext(com.breden.springboot.pagadores.common.TtContext[] dsSessionContext) {
        this.dsSessionContext = dsSessionContext;
    }


    /**
     * Gets the dsClientes value for this WSDLSFRUTPagadoresType.
     * 
     * @return dsClientes
     */
    public com.breden.springboot.pagadores.services.TtClientesType[] getDsClientes() {
        return dsClientes;
    }


    /**
     * Sets the dsClientes value for this WSDLSFRUTPagadoresType.
     * 
     * @param dsClientes
     */
    public void setDsClientes(com.breden.springboot.pagadores.services.TtClientesType[] dsClientes) {
        this.dsClientes = dsClientes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDLSFRUTPagadoresType)) return false;
        WSDLSFRUTPagadoresType other = (WSDLSFRUTPagadoresType) obj;
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
            ((this.dsClientes==null && other.getDsClientes()==null) || 
             (this.dsClientes!=null &&
              java.util.Arrays.equals(this.dsClientes, other.getDsClientes())));
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
        if (getDsClientes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDsClientes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsClientes(), i);
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
        new org.apache.axis.description.TypeDesc(WSDLSFRUTPagadoresType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "WSDLSFRUTPagadoresType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsSessionContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "dsSessionContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "DsSessionContext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsClientes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "dsClientes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", ">dsClientes"));
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
