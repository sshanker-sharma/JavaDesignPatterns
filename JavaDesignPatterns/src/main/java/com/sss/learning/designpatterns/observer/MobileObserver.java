package com.sss.learning.designpatterns.observer;

public class MobileObserver implements Observer{

	double accountBalance;
	
	String observerName;
	
	
	
	public MobileObserver(String observerName) {
		this.observerName=observerName;
	}
	@Override
	public void observe(double accountBalance) {
		this.accountBalance=accountBalance;
		System.out.println(observerName+": Account balance has been updated. Current Value: "+accountBalance);	
	}
	
}
