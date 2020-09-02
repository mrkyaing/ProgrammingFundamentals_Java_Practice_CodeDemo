package com.oop.asiazeu.abstractionDemo;

public class InterfaceDemo {

	public static void main(String[] args) {
		IA zip=new M();
		zip.a();// i am a at the M.
		zip.b();//i am b at the M class. 
		zip.c();//i am c at the B class.
		        //i am c at the M class.
		zip.d();//i am d at the M class.	
	}

}
