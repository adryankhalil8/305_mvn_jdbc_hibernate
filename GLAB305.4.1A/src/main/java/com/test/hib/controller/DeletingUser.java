package com.test.hib.controller;

import com.test.hib.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class DeletingUser {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        User user = session.get(User.class, 3);
        if (user != null) {
            session.remove(user);
        }
        tx.commit();
        session.close();
        System.out.println("User deleted successfully.");
    }
}
