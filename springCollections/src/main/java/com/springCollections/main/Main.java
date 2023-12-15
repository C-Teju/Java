package com.springCollections.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCollections.beans.Employee;


public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		Employee s1=(Employee)context.getBean("emp1");
		System.out.println("Laptop Object1 created by Spring:- "+s1);
		
		context.close();
	}

}
