/**
 * 
 */
package com.example.mongodb.mongoDemo.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodb.mongoDemo.dao.EmployeeDao;
import com.example.mongodb.mongoDemo.model.Employee;

/**
 * @author SubhraGhosh
 *
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao empDao;

	@Override
	public void createEmployee(List<Employee> emp) {
		empDao.saveAll(emp);
		
	}

	@Override
	public Collection<Employee> getAllEmployees() {
		
		return empDao.findAll();
	}

}
