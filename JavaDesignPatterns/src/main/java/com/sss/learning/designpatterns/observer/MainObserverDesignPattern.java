package com.sss.learning.designpatterns.observer;

public class MainObserverDesignPattern {

	
	public static void main(String[] args) {
		
		Account bankAccount=new Account();
		
		Observer mobileObserver=new MobileObserver("My NokiaMobile");
		bankAccount.registerObserver(mobileObserver);
		
		Observer laptopObserver=new MobileObserver("My MI Phone");
		bankAccount.registerObserver(laptopObserver);
		
		Observer blackBerryMobileObserver=new MobileObserver("My Blackberry Mobile");
		bankAccount.registerObserver(blackBerryMobileObserver);
		
		
		bankAccount.updateAccountBalance(100);
		
		bankAccount.unRegisterObserver(blackBerryMobileObserver);

		bankAccount.updateAccountBalance(200);
		
	}
}
