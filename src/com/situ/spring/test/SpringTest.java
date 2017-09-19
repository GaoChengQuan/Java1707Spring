package com.situ.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.situ.spring.controller.StudentController;
import com.situ.spring.dao.IStudentDao;
import com.situ.spring.pojo.Student;
import com.situ.spring.service.impl.StudentServiceImpl;

public class SpringTest {
	@Test
	public void testSpring1() {
		//首先要得到IOC容器
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//从容器中得到bean
		Student student1 = (Student) applicationContext.getBean("student");
		System.out.println(student1);
		//管理容器，会出发destory方法，
		applicationContext.close();
	}
	
	@Test
	public void testSpring() {
		//首先要得到IOC容器
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//从容器中得到bean
		Student student1 = (Student) applicationContext.getBean("student");
		Student student2 = (Student) applicationContext.getBean("student");
		System.out.println(student1 == student2);
	}
	
	@Test
	public void testSpring3() {
		//首先要得到IOC容器
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//从容器中得到bean
		StudentController controller = (StudentController) applicationContext.getBean("studentControll");
		controller.add();
	}
	
	@Test
	public void testSpring4() {
		//首先要得到IOC容器
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//从容器中得到bean
		IStudentDao studentDao =  (IStudentDao) applicationContext.getBean("studentDaoTarget");
		studentDao.save();
	}
	
}
