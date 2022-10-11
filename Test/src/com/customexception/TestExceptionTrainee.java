package com.customexception;

import java.util.Scanner;

public class TestExceptionTrainee {

	public static void checkTrainee() throws TrainingException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the trainee name :- ");
		String name = sc.next();
		System.out.println("Enter the access ID status :- ");
		char hasId = sc.next().charAt(0);
		System.out.println("Enter the laptop status :- ");
		char hasLap = sc.next().charAt(0);
		
		if (hasId == 'y' && hasLap == 'y') {
			System.out.println(name + " Go to the trainging room.");
		}
		else {
			throw new TrainingException("Trainee will not enter");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkTrainee();
		} catch (TrainingException e) {
			e.printStackTrace();
		}
	}

}
