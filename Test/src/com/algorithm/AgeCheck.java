package com.algorithm;

import java.util.Scanner;

public class AgeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age :- ");
		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not Eligible for vote");
		}
	}

}
