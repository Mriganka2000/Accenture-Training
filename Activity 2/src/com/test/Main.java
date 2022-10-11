package com.test;

public class Main {

	public static void main(String[] args) {
		OuterInterface outerInterface = new Implementation();
		outerInterface.msg();
		
		OuterInterface.InnerInterface innerInterface = new Implementation();
		innerInterface.show();
	}

}
