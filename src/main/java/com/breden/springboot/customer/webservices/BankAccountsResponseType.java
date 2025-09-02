/**
 * BankAccountsResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.webservices;

public class BankAccountsResponseType  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String cmAddr;

    private java.lang.String csbank;

    public BankAccountsResponseType() {
    }

    public BankAccountsResponseType(
           java.lang.String cmAddr,
           java.lang.String csbank) {
           this.cmAddr = cmAddr;
           this.csbank = csbank;
    }


    /**
     * Gets the cmAddr value for this BankAccountsResponseType.
     * 
     * @return cmAddr
     */
    public java.lang.String getCmAddr() {
        return cmAddr;
    }


    /**
     * Sets the cmAddr value for this BankAccountsResponseType.
     * 
     * @param cmAddr
     */
    public void setCmAddr(java.lang.String cmAddr) {
        this.cmAddr = cmAddr;
    }


    /**
     * Gets the csbank value for this BankAccountsResponseType.
     * 
     * @return csbank
     */
    public java.lang.String getCsbank() {
        return csbank;
    }


    /**
     * Sets the csbank value for this BankAccountsResponseType.
     * 
     * @param csbank
     */
    public void setCsbank(java.lang.String csbank) {
        this.csbank = csbank;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankAccountsResponseType)) return false;
        BankAccountsResponseType other = (BankAccountsResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cmAddr==null && other.getCmAddr()==null) || 
             (this.cmAddr!=null &&
              this.cmAddr.equals(other.getCmAddr()))) &&
            ((this.csbank==null && other.getCsbank()==null) || 
             (this.csbank!=null &&
              this.csbank.equals(other.getCsbank())));
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
        if (getCmAddr() != null) {
            _hashCode += getCmAddr().hashCode();
        }
        if (getCsbank() != null) {
            _hashCode += getCsbank().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankAccountsResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "BankAccountsResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csbank");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "csbank"));
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
