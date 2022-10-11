package com.algorithm;

import java.util.Scanner;

public class BitwiseOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st value :- ");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd value :- ");
		int b = sc.nextInt();
		
		System.out.println("a AND b :- " + (a & b));
		System.out.println("a XOR b :- " + (a ^ b));
	}

}
