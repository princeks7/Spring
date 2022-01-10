package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it"+ fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStrartupStuff() {
		System.out.println("TrackCoch: inside method doMyStartUpMethod");
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
	
	
	
	
	
	
	

}
