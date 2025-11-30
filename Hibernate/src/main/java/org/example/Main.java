package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;


public class Main {
    public static void main(String [] args) {

        /*
        Student s1=new Student();
        s1.setId(4);
        s1.setName("You");
        s1.setEmail("demo4@gmail.com");

//        Student s2=null;

//        Configuration cfg=new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure();

        SessionFactory sf= new  Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure()
                .buildSessionFactory();   // cfg.buildSessionFactory();

        Session session=sf.openSession();

//        s1=session.find(Student.class,4); //find object to the delete query
        Transaction tx= session.beginTransaction();

//        session.merge(s1); // Update & insert Query
//        session.remove(s1); // Delete query
//        session.persist(s1);    // Insert Query
          tx.commit();
        sf.close();
        session.close();
        System.out.println(s1);  */

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setModel("Laptop");
        l1.setBrand("Dell");
        l1.setRam(8);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setModel("Laptop");
        l2.setBrand("HP");
        l2.setRam(16);

        Student st = new Student();
        st.setId(101);
        st.setName("Gajanan");
        st.setEmail("demo@gmail.com");
        st.setLaptops(Arrays.asList(l1,l2));

        l1.setStudent(st);
        l2.setStudent(st);


        SessionFactory sf= new  Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.persist(l1);
        session.persist(l2);
        session.persist(st);
        tx.commit();
        sf.close();
        session.close();


    }

}
