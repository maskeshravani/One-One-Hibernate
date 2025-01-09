package com.userMain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.user.Profile;
import com.user.User;

public class userMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);
		cfg.addAnnotatedClass(Profile.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		
		Profile p = new Profile();
		p.setId(127);
		p.setAddress("Sangli");
		p.setEmail("shravani@gmail.com");
		p.setPassword("shar123");
		p.setPhone(9834658898l);
		
		ss.persist(p);
		
		
		User u = new User();
		u.setName("Shravani");
		u.setProfile(p);
		
		ss.persist(u);
		tr.commit();
	}

}
