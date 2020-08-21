package com.studentassignment.submit;

import java.util.Scanner;

public class SalaryCaseStudy {

	public static void main(String[] args) {

		try {
			Scanner Keyword = new Scanner(System.in);
			System.out.print("Enter Name of Employee\t:");
			String name = Keyword.nextLine();
			System.out.print("Enter type of Employee (1 or 2)\t:");
			int number = Keyword.nextInt();
			switch (number) {
			case 1:
				Scanner WorkingHourInOneWeek = new Scanner(System.in);
				System.out.print("Enter Working Hour (Within 1 Week) of " + name + " :");
				int W = WorkingHourInOneWeek.nextInt();
				if (W > 50) {

					int bp1 = BasicPay1(W);
					System.out.println("Basic Pay for One Week of " + name + " is " + bp1);

					int OTPay1 = OTPayment(W);
					System.out.println("OT Amount of " + name + " :" + OTPay1);

					System.out.println("The Total (One Week) Salary of " + name + " is :" + (bp1 + OTPay1));
				} else {
					int TotalPayment1 = TotalPay1(W);
					System.out.println("The Total (One Week) Salary of " + name + " is :" + TotalPayment1);
				}

				break;

			case 2:
				Scanner WorkingHourForOneWeek = new Scanner(System.in);
				System.out.print("Enter Working Hour (Within 1 Week) of " + name + " :");
				int WH = WorkingHourForOneWeek.nextInt();
				if (WH > 50) {
					int bp2 = BasicPay2(WH);
					System.out.println("Basic Pay for one week of " + name + " is " + bp2);
					int OTPay2 = OTPayment(WH);
					System.out.println("OT Amount of " + name + " :" + OTPay2);

					System.out.println("The Total (One Week) Salary of " + name + " is :" + (bp2 + OTPay2));
				} else {

					int TotalPayment2 = TotalPay2(WH);
					System.out.println("The Total (One Week) Salary of " + name + " is :" + TotalPayment2);
				}
				break;

			default:
				System.out.println("Your Entered Number is Wrong.");
			}
		} catch (Exception e) {
			System.out.println("Error Occur!!!");
			System.out.println("Check your entering number.");
		}

	}

	public static int BasicPay1(int workhour) {
		int payrate = 2000;
		int basicpay1 = 50 * payrate;
		return basicpay1;
	}

	public static int BasicPay2(int workhour) {
		int payrate = 1000;
		int basicpay2 = 50 * payrate;
		return basicpay2;
	}

	public static int OTPayment(int workhour) {
		int OTpayperhour = 3000;
		int OvertimePayment = CalculateOT(workhour, OTpayperhour);
		;
		return OvertimePayment;
	}

	public static int CalculateOT(int workhour,int OTPayPerHour) {
		int OTHour = (workhour - 50);
		int OT = OTHour * OTPayPerHour;
		return OT;
	}

	public static int TotalPay1(int workhour) {
		int PayperHourRate = 2000;
		int TotalPay1 = workhour * PayperHourRate;
		return TotalPay1;
	}

	public static int TotalPay2(int workhour) {
		int PayRate = 1000;
		int TotalPay2 = workhour * PayRate;
		return TotalPay2;
	}

}
