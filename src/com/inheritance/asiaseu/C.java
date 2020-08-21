package com.inheritance.asiaseu;
class A{
	public void msg() {
		System.out.println("Hello");
	}
}//end of class A
class B{
	public void msg() {
		System.out.println("Welcome");
	}	
}//end of class B
public class C extends A{
	public static void main(String[] args) {	
    C c=new C();
    c.msg();//Hello
	}
}//end of c class 
