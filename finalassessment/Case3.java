package com.onebill.finalassessment;

import java.util.HashSet;
import java.util.Scanner;

public class Case3 {

	public static HashSet<Student> deletedetails(HashSet<Student> set){
		Scanner scan = new Scanner(System.in);
		System.out.println("=================================");
		System.out.print("Enter the student id : ");
		int id = scan.nextInt();
		if (set.removeIf((std) -> std.ID == id)) {
			System.out.println("Student details deleted successfully");
		} else {
			try {
				scan.close();
				throw new InvalidIDException("id does not exsist");
			} catch (InvalidIDException e) {
				System.out.println("*******" + e.getMessage() + "*******");
			}
		}
 
		return set;
	}
}
