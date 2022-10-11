package com.test;

public class Car {

	private String number;
	private String color;
	private Engine engine;
	
	public Car(String number, String color, Engine engine) {
		this.number = number;
		this.color = color;
		this.engine = engine;
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
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
