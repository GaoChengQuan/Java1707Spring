package com.situ.spring.dao;

import org.springframework.stereotype.Repository;

import com.situ.spring.pojo.Student;

@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao{

	@Override
	public void add(Student student) {
		System.out.println("StudentDaoImpl.add()");
	}

}
