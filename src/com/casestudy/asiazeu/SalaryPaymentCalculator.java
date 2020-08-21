package com.casestudy.asiazeu;
import java.util.Scanner;
 class SalaryPaymentCalculator {
	
public static void main(String[] args) {
	

	
		System.out.println("Salary Payment Calculate start");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name Of Employee :");
		String staffname=sc.nextLine();
		System.out.print("Enter type of Employee(1:Admin Staff,2:Delivery Staff):");	
		try {
			int staffType=sc.nextInt();
			System.out.print("Enter Working hour(within 1 week) of "+staffname+":");
			int workinghr=sc.nextInt();
			System.out.println("OT amout of "+staffname+":"+getOTAmt(workinghr));
			double totalsalary=getTotalSalary(staffType,workinghr)+getOTAmt(workinghr);
			System.out.println("The total Salay of "+staffname+":"+totalsalary);
		} catch (Exception e) {
			System.out.println("Error Occurs in system.");
		}
		System.out.println("Salary Payment program end!!");
	}	
	
public static double getTotalSalary(int staffType,double workinghr) {
		double salary=0;
		switch(staffType){
			case 1:{	
				if(workinghr<40) {
				salary=(workinghr*2000);	
			}else {
				salary=(8*5*2000);	
			}				
			}break;
			case 2:{
				if(workinghr<40) {
					salary=(workinghr*1000);	
				}else {
					salary=(8*5*1000);	
				}
				}break;
			default:System.out.println("invalid staff type!!");return salary;
		}return salary;	
	}
	
public static double getOTAmt(double workinghr) {
		double otamt=0;
			if(workinghr>50) {
				otamt=(workinghr-40)*3000;
			}
		return otamt;
	}
}
