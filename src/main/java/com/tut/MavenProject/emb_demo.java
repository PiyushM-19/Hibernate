package com.tut.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import jakarta.transaction.Transaction;

public class emb_demo {
	
	public static void main(String []args){
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Student st1= new Student();
		st1.setId(1);
		st1.setCity("delhi");
		st1.setName("PiyushM");
		Certificate c1= new Certificate();
		c1.setCourses("Jdbc");
		c1.setDuration("1.5Months");
		st1.setCerti(c1);
		
		
		Student st2= new Student();
		st2.setId(2);
		st2.setCity("Mumbai");
		st2.setName("Priya");
		Certificate c2= new Certificate();
		c2.setCourses("Hibernate");
		c2.setDuration("1Months");
		st2.setCerti(c2);
		Session session = factory.openSession();
		org.hibernate.Transaction tx= session.beginTransaction();
		
		session.save(st1);
		session.save(st2);
		
		tx.commit();
		session.close();
		factory.close();
		
		
		
	}
}
