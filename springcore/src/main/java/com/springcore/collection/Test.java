package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collectionConf.xml");
		Emp emp1 = (Emp) context.getBean("Emp1");
		 
		
		System.out.println(emp1);
		System.out.println(emp1.getPhones());
	}

}
