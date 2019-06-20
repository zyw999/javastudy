package service;

import dao.TestDIDao;

public class TestDIServiceImpl1 implements TestDIService {
	private TestDIDao testDIDao;
	public void setTestDIDao(TestDIDao testDIDao) {

		this.testDIDao=testDIDao;
	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		testDIDao.sayHello();
		System.out.println("TestDIService setter ·½·¨×¢Èë say:Hello,Study hard");
		
	}

}
