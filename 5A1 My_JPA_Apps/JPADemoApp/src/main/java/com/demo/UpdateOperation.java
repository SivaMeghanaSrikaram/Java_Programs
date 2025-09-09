package com.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UpdateOperation {

	public static void main(String[] args) {
		//entity manager factory
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPACURD");
		
		//entity manager
		EntityManager emanager = emfactory.createEntityManager();
		
		//transaction
		emanager.getTransaction().begin();
		
		//to update the existing employee(e.g., ID = 1)
		Employee e=emanager.find(Employee.class, 1);   //here 1 is primary key value
		                                               //find() is generic method
		
		// Check if employee exists
		if (e != null) {
		    // Update the fields
		    e.setEname("Siva Meghana Srikaram");
		    e.setMobileno(9865346793L);
		    e.setSalary(95000);
		    
		    // No need to call persist() – JPA tracks changes automatically
		} else {
		    System.out.println("Employee not found.");
		}
		
		//commit
		emanager.getTransaction().commit();
		
		//close objects
		emanager.close();
		emfactory.close();

	}

}
