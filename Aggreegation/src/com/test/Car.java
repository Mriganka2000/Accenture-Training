package com.test;

public class Car {

	private String number;
	private String color;
	private Driver driver;
	
	public Car(String number, String color, Driver driver) {
		this.number = number;
		this.color = color;
		this.driver = driver;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
}
