/**
 * WSDLMaintainCustomerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.webservices;

public class WSDLMaintainCustomerType  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.breden.springboot.customer.schemas.TtContext[] dsSessionContext;

    private com.breden.springboot.customer.webservices.CustomerType[] dsCustomer;

    public WSDLMaintainCustomerType() {
    }

    public WSDLMaintainCustomerType(
           com.breden.springboot.customer.schemas.TtContext[] dsSessionContext,
           com.breden.springboot.customer.webservices.CustomerType[] dsCustomer) {
           this.dsSessionContext = dsSessionContext;
           this.dsCustomer = dsCustomer;
    }


    /**
     * Gets the dsSessionContext value for this WSDLMaintainCustomerType.
     * 
     * @return dsSessionContext
     */
    public com.breden.springboot.customer.schemas.TtContext[] getDsSessionContext() {
        return dsSessionContext;
    }


    /**
     * Sets the dsSessionContext value for this WSDLMaintainCustomerType.
     * 
     * @param dsSessionContext
     */
    public void setDsSessionContext(com.breden.springboot.customer.schemas.TtContext[] dsSessionContext) {
        this.dsSessionContext = dsSessionContext;
    }


    /**
     * Gets the dsCustomer value for this WSDLMaintainCustomerType.
     * 
     * @return dsCustomer
     */
    public com.breden.springboot.customer.webservices.CustomerType[] getDsCustomer() {
        return dsCustomer;
    }


    /**
     * Sets the dsCustomer value for this WSDLMaintainCustomerType.
     * 
     * @param dsCustomer
     */
    public void setDsCustomer(com.breden.springboot.customer.webservices.CustomerType[] dsCustomer) {
        this.dsCustomer = dsCustomer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDLMaintainCustomerType)) return false;
        WSDLMaintainCustomerType other = (WSDLMaintainCustomerType) obj;
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
            ((this.dsCustomer==null && other.getDsCustomer()==null) || 
             (this.dsCustomer!=null &&
              java.util.Arrays.equals(this.dsCustomer, other.getDsCustomer())));
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
        if (getDsCustomer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDsCustomer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsCustomer(), i);
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
        new org.apache.axis.description.TypeDesc(WSDLMaintainCustomerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "WSDLMaintainCustomerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsSessionContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "dsSessionContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "DsSessionContext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "dsCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", ">dsCustomer"));
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
