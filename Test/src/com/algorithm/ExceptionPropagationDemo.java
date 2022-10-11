package com.algorithm;

import java.util.Scanner;

public class ExceptionPropagationDemo {
	
	public void fun3(int n) {
		int number = n / 0;
	}
	
	public void fun2(int n) {
		this.fun3(n);
	}
	
	public void fun1() {
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			this.fun2(n);
		}
		catch (Exception e) {
			System.err.println(e);
		}
	}

	public static void main(String[] args) {
		ExceptionPropagationDemo demo = new ExceptionPropagationDemo();
		demo.fun1();
	}

}
