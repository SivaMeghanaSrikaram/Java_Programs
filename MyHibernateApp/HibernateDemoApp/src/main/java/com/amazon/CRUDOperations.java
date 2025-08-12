package com.amazon;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CRUDOperations {

	public static void main(String[] args) {
		
		//SessionFactory object
		SessionFactory factory = HibernateConfig.getSessionFactory();
		
		//Session object
		Session ses = factory.openSession();
		
		//Transaction management
		Transaction tx =ses.beginTransaction();
		
		//To insert
		//Product p = new Product(4001,"Oppo",14000);
		//ses.save(p);
		
		//update
		//Product p = new Product(2,"Realme",16000);
		Product p = new Product(52,"Realme",15000);
		//ses.update(p);
		
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
