package com.learning.model;

public abstract class Employee {
	
	private int id;
	private String name, gender;
	private int salary;
	
	Address address;
	
	public abstract Address applyAddress();
	
	public Employee() {
		System.out.println("Employee.Employee()");
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("Employee.setName()");
	}

	public Employee(int id, String name, String gender, int salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
	
}
