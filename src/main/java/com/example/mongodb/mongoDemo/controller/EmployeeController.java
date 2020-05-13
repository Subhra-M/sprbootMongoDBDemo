package com.example.mongodb.mongoDemo.controller;

import java.util.Collection;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.mongoDemo.model.Employee;
import com.example.mongodb.mongoDemo.service.EmployeeService;

@RestController
public class EmployeeController {
	private final Logger logger=LoggerFactory.getLogger(this.getClass());
	@Autowired
	EmployeeService empService;
	@PostMapping(value="/crate")
	public String create(@RequestBody List<Employee>emp) {
		logger.debug("Saving all employees into DB");
		empService.createEmployee(emp);
		return "Employee data created";
	}
	@GetMapping(value="/getAllEmp")
	public Collection<Employee>getAllEmployee(){
		logger.debug("Fetching all employee details from DB");
		return empService.getAllEmployees();
	}
	
}
