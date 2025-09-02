/**
 * TtidhhistdetResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.facturacion.services;

public class TtidhhistdetResponseType  implements java.io.Serializable {
    private java.lang.String tt_fac;

    private java.lang.Integer tt_linea;

    private java.lang.String tt_Artic;

    private java.lang.String tt_Descrip;

    private java.math.BigDecimal tt_Cant;

    private java.math.BigDecimal tt_monto;

    private java.math.BigDecimal tt_total;

    public TtidhhistdetResponseType() {
    }

    public TtidhhistdetResponseType(
           java.lang.String tt_fac,
           java.lang.Integer tt_linea,
           java.lang.String tt_Artic,
           java.lang.String tt_Descrip,
           java.math.BigDecimal tt_Cant,
           java.math.BigDecimal tt_monto,
           java.math.BigDecimal tt_total) {
           this.tt_fac = tt_fac;
           this.tt_linea = tt_linea;
           this.tt_Artic = tt_Artic;
           this.tt_Descrip = tt_Descrip;
           this.tt_Cant = tt_Cant;
           this.tt_monto = tt_monto;
           this.tt_total = tt_total;
    }


    /**
     * Gets the tt_fac value for this TtidhhistdetResponseType.
     * 
     * @return tt_fac
     */
    public java.lang.String getTt_fac() {
        return tt_fac;
    }


    /**
     * Sets the tt_fac value for this TtidhhistdetResponseType.
     * 
     * @param tt_fac
     */
    public void setTt_fac(java.lang.String tt_fac) {
        this.tt_fac = tt_fac;
    }


    /**
     * Gets the tt_linea value for this TtidhhistdetResponseType.
     * 
     * @return tt_linea
     */
    public java.lang.Integer getTt_linea() {
        return tt_linea;
    }


    /**
     * Sets the tt_linea value for this TtidhhistdetResponseType.
     * 
     * @param tt_linea
     */
    public void setTt_linea(java.lang.Integer tt_linea) {
        this.tt_linea = tt_linea;
    }


    /**
     * Gets the tt_Artic value for this TtidhhistdetResponseType.
     * 
     * @return tt_Artic
     */
    public java.lang.String getTt_Artic() {
        return tt_Artic;
    }


    /**
     * Sets the tt_Artic value for this TtidhhistdetResponseType.
     * 
     * @param tt_Artic
     */
    public void setTt_Artic(java.lang.String tt_Artic) {
        this.tt_Artic = tt_Artic;
    }


    /**
     * Gets the tt_Descrip value for this TtidhhistdetResponseType.
     * 
     * @return tt_Descrip
     */
    public java.lang.String getTt_Descrip() {
        return tt_Descrip;
    }


    /**
     * Sets the tt_Descrip value for this TtidhhistdetResponseType.
     * 
     * @param tt_Descrip
     */
    public void setTt_Descrip(java.lang.String tt_Descrip) {
        this.tt_Descrip = tt_Descrip;
    }


    /**
     * Gets the tt_Cant value for this TtidhhistdetResponseType.
     * 
     * @return tt_Cant
     */
    public java.math.BigDecimal getTt_Cant() {
        return tt_Cant;
    }


    /**
     * Sets the tt_Cant value for this TtidhhistdetResponseType.
     * 
     * @param tt_Cant
     */
    public void setTt_Cant(java.math.BigDecimal tt_Cant) {
        this.tt_Cant = tt_Cant;
    }


    /**
     * Gets the tt_monto value for this TtidhhistdetResponseType.
     * 
     * @return tt_monto
     */
    public java.math.BigDecimal getTt_monto() {
        return tt_monto;
    }


    /**
     * Sets the tt_monto value for this TtidhhistdetResponseType.
     * 
     * @param tt_monto
     */
    public void setTt_monto(java.math.BigDecimal tt_monto) {
        this.tt_monto = tt_monto;
    }


    /**
     * Gets the tt_total value for this TtidhhistdetResponseType.
     * 
     * @return tt_total
     */
    public java.math.BigDecimal getTt_total() {
        return tt_total;
    }


    /**
     * Sets the tt_total value for this TtidhhistdetResponseType.
     * 
     * @param tt_total
     */
    public void setTt_total(java.math.BigDecimal tt_total) {
        this.tt_total = tt_total;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TtidhhistdetResponseType)) return false;
        TtidhhistdetResponseType other = (TtidhhistdetResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tt_fac==null && other.getTt_fac()==null) || 
             (this.tt_fac!=null &&
              this.tt_fac.equals(other.getTt_fac()))) &&
            ((this.tt_linea==null && other.getTt_linea()==null) || 
             (this.tt_linea!=null &&
              this.tt_linea.equals(other.getTt_linea()))) &&
            ((this.tt_Artic==null && other.getTt_Artic()==null) || 
             (this.tt_Artic!=null &&
              this.tt_Artic.equals(other.getTt_Artic()))) &&
            ((this.tt_Descrip==null && other.getTt_Descrip()==null) || 
             (this.tt_Descrip!=null &&
              this.tt_Descrip.equals(other.getTt_Descrip()))) &&
            ((this.tt_Cant==null && other.getTt_Cant()==null) || 
             (this.tt_Cant!=null &&
              this.tt_Cant.equals(other.getTt_Cant()))) &&
            ((this.tt_monto==null && other.getTt_monto()==null) || 
             (this.tt_monto!=null &&
              this.tt_monto.equals(other.getTt_monto()))) &&
            ((this.tt_total==null && other.getTt_total()==null) || 
             (this.tt_total!=null &&
              this.tt_total.equals(other.getTt_total())));
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
        if (getTt_fac() != null) {
            _hashCode += getTt_fac().hashCode();
        }
        if (getTt_linea() != null) {
            _hashCode += getTt_linea().hashCode();
        }
        if (getTt_Artic() != null) {
            _hashCode += getTt_Artic().hashCode();
        }
        if (getTt_Descrip() != null) {
            _hashCode += getTt_Descrip().hashCode();
        }
        if (getTt_Cant() != null) {
            _hashCode += getTt_Cant().hashCode();
        }
        if (getTt_monto() != null) {
            _hashCode += getTt_monto().hashCode();
        }
        if (getTt_total() != null) {
            _hashCode += getTt_total().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TtidhhistdetResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "TtidhhistdetResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_fac");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_fac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_linea");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_linea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_Artic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_Artic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_Descrip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_Descrip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_Cant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_Cant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_monto");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_monto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
