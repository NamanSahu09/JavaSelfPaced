package com.naman.DemoProjectName;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.io.InputStream;

import org.hibernate.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Alien naman = new Alien();
        naman.setAid(101);
        naman.setAname("Naman");
        naman.setColor("Green");

        // Hibernate configuration
        InputStream is = App.class.getClassLoader().getResourceAsStream("hibernate.cfg.xml");
        System.out.println("Found cfg: " + (is != null));
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(naman); 

        tx.commit();
        session.close(); 

        System.out.println("Data saved successfully.");
    }
}
