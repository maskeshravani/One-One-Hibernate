package com.passportMain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.testing.orm.domain.userguide.Person;

import com.passport.Passport;
import com.passport.PersonExample;


public class PassportMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(PersonExample.class);
		cfg.addAnnotatedClass(Passport.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Passport p = new Passport();
		p.setId(12);
		p.setConntry("India");
		p.setPass_No("hfh9287438");
		ss.persist(p);
		
		PersonExample pe = new PersonExample();
		pe.setName("shravani");
		pe.setEmail("shravani5@gmail.com");
		pe.setAddress("Sangli");
		pe.setmNo(8932738447l);
		pe.setPass(p);

		ss.persist(pe);
		tr.commit();
	}

}
