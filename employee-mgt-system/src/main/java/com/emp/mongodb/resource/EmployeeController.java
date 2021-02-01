package com.emp.mongodb.resource;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.mongodb.model.Employeedetails;
import com.emp.mongodb.repository.EmployeeRepository;

@RestController
@CrossOrigin
 public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping("/welcome")
	public String get() {
		return "For text";
	} 
	
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employeedetails emp) {
		repository.save(emp);
		return "Added emp  : " +emp.getId();
		}
	
	@GetMapping("/getAllEmployee")
	public List<Employeedetails> getAllEmployee(){
		return repository.findAll();
			}
	
	@GetMapping("/getEmpById/{id}")
	public Optional<Employeedetails> getEmpById(@PathVariable int id){
		return repository.findById(id);
		}
	
	@DeleteMapping("/deleteEmpById/{id}")
	public String deleteEmpById(@PathVariable int id) {
		repository.deleteById(id);
		return "deleted by id : "+ id;
		
	}
	
	}
