package com.test;

public class ThisDemoChild extends ThisDemoParent{

	public ThisDemoChild() {
		System.out.println("From child constructor");
	}
	
	public ThisDemoChild(int x) {
		this();
		System.out.println("From child parameterized constructor");
	}
	
	public void display() {
		super.display();
		System.out.println("From child");
	}

}
