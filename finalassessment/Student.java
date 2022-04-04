package com.onebill.finalassessment;

import java.util.Scanner;

public class Student {

	String NAME;
	int ID;
	double MARK;
	int AGE;
	Scanner scan = new Scanner(System.in);

	public Student() {
		System.out.print("Enter the student ID        :");
		this.ID =scan.nextInt();
		System.out.print("Enter the student NAME  :");
		this.NAME = scan.next();
		System.out.print("Enter the student MARK   :");
		this.MARK = scan.nextInt();
		System.out.print("Enter the student AGE      :");
		this.AGE = scan.nextInt();
	}

	/**
	 * @return the nAME
	 */
	public String getNAME() {
		return NAME;
	}

	/**
	 * @param nAME the nAME to set
	 */
	public void setNAME(String nAME) {
		NAME = nAME;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the mARK
	 */
	public double getMARK() {
		return MARK;
	}

	/**
	 * @param mARK the mARK to set
	 */
	public void setMARK(double mARK) {
		MARK = mARK;
	}

	/**
	 * @return the aGE
	 */
	public int getAGE() {
		return AGE;
	}

	/**
	 * @param aGE the aGE to set
	 */
	public void setAGE(int aGE) {
		AGE = aGE;
	}

	@Override
	public String toString() {
		return "NAME=" + NAME + ", ID=" + ID + ",MARK=" + MARK + ", AGE=" + AGE + "";
	}

	@Override
	public int hashCode() {
		return this.ID;
	}

	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj;
		return this.ID == std.ID;
	}

}
