package com.amazon;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class HQLDemo {

	public static void main(String[] args) {
		//SessionFactory object
		SessionFactory factory = HibernateConfig.getSessionFactory();
		
		//Session object
		Session ses = factory.openSession();

		//HQL
		Query qry = ses.createQuery("from Product p");  //to enable HQL we need the support of interface Query 
		List<Product> l = qry.list();
		//enhanced for loop
		for(Product p:l) {
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice());
		}
		
		
		//close objects
		ses.close();
		factory.close();

	}

}
