package com.test.hib.controller;
import com.test.hib.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class CreateUser {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        User u1 = new User("Moh Haseeb", "haseeb@gmail.com", "has123", 20, 2000.69, "NYC");
        User u2 = new User("James Santana", "james@gmail.com", "james123", 25, 2060.69, "Dallas");
        User u3 = new User("AH Shahparan", "shahparan@gmail.com", "shah123", 30, 3060.69, "Chicago");
        User u4 = new User("Christ", "christ@gmail.com", "147852", 35, 35000.30, "NJ");
        User u5 = new User("Sid", "sid@gmail.com", "s258", 29, 4000.36, "LA");
        session.persist(u1);
        session.persist(u2);
        session.persist(u3);
        session.persist(u4);
        session.persist(u5);
        tx.commit();
        session.close();
        System.out.println("User saved successfully.");
    }
}
