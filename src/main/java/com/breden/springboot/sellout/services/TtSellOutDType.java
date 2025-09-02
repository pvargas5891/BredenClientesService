package com.breden.springboot.sellout.services;

public class TtSellOutDType  implements java.io.Serializable {
    private java.lang.String ttNbr;

    private java.lang.Integer ttlinea;

    private java.lang.String ttArticulo;

    private java.lang.String ttDescripcion;

    private java.lang.String ttUM;

    private java.math.BigDecimal ttCantidad;

    private java.math.BigDecimal ttPrecioLista;

    private java.math.BigDecimal ttDescuento;

    private java.math.BigDecimal ttPrecioNeto;

    private java.math.BigDecimal ttTotalLin;

    public TtSellOutDType() {
    }

    public TtSellOutDType(
           java.lang.String ttNbr,
           java.lang.Integer ttlinea,
           java.lang.String ttArticulo,
           java.lang.String ttDescripcion,
           java.lang.String ttUM,
           java.math.BigDecimal ttCantidad,
           java.math.BigDecimal ttPrecioLista,
           java.math.BigDecimal ttDescuento,
           java.math.BigDecimal ttPrecioNeto,
           java.math.BigDecimal ttTotalLin) {
           this.ttNbr = ttNbr;
           this.ttlinea = ttlinea;
           this.ttArticulo = ttArticulo;
           this.ttDescripcion = ttDescripcion;
           this.ttUM = ttUM;
           this.ttCantidad = ttCantidad;
           this.ttPrecioLista = ttPrecioLista;
           this.ttDescuento = ttDescuento;
           this.ttPrecioNeto = ttPrecioNeto;
           this.ttTotalLin = ttTotalLin;
    }


    /**
     * Gets the ttNbr value for this TtSellOutDType.
     * 
     * @return ttNbr
     */
    public java.lang.String getTtNbr() {
        return ttNbr;
    }


    /**
     * Sets the ttNbr value for this TtSellOutDType.
     * 
     * @param ttNbr
     */
    public void setTtNbr(java.lang.String ttNbr) {
        this.ttNbr = ttNbr;
    }


    /**
     * Gets the ttlinea value for this TtSellOutDType.
     * 
     * @return ttlinea
     */
    public java.lang.Integer getTtlinea() {
        return ttlinea;
    }


    /**
     * Sets the ttlinea value for this TtSellOutDType.
     * 
     * @param ttlinea
     */
    public void setTtlinea(java.lang.Integer ttlinea) {
        this.ttlinea = ttlinea;
    }


    /**
     * Gets the ttArticulo value for this TtSellOutDType.
     * 
     * @return ttArticulo
     */
    public java.lang.String getTtArticulo() {
        return ttArticulo;
    }


    /**
     * Sets the ttArticulo value for this TtSellOutDType.
     * 
     * @param ttArticulo
     */
    public void setTtArticulo(java.lang.String ttArticulo) {
        this.ttArticulo = ttArticulo;
    }


    /**
     * Gets the ttDescripcion value for this TtSellOutDType.
     * 
     * @return ttDescripcion
     */
    public java.lang.String getTtDescripcion() {
        return ttDescripcion;
    }


    /**
     * Sets the ttDescripcion value for this TtSellOutDType.
     * 
     * @param ttDescripcion
     */
    public void setTtDescripcion(java.lang.String ttDescripcion) {
        this.ttDescripcion = ttDescripcion;
    }


    /**
     * Gets the ttUM value for this TtSellOutDType.
     * 
     * @return ttUM
     */
    public java.lang.String getTtUM() {
        return ttUM;
    }


    /**
     * Sets the ttUM value for this TtSellOutDType.
     * 
     * @param ttUM
     */
    public void setTtUM(java.lang.String ttUM) {
        this.ttUM = ttUM;
    }


    /**
     * Gets the ttCantidad value for this TtSellOutDType.
     * 
     * @return ttCantidad
     */
    public java.math.BigDecimal getTtCantidad() {
        return ttCantidad;
    }


    /**
     * Sets the ttCantidad value for this TtSellOutDType.
     * 
     * @param ttCantidad
     */
    public void setTtCantidad(java.math.BigDecimal ttCantidad) {
        this.ttCantidad = ttCantidad;
    }


    /**
     * Gets the ttPrecioLista value for this TtSellOutDType.
     * 
     * @return ttPrecioLista
     */
    public java.math.BigDecimal getTtPrecioLista() {
        return ttPrecioLista;
    }


    /**
     * Sets the ttPrecioLista value for this TtSellOutDType.
     * 
     * @param ttPrecioLista
     */
    public void setTtPrecioLista(java.math.BigDecimal ttPrecioLista) {
        this.ttPrecioLista = ttPrecioLista;
    }


    /**
     * Gets the ttDescuento value for this TtSellOutDType.
     * 
     * @return ttDescuento
     */
    public java.math.BigDecimal getTtDescuento() {
        return ttDescuento;
    }


    /**
     * Sets the ttDescuento value for this TtSellOutDType.
     * 
     * @param ttDescuento
     */
    public void setTtDescuento(java.math.BigDecimal ttDescuento) {
        this.ttDescuento = ttDescuento;
    }


    /**
     * Gets the ttPrecioNeto value for this TtSellOutDType.
     * 
     * @return ttPrecioNeto
     */
    public java.math.BigDecimal getTtPrecioNeto() {
        return ttPrecioNeto;
    }


    /**
     * Sets the ttPrecioNeto value for this TtSellOutDType.
     * 
     * @param ttPrecioNeto
     */
    public void setTtPrecioNeto(java.math.BigDecimal ttPrecioNeto) {
        this.ttPrecioNeto = ttPrecioNeto;
    }


    /**
     * Gets the ttTotalLin value for this TtSellOutDType.
     * 
     * @return ttTotalLin
     */
    public java.math.BigDecimal getTtTotalLin() {
        return ttTotalLin;
    }


    /**
     * Sets the ttTotalLin value for this TtSellOutDType.
     * 
     * @param ttTotalLin
     */
    public void setTtTotalLin(java.math.BigDecimal ttTotalLin) {
        this.ttTotalLin = ttTotalLin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TtSellOutDType)) return false;
        TtSellOutDType other = (TtSellOutDType) obj;
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
            ((this.ttlinea==null && other.getTtlinea()==null) || 
             (this.ttlinea!=null &&
              this.ttlinea.equals(other.getTtlinea()))) &&
            ((this.ttArticulo==null && other.getTtArticulo()==null) || 
             (this.ttArticulo!=null &&
              this.ttArticulo.equals(other.getTtArticulo()))) &&
            ((this.ttDescripcion==null && other.getTtDescripcion()==null) || 
             (this.ttDescripcion!=null &&
              this.ttDescripcion.equals(other.getTtDescripcion()))) &&
            ((this.ttUM==null && other.getTtUM()==null) || 
             (this.ttUM!=null &&
              this.ttUM.equals(other.getTtUM()))) &&
            ((this.ttCantidad==null && other.getTtCantidad()==null) || 
             (this.ttCantidad!=null &&
              this.ttCantidad.equals(other.getTtCantidad()))) &&
            ((this.ttPrecioLista==null && other.getTtPrecioLista()==null) || 
             (this.ttPrecioLista!=null &&
              this.ttPrecioLista.equals(other.getTtPrecioLista()))) &&
            ((this.ttDescuento==null && other.getTtDescuento()==null) || 
             (this.ttDescuento!=null &&
              this.ttDescuento.equals(other.getTtDescuento()))) &&
            ((this.ttPrecioNeto==null && other.getTtPrecioNeto()==null) || 
             (this.ttPrecioNeto!=null &&
              this.ttPrecioNeto.equals(other.getTtPrecioNeto()))) &&
            ((this.ttTotalLin==null && other.getTtTotalLin()==null) || 
             (this.ttTotalLin!=null &&
              this.ttTotalLin.equals(other.getTtTotalLin())));
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
        if (getTtlinea() != null) {
            _hashCode += getTtlinea().hashCode();
        }
        if (getTtArticulo() != null) {
            _hashCode += getTtArticulo().hashCode();
        }
        if (getTtDescripcion() != null) {
            _hashCode += getTtDescripcion().hashCode();
        }
        if (getTtUM() != null) {
            _hashCode += getTtUM().hashCode();
        }
        if (getTtCantidad() != null) {
            _hashCode += getTtCantidad().hashCode();
        }
        if (getTtPrecioLista() != null) {
            _hashCode += getTtPrecioLista().hashCode();
        }
        if (getTtDescuento() != null) {
            _hashCode += getTtDescuento().hashCode();
        }
        if (getTtPrecioNeto() != null) {
            _hashCode += getTtPrecioNeto().hashCode();
        }
        if (getTtTotalLin() != null) {
            _hashCode += getTtTotalLin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TtSellOutDType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "TtSellOutDType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttlinea");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttlinea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttArticulo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttArticulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttDescripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttDescripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttUM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttCantidad");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttCantidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttPrecioLista");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttPrecioLista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttDescuento");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttDescuento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttPrecioNeto");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttPrecioNeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttTotalLin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "ttTotalLin"));
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
