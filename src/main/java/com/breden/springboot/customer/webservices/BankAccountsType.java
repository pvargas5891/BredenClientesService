/**
 * BankAccountsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.customer.webservices;

public class BankAccountsType  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String operation;

    private java.lang.String cmAddr;

    private java.lang.String csbank;

    private java.lang.String bkAcctType;

    private java.lang.String csbdEdi;

    private java.lang.String csbdBranch;

    private java.lang.String csbdBkAcct;

    private java.util.Date csbdBegDate;

    private java.util.Date csbdEndDate;

    public BankAccountsType() {
    }

    public BankAccountsType(
           java.lang.String operation,
           java.lang.String cmAddr,
           java.lang.String csbank,
           java.lang.String bkAcctType,
           java.lang.String csbdEdi,
           java.lang.String csbdBranch,
           java.lang.String csbdBkAcct,
           java.util.Date csbdBegDate,
           java.util.Date csbdEndDate) {
           this.operation = operation;
           this.cmAddr = cmAddr;
           this.csbank = csbank;
           this.bkAcctType = bkAcctType;
           this.csbdEdi = csbdEdi;
           this.csbdBranch = csbdBranch;
           this.csbdBkAcct = csbdBkAcct;
           this.csbdBegDate = csbdBegDate;
           this.csbdEndDate = csbdEndDate;
    }


    /**
     * Gets the operation value for this BankAccountsType.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this BankAccountsType.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the cmAddr value for this BankAccountsType.
     * 
     * @return cmAddr
     */
    public java.lang.String getCmAddr() {
        return cmAddr;
    }


    /**
     * Sets the cmAddr value for this BankAccountsType.
     * 
     * @param cmAddr
     */
    public void setCmAddr(java.lang.String cmAddr) {
        this.cmAddr = cmAddr;
    }


    /**
     * Gets the csbank value for this BankAccountsType.
     * 
     * @return csbank
     */
    public java.lang.String getCsbank() {
        return csbank;
    }


    /**
     * Sets the csbank value for this BankAccountsType.
     * 
     * @param csbank
     */
    public void setCsbank(java.lang.String csbank) {
        this.csbank = csbank;
    }


    /**
     * Gets the bkAcctType value for this BankAccountsType.
     * 
     * @return bkAcctType
     */
    public java.lang.String getBkAcctType() {
        return bkAcctType;
    }


    /**
     * Sets the bkAcctType value for this BankAccountsType.
     * 
     * @param bkAcctType
     */
    public void setBkAcctType(java.lang.String bkAcctType) {
        this.bkAcctType = bkAcctType;
    }


    /**
     * Gets the csbdEdi value for this BankAccountsType.
     * 
     * @return csbdEdi
     */
    public java.lang.String getCsbdEdi() {
        return csbdEdi;
    }


    /**
     * Sets the csbdEdi value for this BankAccountsType.
     * 
     * @param csbdEdi
     */
    public void setCsbdEdi(java.lang.String csbdEdi) {
        this.csbdEdi = csbdEdi;
    }


    /**
     * Gets the csbdBranch value for this BankAccountsType.
     * 
     * @return csbdBranch
     */
    public java.lang.String getCsbdBranch() {
        return csbdBranch;
    }


    /**
     * Sets the csbdBranch value for this BankAccountsType.
     * 
     * @param csbdBranch
     */
    public void setCsbdBranch(java.lang.String csbdBranch) {
        this.csbdBranch = csbdBranch;
    }


    /**
     * Gets the csbdBkAcct value for this BankAccountsType.
     * 
     * @return csbdBkAcct
     */
    public java.lang.String getCsbdBkAcct() {
        return csbdBkAcct;
    }


    /**
     * Sets the csbdBkAcct value for this BankAccountsType.
     * 
     * @param csbdBkAcct
     */
    public void setCsbdBkAcct(java.lang.String csbdBkAcct) {
        this.csbdBkAcct = csbdBkAcct;
    }


    /**
     * Gets the csbdBegDate value for this BankAccountsType.
     * 
     * @return csbdBegDate
     */
    public java.util.Date getCsbdBegDate() {
        return csbdBegDate;
    }


    /**
     * Sets the csbdBegDate value for this BankAccountsType.
     * 
     * @param csbdBegDate
     */
    public void setCsbdBegDate(java.util.Date csbdBegDate) {
        this.csbdBegDate = csbdBegDate;
    }


    /**
     * Gets the csbdEndDate value for this BankAccountsType.
     * 
     * @return csbdEndDate
     */
    public java.util.Date getCsbdEndDate() {
        return csbdEndDate;
    }


    /**
     * Sets the csbdEndDate value for this BankAccountsType.
     * 
     * @param csbdEndDate
     */
    public void setCsbdEndDate(java.util.Date csbdEndDate) {
        this.csbdEndDate = csbdEndDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankAccountsType)) return false;
        BankAccountsType other = (BankAccountsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.cmAddr==null && other.getCmAddr()==null) || 
             (this.cmAddr!=null &&
              this.cmAddr.equals(other.getCmAddr()))) &&
            ((this.csbank==null && other.getCsbank()==null) || 
             (this.csbank!=null &&
              this.csbank.equals(other.getCsbank()))) &&
            ((this.bkAcctType==null && other.getBkAcctType()==null) || 
             (this.bkAcctType!=null &&
              this.bkAcctType.equals(other.getBkAcctType()))) &&
            ((this.csbdEdi==null && other.getCsbdEdi()==null) || 
             (this.csbdEdi!=null &&
              this.csbdEdi.equals(other.getCsbdEdi()))) &&
            ((this.csbdBranch==null && other.getCsbdBranch()==null) || 
             (this.csbdBranch!=null &&
              this.csbdBranch.equals(other.getCsbdBranch()))) &&
            ((this.csbdBkAcct==null && other.getCsbdBkAcct()==null) || 
             (this.csbdBkAcct!=null &&
              this.csbdBkAcct.equals(other.getCsbdBkAcct()))) &&
            ((this.csbdBegDate==null && other.getCsbdBegDate()==null) || 
             (this.csbdBegDate!=null &&
              this.csbdBegDate.equals(other.getCsbdBegDate()))) &&
            ((this.csbdEndDate==null && other.getCsbdEndDate()==null) || 
             (this.csbdEndDate!=null &&
              this.csbdEndDate.equals(other.getCsbdEndDate())));
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
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getCmAddr() != null) {
            _hashCode += getCmAddr().hashCode();
        }
        if (getCsbank() != null) {
            _hashCode += getCsbank().hashCode();
        }
        if (getBkAcctType() != null) {
            _hashCode += getBkAcctType().hashCode();
        }
        if (getCsbdEdi() != null) {
            _hashCode += getCsbdEdi().hashCode();
        }
        if (getCsbdBranch() != null) {
            _hashCode += getCsbdBranch().hashCode();
        }
        if (getCsbdBkAcct() != null) {
            _hashCode += getCsbdBkAcct().hashCode();
        }
        if (getCsbdBegDate() != null) {
            _hashCode += getCsbdBegDate().hashCode();
        }
        if (getCsbdEndDate() != null) {
            _hashCode += getCsbdEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankAccountsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "BankAccountsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bkAcctType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "bkAcctType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csbdEdi");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "csbdEdi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csbdBranch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "csbdBranch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csbdBkAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "csbdBkAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csbdBegDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "csbdBegDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csbdEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "csbdEndDate"));
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
