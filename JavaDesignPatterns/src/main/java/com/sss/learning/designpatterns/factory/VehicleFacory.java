package com.sss.learning.designpatterns.factory;

public class VehicleFacory {

	public Vehicle getInstance(String vehicleType){

		if("car".equals(vehicleType)) {
			return new Car();
		}else if("bike".equals(vehicleType)) {
			return new Bike();
		}else {
			return null;
		}			

	}

}
