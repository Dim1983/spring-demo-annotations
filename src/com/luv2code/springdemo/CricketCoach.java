package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
	System.out.println("CricketCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
	this.fortuneService = fortuneService;
	System.out.println("CricketCoach: inside no-arg constructor setFortuneService");
    }

    @Override
    public String getDailyWorkout() {
	// TODO Auto-generated method stub
	return "Practice fast bowling for 15 minutes";
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
	System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
	System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    @Override
    public String getDailyFortune() {
	// TODO Auto-generated method stub
	return fortuneService.getFortune();
    }

}
