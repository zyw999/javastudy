package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.TestDIService;

public class TestDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestDIService ts1=(TestDIService)appCon.getBean("testDIService1");
		ts1.sayHello();

	}

}
