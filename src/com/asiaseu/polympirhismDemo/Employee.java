package com.asiaseu.polympirhismDemo;

public class Employee extends Person {
private float salary;
	public Employee(int id, String name, int age, String address,float salary) {
		super(id, name, age, address);//data passing to super class's constructor
		this.salary=salary;
	}
	
	public void displayInfo() {
		System.out.println("Employee info");
		System.out.println("Id:"+Id);
		System.out.println("Name:"+Name);
		System.out.println("age:"+age);
		System.out.println("address:"+Address);
		System.out.println("Salary:"+salary);
	}

}
