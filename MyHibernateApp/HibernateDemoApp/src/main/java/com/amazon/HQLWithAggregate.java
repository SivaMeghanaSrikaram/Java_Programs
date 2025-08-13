package com.amazon;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class HQLWithAggregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SessionFactory object
		SessionFactory factory = HibernateConfig.getSessionFactory();
		
		//Session object
		Session ses = factory.openSession();
		
		//HQL
		//Query qry = ses.createQuery("select count(*) from Product p");
		
		/*Query qry = ses.createQuery("select max(p.price) from Product p");
		List l=qry.list();
		int count=(int) l.get(0);
		System.out.println(count);*/
		
		
		//Query qry = ses.createQuery("select min(p.price) from Product p");
		/*List l=qry.list();
		int count=(int) l.get(0);
		System.out.println(count);*/
		
		
		/*Query qry = ses.createQuery("select avg(p.price) from Product p");
		List l=qry.list();
		double count=(double) l.get(0);
		System.out.println(count);*/
		
		Query qry = ses.createQuery("select sum(p.price) from Product p");
		List l=qry.list();
		long count=(long) l.get(0);
		System.out.println(count);
		
		
		//close objects
		ses.close();
		factory.close();
	}

}
