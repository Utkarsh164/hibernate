package com.example.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OrmSpringApplication {

	public static void main(String[] args) {

		
//one way to write

//        Configuration cfg = new Configuration();
//
//        cfg.addAnnotatedClass(student.class);
//
//        cfg.configure();
//
//        SessionFactory sf = cfg.buildSessionFactory();

		SessionFactory sf = new Configuration()
				.addAnnotatedClass(student.class)
				.configure()
				.buildSessionFactory();
		Session session = sf.openSession();
		
		//Create
//		Transaction transaction = session.beginTransaction();
//		student s1 = new student();
//
//		s1.setRollNo(4);
//		s1.setsName("Ash");
//		s1.setsAge(12);
//
//		session.persist(s1);
//
//		transaction.commit();
//
//		System.out.println(s1);
		

		//Read
		student s2=session.find(student.class, 2);
		System.out.print("Love from "+s2);
		
		//Update
		
		Transaction transaction = session.beginTransaction();
		student s1 = new student();

		s1.setRollNo(4);
		s1.setsName("Ash ketchum");
		s1.setsAge(12);

		session.merge(s1);

		transaction.commit();

		System.out.println(s1);
		

		session.close();
		sf.close();
	}
}