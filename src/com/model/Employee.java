package com.model;

public class Employee {

	private int empID;
	private String empName;
	private double salary;
	private String dept;
	private String mobNo;
	private String gender;
	private String dateOfBirth;

	public Employee() {
	}

	public Employee(int empID, String empName, double salary, String dept, String mobNo, String gender,
			String dateOfBirth) {
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
		this.mobNo = mobNo;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
