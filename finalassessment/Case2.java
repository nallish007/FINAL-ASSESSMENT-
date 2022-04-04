package com.onebill.finalassessment;

import java.util.HashSet;
import java.util.Scanner;

public class Case2 {
	public static HashSet<Student> editdetails(HashSet<Student> set){
		Scanner scan = new Scanner(System.in);
		System.out.println("=================================");
		System.out.print("Enter the student id : ");
		int id2 = scan.nextInt();
		if(set.stream().anyMatch((std)->std.ID==id2)) {
		set.stream().filter((std)->std.ID==id2).forEach(std -> {
			if (std.ID == id2) {
				System.out.println("=================================");
				System.out.println("select an option to edit ");
				System.out.println("=================================");
				System.out.println("1>>NAME");
				System.out.println("2>>AGE");
				System.out.println("3>>MARK");
				System.out.println("4>>ID");
				System.out.println("=================================");
				System.out.print(">>");
				int select = scan.nextInt();
				System.out.println("=================================");
				switch (select) {
				case 1:
					System.out.print("Enter the name");
					System.out.print(">>");
					std.NAME = scan.next();
					System.out.println("***edited sucesfully***");
					break;
				case 2:
					System.out.print("Enter the age");
					System.out.print(">>");
					std.AGE = scan.nextInt();
					System.out.println("***edited sucesfully***");
					break;
				case 3:
					System.out.print("Enter the mark");
					System.out.print(">>");
					std.MARK = scan.nextInt();
					System.out.println("***edited sucesfully***");
					break;
				case 4:
					System.out.print("Enter the id");
					System.out.print(">>");
					int id4 = scan.nextInt();
					if(set.stream().allMatch((std2)->std2.ID!=id4)) {
						std.ID=id4;
						System.out.println("***edited sucesfully***");
					}
					else {
						System.out.println("id already exsits");
					}
					break;
				default:
					break;
				}
			}
		});
		}
		else{
			try {
				throw new InvalidIDException("id does not exsist");
			} catch (InvalidIDException e) {
				System.out.println("*******" + e.getMessage() + "*******");
			}
		}
 
		return set;
	}
}

