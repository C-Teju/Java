package org.kodnest.hibernate_example1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	@Id
	int regNo;
	String model;
	double cost;
	public Bike() {
		super();
	}
	public Bike(int regNo, String model, double cost) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.cost = cost;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [regNo=" + regNo + ", model=" + model + ", cost=" + cost + "]";
	}
	
}
