package com.situ.spring.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sun.org.apache.bcel.internal.util.SecuritySupport;

/*<bean name="student" class="com.situ.spring.pojo.Student">*/
//@Component("student")
@Controller("student")//web层
//@Service("student")//service层
//@Repository("student")//dao层
public class Student implements Serializable {

	private Integer id = 3;
	private String name;
	private Integer age;
	private String gender;
	private String address;
	private Date birthday;
	private Banji banji;
	
	public void init() {
		System.out.println("Student.init()");
	}
	
	public void destory() {
		System.out.println("Student.destory()");
	}

	//Spring容器构造对象调用无参构造方法
	public Student() {
		super();
		System.out.println("Student.Student()");
	}

	public Student(Integer id, String name, Integer age, String gender, String address, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.birthday = birthday;
	}

	public Student(String name, Integer age, String gender, String address, Date birthday) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.birthday = birthday;
	}

	

	public Student(Integer id, String name, Integer age, String gender, Banji banji) {
		super();
		System.out.println("Student.Student()222");
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.banji = banji;
	}
	
	public Student(String name,Integer id, Integer age, String gender, Banji banji) {
		super();
		System.out.println("Student.Student()111");
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.banji = banji;
	}
	public Banji getBanji() {
		return banji;
	}

	public void setBanji(Banji banji) {
		this.banji = banji;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
		System.out.println("Student.setId() id : " + id);
	}

	public String getName() {
		return name;
	}

	//set方式注入
	@Value("王五")
	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address
				+ ", birthday=" + birthday + ", banji=" + banji + "]";
	}

}
