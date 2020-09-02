package com.ch15.assignment3.umlimplementtation;

public class Circle extends Shape{

protected double radius;

	public Circle() {

}

public Circle(double radius,String color, boolean filled) {
	super(color, filled);
	this.radius=radius;

}

	public Circle(double radius) {
	this.radius = radius;
}

	@Override
	public void calculateArea() {
		double result=Math.PI*this.radius*this.radius;
		System.out.println("Area of Circle is "+result);
		
	}

	@Override
	public void calcualtePerimeter() {
		double result=2*Math.PI*this.radius;
		System.out.println("Perimeter of Circle is "+result);
		
	}

	@Override
	public String toString() {
		return "[Circle Color:"+this.color+"Filled:"+this.filled+"radius:"+this.radius+"]";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


}
