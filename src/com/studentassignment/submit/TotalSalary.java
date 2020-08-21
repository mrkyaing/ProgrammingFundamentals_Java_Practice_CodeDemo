package com.studentassignment.submit;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {

		Scanner userinput = new Scanner(System.in);
		try {
			System.out.print("Enter Name of Employee :");
			String name = userinput.nextLine();

			System.out.print("Enter type of Employee :");
			int type = userinput.nextInt();

			System.out.print("Enter working hour(within 1 week) of " + name + ":");
			int hour = userinput.nextInt();

			int result = getOverTime(hour);
			System.out.println("OT Amount of " + name + ":" + result);

			int totalsalary = totalSalary(type, hour);
			System.out.println("The total Salary of " + name + " is:" + (totalsalary + result));

		
		} // end of try catch
		catch (Exception e) {
			System.out.println("Error occur!Please enter correct word!!");
		} // end of catch
		finally {
			System.out.print("Program End!");
		} // end of finally
	}// end of main

	public static int getOverTime(int overtime) {
		int result = 0;
		if (overtime > 50) {
			result = (overtime - 40) * 3000;
		}
		return result;
	}// end of getOverTime method

	public static int totalSalary(int type, int workhour) {
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

	}// end of totalSalary method

}// end of class