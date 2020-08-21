package com.asiaseu.polympirhismDemo;

public class Teacher extends Person {
	private float salary;
	private double phonebill,allowance;
	public Teacher(int id, String name, int age, String address,float salary) {
		super(id, name, age, address);//data passing to super class's constructor
		this.salary=salary;
	}
	
	public void displayInfo() {
		System.out.println("Teacher info");
		System.out.println("Id:"+Id);
		System.out.println("Name:"+Name);
		System.out.println("age:"+age);
		System.out.println("address:"+Address);
	}

	public void Pay() {
	System.out.println("Teacher's All Salary Amt"+(this.salary+this.phonebill+this.allowance));	
	}
	
	public void setPhonebill(double phonebill) {
		this.phonebill = phonebill;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	
	
}
