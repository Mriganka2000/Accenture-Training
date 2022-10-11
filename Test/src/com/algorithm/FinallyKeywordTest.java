package com.algorithm;

import java.util.Scanner;

public class FinallyKeywordTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the number :- ");
			int[] arr = new int[10];
			String num = sc.next();
			int val = Integer.parseInt(num);
			System.out.println(val);
			arr[10] = 1;
		} 
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.err.println(e);
		}
		catch (Exception e) {
			System.err.println(e);
		}
	}

}
