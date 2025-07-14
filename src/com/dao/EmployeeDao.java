package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class EmployeeDao {

	private Connection conn;

	public EmployeeDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1043", "root", "Payal@123");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insertEmployee(Employee emp) {
		try {
			Statement stmt = conn.createStatement();
			String query = "INSERT INTO employee (empID, empName, salary, dept, mobNo, gender, Date_Of_Birth) VALUES ("
					+ emp.getEmpID() + ",'" + emp.getEmpName() + "'," + emp.getSalary() + ",'" + emp.getDept() + "','"
					+ emp.getMobNo() + "','" + emp.getGender() + "','" + emp.getDateOfBirth() + "')";

			conn.close();
			return stmt.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

			while (rs.next()) {
				Employee e = new Employee(rs.getInt("empID"), rs.getString("empName"), rs.getDouble("salary"),
						rs.getString("dept"), rs.getString("mobNo"), rs.getString("gender"),
						rs.getString("Date_Of_Birth"));

				list.add(e);
			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public Employee getEmployeeById(int id) {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM employee WHERE empID = " + id);

			if (rs.next()) {
				return new Employee(rs.getInt("empID"), rs.getString("empName"), rs.getDouble("salary"),
						rs.getString("dept"), rs.getString("mobNo"), rs.getString("gender"),
						rs.getString("Date_Of_Birth"));
			}

			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
