/**
 * Cms_bus_services_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.juyun.webservice.cms.visit.server;

public interface Cms_bus_services_PortType extends java.rmi.Remote {
    public com.juyun.webservice.cms.visit.server.ContentReturnType persistContent(com.juyun.webservice.cms.visit.server.ContentType request) throws java.rmi.RemoteException;
    public com.juyun.webservice.cms.visit.server.WsContentResponseType wsSave(com.juyun.webservice.cms.visit.server.WsContentRequestType parameters) throws java.rmi.RemoteException;
}
