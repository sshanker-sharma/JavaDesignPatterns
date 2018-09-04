package com.sss.learning.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Account implements Observable{

	double accountBalance;
	List<Observer> observers;
	
	public Account() {
		this.observers=new ArrayList<Observer>();
		
	}
	public void updateAccountBalance(double accountBalance) {
		this.accountBalance=accountBalance;
		notifyObservers();
		
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void unRegisterObserver(Observer observer) {
		observers.remove(observers.indexOf(observer));
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer:observers) {
			observer.observe(accountBalance);
		}
	}
}
