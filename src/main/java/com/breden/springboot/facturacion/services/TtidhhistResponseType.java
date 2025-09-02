/**
 * TtidhhistResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.breden.springboot.facturacion.services;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TtidhhistResponseType  implements java.io.Serializable {
    private java.lang.String tt_Factura;

    private java.lang.String tt_cliente;

    private java.lang.String tt_tipo;

    private java.math.BigDecimal tt_neto;

    private java.lang.String tt_OV;

    private java.lang.String tt_OC;
    
    @JsonFormat
	(shape = JsonFormat.Shape.STRING, pattern = "yyyy-dd-MM")
    private java.util.Date tt_Fecha;

    private java.lang.String tt_vehiculo;

    private java.lang.String tt_ruta;

    private java.lang.String tt_hruta;

    private java.math.BigDecimal tt_PrecUN;

    private java.lang.String tt_Adic01;

    private java.lang.String tt_Adic02;

    private java.lang.String tt_Adic03;

    private java.lang.String tt_Adic04;

    private java.lang.String tt_Adic05;

    private com.breden.springboot.facturacion.services.TtidhhistdetResponseType[] ttidhhistdet;

    public TtidhhistResponseType() {
    }

    public TtidhhistResponseType(
           java.lang.String tt_Factura,
           java.lang.String tt_cliente,
           java.lang.String tt_tipo,
           java.math.BigDecimal tt_neto,
           java.lang.String tt_OV,
           java.lang.String tt_OC,
           java.util.Date tt_Fecha,
           java.lang.String tt_vehiculo,
           java.lang.String tt_ruta,
           java.lang.String tt_hruta,
           java.math.BigDecimal tt_PrecUN,
           java.lang.String tt_Adic01,
           java.lang.String tt_Adic02,
           java.lang.String tt_Adic03,
           java.lang.String tt_Adic04,
           java.lang.String tt_Adic05,
           com.breden.springboot.facturacion.services.TtidhhistdetResponseType[] ttidhhistdet) {
           this.tt_Factura = tt_Factura;
           this.tt_cliente = tt_cliente;
           this.tt_tipo = tt_tipo;
           this.tt_neto = tt_neto;
           this.tt_OV = tt_OV;
           this.tt_OC = tt_OC;
           this.tt_Fecha = tt_Fecha;
           this.tt_vehiculo = tt_vehiculo;
           this.tt_ruta = tt_ruta;
           this.tt_hruta = tt_hruta;
           this.tt_PrecUN = tt_PrecUN;
           this.tt_Adic01 = tt_Adic01;
           this.tt_Adic02 = tt_Adic02;
           this.tt_Adic03 = tt_Adic03;
           this.tt_Adic04 = tt_Adic04;
           this.tt_Adic05 = tt_Adic05;
           this.ttidhhistdet = ttidhhistdet;
    }


    /**
     * Gets the tt_Factura value for this TtidhhistResponseType.
     * 
     * @return tt_Factura
     */
    public java.lang.String getTt_Factura() {
        return tt_Factura;
    }


    /**
     * Sets the tt_Factura value for this TtidhhistResponseType.
     * 
     * @param tt_Factura
     */
    public void setTt_Factura(java.lang.String tt_Factura) {
        this.tt_Factura = tt_Factura;
    }


    /**
     * Gets the tt_cliente value for this TtidhhistResponseType.
     * 
     * @return tt_cliente
     */
    public java.lang.String getTt_cliente() {
        return tt_cliente;
    }


    /**
     * Sets the tt_cliente value for this TtidhhistResponseType.
     * 
     * @param tt_cliente
     */
    public void setTt_cliente(java.lang.String tt_cliente) {
        this.tt_cliente = tt_cliente;
    }


    /**
     * Gets the tt_tipo value for this TtidhhistResponseType.
     * 
     * @return tt_tipo
     */
    public java.lang.String getTt_tipo() {
        return tt_tipo;
    }


    /**
     * Sets the tt_tipo value for this TtidhhistResponseType.
     * 
     * @param tt_tipo
     */
    public void setTt_tipo(java.lang.String tt_tipo) {
        this.tt_tipo = tt_tipo;
    }


    /**
     * Gets the tt_neto value for this TtidhhistResponseType.
     * 
     * @return tt_neto
     */
    public java.math.BigDecimal getTt_neto() {
        return tt_neto;
    }


    /**
     * Sets the tt_neto value for this TtidhhistResponseType.
     * 
     * @param tt_neto
     */
    public void setTt_neto(java.math.BigDecimal tt_neto) {
        this.tt_neto = tt_neto;
    }


    /**
     * Gets the tt_OV value for this TtidhhistResponseType.
     * 
     * @return tt_OV
     */
    public java.lang.String getTt_OV() {
        return tt_OV;
    }


    /**
     * Sets the tt_OV value for this TtidhhistResponseType.
     * 
     * @param tt_OV
     */
    public void setTt_OV(java.lang.String tt_OV) {
        this.tt_OV = tt_OV;
    }


    /**
     * Gets the tt_OC value for this TtidhhistResponseType.
     * 
     * @return tt_OC
     */
    public java.lang.String getTt_OC() {
        return tt_OC;
    }


    /**
     * Sets the tt_OC value for this TtidhhistResponseType.
     * 
     * @param tt_OC
     */
    public void setTt_OC(java.lang.String tt_OC) {
        this.tt_OC = tt_OC;
    }


    /**
     * Gets the tt_Fecha value for this TtidhhistResponseType.
     * 
     * @return tt_Fecha
     */
    public java.util.Date getTt_Fecha() {
        return tt_Fecha;
    }


    /**
     * Sets the tt_Fecha value for this TtidhhistResponseType.
     * 
     * @param tt_Fecha
     */
    public void setTt_Fecha(java.util.Date tt_Fecha) {
        this.tt_Fecha = tt_Fecha;
    }


    /**
     * Gets the tt_vehiculo value for this TtidhhistResponseType.
     * 
     * @return tt_vehiculo
     */
    public java.lang.String getTt_vehiculo() {
        return tt_vehiculo;
    }


    /**
     * Sets the tt_vehiculo value for this TtidhhistResponseType.
     * 
     * @param tt_vehiculo
     */
    public void setTt_vehiculo(java.lang.String tt_vehiculo) {
        this.tt_vehiculo = tt_vehiculo;
    }


    /**
     * Gets the tt_ruta value for this TtidhhistResponseType.
     * 
     * @return tt_ruta
     */
    public java.lang.String getTt_ruta() {
        return tt_ruta;
    }


    /**
     * Sets the tt_ruta value for this TtidhhistResponseType.
     * 
     * @param tt_ruta
     */
    public void setTt_ruta(java.lang.String tt_ruta) {
        this.tt_ruta = tt_ruta;
    }


    /**
     * Gets the tt_hruta value for this TtidhhistResponseType.
     * 
     * @return tt_hruta
     */
    public java.lang.String getTt_hruta() {
        return tt_hruta;
    }


    /**
     * Sets the tt_hruta value for this TtidhhistResponseType.
     * 
     * @param tt_hruta
     */
    public void setTt_hruta(java.lang.String tt_hruta) {
        this.tt_hruta = tt_hruta;
    }


    /**
     * Gets the tt_PrecUN value for this TtidhhistResponseType.
     * 
     * @return tt_PrecUN
     */
    public java.math.BigDecimal getTt_PrecUN() {
        return tt_PrecUN;
    }


    /**
     * Sets the tt_PrecUN value for this TtidhhistResponseType.
     * 
     * @param tt_PrecUN
     */
    public void setTt_PrecUN(java.math.BigDecimal tt_PrecUN) {
        this.tt_PrecUN = tt_PrecUN;
    }


    /**
     * Gets the tt_Adic01 value for this TtidhhistResponseType.
     * 
     * @return tt_Adic01
     */
    public java.lang.String getTt_Adic01() {
        return tt_Adic01;
    }


    /**
     * Sets the tt_Adic01 value for this TtidhhistResponseType.
     * 
     * @param tt_Adic01
     */
    public void setTt_Adic01(java.lang.String tt_Adic01) {
        this.tt_Adic01 = tt_Adic01;
    }


    /**
     * Gets the tt_Adic02 value for this TtidhhistResponseType.
     * 
     * @return tt_Adic02
     */
    public java.lang.String getTt_Adic02() {
        return tt_Adic02;
    }


    /**
     * Sets the tt_Adic02 value for this TtidhhistResponseType.
     * 
     * @param tt_Adic02
     */
    public void setTt_Adic02(java.lang.String tt_Adic02) {
        this.tt_Adic02 = tt_Adic02;
    }


    /**
     * Gets the tt_Adic03 value for this TtidhhistResponseType.
     * 
     * @return tt_Adic03
     */
    public java.lang.String getTt_Adic03() {
        return tt_Adic03;
    }


    /**
     * Sets the tt_Adic03 value for this TtidhhistResponseType.
     * 
     * @param tt_Adic03
     */
    public void setTt_Adic03(java.lang.String tt_Adic03) {
        this.tt_Adic03 = tt_Adic03;
    }


    /**
     * Gets the tt_Adic04 value for this TtidhhistResponseType.
     * 
     * @return tt_Adic04
     */
    public java.lang.String getTt_Adic04() {
        return tt_Adic04;
    }


    /**
     * Sets the tt_Adic04 value for this TtidhhistResponseType.
     * 
     * @param tt_Adic04
     */
    public void setTt_Adic04(java.lang.String tt_Adic04) {
        this.tt_Adic04 = tt_Adic04;
    }


    /**
     * Gets the tt_Adic05 value for this TtidhhistResponseType.
     * 
     * @return tt_Adic05
     */
    public java.lang.String getTt_Adic05() {
        return tt_Adic05;
    }


    /**
     * Sets the tt_Adic05 value for this TtidhhistResponseType.
     * 
     * @param tt_Adic05
     */
    public void setTt_Adic05(java.lang.String tt_Adic05) {
        this.tt_Adic05 = tt_Adic05;
    }


    /**
     * Gets the ttidhhistdet value for this TtidhhistResponseType.
     * 
     * @return ttidhhistdet
     */
    public com.breden.springboot.facturacion.services.TtidhhistdetResponseType[] getTtidhhistdet() {
        return ttidhhistdet;
    }


    /**
     * Sets the ttidhhistdet value for this TtidhhistResponseType.
     * 
     * @param ttidhhistdet
     */
    public void setTtidhhistdet(com.breden.springboot.facturacion.services.TtidhhistdetResponseType[] ttidhhistdet) {
        this.ttidhhistdet = ttidhhistdet;
    }

    public com.breden.springboot.facturacion.services.TtidhhistdetResponseType getTtidhhistdet(int i) {
        return this.ttidhhistdet[i];
    }

    public void setTtidhhistdet(int i, com.breden.springboot.facturacion.services.TtidhhistdetResponseType _value) {
        this.ttidhhistdet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TtidhhistResponseType)) return false;
        TtidhhistResponseType other = (TtidhhistResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tt_Factura==null && other.getTt_Factura()==null) || 
             (this.tt_Factura!=null &&
              this.tt_Factura.equals(other.getTt_Factura()))) &&
            ((this.tt_cliente==null && other.getTt_cliente()==null) || 
             (this.tt_cliente!=null &&
              this.tt_cliente.equals(other.getTt_cliente()))) &&
            ((this.tt_tipo==null && other.getTt_tipo()==null) || 
             (this.tt_tipo!=null &&
              this.tt_tipo.equals(other.getTt_tipo()))) &&
            ((this.tt_neto==null && other.getTt_neto()==null) || 
             (this.tt_neto!=null &&
              this.tt_neto.equals(other.getTt_neto()))) &&
            ((this.tt_OV==null && other.getTt_OV()==null) || 
             (this.tt_OV!=null &&
              this.tt_OV.equals(other.getTt_OV()))) &&
            ((this.tt_OC==null && other.getTt_OC()==null) || 
             (this.tt_OC!=null &&
              this.tt_OC.equals(other.getTt_OC()))) &&
            ((this.tt_Fecha==null && other.getTt_Fecha()==null) || 
             (this.tt_Fecha!=null &&
              this.tt_Fecha.equals(other.getTt_Fecha()))) &&
            ((this.tt_vehiculo==null && other.getTt_vehiculo()==null) || 
             (this.tt_vehiculo!=null &&
              this.tt_vehiculo.equals(other.getTt_vehiculo()))) &&
            ((this.tt_ruta==null && other.getTt_ruta()==null) || 
             (this.tt_ruta!=null &&
              this.tt_ruta.equals(other.getTt_ruta()))) &&
            ((this.tt_hruta==null && other.getTt_hruta()==null) || 
             (this.tt_hruta!=null &&
              this.tt_hruta.equals(other.getTt_hruta()))) &&
            ((this.tt_PrecUN==null && other.getTt_PrecUN()==null) || 
             (this.tt_PrecUN!=null &&
              this.tt_PrecUN.equals(other.getTt_PrecUN()))) &&
            ((this.tt_Adic01==null && other.getTt_Adic01()==null) || 
             (this.tt_Adic01!=null &&
              this.tt_Adic01.equals(other.getTt_Adic01()))) &&
            ((this.tt_Adic02==null && other.getTt_Adic02()==null) || 
             (this.tt_Adic02!=null &&
              this.tt_Adic02.equals(other.getTt_Adic02()))) &&
            ((this.tt_Adic03==null && other.getTt_Adic03()==null) || 
             (this.tt_Adic03!=null &&
              this.tt_Adic03.equals(other.getTt_Adic03()))) &&
            ((this.tt_Adic04==null && other.getTt_Adic04()==null) || 
             (this.tt_Adic04!=null &&
              this.tt_Adic04.equals(other.getTt_Adic04()))) &&
            ((this.tt_Adic05==null && other.getTt_Adic05()==null) || 
             (this.tt_Adic05!=null &&
              this.tt_Adic05.equals(other.getTt_Adic05()))) &&
            ((this.ttidhhistdet==null && other.getTtidhhistdet()==null) || 
             (this.ttidhhistdet!=null &&
              java.util.Arrays.equals(this.ttidhhistdet, other.getTtidhhistdet())));
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
        if (getTt_Factura() != null) {
            _hashCode += getTt_Factura().hashCode();
        }
        if (getTt_cliente() != null) {
            _hashCode += getTt_cliente().hashCode();
        }
        if (getTt_tipo() != null) {
            _hashCode += getTt_tipo().hashCode();
        }
        if (getTt_neto() != null) {
            _hashCode += getTt_neto().hashCode();
        }
        if (getTt_OV() != null) {
            _hashCode += getTt_OV().hashCode();
        }
        if (getTt_OC() != null) {
            _hashCode += getTt_OC().hashCode();
        }
        if (getTt_Fecha() != null) {
            _hashCode += getTt_Fecha().hashCode();
        }
        if (getTt_vehiculo() != null) {
            _hashCode += getTt_vehiculo().hashCode();
        }
        if (getTt_ruta() != null) {
            _hashCode += getTt_ruta().hashCode();
        }
        if (getTt_hruta() != null) {
            _hashCode += getTt_hruta().hashCode();
        }
        if (getTt_PrecUN() != null) {
            _hashCode += getTt_PrecUN().hashCode();
        }
        if (getTt_Adic01() != null) {
            _hashCode += getTt_Adic01().hashCode();
        }
        if (getTt_Adic02() != null) {
            _hashCode += getTt_Adic02().hashCode();
        }
        if (getTt_Adic03() != null) {
            _hashCode += getTt_Adic03().hashCode();
        }
        if (getTt_Adic04() != null) {
            _hashCode += getTt_Adic04().hashCode();
        }
        if (getTt_Adic05() != null) {
            _hashCode += getTt_Adic05().hashCode();
        }
        if (getTtidhhistdet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTtidhhistdet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTtidhhistdet(), i);
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
        new org.apache.axis.description.TypeDesc(TtidhhistResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "TtidhhistResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_Factura");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_Factura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_neto");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_neto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_OV");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_OV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_OC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_OC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_Fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_Fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_vehiculo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_vehiculo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_ruta");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_ruta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_hruta");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_hruta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_PrecUN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_PrecUN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_Adic01");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_Adic01"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_Adic02");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_Adic02"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_Adic03");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_Adic03"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_Adic04");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_Adic04"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tt_Adic05");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "tt_Adic05"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttidhhistdet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttidhhistdet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "TtidhhistdetResponseType"));
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
