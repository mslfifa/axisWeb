/**
 * Cms_bus_servicesBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.juyun.webservice.cms.visit.server;

public class Cms_bus_servicesBindingSkeleton implements com.juyun.webservice.cms.visit.server.Cms_bus_services_PortType, org.apache.axis.wsdl.Skeleton {
    private com.juyun.webservice.cms.visit.server.Cms_bus_services_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "ContentRequestElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "ContentType"), com.juyun.webservice.cms.visit.server.ContentType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("persistContent", _params, new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "ContentReturnElement"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "ContentReturnType"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "persistContent"));
        _oper.setSoapAction("http://www.example.org/cms_bus_services/persistContent");
        _myOperationsList.add(_oper);
        if (_myOperations.get("persistContent") == null) {
            _myOperations.put("persistContent", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("persistContent")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "WsContentRequestElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "WsContentRequestType"), com.juyun.webservice.cms.visit.server.WsContentRequestType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("wsSave", _params, new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "WsContentResponseElement"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "WsContentResponseType"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "wsSave"));
        _oper.setSoapAction("http://www.example.org/cms_bus_services/wsSave");
        _myOperationsList.add(_oper);
        if (_myOperations.get("wsSave") == null) {
            _myOperations.put("wsSave", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("wsSave")).add(_oper);
    }

    public Cms_bus_servicesBindingSkeleton() {
        this.impl = new com.juyun.webservice.cms.visit.server.Cms_bus_servicesBindingImpl();
    }

    public Cms_bus_servicesBindingSkeleton(com.juyun.webservice.cms.visit.server.Cms_bus_services_PortType impl) {
        this.impl = impl;
    }
    public com.juyun.webservice.cms.visit.server.ContentReturnType persistContent(com.juyun.webservice.cms.visit.server.ContentType request) throws java.rmi.RemoteException
    {
        com.juyun.webservice.cms.visit.server.ContentReturnType ret = impl.persistContent(request);
        return ret;
    }

    public com.juyun.webservice.cms.visit.server.WsContentResponseType wsSave(com.juyun.webservice.cms.visit.server.WsContentRequestType parameters) throws java.rmi.RemoteException
    {
        com.juyun.webservice.cms.visit.server.WsContentResponseType ret = impl.wsSave(parameters);
        return ret;
    }

}
