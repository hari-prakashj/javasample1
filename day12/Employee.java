package com.onesoft.day12;

public class Employee {
	private String name;
	private int id;
	private int age;
	private boolean isVaccinated;
	private String gender;
	private int salary;
	
	public void setName(String name) {
		this .name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setIsVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}
	public boolean getIsVaccinated() {
		return isVaccinated;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	
	public Employee(String name, int id, int age, boolean isVaccinated, String gender, int salary) {
		this.name=name;
		this.id = id;
		this.age=age;
		this.isVaccinated=isVaccinated;
		this.gender = gender;
		this.salary=salary;
	}
	
	public String toString() {
		return name+id+age+isVaccinated+gender+salary;
	}

}
