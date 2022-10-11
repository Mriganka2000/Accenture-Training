package com.algorithm;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the desired string :- ");
		String str = sc.nextLine();
		
		System.out.println("String length is :- " + str.length());
		System.out.print("Enter the index number :- ");
		int pos = sc.nextInt();
		
		System.out.println("Character at position " + pos + " is :- " + str.charAt(pos));
		
		System.out.println("Enter the starting index and end index for substrig :- ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Substring is :- " + str.substring(start, end + 1));
		
		System.out.print("Enter the new string to concatinate :- ");
		String newStr = sc.nextLine();
		
		String concat = new String(str);
		concat += " " + newStr;
		
		System.out.println("String after concatenation :- " + concat);
		
		System.out.println("Enter the suffix :- ");
		String suf = sc.nextLine();
		
		System.out.println("String ends with the suffix " + suf + " " + " :- " + concat.endsWith(suf));
		
		System.out.println("Enter the string part :- ");
		String part = sc.nextLine();
		
		System.out.println("The starting index is :- " + concat.indexOf(part));
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println(str1.equals(str2));
	}

}
