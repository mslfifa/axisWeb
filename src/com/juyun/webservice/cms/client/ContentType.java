/**
 * ContentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.juyun.webservice.cms.client;

public class ContentType  implements java.io.Serializable {
    private java.lang.String title;

    private java.lang.String content;

    private java.util.Calendar release_date;

    private byte[] attachment;

    private java.lang.String session_id;

    private java.util.Calendar create_time;

    public ContentType() {
    }

    public ContentType(
           java.lang.String title,
           java.lang.String content,
           java.util.Calendar release_date,
           byte[] attachment,
           java.lang.String session_id,
           java.util.Calendar create_time) {
           this.title = title;
           this.content = content;
           this.release_date = release_date;
           this.attachment = attachment;
           this.session_id = session_id;
           this.create_time = create_time;
    }


    /**
     * Gets the title value for this ContentType.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ContentType.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the content value for this ContentType.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this ContentType.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the release_date value for this ContentType.
     * 
     * @return release_date
     */
    public java.util.Calendar getRelease_date() {
        return release_date;
    }


    /**
     * Sets the release_date value for this ContentType.
     * 
     * @param release_date
     */
    public void setRelease_date(java.util.Calendar release_date) {
        this.release_date = release_date;
    }


    /**
     * Gets the attachment value for this ContentType.
     * 
     * @return attachment
     */
    public byte[] getAttachment() {
        return attachment;
    }


    /**
     * Sets the attachment value for this ContentType.
     * 
     * @param attachment
     */
    public void setAttachment(byte[] attachment) {
        this.attachment = attachment;
    }


    /**
     * Gets the session_id value for this ContentType.
     * 
     * @return session_id
     */
    public java.lang.String getSession_id() {
        return session_id;
    }


    /**
     * Sets the session_id value for this ContentType.
     * 
     * @param session_id
     */
    public void setSession_id(java.lang.String session_id) {
        this.session_id = session_id;
    }


    /**
     * Gets the create_time value for this ContentType.
     * 
     * @return create_time
     */
    public java.util.Calendar getCreate_time() {
        return create_time;
    }


    /**
     * Sets the create_time value for this ContentType.
     * 
     * @param create_time
     */
    public void setCreate_time(java.util.Calendar create_time) {
        this.create_time = create_time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentType)) return false;
        ContentType other = (ContentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.release_date==null && other.getRelease_date()==null) || 
             (this.release_date!=null &&
              this.release_date.equals(other.getRelease_date()))) &&
            ((this.attachment==null && other.getAttachment()==null) || 
             (this.attachment!=null &&
              java.util.Arrays.equals(this.attachment, other.getAttachment()))) &&
            ((this.session_id==null && other.getSession_id()==null) || 
             (this.session_id!=null &&
              this.session_id.equals(other.getSession_id()))) &&
            ((this.create_time==null && other.getCreate_time()==null) || 
             (this.create_time!=null &&
              this.create_time.equals(other.getCreate_time())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getRelease_date() != null) {
            _hashCode += getRelease_date().hashCode();
        }
        if (getAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSession_id() != null) {
            _hashCode += getSession_id().hashCode();
        }
        if (getCreate_time() != null) {
            _hashCode += getCreate_time().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "ContentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("release_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "release_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "hexBinary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("session_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "session_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "create_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
