/**
 * ContentReturnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.juyun.webservice.cms.visit.server;

public class ContentReturnType  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String msg;

    private java.lang.String reply_time;

    private java.lang.String session_id;

    private java.lang.String[] exception;

    public ContentReturnType() {
    }

    public ContentReturnType(
           java.lang.String status,
           java.lang.String msg,
           java.lang.String reply_time,
           java.lang.String session_id,
           java.lang.String[] exception) {
           this.status = status;
           this.msg = msg;
           this.reply_time = reply_time;
           this.session_id = session_id;
           this.exception = exception;
    }


    /**
     * Gets the status value for this ContentReturnType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ContentReturnType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the msg value for this ContentReturnType.
     * 
     * @return msg
     */
    public java.lang.String getMsg() {
        return msg;
    }


    /**
     * Sets the msg value for this ContentReturnType.
     * 
     * @param msg
     */
    public void setMsg(java.lang.String msg) {
        this.msg = msg;
    }


    /**
     * Gets the reply_time value for this ContentReturnType.
     * 
     * @return reply_time
     */
    public java.lang.String getReply_time() {
        return reply_time;
    }


    /**
     * Sets the reply_time value for this ContentReturnType.
     * 
     * @param reply_time
     */
    public void setReply_time(java.lang.String reply_time) {
        this.reply_time = reply_time;
    }


    /**
     * Gets the session_id value for this ContentReturnType.
     * 
     * @return session_id
     */
    public java.lang.String getSession_id() {
        return session_id;
    }


    /**
     * Sets the session_id value for this ContentReturnType.
     * 
     * @param session_id
     */
    public void setSession_id(java.lang.String session_id) {
        this.session_id = session_id;
    }


    /**
     * Gets the exception value for this ContentReturnType.
     * 
     * @return exception
     */
    public java.lang.String[] getException() {
        return exception;
    }


    /**
     * Sets the exception value for this ContentReturnType.
     * 
     * @param exception
     */
    public void setException(java.lang.String[] exception) {
        this.exception = exception;
    }

    public java.lang.String getException(int i) {
        return this.exception[i];
    }

    public void setException(int i, java.lang.String _value) {
        this.exception[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContentReturnType)) return false;
        ContentReturnType other = (ContentReturnType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.msg==null && other.getMsg()==null) || 
             (this.msg!=null &&
              this.msg.equals(other.getMsg()))) &&
            ((this.reply_time==null && other.getReply_time()==null) || 
             (this.reply_time!=null &&
              this.reply_time.equals(other.getReply_time()))) &&
            ((this.session_id==null && other.getSession_id()==null) || 
             (this.session_id!=null &&
              this.session_id.equals(other.getSession_id()))) &&
            ((this.exception==null && other.getException()==null) || 
             (this.exception!=null &&
              java.util.Arrays.equals(this.exception, other.getException())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMsg() != null) {
            _hashCode += getMsg().hashCode();
        }
        if (getReply_time() != null) {
            _hashCode += getReply_time().hashCode();
        }
        if (getSession_id() != null) {
            _hashCode += getSession_id().hashCode();
        }
        if (getException() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getException());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getException(), i);
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
        new org.apache.axis.description.TypeDesc(ContentReturnType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "ContentReturnType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reply_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reply_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("session_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "session_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exception");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exception"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
