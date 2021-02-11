package com.emp.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;
import com.emp.mongodb.model.Employeedetails;

public interface EmployeeRepository extends MongoRepository <Employeedetails , Integer>{

	public List<Employeedetails> findByFirstName(String firstName);
	public Optional <Employeedetails> findById(String id);
	public void deleteById(String id);


}
