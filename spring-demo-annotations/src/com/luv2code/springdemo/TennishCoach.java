package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennishCoach implements Coach {
    @Autowired
    @Qualifier("fortuneRandomPropertyFile")
	private FortuneService fortuneService;
	
//    @Autowired
//	public TennishCoach(FortuneService theFortuneService)
//	{
//		fortuneService = theFortuneService;
//	}
//   define a default constructor
	public TennishCoach()
	{
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	///define the init method
	public void doMyStartupStuff() {
		System.out.println(">>TennishCoach: inside the doMystartupStuff()");
	}
	
	
	
	//define a setter method
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: inside setFortuneService");
//		this.fortuneService = fortuneService;
//	}
	@Override
	public String getDailyWorkout() {
		return "Practice your bachhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
