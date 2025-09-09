package com.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class InsertOperation {

	public static void main(String[] args) {
		
		//entity manager factory
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPACURD");
		
		//entity manager
		EntityManager emanager = emfactory.createEntityManager();
		
		//transaction
		emanager.getTransaction().begin();
		
		//to insert
		Employee e=new Employee();
		e.setEname("Abhi");
		e.setMobileno(888354352l);
		e.setSalary(66000);
	
		emanager.persist(e);
		
		//commit
		emanager.getTransaction().commit();
		
		//close objects
		emanager.close();
		emfactory.close();
		
	}

}
