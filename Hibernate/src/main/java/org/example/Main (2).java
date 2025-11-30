package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Laptop l1=new Laptop();
//        l1.setId(4);
//        l1.setBrand("DELL");
//        l1.setModel("riazon");
//        l1.setRam(8);

//        Laptop l2=new Laptop();
//        l2.setId(2);
//        l2.setBrand("DELL");
//        l2.setModel("XPM");
//        l2.setRam(32);
//
//        Laptop l3=new Laptop();
//        l3.setId(3);
//        l3.setBrand("APPLE");
//        l3.setModel("Macbook");
//        l3.setRam(8);
//
//        Student s1=new Student();
//        s1.setId(101);
//        s1.setFname("Gajanan");
//        s1.setLname("Narwade");
//
//        Student s2=new Student();
//        s2.setId(102);
//        s2.setFname("Rushi");
//        s2.setLname("Dalvi");

//        Student s3=new Student();
//        s3.setId(103);
//        s3.setFname("Nilesh");
//        s3.setLname("Jashav");


//        s1.setLaptops(Arrays.asList(l1,l2));
//        s2.setLaptops(Arrays.asList(l3));
//        s3.setLaptops(Arrays.asList(l1));

//        l1.setStudent(Arrays.asList(s1,s3));
//        l2.setStudent(Arrays.asList(s1,s2));
//        l3.setStudent(Arrays.asList(s2));

//        l1.setStudent(s1);
//        l2.setStudent(s1);

//        Student s2=null;



        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();     //cfg.buildSessionFactory();
        Session session=sf.openSession();

//        s2=session.find(Student.class,2); //Fetch data

//        Transaction tx=session.beginTransaction();
//        session.merge(s1); //update & if not present then work like insert query
//        session.persist(l1);
//        session.persist(l2);
//        session.persist(l3);
//        session.persist(s1);
//        session.persist(s2);
//        session.persist(s3); //Store value
//        session.remove(s2);

        //HQL
//        String brand= "DELL";
//        Query query=session.createQuery("from Laptop where brand like ?1"); //HQL
//        query.setParameter(1,brand);
//        List<Laptop> laptop=query.getResultList();
//        System.out.println(laptop);
//        tx.commit();

//        //Difference between lazy eager loading
//        Laptop laptop=session.getReference(Laptop.class,4);
////        System.out.println(laptop);
//        session.close();

        //Seesion two
//        Session session1=sf.openSession();
//
//        Student s5=new Student();
//        s5=session1.find(Student.class,102);
//        System.out.println(s5);
//
//        session1.close();


        Laptop l1=session.find(Laptop.class,4);
        System.out.println(l1);
        session.close();

        Session session1=sf.openSession();
        Laptop l2=session1.find(Laptop.class,4);
        System.out.println(l2);
        session1.close();



        sf.close();

        //System.out.println(s2);//s2.toString() ---> In ths Student class method
    }
}
