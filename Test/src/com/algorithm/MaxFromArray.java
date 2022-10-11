package com.algorithm;

import java.util.Scanner;

public class MaxFromArray {

	public static int findMax(int[] arr) {
		int max = arr[0];
		
		for (int item : arr) {
			if (item > max) {
				max = item;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array :- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements :- ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Max element is :- " + findMax(arr));
	}

}
