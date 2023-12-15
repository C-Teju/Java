package com.kodenst.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
//		create();
//		read();
//		update();
		delete();
	}

	public static void delete() {
		Configuration conf=new Configuration().configure();
		SessionFactory factory= conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
//		to delete data from database
		Laptop laptop= session.get(Laptop.class,01);
		session.delete(laptop);
		txn.commit();
		System.out.println("Laptop has been deleted"+laptop);
	}

	public static void update() {
		Configuration conf=new Configuration().configure();
		SessionFactory factory= conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
//		to change/update data from database
		Laptop laptop= session.get(Laptop.class,01);
		laptop.setBrandName("HP");
		session.save(laptop);
		txn.commit();
		System.out.println("Laptop has been updated "+laptop);
	}

	public static void read() {
		Configuration conf=new Configuration().configure();
		SessionFactory factory= conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
//		to read data from database
		Laptop laptop= session.get(Laptop.class,01);
		txn.commit();
		System.out.println("Laptop has been read "+laptop);
	}

	
	public static void create() {
		Laptop laptop=new Laptop(01,"Dell", 1234599.99);
		Configuration conf=new Configuration().configure();
		SessionFactory factory= conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		session.save(laptop);
		txn.commit();
		System.out.println("Laptop has been created "+laptop);
	}

}
