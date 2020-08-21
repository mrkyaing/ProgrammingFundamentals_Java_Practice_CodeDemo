package com.studentassignment.submit;

import java.util.Scanner;

public class TotalSalaryKMT {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		try {
			System.out.print("Enter Name of Employee:");
			String name = Sc.nextLine();

			System.out.print("Enter type of Employee:");
			int type = Sc.nextInt();

			Scanner Sc2 = new Scanner(System.in);
			System.out.print("Enter working hour(within 1 week) of " + name + ":");
			int hour = Sc2.nextInt();

			int result = getOverTime(hour);
			System.out.println("OT Amount of " + name + ":" + result);

			int totalsalary = totalSalary(type,hour);
			System.out.println("The total Salary of " + name + " is:" + (totalsalary + result));
		} // end of try catch
		catch (Exception e) {
			System.out.println("Error occur!Please enter correct word!!");
		} // end of catch
		finally {
			System.out.print("Program End!");
		} // end of finally
	}// end of main

	public static int getOverTime(int OT) {
		int result = 0;
		if (OT > 50) {
			result = (OT - 40) * 3000;
		}
		return result;
	}// end of getOverTime method

	public static int totalSalary(int type, int normalhour) {
		int totalsalary = 0;
		if (type == 1) {
			if (normalhour < 40) {
				totalsalary = 2000 * normalhour;
			} else {
				totalsalary = 2000 * 8 * 5;
			}
		} else if (type == 2) {
			if (normalhour < 40) {
				totalsalary = 1000 * normalhour;
			} else {
				totalsalary = 1000 * 8 * 5;
			}
		}
		return totalsalary;
	}// end of totalSalary method

}// end of class
