/**
 * Cms_bus_servicesBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.juyun.webservice.cms.visit.server;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Cms_bus_servicesBindingImpl implements com.juyun.webservice.cms.visit.server.Cms_bus_services_PortType{
    public com.juyun.webservice.cms.visit.server.ContentReturnType persistContent(com.juyun.webservice.cms.visit.server.ContentType request) throws java.rmi.RemoteException {
        return null;
    }

    public com.juyun.webservice.cms.visit.server.WsContentResponseType wsSave(com.juyun.webservice.cms.visit.server.WsContentRequestType request) throws java.rmi.RemoteException {
    	com.juyun.webservice.cms.visit.server.WsContentResponseType response = new com.juyun.webservice.cms.visit.server.WsContentResponseType();
    	response.setStatus("success");
    	response.setMsg("操作成功!title:"+request.getTitle()+"|content:"+request.getContent()+"|Channel_name:"+request.getChannel_name()+"|getRelease_date:"+request.getRelease_date());
    	if(request.getAttachments()!=null){
    		AttachmentType[] attachs = request.getAttachments().clone();
    		
    		if(attachs!=null && attachs.length>0){
    			String dir = "D:/temp/attachment/ws_files/";
    			OutputStream os = null;
    			for (int i = 0; i < attachs.length; i++) {
    				AttachmentType item = attachs[i];
    				String filePath = dir+item.getFile_name();
    				byte[] fileBytes = item.getFile_binary();
    				try {
    	        		os = new FileOutputStream(filePath);
    	    			os.write(fileBytes);
    	    			os.flush();
    	    			System.out.println("##### write file to "+filePath);
    	    		} catch (FileNotFoundException e) {
    	    			// TODO Auto-generated catch block
    	    			e.printStackTrace();
    	    		} catch (IOException e) {
    	    			// TODO Auto-generated catch block
    	    			e.printStackTrace();
    	    		}finally{
    	    			if(os!=null){
    	    				try {
    	    					os.close();
    	    				} catch (IOException e) {
    	    					// TODO Auto-generated catch block
    	    					e.printStackTrace();
    	    				}
    	    			}
    	    		}
				}
    		}
    		
    		/*String fileName = request.getAttachments().clone();
        	byte[] fileBytes = request.getAttachments().getFile_binary();
        	OutputStream os = null;
        	try {
    			String filePath = "D:/temp/attachment/ws_files/"+fileName;
        		os = new FileOutputStream(filePath);
    			os.write(fileBytes);
    			System.out.println("##### write file to "+filePath);
    			os.flush();
    		} catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}finally{
    			if(os!=null){
    				try {
    					os.close();
    				} catch (IOException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
    			}
    		}*/
    	}
    	
    	
    	return response;
    }

}
