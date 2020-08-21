package com.asiazeus.oop;
public class Car {
//data fields
public String Color;
public int Xpos;
public int Ypos;
public int Fuel;
protected String Model;
//Constructor
public Car() {
	Color="no color";
}
public Car(String color,int xpos,int ypos,int fuel) {
	Color=color;
	Xpos=xpos;
	Ypos=ypos;
	Fuel=fuel;
}
//display method
public void DisplayInf() {
	System.out.println("Car Color is:"+Color);
	System.out.println("Car x positon  is:"+Xpos);
	System.out.println("Car y positon is:"+Ypos);
	System.out.println("Car fuel is:"+Fuel);	
}
//start engine method(define)
public void StartEngine() {
	if(Fuel>0) {
		System.out.println("Engine Started");
	}else {
		System.out.println("please fill fuel.");
	}
}
//stop engine
public void StopEngine() {
	System.out.println("Engine Stop");
}
}
