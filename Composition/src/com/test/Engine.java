package com.test;

public class Engine {

	private String companyName;
	private String type;
	private int cc;
	
	public Engine(String companyName, String type, int cc) {
		this.companyName = companyName;
		this.type = type;
		this.cc = cc;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
