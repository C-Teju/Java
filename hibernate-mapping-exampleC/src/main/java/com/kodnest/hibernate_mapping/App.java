package com.kodnest.hibernate_mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Technology t1=new Technology();
		Technology t2=new Technology();
		Technology t3=new Technology();
		Technology t4=new Technology();
		
		List<Technology> lt1=new ArrayList();
		lt1.add(t1);
		lt1.add(t3);
		lt1.add(t4);
		
		List<Technology> lt2=new ArrayList();
		lt2.add(t2);
		lt2.add(t3);
		
		List<Technology> lt3=new ArrayList();
		lt3.add(t1);
		lt3.add(t2);
		lt3.add(t3);
		
		List<Technology> lt4=new ArrayList();
		lt4.add(t3);
		lt4.add(t4);
		
		List<Technology> lt5=new ArrayList();
		lt5.add(t1);
		lt5.add(t2);
		lt5.add(t3);
		lt5.add(t4);
	
		
		Employee e1=new Employee(01,"Amit",'C', lt1);
		Employee e2=new Employee(02,"Ankit",'B', lt2);
		Employee e3=new Employee(03,"Akash",'A', lt3);
		Employee e4=new Employee(04,"Arjun",'C', lt4);
		Employee e5=new Employee(05,"Anjali",'C', lt5);
			
		

		List<Employee> le1=new ArrayList();
		le1.add(e1);
		le1.add(e3);
		le1.add(e5);
		
		List<Employee> le2=new ArrayList();
		le2.add(e2);
		le2.add(e3);
		le2.add(e5);
		
		List<Employee> le3=new ArrayList();
		le3.add(e1);
		le3.add(e2);
		le3.add(e3);
		le3.add(e4);
		le3.add(e5);
		
		List<Employee> le4=new ArrayList();
		le4.add(e1);
		le4.add(e4);
		le4.add(e5);
		
		
		t1.setTechId(111);
		t1.setTechName("Java");
		t1.setEmployee(le1);
		
		t2.setTechId(222);
		t2.setTechName("Python");
		t2.setEmployee(le2);
		
		t3.setTechId(333);
		t3.setTechName("MySQL");
		t3.setEmployee(le3);
		
		t4.setTechId(444);
		t4.setTechName("ReactJS");
		t4.setEmployee(le4);

		
		Configuration cfg = new Configuration().configure();
		

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction txn = session.beginTransaction();

		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);

		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		

		txn.commit();
		System.out.println("Finished");
		
	}

}
