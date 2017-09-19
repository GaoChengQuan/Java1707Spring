package com.situ.spring.dao.impl;

import com.situ.spring.dao.IStudentDao;
import com.situ.spring.pojo.Student;

public class StudentDaoProxy implements IStudentDao{
	private IStudentDao studentDao;
	
	public StudentDaoProxy(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	@Override
	public void add(Student student) {
		System.out.println("开启事务");
		studentDao.add(student);
		System.out.println("关闭事务");
	}

}
