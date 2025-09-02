package com.breden.springboot.sellout.services;
import com.breden.springboot.sellout.common.Temp_err_msg;
import com.breden.springboot.sellout.common.TtContext;


public class WSDLSFSellOutResponseType  implements java.io.Serializable {
    private java.lang.String result;

    private TtContext[] dsSessionContext;

    private Temp_err_msg[] dsExceptions;

    private TtResponse[] dsResponse;

    public WSDLSFSellOutResponseType() {
    }

    public WSDLSFSellOutResponseType(
           java.lang.String result,
           TtContext[] dsSessionContext,
           Temp_err_msg[] dsExceptions,
           TtResponse[] dsResponse) {
           this.result = result;
           this.dsSessionContext = dsSessionContext;
           this.dsExceptions = dsExceptions;
           this.dsResponse = dsResponse;
    }


    /**
     * Gets the result value for this WSDLSFSellOutResponseType.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this WSDLSFSellOutResponseType.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the dsSessionContext value for this WSDLSFSellOutResponseType.
     * 
     * @return dsSessionContext
     */
    public TtContext[] getDsSessionContext() {
        return dsSessionContext;
    }


    /**
     * Sets the dsSessionContext value for this WSDLSFSellOutResponseType.
     * 
     * @param dsSessionContext
     */
    public void setDsSessionContext(TtContext[] dsSessionContext) {
        this.dsSessionContext = dsSessionContext;
    }


    /**
     * Gets the dsExceptions value for this WSDLSFSellOutResponseType.
     * 
     * @return dsExceptions
     */
    public Temp_err_msg[] getDsExceptions() {
        return dsExceptions;
    }


    /**
     * Sets the dsExceptions value for this WSDLSFSellOutResponseType.
     * 
     * @param dsExceptions
     */
    public void setDsExceptions(Temp_err_msg[] dsExceptions) {
        this.dsExceptions = dsExceptions;
    }


    /**
     * Gets the dsResponse value for this WSDLSFSellOutResponseType.
     * 
     * @return dsResponse
     */
    public TtResponse[] getDsResponse() {
        return dsResponse;
    }


    /**
     * Sets the dsResponse value for this WSDLSFSellOutResponseType.
     * 
     * @param dsResponse
     */
    public void setDsResponse(TtResponse[] dsResponse) {
        this.dsResponse = dsResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDLSFSellOutResponseType)) return false;
        WSDLSFSellOutResponseType other = (WSDLSFSellOutResponseType) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.dsSessionContext==null && other.getDsSessionContext()==null) || 
             (this.dsSessionContext!=null &&
              java.util.Arrays.equals(this.dsSessionContext, other.getDsSessionContext()))) &&
            ((this.dsExceptions==null && other.getDsExceptions()==null) || 
             (this.dsExceptions!=null &&
              java.util.Arrays.equals(this.dsExceptions, other.getDsExceptions()))) &&
            ((this.dsResponse==null && other.getDsResponse()==null) || 
             (this.dsResponse!=null &&
              java.util.Arrays.equals(this.dsResponse, other.getDsResponse())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
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
        if (getDsExceptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDsExceptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsExceptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDsResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDsResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsResponse(), i);
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
        new org.apache.axis.description.TypeDesc(WSDLSFSellOutResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "WSDLSFSellOutResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsSessionContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "dsSessionContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "DsSessionContext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsExceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "dsExceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "DsExceptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "dsResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", ">dsResponse"));
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
