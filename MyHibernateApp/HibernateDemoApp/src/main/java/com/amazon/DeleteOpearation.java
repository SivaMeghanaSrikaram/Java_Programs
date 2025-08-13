package com.amazon;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeleteOpearation {

	public static void main(String[] args) {
		//SessionFactory object
		SessionFactory factory = HibernateConfig.getSessionFactory();
		
		//Session object
		Session ses = factory.openSession();
		
		//Transaction management
		Transaction tx =ses.beginTransaction();
		
		//To delete
		Product p = new Product();
		p.setPid(302);
		//p.setPid(202);
		ses.delete(p);
		
		//commit
		tx.commit();
		
		//close objects
		ses.close();
		factory.close();

	}

}
