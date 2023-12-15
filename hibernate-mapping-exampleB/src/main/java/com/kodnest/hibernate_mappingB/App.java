package com.kodnest.hibernate_mappingB;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		
		
		
		List<Product> l1=new ArrayList<>();
		l1.add(p1);
		l1.add(p2);
		
		List<Product> l2=new ArrayList<>();
		l2.add(p3);
		l2.add(p4);
		
		Customer c1=new Customer(1, "Amit", 21, l1);
		Customer c2=new Customer(2, "Arjun", 25, l2);
		
		p1.setpId(111);
		p1.setpName("Keyboard");
		p1.setpCost(1000);
		p1.setCust(c1);
		
		
		p2.setpId(222);
		p2.setpName("Mouse");
		p2.setpCost(700);
		p2.setCust(c1);
		
		p3.setpId(333);
		p3.setpName("TV");
		p3.setpCost(70000);
		p3.setCust(c2);
		
		p4.setpId(444);
		p4.setpName("Camera");
		p4.setpCost(150000);
		p4.setCust(c2);
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction txn = session.beginTransaction();

		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);

		session.save(c1);
		session.save(c2);

		txn.commit();
		System.out.println("Finished");
	}

}
