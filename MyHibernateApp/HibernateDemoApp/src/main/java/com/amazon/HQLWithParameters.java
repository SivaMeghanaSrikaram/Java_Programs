package com.amazon;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class HQLWithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SessionFactory object
		SessionFactory factory = HibernateConfig.getSessionFactory();
		
		//Session object
		Session ses = factory.openSession();
		
		//HQL
		// ?1 and ?2 are place holders(or) positional parameters
		//Query qry = ses.createQuery("from Product p where p.price>?1 and p.price<?2");
		
		//HQL with named parameters(:p1,:p2)
		Query qry = ses.createQuery("from Product p where p.price>:p1 and p.price<:p2");
		//set values
		qry.setParameter("p1", 10000);
		qry.setParameter("p2", 15000);
		List<Product> l=qry.list();
		
		//enhanced for loop
		for(Product p:l) {
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrice());
		}
		
		//close objects
		ses.close();
		factory.close();
	}

}
