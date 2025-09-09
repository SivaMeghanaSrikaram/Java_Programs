package com.demo;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class SelectOperation {

	public static void main(String[] args) {
		//entity manager factory
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPACURD");
		
		//entity manager
		EntityManager emanager = emfactory.createEntityManager();
		
		/*Query qry = emanager.createQuery("FROM Employee e WHERE e.salary BETWEEN :minSalary AND :maxSalary");

		qry.setParameter("minSalary", 50000);
        qry.setParameter("maxSalary", 99000);*/
		
		//Query qry = emanager.createQuery("from Employee e WHERE e.ename LIKE 'm%'");
		
		//Query qry = emanager.createQuery("from Employee e ORDER BY e.salary DESC limit 1 offset 1");
		
		Query qry = emanager.createQuery("select SUM(e.salary) from Employee e ");
        // Execute the query and get results
        /*List<Employee> l = qry.getResultList();
        for (Employee e : l) {
            System.out.println("ID: " + e.getEid() + ", Name: " + e.getEname() + ", Salary: " + e.getSalary());
        }
		*/	
		Number totalSalary = (Number) qry.getSingleResult();
        System.out.println("Total sum of salaries: " + totalSalary);
		//close objects
		emanager.close();
		emfactory.close();
	}
}
