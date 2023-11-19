package com.tut.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main( String[] args )
    {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student stu=(Student)session.get(Student.class, 1);
		Address adu= (Address)session.get(Address.class, 1);
	
		
				
		
		System.out.println(stu.getName());
		System.out.println(adu.getCity());
		session.close();
		factory.close();
;    }
	
}
