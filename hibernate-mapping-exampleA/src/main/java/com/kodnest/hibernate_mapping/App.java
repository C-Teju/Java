package com.kodnest.hibernate_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	

	public static void main(String[] args) {
//Since the bike entity is referenced in student entity make
//	sure the bike object is created before the student object.
		
//		This is for Uni-Directional OneToOne mapping
//		Bike b1 = new Bike(123, "Yamaha", 200000,s3);
//		Bike b2 = new Bike(456, "Kawasaki", 300000,s1);
//		Bike b3 = new Bike(789, "Ninja", 400000,s2);
		
		
//		This is for Bi-Directional OneToOne mapping
		Bike b1=new Bike();
		Bike b2=new Bike();
		Bike b3=new Bike();
		

		Student s1 = new Student(1, "Breen", 85,b2);
		Student s2 = new Student(2, "Morena", 90,b3);
		Student s3 = new Student(3, "Aisling", 85,b1);

//		This is also for Bi-Directional OneToOne mapping
		b1.setRegNo(111);
		b1.setModel("KTM");
		b1.setCost(12346.34);
		b1.setStudent(s3);
		
		b2.setRegNo(222);
		b2.setModel("Yamaha");
		b2.setCost(22346.34);
		b2.setStudent(s1);
		
		b3.setRegNo(333);
		b3.setModel("Royal Enfield");
		b3.setCost(32356.34);
		b3.setStudent(s2);
		
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction txn = session.beginTransaction();

		session.save(s1);
		session.save(s2);
		session.save(s3);

		session.save(b1);
		session.save(b2);
		session.save(b3);

		txn.commit();

		System.out.println("----> " + s1 + "has been stored in Database !");
		System.out.println("----> " + s2 + "has been stored in Database !");
		System.out.println("----> " + s3 + "has been stored in Database !");
		System.out.println("----> " + b1 + "has been stored in Database !");
		System.out.println("----> " + b2 + "has been stored in Database !");
		System.out.println("----> " + b3 + "has been stored in Database !");
	}

}
