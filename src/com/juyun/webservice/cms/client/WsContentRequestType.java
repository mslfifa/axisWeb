/**
 * WsContentRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.juyun.webservice.cms.client;

public class WsContentRequestType  implements java.io.Serializable {
    private java.lang.String title;

    private java.lang.String channel_name;

    private java.lang.String content;

    private java.util.Date release_date;

    private com.juyun.webservice.cms.client.AttachmentType[] attachments;

    public WsContentRequestType() {
    }

    public WsContentRequestType(
           java.lang.String title,
           java.lang.String channel_name,
           java.lang.String content,
           java.util.Date release_date,
           com.juyun.webservice.cms.client.AttachmentType[] attachments) {
           this.title = title;
           this.channel_name = channel_name;
           this.content = content;
           this.release_date = release_date;
           this.attachments = attachments;
    }


    /**
     * Gets the title value for this WsContentRequestType.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this WsContentRequestType.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the channel_name value for this WsContentRequestType.
     * 
     * @return channel_name
     */
    public java.lang.String getChannel_name() {
        return channel_name;
    }


    /**
     * Sets the channel_name value for this WsContentRequestType.
     * 
     * @param channel_name
     */
    public void setChannel_name(java.lang.String channel_name) {
        this.channel_name = channel_name;
    }


    /**
     * Gets the content value for this WsContentRequestType.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this WsContentRequestType.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the release_date value for this WsContentRequestType.
     * 
     * @return release_date
     */
    public java.util.Date getRelease_date() {
        return release_date;
    }


    /**
     * Sets the release_date value for this WsContentRequestType.
     * 
     * @param release_date
     */
    public void setRelease_date(java.util.Date release_date) {
        this.release_date = release_date;
    }


    /**
     * Gets the attachments value for this WsContentRequestType.
     * 
     * @return attachments
     */
    public com.juyun.webservice.cms.client.AttachmentType[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this WsContentRequestType.
     * 
     * @param attachments
     */
    public void setAttachments(com.juyun.webservice.cms.client.AttachmentType[] attachments) {
        this.attachments = attachments;
    }

    public com.juyun.webservice.cms.client.AttachmentType getAttachments(int i) {
        return this.attachments[i];
    }

    public void setAttachments(int i, com.juyun.webservice.cms.client.AttachmentType _value) {
        this.attachments[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsContentRequestType)) return false;
        WsContentRequestType other = (WsContentRequestType) obj;
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
            ((this.channel_name==null && other.getChannel_name()==null) || 
             (this.channel_name!=null &&
              this.channel_name.equals(other.getChannel_name()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.release_date==null && other.getRelease_date()==null) || 
             (this.release_date!=null &&
              this.release_date.equals(other.getRelease_date()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments())));
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
        if (getChannel_name() != null) {
            _hashCode += getChannel_name().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getRelease_date() != null) {
            _hashCode += getRelease_date().hashCode();
        }
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
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
        new org.apache.axis.description.TypeDesc(WsContentRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "WsContentRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel_name"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "AttachmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
