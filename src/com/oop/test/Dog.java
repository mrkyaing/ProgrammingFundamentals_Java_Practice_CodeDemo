package com.oop.test;

public class Dog extends Mammal{
	@Override
	public void walk() {
		System.out.println("Dog is walk");
	}
	@Override
	public void sleep() {
		System.out.println("dog is sleeping ");
	}
	@Override
	public void eat() {
		System.out.println("dog is eating the meal");
	}
	@Override
	public void speak() {
		System.out.println("woak woak woak");
	}
	
}
