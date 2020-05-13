package com.example.mongodb.mongoDemo.dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongodb.mongoDemo.model.Employee;

@Repository
public interface EmployeeDao extends MongoRepository<Employee, ObjectId>{

}
