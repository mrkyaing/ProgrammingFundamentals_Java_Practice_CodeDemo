package com.inheritance.asiaseu;

public class HRMSApp {

	public static void main(String[] args) {
		Programmer p1=new Programmer();
		p1.setId(1);
		p1.setName("smith");
		p1.setEmail("smith@gmail.com");
		p1.setSalary(200000.50f);
		p1.print();
		
		DBA dba=new DBA();
		dba.setId(2);
		dba.setName("david");
		dba.setEmail("david@gmail.com");
		dba.setSalary(250000.50f);
		dba.print();

	}

}
