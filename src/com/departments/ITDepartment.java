package com.departments;

import java.util.Scanner;

public class ITDepartment {

	private int numberOfLaptops;
	private int numberOfMobiles;

	public void installAntivirus(String antivirusName) {

	}

	public void assignLaptop(int employeeID) {
		if (employeeID < 5) {
			System.out.println("Laptop will be issued");
		} else {
			System.out.println("You are not an employee");
		}
	}
}
