package com.amazon;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SelectOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SessionFactory object
		SessionFactory factory = HibernateConfig.getSessionFactory();
		
		//Session object
		Session ses = factory.openSession();
		
		
		//To select
		//Product p = new Product();
		//ses.load(p, 102);
		Product p = ses.get(Product.class, 102);
		System.out.println(
				p.getPid()+" "+
				p.getPname()+" "+
				p.getPrice());
		
		//close objects
		ses.close();
		factory.close();
	}

}
