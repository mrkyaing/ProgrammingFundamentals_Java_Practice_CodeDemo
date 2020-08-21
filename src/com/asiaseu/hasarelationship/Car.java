package com.asiaseu.hasarelationship;

public class Car {
	// Methods implementation and class/Instance members
	private String color;
	private int maxSpeed; 
	//car have Engine Class
	public Engine engine;
	public Car() {
		engine=new Engine();
	}
	public void carInfo(){
		System.out.println("Car Color= "+color + " Max Speed= " + maxSpeed);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
