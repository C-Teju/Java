package org.kodnest.hibernate_exampleA;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
			Employee e1=new Employee(101,"Breen", 85000);
			Employee e2=new Employee(102,"Aisling", 75000);
			Employee e3=new Employee(103,"Morena", 80000);
			
			Department d1=new Department(1, "IT");
			Department d2=new Department(2, "HR");
			
			Configuration cfg=new Configuration();
	        cfg.configure();
	        
	        SessionFactory factory=cfg.buildSessionFactory();
	        
	        Session session=factory.openSession();
	        
	        Transaction txn=session.beginTransaction();
	        
	        session.save(e1);
	        session.save(e2);
	        session.save(e3);
	        
	        session.save(d1);
	        session.save(d2);
	        
	        
	        txn.commit();
			
	        System.out.println("--------> Finished");

	}

}
