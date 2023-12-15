package com.kodnest.hibernate_mappingB;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	int cId;
	String cName;
	int cAge;
	
	@OneToMany
	List<Product> Product;
	
	public Customer() {
		super();
	}
	

	public Customer(int cId, String cName, int cAge, List<com.kodnest.hibernate_mappingB.Product> product) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cAge = cAge;
		Product = product;
	}


	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcAge() {
		return cAge;
	}

	public void setcAge(int cAge) {
		this.cAge = cAge;
	}

	public List<Product> getProduct() {
		return Product;
	}

	public void setProduct(List<Product> product) {
		Product = product;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cAge=" + cAge + ", Product=" + Product + "]";
	}
	
	
	
	

}
