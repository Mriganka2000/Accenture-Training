package com.algorithm;

import java.util.Scanner;

public class Operation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st value :- ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd value :- ");
		int b = sc.nextInt();
		
		System.out.println("Addition :- " + (a + b));
		System.out.println("Subtraction :- " + (a - b));
		System.out.println("Pre increment :- " + (++a));
		System.out.println("Post decrement :- " + (b--) + " " + b);
		System.out.println("Multiplication :- " + (a * b));
		int div = a / b;
		int rem = a % b;
		System.out.println("Division :- " + div);
		System.out.println("Modulo :- " + rem);
	}
	
}
