package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {
    private String[] fortuneArray;

    public void setFortuneArray(String[] fortuneArray) {
	this.fortuneArray = fortuneArray;
    }

    @Override
    public String getFortune() {
	
	int i = (int) (Math.random() * 10);
	return fortuneArray[i];
    }

}
