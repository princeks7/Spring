package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HellowSpringApp {

	public static void main(String[] args) {

		
		 // load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean spring context
		Coach c1 = context.getBean("myCoach", Coach.class);
		//call method on bean
		System.out.println(c1.getDailyWorkout());
		//let's  call our new method for fortunes
		System.out.println(c1.getDailyFortune());
		
		
		//close the context
		context.close();
	}

}
