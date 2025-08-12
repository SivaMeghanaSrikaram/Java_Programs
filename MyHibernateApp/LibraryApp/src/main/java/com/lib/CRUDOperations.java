package com.lib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CRUDOperations {

	public static void main(String[] args) {
		
		//here in maven SessionFactory and Session are with the replacement of 7steps in JDBC-sql
		//here no necessity of creating a table and fields over there in sql.just we need to create a database
		
		//SessionFactory object
		SessionFactory factory = HibernateConfig.getSessionFactory();
		
		//Session object
		Session ses = factory.openSession();
		
		//Transaction management
		Transaction tx =ses.beginTransaction();
		
		//To insert
		Book p = new Book(1,"Spiritual",1500);
		/*Book p1 = new Book(102,"Meditation",1000);
		ses.save(p);
		ses.save(p1);*/
		
		//ses.update(p);
		/*Book p1 = new Book(3,"Meditation",1300);
		ses.update(p1);*/
		
		//delete 
		ses.delete(p);
				
		//get
		//ses.load(1, p);
		
		//commit transaction
		tx.commit();
		
		//close objects
		ses.close();
		factory.close();

	}

}

