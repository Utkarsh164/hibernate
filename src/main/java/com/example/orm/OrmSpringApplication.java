package com.example.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OrmSpringApplication {

    public static void main(String[] args) {

        student s1 = new student();

        s1.setRollNo(1);
        s1.setsName("utkarsh");
        s1.setsAge(12);

        Configuration cfg = new Configuration();

        cfg.addAnnotatedClass(student.class);

        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();

        System.out.println(s1);

        session.close();
        sf.close();
    }
}