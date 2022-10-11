package com.collection.arraylist.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		ArrayList<Candidate> list = new ArrayList<>();
		
		list.add(new Candidate(1, "Java", "accenture"));		
		list.add(new Candidate(2, "SAP", "accenture"));
		list.add(new Candidate(3, ".NET", "accenture"));
		
		for (Candidate item : list) {
			System.out.println("Id :- " + item.eid);
			System.out.println("Stream :- " + item.stream);
			System.out.println("Company :- " + item.company);
		}
		
		System.out.println();
		
		Iterator<Candidate> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			Candidate candidate = iterator.next();
			System.out.println("Id :- " + candidate.eid);
			System.out.println("Stream :- " + candidate.stream);
			System.out.println("Company :- " + candidate.company);
		}
		
		ArrayList<Candidate> list2 = new ArrayList<>();
		
		list2.add(new Candidate(1, "C#", "accenture"));		
		list2.add(new Candidate(2, "C++", "accenture"));
		list2.add(new Candidate(3, "MERN", "accenture"));
		
		list.addAll(list2);
		
		System.out.println();
		
		Iterator<Candidate> it = list.iterator();
		
		while (it.hasNext()) {
			Candidate candidate = it.next();
			System.out.println("Id :- " + candidate.eid);
			System.out.println("Stream :- " + candidate.stream);
			System.out.println("Company :- " + candidate.company);
		}
		
		list.remove(4);
		
		for (Candidate item : list) {
			System.out.println("Id :- " + item.eid);
			System.out.println("Stream :- " + item.stream);
			System.out.println("Company :- " + item.company);
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);
		
		System.out.println(map);
	}

}
