package com.algorithm;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("accenture");
		
		System.out.println(sb);
		
		sb.insert(2, 'c');
		System.out.println(sb);
		
		StringBuffer test = sb.replace(0, 5, "tcs");
		System.out.println(test);
		
		System.out.println(test.capacity());
		
		sb.append(" company");
		
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		
		System.out.println(sb.capacity());
	}

}
