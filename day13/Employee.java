package com.onesoft.day13;

public class Employee {
	private String name;
	private int id;
	private boolean isPermanent;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isPermanent() {
		return isPermanent;
	}
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int id, boolean isPermanent, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.isPermanent = isPermanent;
		this.salary = salary;
	}

	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", isPermanent=" + isPermanent + ", salary=" + salary + "]";
	}
	
	

}
