package com.tut.MavenProject;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Student st = new Student();
       
        //Adding Student
        st.setId(0);
        st.setCity("Bhopal");
        st.setName("Piyush");
        
        st.setId(1);
        st.setCity("delhi");
        st.setName("Priyanka");
        
        //adding Address_id;
        Address ad= new Address();
     
        ad.setAddedDate(new Date(0));  
        ad.setCity("Bhopal");
        ad.setName("Piyush");
        ad.setState("Madhya Pradesh");
        ad.setX(0);
         
        
        
        
        
        Session session = factory.openSession();
        Transaction tx= session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        factory.close();
        System.out.println(st);
        System.out.println(ad);
       
        
        
        
        
        
        
    
    
    }
}
