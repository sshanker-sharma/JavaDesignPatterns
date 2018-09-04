package com.sss.learning.designpatterns.observer;

public interface Observable {

	public void registerObserver(Observer observer);
	public void notifyObservers();
	public void unRegisterObserver(Observer observer);
	
}
