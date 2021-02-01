package com.emp.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.emp.mongodb.model.Employeedetails;

public interface EmployeeRepository extends MongoRepository <Employeedetails , Integer>{

}
