package com.example.mongodb.mongoDemo.service;

import java.util.Collection;
import java.util.List;

import com.example.mongodb.mongoDemo.model.Employee;

public interface EmployeeService {

	public void createEmployee(List<Employee>emp);
	public Collection<Employee>getAllEmployees();
	
}
