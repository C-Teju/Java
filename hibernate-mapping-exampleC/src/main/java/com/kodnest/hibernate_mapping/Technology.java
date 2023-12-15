package com.kodnest.hibernate_mapping;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Technology {
	@Id
	int techId;
	String techName;
	
	@ManyToMany
	List<Employee> Employee;

	public Technology() {
		super();
	}

	public Technology(int techId, String techName, List<com.kodnest.hibernate_mapping.Employee> employee) {
		super();
		this.techId = techId;
		this.techName = techName;
		Employee = employee;
	}

	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public List<Employee> getEmployee() {
		return Employee;
	}

	public void setEmployee(List<Employee> employee) {
		Employee = employee;
	}

	@Override
	public String toString() {
		return "Technology [techId=" + techId + ", techName=" + techName + ", Employee=" + Employee + "]";
	}

	
	
	
}
