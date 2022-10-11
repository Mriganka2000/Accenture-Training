package com.algorithm;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("John");
		list.add("David");
		list.add("Mriganka");
		
		for (String item : list) {
			System.out.println(item);
		}
		
		System.out.println();
		
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
