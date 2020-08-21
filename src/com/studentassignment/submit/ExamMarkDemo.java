package com.studentassignment.submit;
import java.util.Scanner;

public class ExamMarkDemo {

	public static void main(String[] args) {
		int choice = 1;

		while (choice == 1) {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.print("Enter number of student:");
				int n = sc.nextInt();
				int[] student = new int[n];

				for (int i = 0; i < n; i++) {
					Scanner sc2 = new Scanner(System.in);
					System.out.print("Enter Name of Student:");
					String name = sc2.nextLine();

					System.out.print("Enter Gender(Male/Female):");
					String gender = sc2.nextLine();

					String[] subject = { "Myanmar", "English", "Mathematics" };

					int totalmark = 0;
					int[] mark = new int[3];

					for (int j = 0; j < 3; j++) {
						System.out.print("Enter " + name + "'s " + subject[j] + " marks:");
						mark[j] = sc2.nextInt();
						totalmark += mark[j];

					} // end of inner for loop

					if (mark[0] < 40 || mark[1] < 40 || mark[2] < 40) {
						System.out.println(name + " fail in exam.");
					} else {
						System.out.println(name + " pass in exam.");
					}

					System.out.println("Total mark of " + name + ":" + totalmark);
					System.out.println("Avg of " + name + ":" + (totalmark / 3));

				} // end of outer for loop

			} catch (Exception e) {
				System.out.println("Enter correct word!");
		} // end of try catch

			System.out.println("====================================");
			System.out.print("Do you want to restart the program?? \nclick 1 for yes and 0 for no:");
			choice = sc.nextInt();

		} // end of while

		System.out.print("Program end!!");

	}// end of main

}// end of class
