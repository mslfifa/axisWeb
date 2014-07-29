/**
 * Cms_bus_services_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.juyun.webservice.cms.visit.server;

public class Cms_bus_services_ServiceLocator extends org.apache.axis.client.Service implements com.juyun.webservice.cms.visit.server.Cms_bus_services_Service {

    public Cms_bus_services_ServiceLocator() {
    }


    public Cms_bus_services_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Cms_bus_services_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for cms_bus_servicesPort
    private java.lang.String cms_bus_servicesPort_address = "http://www.juyun.com/";

    public java.lang.String getcms_bus_servicesPortAddress() {
        return cms_bus_servicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String cms_bus_servicesPortWSDDServiceName = "cms_bus_servicesPort";

    public java.lang.String getcms_bus_servicesPortWSDDServiceName() {
        return cms_bus_servicesPortWSDDServiceName;
    }

    public void setcms_bus_servicesPortWSDDServiceName(java.lang.String name) {
        cms_bus_servicesPortWSDDServiceName = name;
    }

    public com.juyun.webservice.cms.visit.server.Cms_bus_services_PortType getcms_bus_servicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(cms_bus_servicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getcms_bus_servicesPort(endpoint);
    }

    public com.juyun.webservice.cms.visit.server.Cms_bus_services_PortType getcms_bus_servicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.juyun.webservice.cms.visit.server.Cms_bus_servicesBindingStub _stub = new com.juyun.webservice.cms.visit.server.Cms_bus_servicesBindingStub(portAddress, this);
            _stub.setPortName(getcms_bus_servicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setcms_bus_servicesPortEndpointAddress(java.lang.String address) {
        cms_bus_servicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.juyun.webservice.cms.visit.server.Cms_bus_services_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.juyun.webservice.cms.visit.server.Cms_bus_servicesBindingStub _stub = new com.juyun.webservice.cms.visit.server.Cms_bus_servicesBindingStub(new java.net.URL(cms_bus_servicesPort_address), this);
                _stub.setPortName(getcms_bus_servicesPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("cms_bus_servicesPort".equals(inputPortName)) {
            return getcms_bus_servicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "cms_bus_services");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/cms_bus_services/", "cms_bus_servicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("cms_bus_servicesPort".equals(portName)) {
            setcms_bus_servicesPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
