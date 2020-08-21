package com.asiazeus.oop;

public class Student {
private String Id;
public String Name;
public String Address;
private int Age;

public void SetAge(int age) {
	if(age>18) {
		Age=age;
		System.out.println("Student age is valid");
	}else {
		System.out.println("Student can't register");
		System.exit(0);
	}
	
}

public void SetId(String id) {	
	if(id!=null) {
		Id=id;
	}
	else {
		System.out.println("invalid student id");
	}
}
public void displayInfo() {
	System.out.println("Student Id:"+Id);
	System.out.println("Student Name:"+Name);
	System.out.println("Student Address:"+Address);
	System.out.println("Student Age:"+Age);
}
}
