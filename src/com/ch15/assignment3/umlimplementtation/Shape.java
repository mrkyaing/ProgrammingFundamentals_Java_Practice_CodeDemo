package com.ch15.assignment3.umlimplementtation;
public abstract class Shape {
protected String color;
protected boolean filled;
public Shape() {
}
public Shape(String color, boolean filled) {
	this.color = color;
	this.filled = filled;
}

public abstract void calculateArea();
public abstract void calcualtePerimeter();
public abstract String toString();

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public boolean isFilled() {
	return filled;
}
public void setFilled(boolean filled) {
	this.filled = filled;
}

}
