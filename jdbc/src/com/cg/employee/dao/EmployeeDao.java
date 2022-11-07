package com.cg.employee.dao;


	import java.util.List;

import com.cg.employee.beans.Employee;

	public interface EmployeeDao {
		int addEmployee(Employee emp);

		int updateEmployee(Employee emp);

		List<Employee> getEmployeeByCode(int code);

		List<Employee> getAllEmployees();

		int deleteEmployeeByCode(int code);
	}

