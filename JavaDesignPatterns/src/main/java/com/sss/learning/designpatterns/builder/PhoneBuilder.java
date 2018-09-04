package com.sss.learning.designpatterns.builder;

public class PhoneBuilder {
	Phone phone;

	public PhoneBuilder() {
		phone=new Phone();
	}
	
	public PhoneBuilder setMake(String make) {
		phone.setMake(make);
		return this;
	}
	public PhoneBuilder setYearOfManufacturing(int yearOfManufacturing) {
		phone.setYearOfManufacturing(yearOfManufacturing);
		return this;
	}
	public PhoneBuilder setWeight(String weight) {
		phone.setWeight(weight);
		return this;
	}
	public PhoneBuilder setModelNumber(String modelNumber) {
		phone.setModelNumber(modelNumber);
		return this;
	}
	public PhoneBuilder setOsType(String osType) {
		phone.setOsType(osType);
		return this;
	}
	public PhoneBuilder setOsVersion(String osVersion) {
		phone.setOsVersion(osVersion);
		return this;
	}
	
	public Phone getPhone() {
		return phone;
	}

}
