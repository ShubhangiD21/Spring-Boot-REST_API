package com.emp.mongodb.resource;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	//Api for save/ add new employee details into db
	@PostMapping("/saveEmployee")
	public String saveEmployee(@RequestBody Employeedetails emp) {
		repository.save(emp);
		return "Added emp  : " +emp.getId();
		}
	
	//Api for get all emp list from db
	@GetMapping("/getAllEmployee")
	public List<Employeedetails> getAllEmployee(){
		return repository.findAll();
			}
	
	//Api for delete emp by id
	@DeleteMapping("/deleteEmpById/{id}")
	public String deleteEmpById(@PathVariable("id") String id) {
			repository.deleteById(id);
		return "deleted by id : "+ id;
		
	}
	
	//Api for get particular  emp detail by firstName(this api is created for practice purpose)
	@GetMapping("/getEmpByfirstName/{firstName}")
	public List <Employeedetails> getEmpByfirstName(@PathVariable String firstName)
	{
		return repository.findByFirstName(firstName);
	}
	
	//Api for get particular  emp detail by id
	@GetMapping("/findById/{id}")
	public Optional <Employeedetails> getEmpById(@PathVariable ("id") String id){
		Optional <Employeedetails> emp= repository.findById(id);
		return emp;
	}
	
	//Api for update particular  emp address and email
	@PutMapping("/update/{id}")
	public Employeedetails  updateTodo(@PathVariable ("id") String id, @RequestBody Employeedetails info) throws Exception {
		Employeedetails dataToUpdate =  this.repository.findById(id).orElseThrow(() -> new Exception("employee not found"));
		
		dataToUpdate.setAddress(info.getAddress());
		dataToUpdate.setEmail(info.getEmail());
		return this.repository.save(dataToUpdate);
	}
	
	
	}
