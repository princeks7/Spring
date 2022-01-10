package com.springcore.javaconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		
		Student student = context.getBean("student",Student.class);
		System.out.println(student);
		
		context.close();
		
		
	}

}
