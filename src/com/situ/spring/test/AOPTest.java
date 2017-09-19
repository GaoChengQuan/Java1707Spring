package com.situ.spring.test;

import org.junit.Test;

import com.situ.spring.dao.IStudentDao;
import com.situ.spring.dao.impl.ProxyFactory;
import com.situ.spring.dao.impl.StudentDaoImpl;
import com.situ.spring.dao.impl.StudentDaoProxy;
import com.situ.spring.pojo.Student;

public class AOPTest {
	@Test
	public void test1() {
		IStudentDao studentDao = new StudentDaoProxy(new StudentDaoImpl());
		studentDao.add(new Student());
	}
	
	@Test
	public void test2() {
		//1.目标对象
		IStudentDao target = new StudentDaoImpl();
		//2.给目标对象创建代理对象
		IStudentDao proxy = (IStudentDao) new ProxyFactory(target).getProxyInstance();
		proxy.delete();
		
	}
}
