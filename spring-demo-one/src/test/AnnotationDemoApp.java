package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read the spring file
	      ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("test/applicationContext.xml");
	     
		//get the bean from spring container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		 context.close();
		
		
	}

}
