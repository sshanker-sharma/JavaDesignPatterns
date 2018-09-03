package com.sss.learning.designpatterns.factory;

public class Main {

	public static void main(String[] args) {
		VehicleFacory vf=new VehicleFacory();
		
		Vehicle car=vf.getInstance("car");
		car.run();
		
		Vehicle bike=vf.getInstance("bike");
		bike.run();

	}

}
