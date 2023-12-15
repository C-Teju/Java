package com.kn.springIntro.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.springIntro.beans.Laptop;



public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		Laptop s1=(Laptop)context.getBean("l1");
		System.out.println("Laptop Object1 created by Spring:- "+s1);
		Laptop s2=(Laptop)context.getBean("l2");
		System.out.println("Laptop Object2 created by Spring:- "+s2);
	}

}
