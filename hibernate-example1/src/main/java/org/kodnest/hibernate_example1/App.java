package org.kodnest.hibernate_example1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Student s1=new Student(1, "Breen", 85);
    	Student s2=new Student(2, "Morena", 90);
    	Student s3=new Student(3, "Aisling", 85);
    	
    	Bike b1=new Bike(123, "Yamaha", 200000);
    	Bike b2=new Bike(456, "Kawasaki", 300000);
    	Bike b3=new Bike(789, "Ninja", 400000);
    	
        Configuration cfg=new Configuration();
        cfg.configure();
        
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session session=factory.openSession();
        
        Transaction txn=session.beginTransaction();
        
        session.save(s1);
        session.save(s2);
        session.save(s3);
        
        session.save(b1);
        session.save(b2);
        session.save(b3);
        
        txn.commit();
        
        System.out.println("----> "+s1+"has been stored in Database !");
        System.out.println("----> "+s2+"has been stored in Database !");
        System.out.println("----> "+s3+"has been stored in Database !");
        System.out.println("----> "+b1+"has been stored in Database !");
        System.out.println("----> "+b2+"has been stored in Database !");
        System.out.println("----> "+b3+"has been stored in Database !");
    }
}
