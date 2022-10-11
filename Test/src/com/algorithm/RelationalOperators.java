package com.algorithm;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st value :- ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd value :- ");
		int b = sc.nextInt();
		
		System.out.println("a != b :- " + (a != b));
		System.out.println("a >= b :- " + (a >= b));
		System.out.println("a <= b :- " + (a <= b));
	}
	
}
