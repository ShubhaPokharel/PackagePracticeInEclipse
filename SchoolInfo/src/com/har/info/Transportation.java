package com.har.info;

public class Transportation {
	public void transporatationInfo(int money) {
		if(money < 100) {
			System.out.println("You have payed less than 100 dollars for transportation throughout the whole year.");
		}
		else {
			System.out.println("You have payed more than 100 dollars for transportation throughout the whole year.");
		}
	}
}
