package com.departments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HRDepartment {

//	private String[] projectList;

	private ArrayList<Employee> employees = new ArrayList<>();

	public HRDepartment() {

		employees.add(new Employee(123, "Praneeth", "Test Engineer", "E-commerce", "50000"));
		employees.add(new Employee(124, "Prakash", "Dev Ops", "Finance", "60000"));
		employees.add(new Employee(125, "Pramod", "Developer", "banking", "70000"));
		employees.add(new Employee(126, "Patel", "Automation Engineer", "E-commerce", "80000"));
		employees.add(new Employee(127, "Prayag", "Test Lead", "banking", "900000"));

	}

	public void searchEmployeeList(String search) {

		for (Employee employee : employees) {
			if (employee.getProjectName().equalsIgnoreCase(search)) {
				System.out.println(
						"Employee ID: " + employee.getEmployeeId() + " Employee Name: " + employee.getEmployeeName()
								+ " Project Name: " + employee.getProjectName() + " Salary: " + employee.getSalary());
			}
		}

	}

	public void salaryEachEmployee(String Search) {

		for (Employee employee : employees) {

			if (employee.getEmployeeName().equalsIgnoreCase(Search)) {
				System.out.println(" Employee ID: " + employee.getEmployeeId() + " Employee Name: "
						+ employee.getEmployeeName() + " Salary: " + employee.getSalary());
			}
		}

	}

	public void getEmployeeDetails(int employeeID) {

		String newLine = System.lineSeparator();

		for (Employee employee : employees) {
			if (employee.getEmployeeId() == employeeID) {
				System.out.println(" Employee ID: " + employee.getEmployeeId() + newLine + " Employee Name: "
						+ employee.getEmployeeName() + newLine + " Project Name: " + employee.getProjectName() + newLine
						+ " Salary: " + employee.getSalary());
			}
		}

	}

	public void totalEmployees() {

		int count = 0;
		for (Employee employee : employees) {
			System.out.println("ID: " + employee.getEmployeeId() + " Name: " + employee.getEmployeeName());
			count++;
		}

		System.out.println("Total Number of Employees: " + count);

	}

	private void projectList() {

	}

}