package com;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private Address address;
	
	public Employee(){
		System.out.println("Obj created with empty");
	}
	
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

public Employee(int id, String name, float salary) {
		System.out.println("Obj created with parameters");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

public void display() {
	System.out.println("Employee class  method");
	
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
}
}
