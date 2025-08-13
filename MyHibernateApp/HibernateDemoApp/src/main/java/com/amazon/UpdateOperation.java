package com.amazon;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SessionFactory object
		SessionFactory factory = HibernateConfig.getSessionFactory();
		
		//Session object
		Session ses = factory.openSession();
		
		//Transaction management
		Transaction tx =ses.beginTransaction();
		
		//To update
		Product p = new Product();
		/*p.setPid(452);
		p.setPname("Micormax");
		p.setPrice(9000);
		ses.update(p);*/
		p.setPid(102);
		p.setPname("MI");
		p.setPrice(14000);
		ses.merge(p);
		
		//commit
		tx.commit();
		
		//close objects
		ses.close();
		factory.close();
	}

}
