package com.departments;

public class App {

	public static void main(String[] args) {

// 	Getting Details of an employee 	 
		HRDepartment employees = new HRDepartment();
		employees.getEmployeeDetails(300);

//	Assign a laptop with valid employeeID	
		// ITDepartment itDepartment = new ITDepartment();
		// itDepartment.assignLaptop(201);

//	 Show the total number of employees in the company and show their IDs and Names.
		// employees.totalEmployees();

		// Show a list of all the employees under a project including the manager, and
		// team lead
	//	employees.searchEmployeeList("abc");

		// Show the salary of each employee
		employees.salaryEachEmployee(null);

	}
}