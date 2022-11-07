package com.cg.deptemp.service;

import com.cg.deptemp.entities.Department;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.deptemp.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentRepository deptrepo;
	@Override
	public void addDepartment(Department dept) {
		deptrepo.save(dept);		
	}
	@Override
	public List<Department> viewAllDepts() {
		return deptrepo.findAll();
	}
	@Override
	public Optional<Department> getById(int deptno) {
	Optional<Department> dept = deptrepo.findById(deptno);
	
		return dept;
	}
	@Override
	public void updateDepartment(Department dept) {
		deptrepo.save(dept);
		
	}
	@Override
	public void deleteDepartment(int deptno) {
	deptrepo.deleteById(deptno);
		
	}
}
	
	