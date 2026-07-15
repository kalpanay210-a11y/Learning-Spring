package com.learning.model;

import lombok.Data;

@Data
public class Employee {
	
	private int id;
	private String name, gender;
	private int salary;
	
	private Address address;
	
	public Employee() {
		System.out.println("Employee.Employee()");
	}
	
	public Employee(int id, String name, String gender, int salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.address = address;
		System.out.println("Employee.Employee(5)");
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
		System.out.println("Employee.setId()");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name= name;
		System.out.println("Employee.setName()");
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
		System.out.println("Employee.setGender()");
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
		System.out.println("Employee.setSalary()");
	}
	 public Address getAddress() {
		 return address;
	 }
	
	 public void setAddress(Address address) {
		 this.address = address;
	 }
	 
	 @Override 
	 
	 public String toString() {
		 return "Employee[ name= "+ name +", gender= "+ gender +", salary= "+ gender+", address= "+ address +"]";
	 }
}
