package com.algorithm;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
//			FileReader fileReader = new FileReader("acc.txt");
			try {
				System.out.print("Enter the number :- ");
				int x = sc.nextInt();
				int b = x/ 0;
			}
			catch (ArithmeticException e) {
				System.out.println("ArithmeticException");
			}
			finally {
				System.out.println("FInally happening");
			}
			try {
				System.out.print("Enter the company name :- ");
				String name = sc.next();
				name = null;
				System.out.println(name.charAt(0));
			}
			catch (NullPointerException e) {
				System.out.println(e);
			}
		} 
		catch (Exception e) {
			System.err.println(e);
		}
		
		finally {
			sc.close();
		}
	}

}
