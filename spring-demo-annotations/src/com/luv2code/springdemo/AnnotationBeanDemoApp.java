package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanDemoApp {

	public static void main(String[] args) {

		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//retrive bean form the container
		
		Coach theCoach = context.getBean("tennishCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennishCoach", Coach.class);
		
		
		boolean result = (theCoach == alphaCoach);
		//print out the results
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for the theCoach: " + theCoach);
		System.out.println("\nMemeory location for the alphaCoah: " + alphaCoach);
		//close the context
		context.close();
	}

}
