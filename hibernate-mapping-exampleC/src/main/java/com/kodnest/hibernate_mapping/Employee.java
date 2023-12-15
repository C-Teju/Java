package com.kodnest.hibernate_mapping;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	int id;
	String name;
	char team;
	@ManyToMany
	List<Technology> Technology;
	
	
	public Employee() {
		super();
	}


	public Employee(int id, String name, char team, List<com.kodnest.hibernate_mapping.Technology> technology) {
		super();
		this.id = id;
		this.name = name;
		this.team = team;
		Technology = technology;
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


	public char getTeam() {
		return team;
	}


	public void setTeam(char team) {
		this.team = team;
	}


	public List<Technology> getTechnology() {
		return Technology;
	}


	public void setTechnology(List<Technology> technology) {
		Technology = technology;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", team=" + team + ", Technology=" + Technology + "]";
	}
	
	
}
