package com.onebill.finalassessment;

import java.util.HashSet;
import java.util.Scanner;

public class Case1 {

	public static HashSet<Student> getdetails(HashSet<Student> set){
		Scanner scan = new Scanner(System.in);
		System.out.println("=================================");
		System.out.println("*****Enter the no.of students to be added*****");
		System.out.print(">>");
		int n = scan.nextInt();
		System.out.println("=================================");
		for (int i = 0; i < n; i++) {
			set.add(new Student());
			System.out.println("=================================");
		}
		
		return set;
	}
}
