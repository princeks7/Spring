package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	//add new field for the emailAddress and team
	
	private String emailAddress;
	private String team;
	
	
  public FortuneService getFortuneService() {
		return fortuneService;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCouchinside setter method - EmailAddress");
		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		System.out.println("CricketCouchinside setter method - Set team");
		this.team = team;
	}
    

	/// create a no arg constructor
	public CricketCoach() {
     System.out.println("CricketCouch:Let us play cricket in constructor");
     
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCouchinside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Pactice fast bowling for 15 minutes";
		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
