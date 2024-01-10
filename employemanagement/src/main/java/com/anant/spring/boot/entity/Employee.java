package com.anant.spring.boot.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document (collection = "employees")
public class Employee {
   
    private String name;
    private String mail;
    @Id private int id;
    private String dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", mail=" + mail + ", id=" + id + ", dob=" + dob + "]";
	}
	public Employee(String name, String mail, int id, String dob) {
		super();
		this.name = name;
		this.mail = mail;
		this.id = id;
		this.dob = dob;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
