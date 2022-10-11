package com.polymorphism;

public class MethodOverloading {

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	public static void main(String[] args) {
		System.err.println(add(10, 20)); // Calls 1st add
		System.err.println(add(10, 20, 30)); // Calls 2nd add
		System.err.println(add(10, 20, 30, 40)); // Calls 3rd add
	}

}
