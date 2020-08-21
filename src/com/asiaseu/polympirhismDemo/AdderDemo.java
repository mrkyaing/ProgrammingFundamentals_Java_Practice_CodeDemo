package com.asiaseu.polympirhismDemo;
public class AdderDemo {
	public static void main(String[] args) {
	Adder a=new Adder();
	int result=a.Add(12,12);
	int result2=a.Add(12,2,3);
	double result3=a.Add(12.3,2,3);
	System.out.println("result of two parameter "+result);
	System.out.println("result of three paremeter "+result2);
	System.out.println("result of three paremeter with double value return"+result3);
	}

}
