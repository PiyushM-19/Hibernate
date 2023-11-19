package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class mapMain {

	public static void main(String[] args) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		Question que = new Question();
		que.setQue("Java");
		que.setQue_id(21);
		
		Answer ans= new Answer();
		ans.setAns_id(1);
		ans.setAns("Mahiya se Java Java");
		que.setAns(ans);
		ans.setQue(que);
		
		
		
		
		Question que2 = new Question();
		que2.setQue("Java");
		que2.setQue_id(22);
		
		Answer ans2= new Answer();
		ans2.setAns_id(2);
		ans2.setAns("Mahiya se Java Java");
		que2.setAns(ans2);
		ans.setQue(que2);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(que);
		s.save(ans);
		s.save(que2);
		s.save(ans2);
		tx.commit();
		s.close();
		factory.close();
		
		

	}

}
