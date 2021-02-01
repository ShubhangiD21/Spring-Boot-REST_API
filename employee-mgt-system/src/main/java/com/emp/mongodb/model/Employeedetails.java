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
	private int id;
	private String fname;
	private String lname;
	private String address;
	private String email;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employeedetails [id=" + id + ", fname=" + fname + ", lname=" + lname + ", address=" + address
				+ ", email=" + email + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
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
	public void setEmail(String email) {
		this.email = email;
	}
	
}
