package com.test;

public class Implementation implements OuterInterface, OuterInterface.InnerInterface {

	@Override
	public void msg() {
		System.out.println("From outer interface");
	}

	@Override
	public void show() {
		System.out.println("From inner interface");
	}

	
	
}
