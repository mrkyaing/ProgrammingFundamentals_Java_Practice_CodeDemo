package com.asiaseu.polympirhismDemo;

public class Demo {

	public static void main(String[] args) {
		Employee e1=new Employee(001,"Su Su",20,"Ygn",200000);
		e1.displayInfo();
		
		Teacher t1=new Teacher(001,"U Min U",35,"Ygn",500000);
		t1.setPhonebill(30000);
		t1.setAllowance(20000);
		t1.displayInfo();
		t1.Pay();
	}

}
