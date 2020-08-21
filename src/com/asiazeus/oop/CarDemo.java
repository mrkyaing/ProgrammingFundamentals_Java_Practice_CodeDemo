package com.asiazeus.oop;

public class CarDemo {

	public static void main(String[] args) {
		// data passing with Instance variable/data fields
		Car mycar = new Car();
		mycar.Color = "Black";
		mycar.Xpos = 90;
		mycar.Ypos = 50;
		mycar.Fuel = 20;
		
		//method calling
		mycar.DisplayInf();
		mycar.StartEngine();
		mycar.Fuel = 0;
		mycar.StartEngine();
		mycar.StopEngine();
		
		//data passing with constructor
		Car yourcar=new Car("Yellow",120,130,500);
		//method calling
		yourcar.DisplayInf();
		yourcar.StartEngine();
		yourcar.Fuel = 0;
		yourcar.StartEngine();
		yourcar.StopEngine();
		
	}//end of main

}//end of class
