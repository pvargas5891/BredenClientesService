/**
 * CustomerResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.webservices;

public class CustomerResponseType  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String cmAddr;

    private com.breden.springboot.customer.webservices.BankAccountsResponseType[] bankAccounts;

    public CustomerResponseType() {
    }

    public CustomerResponseType(
           java.lang.String cmAddr,
           com.breden.springboot.customer.webservices.BankAccountsResponseType[] bankAccounts) {
           this.cmAddr = cmAddr;
           this.bankAccounts = bankAccounts;
    }


    /**
     * Gets the cmAddr value for this CustomerResponseType.
     * 
     * @return cmAddr
     */
    public java.lang.String getCmAddr() {
        return cmAddr;
    }


    /**
     * Sets the cmAddr value for this CustomerResponseType.
     * 
     * @param cmAddr
     */
    public void setCmAddr(java.lang.String cmAddr) {
        this.cmAddr = cmAddr;
    }


    /**
     * Gets the bankAccounts value for this CustomerResponseType.
     * 
     * @return bankAccounts
     */
    public com.breden.springboot.customer.webservices.BankAccountsResponseType[] getBankAccounts() {
        return bankAccounts;
    }


    /**
     * Sets the bankAccounts value for this CustomerResponseType.
     * 
     * @param bankAccounts
     */
    public void setBankAccounts(com.breden.springboot.customer.webservices.BankAccountsResponseType[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public com.breden.springboot.customer.webservices.BankAccountsResponseType getBankAccounts(int i) {
        return this.bankAccounts[i];
    }

    public void setBankAccounts(int i, com.breden.springboot.customer.webservices.BankAccountsResponseType _value) {
        this.bankAccounts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerResponseType)) return false;
        CustomerResponseType other = (CustomerResponseType) obj;
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
            ((this.bankAccounts==null && other.getBankAccounts()==null) || 
             (this.bankAccounts!=null &&
              java.util.Arrays.equals(this.bankAccounts, other.getBankAccounts())));
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
        if (getBankAccounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBankAccounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBankAccounts(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "CustomerResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "cmAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "bankAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "BankAccountsResponseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
