package com.algorithm;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.ensureCapacity(20);
		
		System.out.println("Capacity of the string builder :- " + builder.capacity());
		
		builder.append('a');
		builder.append('c');
		builder.append('c');
		builder.append('e');
		builder.append('n');
		builder.append('t');
		builder.append('u');
		builder.append('r');
		builder.append('e');
		
		System.out.println(builder.toString());
		
		builder.insert(4, 'e');
		System.out.println(builder.toString());
		
		builder.delete(4, 5);
		System.out.println(builder.toString());
		
		builder.reverse();
		System.out.println(builder.toString());
	}

}
