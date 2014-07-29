/**
 * AttachmentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.juyun.webservice.cms.visit.server;

public class AttachmentType  implements java.io.Serializable {
    private java.lang.String file_name;

    private java.lang.String file_type;

    private java.lang.String file_size;

    private byte[] file_binary;

    public AttachmentType() {
    }

    public AttachmentType(
           java.lang.String file_name,
           java.lang.String file_type,
           java.lang.String file_size,
           byte[] file_binary) {
           this.file_name = file_name;
           this.file_type = file_type;
           this.file_size = file_size;
           this.file_binary = file_binary;
    }


    /**
     * Gets the file_name value for this AttachmentType.
     * 
     * @return file_name
     */
    public java.lang.String getFile_name() {
        return file_name;
    }


    /**
     * Sets the file_name value for this AttachmentType.
     * 
     * @param file_name
     */
    public void setFile_name(java.lang.String file_name) {
        this.file_name = file_name;
    }


    /**
     * Gets the file_type value for this AttachmentType.
     * 
     * @return file_type
     */
    public java.lang.String getFile_type() {
        return file_type;
    }


    /**
     * Sets the file_type value for this AttachmentType.
     * 
     * @param file_type
     */
    public void setFile_type(java.lang.String file_type) {
        this.file_type = file_type;
    }


    /**
     * Gets the file_size value for this AttachmentType.
     * 
     * @return file_size
     */
    public java.lang.String getFile_size() {
        return file_size;
    }


    /**
     * Sets the file_size value for this AttachmentType.
     * 
     * @param file_size
     */
    public void setFile_size(java.lang.String file_size) {
        this.file_size = file_size;
    }


    /**
     * Gets the file_binary value for this AttachmentType.
     * 
     * @return file_binary
     */
    public byte[] getFile_binary() {
        return file_binary;
    }


    /**
     * Sets the file_binary value for this AttachmentType.
     * 
     * @param file_binary
     */
    public void setFile_binary(byte[] file_binary) {
        this.file_binary = file_binary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttachmentType)) return false;
        AttachmentType other = (AttachmentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.file_name==null && other.getFile_name()==null) || 
             (this.file_name!=null &&
              this.file_name.equals(other.getFile_name()))) &&
            ((this.file_type==null && other.getFile_type()==null) || 
             (this.file_type!=null &&
              this.file_type.equals(other.getFile_type()))) &&
            ((this.file_size==null && other.getFile_size()==null) || 
             (this.file_size!=null &&
              this.file_size.equals(other.getFile_size()))) &&
            ((this.file_binary==null && other.getFile_binary()==null) || 
             (this.file_binary!=null &&
              java.util.Arrays.equals(this.file_binary, other.getFile_binary())));
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
        if (getFile_name() != null) {
            _hashCode += getFile_name().hashCode();
        }
        if (getFile_type() != null) {
            _hashCode += getFile_type().hashCode();
        }
        if (getFile_size() != null) {
            _hashCode += getFile_size().hashCode();
        }
        if (getFile_binary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFile_binary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFile_binary(), i);
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
        new org.apache.axis.description.TypeDesc(AttachmentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "AttachmentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_binary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_binary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "hexBinary"));
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
