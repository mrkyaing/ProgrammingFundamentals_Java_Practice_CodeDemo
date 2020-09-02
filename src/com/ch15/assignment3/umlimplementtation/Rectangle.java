package com.ch15.assignment3.umlimplementtation;

public class Rectangle extends Shape {
	
protected double width,length;
//constructor with default 
	public Rectangle() {
}
//constructor with super class 's attributes
public Rectangle(double width,double length,String color, boolean filled) {
	super(color, filled);//
	this.length=length;
	this.width=width;

}
//constructor with this class 's attributes
	public Rectangle(double width, double length) {
	this.width = width;
	this.length = length;
}

	@Override
	public void calculateArea() {
	   double result=this.width*this.length;
	   System.out.println("Area of Rectangle is "+result);

	}

	@Override
	public void calcualtePerimeter() {
		 double result=(this.width+this.length)*2;
		   System.out.println("Perimeter of Rectangle is "+result);

	}

	@Override
	public String toString() {
		return "[Rectangle>>Color:"+this.color+"Filled:"+this.filled+"Width:"+this.width+"Length:"+this.length+"]";
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	
}
