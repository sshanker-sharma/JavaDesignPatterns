package com.sss.learning.designpatterns.builder;

public class MainBuilderDesignPattern {

	public static void main(String[] args) {
		
		Phone phone=new PhoneBuilder().setMake("Nokia").setModelNumber("1.11").setOsVersion("Android").getPhone();
		
		System.out.println("phone::" + phone);
		
	}
}
