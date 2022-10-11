package com.algorithm;

import java.util.Scanner;

public class Test {
	double radius;
	final double PI = 3.1415926535898;
	double area;
	
	double calculate(double radi) throws ArithmeticException {
		radius = radi;
		area = PI * radius * radius;
		
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
				
		try {
			System.out.println(new Test().calculate(radius));
		} catch (ArithmeticException e) {
			e.getMessage();
		}
	}

}
