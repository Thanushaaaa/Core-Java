package com.xworkz.ring.shop.dto;

import java.io.Serializable;

public class MetroStaffDTO implements Serializable {
	private String name;
	private int salary;
	private String location;
	private int age;
	private int workingHours;

	public MetroStaffDTO() {

	}

	public MetroStaffDTO(String name, int salary, String location, int age, int workingHours) {

		this.name = name;
		this.salary = salary;
		this.location = location;
		this.age = age;
		this.workingHours = workingHours;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String getLocation() {
		return location;
	}

	public int getAge() {
		return age;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String toString() {
		return "MetroStaffDTO [name=" + name + ", salary=" + salary + ", location=" + location + ", age=" + age
				+ ", workingHours=" + workingHours + "]";
	}

}
