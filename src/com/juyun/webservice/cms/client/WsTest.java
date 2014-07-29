package com.juyun.webservice.cms.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Date;

import javax.xml.rpc.ServiceException;

public class WsTest {

	public static void main(String[] args) throws ServiceException, IOException {
		// TODO Auto-generated method stub
		Cms_bus_services_Service service = new Cms_bus_services_ServiceLocator();
		WsContentRequestType request = new WsContentRequestType();
		request.setTitle("原开封书记或涉土地贪腐");
		request.setContent("法学家：继承法将配偶作为第一继承人不妥 你怎么看清华非升即走政策引争议 学生请愿留未续聘老师吕秀莲声称台湾要做“永久中立国”(图)广州区财政局官员被杀 家属疑因多次拒贿得罪人");
		Date release_date = new Date(2014,5,10);
		request.setRelease_date(release_date );
		request.setChannel_name("国内新闻");
		
		InputStream is = null;
		byte[] tmp = null;
		String dir = "D:/temp/img/png/建筑/";
		
		AttachmentType[] attachments = new AttachmentType[2];
		
		attachments[0] = new AttachmentType();
		attachments[0].setFile_name("世界名建筑05.png");
		is = new FileInputStream(dir+attachments[0].getFile_name());
		tmp = new byte[is.available()];
		is.read(tmp);
		attachments[0].setFile_binary(tmp);
		attachments[0].setFile_size(tmp.length+"");
		attachments[0].setFile_type("img");
		
		attachments[1] = new AttachmentType();
		attachments[1].setFile_name("世界名建筑06.png");
		is = new FileInputStream(dir+attachments[1].getFile_name());
		tmp = new byte[is.available()];
		is.read(tmp);
		attachments[1].setFile_binary(tmp);
		attachments[1].setFile_size(tmp.length+"");
		attachments[1].setFile_type("img");
		
		request.setAttachments(attachments);
		
		WsContentResponseType response = service.getcms_bus_servicesPort().wsSave(request);
		System.out.println("status:"+response.getStatus()+"|msg:"+response.getMsg()+"|Err_code:"+response.getErr_code());
		
	}

}
