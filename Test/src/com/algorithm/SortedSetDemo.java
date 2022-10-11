package com.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(3);
		set.add(4);
		set.add(4);
		
		System.out.println(set);
		
		set.remove(1);
		
		System.out.println(set);
		
		NavigableSet<Integer> res = set.descendingSet();
		
		System.out.println(res);
	 }

}
