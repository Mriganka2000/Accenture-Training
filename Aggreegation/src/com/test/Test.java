package com.test;

public class Test {

	public static void main(String[] args) {
		Driver d = new Driver("John", 30, true);
		Car c = new Car("WB123456", "White", d);
		
		System.out.println("Car number :- " + c.getNumber());
		System.out.println("Car color :- " + c.getColor());
		System.out.println("Car Driver name :- " + c.getDriver().getName());
	}

}
