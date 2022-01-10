package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		//read the spring file
	      AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
	     
		//get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//call the new swim coach methods.. has the props values injected
		System.out.println("email"+ theCoach.getEmail());
		System.out.println("email"+ theCoach.getTeam());
		//close the context
		 context.close();
		
		
	}

}
