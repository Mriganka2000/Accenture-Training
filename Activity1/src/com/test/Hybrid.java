package com.test;

public class Hybrid implements ParticipateA, ParticipateB {
	
	public String companyName;
	public int eid;
	public String stream;
	public String project;

	@Override
	public void setParticipateB(String companyName, int eid, String stream, String project) {
		// TODO Auto-generated method stub
		this.companyName = companyName;
		this.eid = eid;
		this.stream = stream;
		this.project = project;
	}

	@Override
	public void setParticipateA(String companyName, int eid, String stream, String project) {
		// TODO Auto-generated method stub
		this.companyName = companyName;
		this.eid = eid;
		this.stream = stream;
		this.project = project;
	}

	@Override
	public void setComapany() {
		System.out.println("Company name is :- " + companyName);
	}

}
