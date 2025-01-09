package com.productMain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.product.Product;
import com.product.Supplier;

public class productMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Supplier.class);
		cfg.addAnnotatedClass(Product.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Product p = new Product();
		p.setP_name("Bag");
		p.setPrice(1000);
		p.setComName("Zyzon");
		p.setColor("black");
		
		ss.persist(p);
		
		Supplier s = new Supplier();
		s.setS_id(12);
		s.setAddress("Sangli");
		s.setmNo(9893279827l);
		s.setProduct(p);
		
		ss.persist(s);
		tr.commit();
	}

}
