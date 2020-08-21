package com.asiazeus.oop;

import java.text.DecimalFormat;

public class Circle {
public int radius;

public void CalcualteArea() {
	double result=3.14*radius*radius;
	//decimal digit format convert.
   String finalresult=new DecimalFormat("#0.00").format(result);	
	System.out.println("Circle Area is :"+finalresult);
}
}
