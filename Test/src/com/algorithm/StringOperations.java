package com.algorithm;

public class StringOperations {

	public static void main(String[] args) {
		String upper = "ACCENTURE";
		System.out.println(upper.toLowerCase());
		
		String present = "I love my country";
		System.out.println(present.replace(' ', '_'));
		
		String extra = "    I work in Accenture   ";
		System.out.println(extra.trim());
	}

}
