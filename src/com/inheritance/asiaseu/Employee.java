package com.inheritance.asiaseu;

public class Employee {
private int Id;
private String name;
private String email;
private float salary;

public Employee() {
	
}
public Employee(int id,String Name,String emial,float salary) {
	this.Id=id;
	this.name=name;
	this.email=emial;
	this.salary=salary;
}

public void setId(int id) {
	this.Id=id;
}
public int getId() {
	return this.Id;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return this.name;
}
public void setEmail(String email) {
	this.email=email;
}
public String getEmail() {
	return this.email;
}
public void setSalary(float salary) {
	this.salary=salary;
}
public float getSalary() {
	return this.salary;
}

public void print() {
	System.out.println("Employee Infromation");
	System.out.println("=====================");
	System.out.println("id:"+this.Id);
	System.out.println("name:"+this.name);
	System.out.println("emial:"+this.email);
	System.out.println("salary:"+this.salary);
}

}
