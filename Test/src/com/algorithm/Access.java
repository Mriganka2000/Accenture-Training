package com.algorithm;

public class Access {

	public static void main(String[] args) {
		SportsMan c = new SportsMan("Dhoni", "Bihar", "India", "Brown", 30);
		
		c.role = new String[2];
		c.role[0] = "Batsman";
		c.role[1] = "Wicketkeeper";
		
		System.out.println(c.getBehaviour());
	}

}
