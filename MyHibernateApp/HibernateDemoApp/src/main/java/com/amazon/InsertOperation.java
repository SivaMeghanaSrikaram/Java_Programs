package com.amazon;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InsertOperation {

	public static void main(String[] args) {
		
		//SessionFactory object
		SessionFactory factory = HibernateConfig.getSessionFactory();
		
		//Session object
		Session ses = factory.openSession();
		
		//Transaction management
		Transaction tx =ses.beginTransaction();
		
		//to insert
		Product p = new Product();
		Product p1 = new Product();
		//p.setPname("Samsung");  //existing
		//p.setPrice(18000);
		/*p1.setPname("Oppo"); //new
		p1.setPrice(16000);
		ses.save(p);
		ses.save(p1);*/
		
		//do everything or ntg bcoz of samsung duplicte oppo is also not inserting
		
		p.setPname("Oppo");
		p.setPrice(18000);
		p1.setPname("Realme");
		p1.setPrice(20000);
		ses.save(p);
		ses.save(p1);
		
		/*ses.persist(p);  //same as save
		int id = (int) ses.save(p);  //legacy method/out dated method
		System.out.println(id);
		ses.saveOrUpdate(p);*/
		
		//commit
		tx.commit();
		
		//close objects
		ses.close();
		factory.close();
}
}