package com.asiazeus.oop;

public class StudentDemo {

	public static void main(String[] args) {
		Student student = new Student();
		student.Name = "Su SU";
		student.Address = "ygn";
		//student.Age=20; (can't access the age )//encapsulate
		student.SetAge(10);
		//student.Id=200;
		student.SetId("s001");
		student.displayInfo();
	}

}
