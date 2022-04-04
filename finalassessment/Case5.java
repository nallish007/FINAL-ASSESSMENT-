package com.onebill.finalassessment;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Case5 {

	public static HashSet<Student>Getastudentdetails(HashSet<Student> set) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=================================");
		System.out.print("Enter the student id : ");
		int id1 = scan.nextInt();
		try {
		List<Student> collect = set.stream().filter((std) -> std.ID == id1).collect(Collectors.toList());
		System.out.println(collect.get(0));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("*****ID DOESN'T EXCIST*****");
		}
		 
		return set;
	}
}
