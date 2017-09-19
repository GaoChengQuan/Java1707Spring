package com.situ.spring.dao;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

import com.situ.spring.pojo.Student;

public interface IStudentDao {
	void add(Student student);
}
