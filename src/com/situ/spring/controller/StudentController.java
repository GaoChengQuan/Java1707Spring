package com.situ.spring.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.situ.spring.pojo.Student;
import com.situ.spring.service.IStudentService;
import com.situ.spring.service.impl.StudentServiceImpl;

/*<bean name="studentControll" class="com.situ.spring.controller.StudentController">*/
@Controller("studentControll")
public class StudentController {
	//需要什么，就创建什么，这就叫“控制正转”
	@Resource(name="studentService")
	private IStudentService studentService;
	
	//注入
	//对象的创建交给别人，叫"控制反转"
	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}
	
	public void add() {
		Student student = new Student();
		studentService.add(student);
	}
}
