package com.algorithm;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the status :- ");
		String status = sc.nextLine();
		System.out.print("Enter the age :- ");
		int age = sc.nextInt();
		
		if (age >= 22 && status.equals("graduate")) {
			System.out.println("Ready for job");
		}
		else if (age == 18 && !status.equals("graduate")) {
			System.out.println("Go for graduation");
		}
		else {
			System.out.println("False information. \n" + " Complete HS");
		}
	}

}
