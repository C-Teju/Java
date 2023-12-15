package com.kn.springIntro.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.springIntro.beans.Student;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
		Student s1=(Student)context.getBean("s1");
		
		System.out.println("---> Object created by Spring = "+ s1);
	}

}
