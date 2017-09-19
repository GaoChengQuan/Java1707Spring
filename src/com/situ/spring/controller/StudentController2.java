package com.situ.spring.controller;

import com.situ.spring.pojo.Student;
import com.situ.spring.service.IStudentService;
import com.situ.spring.service.impl.StudentServiceImpl;

public class StudentController2 {
	//需要什么，就创建什么，这就叫“控制正转”
	private IStudentService studentService = new StudentServiceImpl();
	
	public void add() {
		Student student = new Student();
		studentService.add(student);
	}
}
