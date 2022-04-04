package com.onebill.finalassessment;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashSet<Student> set = new HashSet<Student>();

		while (true) {
			Scanner scan = new Scanner(System.in);
			int s = 0;
			System.out.println("=================================");
			System.out.println("*******SELECT AN OPTION********");
			System.out.println("1>>Add student details");
			System.out.println("2>>Edit student details");
			System.out.println("3>>Delete student details");
			System.out.println("4>>List of  students ");
			System.out.println("5>>Get a  student details");
			System.out.println("6>>Sort the student list ");
			System.out.println("7>>Exit ");
			System.out.println("=================================");
			System.out.print(">>");
			s = scan.nextInt();
			switch (s) {
			case 1:

				set = Case1.getdetails(set);
				break;

			case 2:

				set = Case2.editdetails(set);
				break;

			case 3:

				set = Case3.deletedetails(set);
				break;

			case 4:

				set = Case4.listdetails(set);
				break;
			case 5:

				set = Case5.Getastudentdetails(set);
				break;
			case 6:

				set = Case6.storteddetails(set);
				break;
			case 7:
				return;
			default:
				try {
					throw new InvalidIDException("invalid entry");
				} catch (InvalidIDException e) {
					System.out.println("*******" + e.getMessage() + "*******");
				}
			}
		}
	}
}
