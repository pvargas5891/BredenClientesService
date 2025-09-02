package com.breden.springboot.sellout.services;
import com.breden.springboot.sellout.common.TtContext;
public class WSDLSFSellOutType  implements java.io.Serializable {
    private TtContext[] dsSessionContext;

    private TtSellOutType[] dsOrder;

    public WSDLSFSellOutType() {
    }

    public WSDLSFSellOutType(
           TtContext[] dsSessionContext,
           TtSellOutType[] dsOrder) {
           this.dsSessionContext = dsSessionContext;
           this.dsOrder = dsOrder;
    }


    /**
     * Gets the dsSessionContext value for this WSDLSFSellOutType.
     * 
     * @return dsSessionContext
     */
    public TtContext[] getDsSessionContext() {
        return dsSessionContext;
    }


    /**
     * Sets the dsSessionContext value for this WSDLSFSellOutType.
     * 
     * @param dsSessionContext
     */
    public void setDsSessionContext(TtContext[] dsSessionContext) {
        this.dsSessionContext = dsSessionContext;
    }


    /**
     * Gets the dsOrder value for this WSDLSFSellOutType.
     * 
     * @return dsOrder
     */
    public TtSellOutType[] getDsOrder() {
        return dsOrder;
    }


    /**
     * Sets the dsOrder value for this WSDLSFSellOutType.
     * 
     * @param dsOrder
     */
    public void setDsOrder(TtSellOutType[] dsOrder) {
        this.dsOrder = dsOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSDLSFSellOutType)) return false;
        WSDLSFSellOutType other = (WSDLSFSellOutType) obj;
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
            ((this.dsOrder==null && other.getDsOrder()==null) || 
             (this.dsOrder!=null &&
              java.util.Arrays.equals(this.dsOrder, other.getDsOrder())));
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
        if (getDsOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDsOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDsOrder(), i);
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
        new org.apache.axis.description.TypeDesc(WSDLSFSellOutType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "WSDLSFSellOutType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsSessionContext");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "dsSessionContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services:common", "DsSessionContext"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", "dsOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:schemas-qad-com:xml-services", ">dsOrder"));
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
