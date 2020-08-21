package com.asiaseu.polympirhismDemo;

public class Adder {
	
	//method overloading (compile-time polymorphism)
	public int Add(int n1,int n2) {
		return n1+n2;
	}
	
	public int Add(int n1,int n2,int n3) {
		return n1+n2+n3;
	}
	
	
	public double Add(double n1,int n2,int n3) {
		return n1+n2+n3;
	}
}
