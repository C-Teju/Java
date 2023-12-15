package com.kodnest.hibernate_mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bike {
	
		@Id
		int regNo;
		String model;
		double cost;
		
		@OneToOne
		Student student;
		
		public Bike() {
			super();
		}

		public Bike(int regNo, String model, double cost, Student student) {
			super();
			this.regNo = regNo;
			this.model = model;
			this.cost = cost;
			this.student = student;
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

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		@Override
		public String toString() {
			return "Bike [regNo=" + regNo + ", model=" + model + ", cost=" + cost + ", student=" + student + "]";
		}

		
		
		
		
	
}
