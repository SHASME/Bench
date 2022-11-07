package com.cg.deptemp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.deptemp.dto.EmployeeDto;
import com.cg.deptemp.entities.Employee;
import com.cg.deptemp.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl empservice;
	
	@PostMapping
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeDto empdto){
		int empno = empservice.addEmployee(empdto);
		return new ResponseEntity<String>("inserted empcode = "+empno,HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmpls(){
		List<Employee> empList = empservice.viewAllEmpls();
		return new ResponseEntity<List<Employee>>(empList,HttpStatus.OK);
	}
	@GetMapping("/id/{empno}")
	public ResponseEntity<Optional<Employee>> getEmpById(@PathVariable int empno){
		Optional<Employee> emp = empservice.getById(empno);
		return new ResponseEntity<Optional<Employee>>(emp,HttpStatus.OK);
		
	}
	@PutMapping
	public ResponseEntity<String> editEmployee(@RequestBody Employee emp){
		empservice.updateEmployee(emp);
		return new ResponseEntity<String>("updated",HttpStatus.OK);
	}
	@DeleteMapping("/id/{empno}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int empno){
		empservice.deleteEmployee(empno);
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}
}

