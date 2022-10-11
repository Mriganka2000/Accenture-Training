package com.algorithm;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Rakesh");
		map.put(2, "Shayam");
		map.put(3, "Gautom");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
//		Comparing one keys with other
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
//		Reverse order
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
//		map.remove(2);
//		
//		System.out.println(map.entrySet());
		
		map.replace(2, "Miganka");
		
		System.out.println(map.entrySet());
		
		NavigableMap<Integer, String> reverse = new TreeMap<>();
		
		reverse.put(1, "A");
		reverse.put(2, "B");
		reverse.put(3, "C");
		reverse.put(4, "D");
		
		System.out.println(reverse.descendingMap());
	}

}
