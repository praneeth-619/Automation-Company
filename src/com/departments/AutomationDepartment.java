package com.departments;

import java.util.ArrayList;

public class AutomationDepartment {

	private ArrayList<String> managerList = new ArrayList<>();
	private ArrayList<String> teamLeads = new ArrayList<>();
	private ArrayList<String> projects = new ArrayList<>();

	public AutomationDepartment() {

		managerList.add("Vels");
		managerList.add("Sanjay");
		managerList.add("Vishy");

		teamLeads.add("Arun");
		teamLeads.add("Mallikarjun");
		teamLeads.add("Suraj");

		projects.add("Citrix");
		projects.add("Twitter");
		projects.add("Banking");
		projects.add("IOS");

	}
}
