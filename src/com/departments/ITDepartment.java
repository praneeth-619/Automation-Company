package com.departments;

import java.util.Scanner;

public class ITDepartment extends HRDepartment {

	private int numberOfLaptops;
	private int numberOfMobiles;
//private boolean assignLaptop;

	public void installAntivirus(String antivirusName) {

	}

	public void assignLaptop(int employeeID) {
// use employeecount--hr
		if (employeeID < 5) {
			System.out.println("Laptop will be issued");
		} else {
			System.out.println("You are not an employee");
		}
	}
}
