package com.onebill.finalassessment;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Case6 {
	public static HashSet<Student> storteddetails(HashSet<Student> set) {
		Scanner scan = new Scanner(System.in);
		boolean t = false;
		do {
			t = false;
			System.out.println("=================================");
			System.out.println("1>>Sort by name");
			System.out.println("2>>Sort by id ");
			System.out.println("3>> Sort by age ");
			System.out.println("4>> Sort by marks ");
			System.out.println("5>> back ");
			System.out.println("=================================");
			System.out.print(">>");
			int se = scan.nextInt();
			switch (se) {
			case 1:
				set.stream().sorted(Comparator.comparing(Student::getNAME)).forEach(System.out::println);
				break;
			case 2:
				set.stream().sorted(Comparator.comparing(Student::getID)).forEach(System.out::println);
				break;
			case 3:
				set.stream().sorted(Comparator.comparing(Student::getAGE)).forEach(System.out::println);
				break;
			case 4:
				set.stream().sorted(Comparator.comparing(Student::getMARK)).forEach(System.out::println);
				break;
			case 5:
				break;
			default:
				try {
					throw new InvalidIDException("invalid entry");
				} catch (InvalidIDException e) {
					t = true;
					System.out.println("*******" + e.getMessage() + "*******");
				}
			}
		} while (t);

		return set;
	}
}
