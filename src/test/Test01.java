package test;

import javax.xml.ws.Endpoint;

import service.TestServiceImp;
import service.TestServiceInf;

public class Test01 {
	public static void main(String[] args) {
		TestServiceInf testService=new TestServiceImp();
		Endpoint.publish("http://localhost/testWs", testService);
		
	}

}
