package com.studentassignment.submit;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Enter Name Of Employee ");
			String Ename = scan.nextLine();
			System.out.print("Enter Type Of Employee: ");
			int type = scan.nextInt();
			System.out.print("Enter Working Hour(within 1 week): ");
			int hours = scan.nextInt();
			int ot = otfees(hours);
			System.out.println("OT amount of" + Ename + ":" + ot);
			int totalsalary = totalFees(type, hours);
			System.out.println("The total salary of" + Ename + " is " + (totalsalary + ot));
		} catch (Exception e) {
			System.out.println("Error:(");
		}

	}

	public static int otfees(int overtimes) {
		int ot = 0;
		if (overtimes > 50) {
			ot = (overtimes - 50) * 3000;
		}
		return ot;

	}

	public static int totalFees(int type, int workhour) {
		int totalsalary = 0;
		if (workhour < 40) {
			if (type == 1) {
				totalsalary = 2000 * workhour;
			} else if (type == 2) {
				totalsalary = 1000 * workhour;
			}

		} else if (workhour >= 40) {
			if (type == 1) {
				totalsalary = 2000 * 8 * 5;
			} else if (type == 2) {
				totalsalary = 1000 * 8 * 5;
			}
		}
		return totalsalary;

	}

}
