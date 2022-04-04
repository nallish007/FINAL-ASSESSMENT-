package com.onebill.finalassessment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Case4 {

	public static HashSet<Student> listdetails(HashSet<Student> set) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=================================");
		System.out.println("\n*****STUDENT DETAILS*****");
		Iterator<Student> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + "\n");
		}
	 
		return set;
	}
}
