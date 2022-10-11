package com.test;

public class Test {

	public static void main(String[] args) {
		Car car = new Car("WB123456", "White", new Engine("Honda", "Diesel", 100));
		
		System.out.println("Car number :- " + car.getNumber());
		System.out.println("Car color :- " + car.getColor());
		System.out.println("Car engine name :- " + car.getEngine().getCompanyName());
		System.out.println("Car engine type :- " + car.getEngine().getType());
	}

}
