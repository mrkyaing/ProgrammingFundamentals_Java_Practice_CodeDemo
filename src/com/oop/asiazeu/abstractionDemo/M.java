package com.oop.asiazeu.abstractionDemo;

public class M extends B{
	@Override
	public void a() {
		System.out.println("i am a at the M class ");
		
	}

	@Override
	public void b() {
		System.out.println("i am b at the M class ");
		
	}

	@Override
	public void d() {
		System.out.println("i am d at the M class ");
		
	}
	
	@Override
	public void c() {
		super.c();
		System.out.println("i am c at the M class ");
	}

}
