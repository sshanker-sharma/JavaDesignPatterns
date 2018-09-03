package com.sss.learning.designpatterns.builder;

public class PhoneBuilder {
	Phone phone;

	public Phone setMake(String make) {
		phone.setMake(make);
		return phone;
	}
	public Phone setYearOfManufacturing(int yearOfManufacturing) {
		phone.setYearOfManufacturing(yearOfManufacturing);
		return phone;
	}
	public Phone setWeight(String weight) {
		phone.setWeight(weight);
		return phone;
	}
	public Phone setModelNumber(String modelNumber) {
		phone.setModelNumber(modelNumber);
		return phone;
	}
	public Phone setOsType(String osType) {
		phone.setOsType(osType);
		return phone;
	}
	public Phone setOsVersion(String osVersion) {
		phone.setOsVersion(osVersion);
		return phone;
	}
	
	
	public Phone getPhone() {
		return new Phone(phone.getMake(), phone.getYearOfManufacturing(), phone.getWeight(), phone.getModelNumber(), phone.getOsType(), phone.getOsVersion());
	}

}
