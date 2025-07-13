package com.service;

import java.util.List;
import com.dao.EmployeeDao;
import com.model.Employee;

public class EmployeeService {

	private EmployeeDao dao = new EmployeeDao();

	public int addEmployee(Employee emp) {
		return dao.insertEmployee(emp);
	}

	public List<Employee> fetchAllEmployees() {
		return dao.getAllEmployees();
	}

	public Employee fetchEmployeeById(int id) {
		return dao.getEmployeeById(id);
	}
}
