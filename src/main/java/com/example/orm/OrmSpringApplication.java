package com.example.orm;

import java.util.ArrayList;
import java.util.List;

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

		// second way to write this
//		SessionFactory sf = new Configuration()
//				.addAnnotatedClass(student.class)
//				.configure()
//				.buildSessionFactory();
//		Session session = sf.openSession();

		// Create
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

		// Read
//		student s2=session.find(student.class, 2);
//		System.out.print("Love from "+s2);

		// Update

//		Transaction transaction = session.beginTransaction();
//		student s1 = new student();
//
//		s1.setRollNo(4);
//		s1.setsName("Ash ketchum");
//		s1.setsAge(12);
//
//		session.merge(s1);
//
//		transaction.commit();
//
//		System.out.println(s1);
//		
//
//		session.close();
//		sf.close();

//		SessionFactory sf = new Configuration().addAnnotatedClass(student.class).configure().buildSessionFactory();
//		Session session = sf.openSession();
//		Transaction transaction = session.beginTransaction();
//		Laptop l = new Laptop();
//		l.setlModal("Yoga");
//		l.setlName("Lenovo");
//		l.setlPrice(70000);
//
//		student s = new student();
//		s.setRollNo(64);
//		s.setsAge(22);
//		s.setsName("Utkarsh Singh Rawat");
//		s.setLaptop(l);
//
//		session.persist(s);
//		transaction.commit();
//
//		student std = session.find(student.class, 64);
//
//		System.out.println("IBM Ka intejar karne wala : " + std);
//		session.close();
//		sf.close();

		SessionFactory sf = new Configuration().addAnnotatedClass(student.class).addAnnotatedClass(Laptop.class)
				.configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Laptop l1 = new Laptop();
		l1.setlId(1);
		l1.setlModal("Yoga");
		l1.setlName("Lenovo");
		l1.setlPrice(30000);
		
		Laptop l2 = new Laptop();
		l2.setlId(2);
		l2.setlModal("Dell");
		l2.setlName("Latitude 5000");
		l2.setlPrice(30000);
		
		List<Laptop> list=new ArrayList<>();
		list.add(l1);
		list.add(l2);

		student s = new student();
		s.setLaptops(list);
		s.setRollNo(164);
		s.setsAge(22);
		s.setsName("Utkarsh Singh Rawat");
		l1.setStd(s);
		l2.setStd(s);

		session.persist(l2);
		session.persist(l1);
		session.persist(s);
		transaction.commit();
		student std = session.find(student.class, 164);
		System.out.println("IBMer : " + std);
		session.close();
		sf.close();

	}
}