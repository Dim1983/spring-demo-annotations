package com.luv2code.springdemo;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

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

    @Override
    public String getDailyFortune() {
	// TODO Auto-generated method stub
	return fortuneService.getFortune();
    }

}
