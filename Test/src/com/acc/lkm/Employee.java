package com.acc.lkm;

public class Employee {
	
	private int id;
	private int age;
	private double salary;
	private double variablePay;
	
	public Employee(int id, int age, double salary) {
		this.id = id;
		this.age = age;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getVariablePay() {
		this.variablePay = this.salary - (this.salary * 0.1);
		return this.variablePay;
	}

}
