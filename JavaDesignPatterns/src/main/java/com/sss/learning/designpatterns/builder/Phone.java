package com.sss.learning.designpatterns.builder;

public class Phone {

	String make;
	int yearOfManufacturing;
	String weight;
	String modelNumber;
	String osType;
	String osVersion;
	
	
	
	public Phone(String make, int yearOfManufacturing, String weight, String modelNumber, String osType,
			String osVersion) {
		super();
		this.make = make;
		this.yearOfManufacturing = yearOfManufacturing;
		this.weight = weight;
		this.modelNumber = modelNumber;
		this.osType = osType;
		this.osVersion = osVersion;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYearOfManufacturing() {
		return yearOfManufacturing;
	}
	public void setYearOfManufacturing(int yearOfManufacturing) {
		this.yearOfManufacturing = yearOfManufacturing;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Phone [make=");
		builder.append(make);
		builder.append(", yearOfManufacturing=");
		builder.append(yearOfManufacturing);
		builder.append(", weight=");
		builder.append(weight);
		builder.append(", modelNumber=");
		builder.append(modelNumber);
		builder.append(", osType=");
		builder.append(osType);
		builder.append(", osVersion=");
		builder.append(osVersion);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
