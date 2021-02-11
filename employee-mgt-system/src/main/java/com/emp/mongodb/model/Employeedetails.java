package com.emp.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

//@Getter
//@Setter
//@ToString

@Document(collection = "Employeedetails")
public class Employeedetails {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Employeedetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", email=" + email + "]";
	}
	public void setEmail(String email) {
		this.email = email;
	}
			
}
