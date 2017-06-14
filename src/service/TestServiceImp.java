package service;

import javax.jws.WebService;

@WebService
public class TestServiceImp implements TestServiceInf {

	@Override
	public String ping() {
		System.out.println("测试ws服务。。");
		return "pong";
	}

}
