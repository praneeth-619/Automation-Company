package com.departments;

public class AutomationDepartment  {

	public String[] managers;
	public String[] teamLeads;
	public String[] employees;
	private String[] projectDetails;

	public String[] getManager() {

		managers = new String[3];
		managers[0] = "Vels";
		managers[1] = "Sanjay";
		managers[2] = "Vishy";

		return managers;
	}

	public String[] getTeamLead() {

		teamLeads = new String[3];
		teamLeads[0] = "Arun";
		teamLeads[1] = "Mallikarjun";
		teamLeads[2] = "Suraj";

		return teamLeads;
	}
	//List 

	public String[] getEmployee() {

		employees = new String[3];
		employees[0] = "Praneeth";
		employees[1] = "Prashanth";
		employees[2] = "Prakash";

		return employees;
	}

	private String projectDetails() {
		return null;

	}

}
