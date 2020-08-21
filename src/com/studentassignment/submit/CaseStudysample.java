package com.studentassignment.submit;


import java.util.*;

public class CaseStudysample {

	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Name of Employee\t:");
		String name = scan.nextLine();
		Scanner userinput = new Scanner(System.in);
		System.out.print("Enter type of Employee(1 or 2)\t:");
		int type = userinput.nextInt();
		System.out.print("Enter working hour (within 1 week)of " + name + ":");
		int Workinghour = userinput.nextInt();
		if (type == 1) {
			int Hour = 40;
			int BasicSalary = BasicSalaryforType1(Hour);// method calling
			System.out.println("Basic Salary for " + name +" : "+ BasicSalary);
			if (Workinghour > 50) {
				int workhour = Workinghour - 40;
				int payrate = 3000;
				int OTPay = Overtime(workhour, payrate);
				int Totalsalary = BasicSalary + OTPay;
				System.out.println("OT amount of " + name + " : " + OTPay);
				System.out.println("The total Salary of " + name + " is " + Totalsalary);
			} // inner if
			else {
				int Totalsalary = BasicSalary;
				System.out.println("The total Salary of " + name + " is " + Totalsalary);
			} // else
		} // if
		else if (type == 2) {
			int Hour = 40;
			int BasicSalary = BasicSalaryforType2(Hour);// method calling
			System.out.println("Basic Salary for " + name +" : "+ BasicSalary);

			if (Workinghour > 50) {
				int workhour = Workinghour - 40;
				int payrate = 3000;
				int OTPay = Overtime(workhour, payrate);
				int Totalsalary = BasicSalary + OTPay;
				System.out.println("OT amount of " + name + " : " + OTPay);
				System.out.println("The total Salary of " + name + " is " + Totalsalary);
			} // inner if
			else {
				int Totalsalary = BasicSalary;
				System.out.println("The total Salary of " + name + " is " + Totalsalary);
			} // else

		} // else if
		} catch(Exception e) {
			System.out.println("Error Occur!!");
			System.out.println("Check your entering value!!!");
		}//catch
		
	}// main

	public static int BasicSalaryforType1(int workhour) {
		int payrate = 2000;
		int BasicPay = workhour * payrate;
		return BasicPay;
	}

	public static int BasicSalaryforType2(int workhour) {
		int payrate = 1000;
		int BasicPay = workhour * payrate;
		return BasicPay;
	}

	public static int Overtime(int workhour, int payrate) {
		int OvertimePay = workhour * payrate;
		return OvertimePay;
	}

}// class

