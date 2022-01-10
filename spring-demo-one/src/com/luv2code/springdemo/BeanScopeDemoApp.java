package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
      //load the spring configuration file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrive bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoah = context.getBean("myCoach", Coach.class);
		
		//check if they are the same
		
		boolean results = (theCoach == alphaCoah);
	    //results printing
		System.out.println("Pointing to the same object: "+results);
		
		// Memory location of the objects
		System.out.println("The momory location of the theCouch object: "+theCoach);
		
		System.out.println("The momory location of the alphaobject object: "+alphaCoah);
		
		//closing the context object
		context.close();
		
	}

}
