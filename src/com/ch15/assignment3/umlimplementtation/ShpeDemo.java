package com.ch15.assignment3.umlimplementtation;

public class ShpeDemo {

	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.setRadius(10);
		c1.calculateArea();
		c1.calcualtePerimeter();
		c1.setColor("red");
		c1.setFilled(true);
		System.out.println(c1.toString());
		
		Circle c2=new Circle(3,"no color",false);
		c2.calculateArea();
		c2.calcualtePerimeter();
		System.out.println(c2.toString());
		
       Rectangle r1=new Rectangle();
       r1.setColor("green");
       r1.setFilled(true);
       r1.length=4;
       r1.width=2;
       r1.calculateArea();
       r1.calcualtePerimeter();
       System.out.println(r1.toString());
       
       Rectangle r2=new Rectangle(3,2,"black",true);
       r2.calculateArea();//6
       r2.calcualtePerimeter();//10
       System.out.println(r2.toString());
       
		
       Square s1=new Square();
       s1.setColor("blue");
       s1.setFilled(true);
       s1.setSide(5);
       s1.setLength(4);
       s1.setWidth(5);
       s1.calculateArea();//20
       s1.calcualtePerimeter();//4*5=20
       System.out.println(s1.toString());
	}

}
