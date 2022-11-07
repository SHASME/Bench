package com.cg.employee.service;

import java.util.List;

import com.cg.employee.beans.Employee;
import com.cg.employee.dao.EmployeeDao;
import com.cg.employee.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {


		EmployeeDao dao = new EmployeeDaoImpl();

		@Override
		public int addEmployee(Employee emp) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int updatEmployee(Employee emp) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public List<Employee> getAllEmployees() {
			// TODO Auto-generated method stub
			return null;
		}

		

	}

