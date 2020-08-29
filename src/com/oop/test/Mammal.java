package com.oop.test;

public class Mammal {
	
private int Id,numberOfLegs,lifespan;
private String typeOfColor,gender,inhabit,blooded,name;
public void walk() {
	System.out.println("Mammal is walking.");
}

public void sleep() {
	System.out.println("sleeping ........");
}
public void eat() {
	System.out.println("eating .......");
}
public void speak() {
	System.out.println("speaking .......");
}
public void print() {
	System.out.println("Id:"+this.Id);
	System.out.println("name:"+this.name);
	System.out.println("number of legs:"+this.numberOfLegs);
	System.out.println("gender :"+this.gender);
	System.out.println("lifespan :"+this.lifespan);
	System.out.println("blooded Type"+this.blooded);
	System.out.println("in habit:"+this.inhabit);
	System.out.println("type of color:"+this.typeOfColor);
}

public int getId() {
	return Id;
}

public void setId(int id) {
	if(id<=0) {
		throw new IllegalArgumentException("invalid id");
	}
	Id = id;
}

public int getNumberOfLegs() {
	return numberOfLegs;
}

public void setNumberOfLegs(int numberOfLegs) {
	this.numberOfLegs = numberOfLegs;
}

public int getLifespan() {
	return lifespan;
}

public void setLifespan(int lifespan) {
	if(lifespan>=100) {
		throw new IllegalArgumentException("invalid lifespan");
	}
	this.lifespan = lifespan;
}

public String getTypeOfColor() {
	return typeOfColor;
}

public void setTypeOfColor(String typeOfColor) {
	this.typeOfColor = typeOfColor;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getInhabit() {
	return inhabit;
}

public void setInhabit(String inhabit) {
	this.inhabit = inhabit;
}

public String getBlooded() {
	return blooded;
}

public void setBlooded(String blooded) {
	this.blooded = blooded;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}




}
