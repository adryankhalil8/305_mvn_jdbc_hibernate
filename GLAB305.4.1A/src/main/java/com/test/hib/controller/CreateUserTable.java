package com.test.hib.controller;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class CreateUserTable {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        // Trigger schema creation/update
        tx.commit();
        session.close();
        System.out.println("User table checked/created successfully.");
    }
}
