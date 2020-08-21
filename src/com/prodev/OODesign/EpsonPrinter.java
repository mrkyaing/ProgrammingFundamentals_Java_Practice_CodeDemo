package com.prodev.OODesign;

public class EpsonPrinter implements Printer {

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
System.out.println("Epson Printer is printing out "+message);
	}

}
