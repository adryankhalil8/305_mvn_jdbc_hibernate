package com.test.hib.controller;
import com.test.hib.model.User;
import org.hibernate.Session;
public class FindingUser {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        int userId = 2;
        User user = session.get(User.class, userId);
        if (user != null) {
            System.out.println("Fullname: " + user.getFullname());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Password: " + user.getPassword());
        } else {
            System.out.println("User not found.");
        }
        session.close();
    }
}

