package com.controller;

import java.util.*;
import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeController {

	private static final Scanner sc = new Scanner(System.in);
	private static final EmployeeService service = new EmployeeService();

	public static void main(String[] args) {

		while (true) {
			System.out.println("\n=== Employee Management System ===");
			System.out.println("1. Add Employee");
			System.out.println("2. View All Employees");
			System.out.println("3. View Employee by ID");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				Employee e = new Employee();
				System.out.print("Enter ID: ");
				e.setEmpID(sc.nextInt());
				sc.nextLine(); // consume newline

				System.out.print("Enter Name: ");
				e.setEmpName(sc.nextLine());

				System.out.print("Enter Salary: ");
				e.setSalary(sc.nextDouble());
				sc.nextLine();

				System.out.print("Enter Department: ");
				e.setDept(sc.nextLine());

				System.out.print("Enter Mobile No: ");
				e.setMobNo(sc.nextLine());

				System.out.print("Enter Gender: ");
				e.setGender(sc.nextLine());

				System.out.print("Enter DOB (YYYY-MM-DD): ");
				e.setDateOfBirth(sc.nextLine());

				int status = service.addEmployee(e);
				if (status > 0)
					System.out.println("Employee added successfully!");
				else
					System.out.println("Failed to add employee.");
				break;

			case 2:
				List<Employee> list = service.fetchAllEmployees();
				if (list.isEmpty()) {
					System.out.println("No employees found.");
				} else {
					for (Employee emp : list) {
						System.out.println(emp.getEmpID() + " | " + emp.getEmpName() + " | " + emp.getSalary() + " | "
								+ emp.getDept() + " | " + emp.getMobNo() + " | " + emp.getGender() + " | "
								+ emp.getDateOfBirth());
					}
				}
				break;

			case 3:
				System.out.print("Enter Employee ID: ");
				int id = sc.nextInt();
				Employee emp = service.fetchEmployeeById(id);
				if (emp != null) {
					System.out.println(
							emp.getEmpID() + " | " + emp.getEmpName() + " | " + emp.getSalary() + " | " + emp.getDept()
									+ " | " + emp.getMobNo() + " | " + emp.getGender() + " | " + emp.getDateOfBirth());
				} else {
					System.out.println("Employee not found.");
				}
				break;

			case 4:
				System.out.println("Thank you!");
				System.exit(0);

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
