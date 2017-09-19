package com.situ.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.situ.spring.dao.IStudentDao;
import com.situ.spring.pojo.Student;

@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao {
	@Override
	public void save() {
		System.out.println("StudentDaoImpl.save()");
	}

	@Override
	public void update() {
		System.out.println("StudentDaoImpl.update()");
	}

	@Override
	public void delete() {
		System.out.println("StudentDaoImpl.delete()");
	}

	@Override
	public void find() {
		System.out.println("StudentDaoImpl.find()");
	}
}
