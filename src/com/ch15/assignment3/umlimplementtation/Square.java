package com.ch15.assignment3.umlimplementtation;

public class Square extends Rectangle {
protected double side;

public Square() {

}

public Square(double side,double width, double length, String color, boolean filled) {
	super(width, length, color, filled);
	this.side=side;

}

public Square(double side,double width, double length) {
	super(width, length);
	this.side=side;

}



@Override
public void calcualtePerimeter() {
	double result=4*this.side;
	System.out.println("Perimeter of Square is "+result);
}





@Override
public String toString() {
	return "Square [side=" + side + ", width=" + width + ", length=" + length + ", color=" + color + ", filled="+ filled + "]";
}

public Square(double side) {
	this.side = side;
}

public double getSide() {
	return side;
}

public void setSide(double side) {
	this.side = side;
}




}
